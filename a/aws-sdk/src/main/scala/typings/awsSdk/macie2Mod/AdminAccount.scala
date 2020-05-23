package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminAccount extends js.Object {
  /**
    * The AWS account ID for the account.
    */
  var accountId: js.UndefOr[string] = js.native
  /**
    * The current status of the account as a delegated administrator of Amazon Macie for the organization.
    */
  var status: js.UndefOr[AdminStatus] = js.native
}

object AdminAccount {
  @scala.inline
  def apply(accountId: string = null, status: AdminStatus = null): AdminAccount = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminAccount]
  }
}

