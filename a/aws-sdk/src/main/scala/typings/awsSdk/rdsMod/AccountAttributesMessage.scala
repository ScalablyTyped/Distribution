package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountAttributesMessage extends js.Object {
  /**
    * A list of AccountQuota objects. Within this list, each quota has a name, a count of usage toward the quota maximum, and a maximum value for the quota.
    */
  var AccountQuotas: js.UndefOr[AccountQuotaList] = js.native
}

object AccountAttributesMessage {
  @scala.inline
  def apply(AccountQuotas: AccountQuotaList = null): AccountAttributesMessage = {
    val __obj = js.Dynamic.literal()
    if (AccountQuotas != null) __obj.updateDynamic("AccountQuotas")(AccountQuotas.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountAttributesMessage]
  }
}

