package typings.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinNonce extends js.Object {
  var bin: String = js.native
  var nonce: String = js.native
}

object BinNonce {
  @scala.inline
  def apply(bin: String, nonce: String): BinNonce = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinNonce]
  }
  @scala.inline
  implicit class BinNonceOps[Self <: BinNonce] (val x: Self) extends AnyVal {
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
    def setBin(value: String): Self = this.set("bin", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
  }
  
}

