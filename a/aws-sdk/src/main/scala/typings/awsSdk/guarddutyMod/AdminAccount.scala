package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminAccount extends js.Object {
  /**
    * The AWS account ID for the account.
    */
  var AdminAccountId: js.UndefOr[String] = js.native
  /**
    * Indicates whether the account is enabled as the delegated administrator.
    */
  var AdminStatus: js.UndefOr[typings.awsSdk.guarddutyMod.AdminStatus] = js.native
}

object AdminAccount {
  @scala.inline
  def apply(AdminAccountId: String = null, AdminStatus: AdminStatus = null): AdminAccount = {
    val __obj = js.Dynamic.literal()
    if (AdminAccountId != null) __obj.updateDynamic("AdminAccountId")(AdminAccountId.asInstanceOf[js.Any])
    if (AdminStatus != null) __obj.updateDynamic("AdminStatus")(AdminStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminAccount]
  }
}

