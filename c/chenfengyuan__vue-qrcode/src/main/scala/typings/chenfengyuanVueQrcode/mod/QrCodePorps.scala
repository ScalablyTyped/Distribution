package typings.chenfengyuanVueQrcode.mod

import typings.chenfengyuanVueQrcode.anon.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QrCodePorps extends js.Object {
  
  // The options for the QR code generator.
  var options: Color = js.native
  
  // The tag name of the component's root element.
  var tag: String = js.native
  
  // The value of the QR code.
  var value: String | Null = js.native
}
object QrCodePorps {
  
  @scala.inline
  def apply(options: Color, tag: String): QrCodePorps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[QrCodePorps]
  }
  
  @scala.inline
  implicit class QrCodePorpsOps[Self <: QrCodePorps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOptions(value: Color): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
