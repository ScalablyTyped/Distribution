package typings.cryptojs.CryptoJS.enc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncStatic extends js.Object {
  
  var Base64: ICoder = js.native
  
  var Hex: ICoder = js.native
  
  var Latin1: ICoder = js.native
  
  var Utf16: ICoder = js.native
  
  var Utf16BE: ICoder = js.native
  
  var Utf16LE: ICoder = js.native
  
  var Utf8: ICoder = js.native
}
object EncStatic {
  
  @scala.inline
  def apply(
    Base64: ICoder,
    Hex: ICoder,
    Latin1: ICoder,
    Utf16: ICoder,
    Utf16BE: ICoder,
    Utf16LE: ICoder,
    Utf8: ICoder
  ): EncStatic = {
    val __obj = js.Dynamic.literal(Base64 = Base64.asInstanceOf[js.Any], Hex = Hex.asInstanceOf[js.Any], Latin1 = Latin1.asInstanceOf[js.Any], Utf16 = Utf16.asInstanceOf[js.Any], Utf16BE = Utf16BE.asInstanceOf[js.Any], Utf16LE = Utf16LE.asInstanceOf[js.Any], Utf8 = Utf8.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncStatic]
  }
  
  @scala.inline
  implicit class EncStaticOps[Self <: EncStatic] (val x: Self) extends AnyVal {
    
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
    def setBase64(value: ICoder): Self = this.set("Base64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHex(value: ICoder): Self = this.set("Hex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatin1(value: ICoder): Self = this.set("Latin1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtf16(value: ICoder): Self = this.set("Utf16", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtf16BE(value: ICoder): Self = this.set("Utf16BE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtf16LE(value: ICoder): Self = this.set("Utf16LE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtf8(value: ICoder): Self = this.set("Utf8", value.asInstanceOf[js.Any])
  }
}
