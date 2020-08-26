package typings.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MerchantAccountId extends js.Object {
  var authorization: js.UndefOr[String] = js.native
  var client: js.UndefOr[typings.braintreeWeb.clientMod.Client] = js.native
  var merchantAccountId: js.UndefOr[String] = js.native
}

object MerchantAccountId {
  @scala.inline
  def apply(): MerchantAccountId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MerchantAccountId]
  }
  @scala.inline
  implicit class MerchantAccountIdOps[Self <: MerchantAccountId] (val x: Self) extends AnyVal {
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
    def setAuthorization(value: String): Self = this.set("authorization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorization: Self = this.set("authorization", js.undefined)
    @scala.inline
    def setClient(value: typings.braintreeWeb.clientMod.Client): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    @scala.inline
    def setMerchantAccountId(value: String): Self = this.set("merchantAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerchantAccountId: Self = this.set("merchantAccountId", js.undefined)
  }
  
}

