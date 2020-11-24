package typings.cryptojs.CryptoJS.format

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatStatic extends js.Object {
  
  var Hex: IFormatter = js.native
  
  var OpenSSL: IFormatter = js.native
}
object FormatStatic {
  
  @scala.inline
  def apply(Hex: IFormatter, OpenSSL: IFormatter): FormatStatic = {
    val __obj = js.Dynamic.literal(Hex = Hex.asInstanceOf[js.Any], OpenSSL = OpenSSL.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatStatic]
  }
  
  @scala.inline
  implicit class FormatStaticOps[Self <: FormatStatic] (val x: Self) extends AnyVal {
    
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
    def setHex(value: IFormatter): Self = this.set("Hex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenSSL(value: IFormatter): Self = this.set("OpenSSL", value.asInstanceOf[js.Any])
  }
}
