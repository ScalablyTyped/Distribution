package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateStreamOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the stream.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.native
}
object CreateStreamOutput {
  
  @scala.inline
  def apply(): CreateStreamOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStreamOutput]
  }
  
  @scala.inline
  implicit class CreateStreamOutputMutableBuilder[Self <: CreateStreamOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
  }
}
