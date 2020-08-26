package typings.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nonce extends js.Object {
  var nonce: String = js.native
}

object Nonce {
  @scala.inline
  def apply(nonce: String): Nonce = {
    val __obj = js.Dynamic.literal(nonce = nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nonce]
  }
  @scala.inline
  implicit class NonceOps[Self <: Nonce] (val x: Self) extends AnyVal {
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
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
  }
  
}

