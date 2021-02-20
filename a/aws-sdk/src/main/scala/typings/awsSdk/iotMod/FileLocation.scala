package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileLocation extends StObject {
  
  /**
    * The location of the updated firmware in S3.
    */
  var s3Location: js.UndefOr[S3Location] = js.native
  
  /**
    * The stream that contains the OTA update.
    */
  var stream: js.UndefOr[Stream] = js.native
}
object FileLocation {
  
  @scala.inline
  def apply(): FileLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileLocation]
  }
  
  @scala.inline
  implicit class FileLocationMutableBuilder[Self <: FileLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Location(value: S3Location): Self = StObject.set(x, "s3Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3LocationUndefined: Self = StObject.set(x, "s3Location", js.undefined)
    
    @scala.inline
    def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
