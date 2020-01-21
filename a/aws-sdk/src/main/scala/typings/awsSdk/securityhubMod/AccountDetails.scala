package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountDetails extends js.Object {
  /**
    * The ID of an AWS account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.securityhubMod.AccountId] = js.native
  /**
    * The email of an AWS account.
    */
  var Email: js.UndefOr[NonEmptyString] = js.native
}

object AccountDetails {
  @scala.inline
  def apply(AccountId: AccountId = null, Email: NonEmptyString = null): AccountDetails = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (Email != null) __obj.updateDynamic("Email")(Email.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountDetails]
  }
}

