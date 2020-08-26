package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountKey extends js.Object {
  /**
    * Identifier for the account, unique to the provider
    */
  var accountId: String = js.native
  /**
    * Any arguments that identify an instantiation of the provider
    */
  var providerArgs: js.UndefOr[js.Any] = js.native
  /**
    * Identifier of the provider
    */
  var providerId: String = js.native
}

object AccountKey {
  @scala.inline
  def apply(accountId: String, providerId: String): AccountKey = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountKey]
  }
  @scala.inline
  implicit class AccountKeyOps[Self <: AccountKey] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProviderId(value: String): Self = this.set("providerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProviderArgs(value: js.Any): Self = this.set("providerArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviderArgs: Self = this.set("providerArgs", js.undefined)
  }
  
}

