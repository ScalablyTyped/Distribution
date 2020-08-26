package typings.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Kount extends js.Object {
  var client: typings.braintreeWeb.clientMod.Client = js.native
  var kount: Boolean = js.native
  var paypal: Boolean = js.native
}

object Kount {
  @scala.inline
  def apply(client: typings.braintreeWeb.clientMod.Client, kount: Boolean, paypal: Boolean): Kount = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], kount = kount.asInstanceOf[js.Any], paypal = paypal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kount]
  }
  @scala.inline
  implicit class KountOps[Self <: Kount] (val x: Self) extends AnyVal {
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
    def setClient(value: typings.braintreeWeb.clientMod.Client): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setKount(value: Boolean): Self = this.set("kount", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaypal(value: Boolean): Self = this.set("paypal", value.asInstanceOf[js.Any])
  }
  
}

