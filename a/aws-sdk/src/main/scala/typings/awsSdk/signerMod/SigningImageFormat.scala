package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SigningImageFormat extends js.Object {
  
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
  implicit class SigningImageFormatOps[Self <: SigningImageFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultFormat(value: ImageFormat): Self = this.set("defaultFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedFormatsVarargs(value: ImageFormat*): Self = this.set("supportedFormats", js.Array(value :_*))
    
    @scala.inline
    def setSupportedFormats(value: ImageFormats): Self = this.set("supportedFormats", value.asInstanceOf[js.Any])
  }
}
