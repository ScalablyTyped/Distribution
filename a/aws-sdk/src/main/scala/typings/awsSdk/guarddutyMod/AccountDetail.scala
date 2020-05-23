package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountDetail extends js.Object {
  /**
    * The member account ID.
    */
  var AccountId: typings.awsSdk.guarddutyMod.AccountId = js.native
  /**
    * The email address of the member account.
    */
  var Email: typings.awsSdk.guarddutyMod.Email = js.native
}

object AccountDetail {
  @scala.inline
  def apply(AccountId: AccountId, Email: Email): AccountDetail = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountDetail]
  }
}

