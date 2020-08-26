package typings.cryptoJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hex extends js.Object {
  var Hex: js.Any = js.native
  var OpenSSL: js.Any = js.native
}

object Hex {
  @scala.inline
  def apply(Hex: js.Any, OpenSSL: js.Any): Hex = {
    val __obj = js.Dynamic.literal(Hex = Hex.asInstanceOf[js.Any], OpenSSL = OpenSSL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hex]
  }
  @scala.inline
  implicit class HexOps[Self <: Hex] (val x: Self) extends AnyVal {
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
    def setHex(value: js.Any): Self = this.set("Hex", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenSSL(value: js.Any): Self = this.set("OpenSSL", value.asInstanceOf[js.Any])
  }
  
}

