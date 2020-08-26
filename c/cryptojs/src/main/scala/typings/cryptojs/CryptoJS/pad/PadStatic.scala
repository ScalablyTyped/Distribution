package typings.cryptojs.CryptoJS.pad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PadStatic extends js.Object {
  var AnsiX923: typings.cryptojs.CryptoJS.pad.AnsiX923 = js.native
  var Iso10126: typings.cryptojs.CryptoJS.pad.Iso10126 = js.native
  var Iso97971: typings.cryptojs.CryptoJS.pad.Iso97971 = js.native
  var NoPadding: typings.cryptojs.CryptoJS.pad.NoPadding = js.native
  var Pkcs7: typings.cryptojs.CryptoJS.pad.Pkcs7 = js.native
  var ZeroPadding: typings.cryptojs.CryptoJS.pad.ZeroPadding = js.native
}

object PadStatic {
  @scala.inline
  def apply(
    AnsiX923: AnsiX923,
    Iso10126: Iso10126,
    Iso97971: Iso97971,
    NoPadding: NoPadding,
    Pkcs7: Pkcs7,
    ZeroPadding: ZeroPadding
  ): PadStatic = {
    val __obj = js.Dynamic.literal(AnsiX923 = AnsiX923.asInstanceOf[js.Any], Iso10126 = Iso10126.asInstanceOf[js.Any], Iso97971 = Iso97971.asInstanceOf[js.Any], NoPadding = NoPadding.asInstanceOf[js.Any], Pkcs7 = Pkcs7.asInstanceOf[js.Any], ZeroPadding = ZeroPadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[PadStatic]
  }
  @scala.inline
  implicit class PadStaticOps[Self <: PadStatic] (val x: Self) extends AnyVal {
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
    def setAnsiX923(value: AnsiX923): Self = this.set("AnsiX923", value.asInstanceOf[js.Any])
    @scala.inline
    def setIso10126(value: Iso10126): Self = this.set("Iso10126", value.asInstanceOf[js.Any])
    @scala.inline
    def setIso97971(value: Iso97971): Self = this.set("Iso97971", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoPadding(value: NoPadding): Self = this.set("NoPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def setPkcs7(value: Pkcs7): Self = this.set("Pkcs7", value.asInstanceOf[js.Any])
    @scala.inline
    def setZeroPadding(value: ZeroPadding): Self = this.set("ZeroPadding", value.asInstanceOf[js.Any])
  }
  
}

