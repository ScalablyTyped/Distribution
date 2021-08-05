package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Media extends StObject {
  
  /**
    * The S3 object location of the input media file. The URI must be in the same region as the API endpoint that you are calling. The general form is: For example: For more information about S3 object names, see Object Keys in the Amazon S3 Developer Guide.
    */
  var MediaFileUri: js.UndefOr[Uri] = js.undefined
}
object Media {
  
  inline def apply(): Media = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Media]
  }
  
  extension [Self <: Media](x: Self) {
    
    inline def setMediaFileUri(value: Uri): Self = StObject.set(x, "MediaFileUri", value.asInstanceOf[js.Any])
    
    inline def setMediaFileUriUndefined: Self = StObject.set(x, "MediaFileUri", js.undefined)
  }
}
