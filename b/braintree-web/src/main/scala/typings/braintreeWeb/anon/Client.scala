package typings.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  var client: typings.braintreeWeb.clientMod.Client = js.native
}

object Client {
  @scala.inline
  def apply(client: typings.braintreeWeb.clientMod.Client): Client = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
  @scala.inline
  implicit class ClientOps[Self <: Client] (val x: Self) extends AnyVal {
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
  }
  
}

