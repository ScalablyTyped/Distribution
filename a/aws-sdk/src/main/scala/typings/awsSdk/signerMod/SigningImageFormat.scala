package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SigningImageFormat extends StObject {
  
  /**
    * The default format of a code signing image.
    */
  var defaultFormat: ImageFormat = js.native
  
  /**
    * The supported formats of a code signing image.
    */
  var supportedFormats: ImageFormats = js.native
}
object SigningImageFormat {
  
  @scala.inline
  def apply(defaultFormat: ImageFormat, supportedFormats: ImageFormats): SigningImageFormat = {
    val __obj = js.Dynamic.literal(defaultFormat = defaultFormat.asInstanceOf[js.Any], supportedFormats = supportedFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigningImageFormat]
  }
  
  @scala.inline
  implicit class SigningImageFormatMutableBuilder[Self <: SigningImageFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultFormat(value: ImageFormat): Self = StObject.set(x, "defaultFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedFormats(value: ImageFormats): Self = StObject.set(x, "supportedFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedFormatsVarargs(value: ImageFormat*): Self = StObject.set(x, "supportedFormats", js.Array(value :_*))
  }
}
