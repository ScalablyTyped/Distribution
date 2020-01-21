package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountDetail extends js.Object {
  /**
    * Member account ID.
    */
  var AccountId: typings.awsSdk.guarddutyMod.AccountId = js.native
  /**
    * Member account's email address.
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

