package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Media extends StObject {
  
  /**
    * The S3 object location of the input media file. The URI must be in the same region as the API endpoint that you are calling. The general form is: For example: For more information about S3 object names, see Object Keys in the Amazon S3 Developer Guide.
    */
  var MediaFileUri: js.UndefOr[Uri] = js.native
}
object Media {
  
  @scala.inline
  def apply(): Media = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Media]
  }
  
  @scala.inline
  implicit class MediaMutableBuilder[Self <: Media] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaFileUri(value: Uri): Self = StObject.set(x, "MediaFileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaFileUriUndefined: Self = StObject.set(x, "MediaFileUri", js.undefined)
  }
}
