package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountKey extends js.Object {
  /**
    * Identifier for the account, unique to the provider
    */
  var accountId: String
  /**
    * Any arguments that identify an instantiation of the provider
    */
  var providerArgs: js.UndefOr[js.Any] = js.undefined
  /**
    * Identifier of the provider
    */
  var providerId: String
}

object AccountKey {
  @scala.inline
  def apply(accountId: String, providerId: String, providerArgs: js.Any = null): AccountKey = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any])
    if (providerArgs != null) __obj.updateDynamic("providerArgs")(providerArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountKey]
  }
}

