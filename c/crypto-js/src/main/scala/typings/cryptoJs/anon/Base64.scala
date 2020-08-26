package typings.cryptoJs.anon

import typings.cryptoJs.mod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base64 extends js.Object {
  var Base64: Encoder = js.native
  var Hex: Encoder = js.native
  var Latin1: Encoder = js.native
  var Utf16: Encoder = js.native
  var Utf16LE: Encoder = js.native
  var Utf8: Encoder = js.native
}

object Base64 {
  @scala.inline
  def apply(Base64: Encoder, Hex: Encoder, Latin1: Encoder, Utf16: Encoder, Utf16LE: Encoder, Utf8: Encoder): Base64 = {
    val __obj = js.Dynamic.literal(Base64 = Base64.asInstanceOf[js.Any], Hex = Hex.asInstanceOf[js.Any], Latin1 = Latin1.asInstanceOf[js.Any], Utf16 = Utf16.asInstanceOf[js.Any], Utf16LE = Utf16LE.asInstanceOf[js.Any], Utf8 = Utf8.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base64]
  }
  @scala.inline
  implicit class Base64Ops[Self <: Base64] (val x: Self) extends AnyVal {
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
    def setBase64(value: Encoder): Self = this.set("Base64", value.asInstanceOf[js.Any])
    @scala.inline
    def setHex(value: Encoder): Self = this.set("Hex", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatin1(value: Encoder): Self = this.set("Latin1", value.asInstanceOf[js.Any])
    @scala.inline
    def setUtf16(value: Encoder): Self = this.set("Utf16", value.asInstanceOf[js.Any])
    @scala.inline
    def setUtf16LE(value: Encoder): Self = this.set("Utf16LE", value.asInstanceOf[js.Any])
    @scala.inline
    def setUtf8(value: Encoder): Self = this.set("Utf8", value.asInstanceOf[js.Any])
  }
  
}

