package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteStreamInput extends StObject {
  
  /**
    * Optional: The version of the stream that you want to delete.  Specify the version as a safeguard to ensure that your are deleting the correct stream. To get the stream version, use the DescribeStream API. If not specified, only the CreationTime is checked before deleting the stream.
    */
  var CurrentVersion: js.UndefOr[Version] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the stream that you want to delete. 
    */
  var StreamARN: ResourceARN = js.native
}
object DeleteStreamInput {
  
  @scala.inline
  def apply(StreamARN: ResourceARN): DeleteStreamInput = {
    val __obj = js.Dynamic.literal(StreamARN = StreamARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStreamInput]
  }
  
  @scala.inline
  implicit class DeleteStreamInputMutableBuilder[Self <: DeleteStreamInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentVersion(value: Version): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentVersionUndefined: Self = StObject.set(x, "CurrentVersion", js.undefined)
    
    @scala.inline
    def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
  }
}
