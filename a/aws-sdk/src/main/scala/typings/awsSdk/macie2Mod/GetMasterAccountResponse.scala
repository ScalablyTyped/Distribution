package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMasterAccountResponse extends js.Object {
  /**
    * The AWS account ID for the master account. If the accounts are associated by a Macie membership invitation, this object also provides details about the invitation that was sent and accepted to establish the relationship between the accounts.
    */
  var master: js.UndefOr[Invitation] = js.native
}

object GetMasterAccountResponse {
  @scala.inline
  def apply(master: Invitation = null): GetMasterAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (master != null) __obj.updateDynamic("master")(master.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMasterAccountResponse]
  }
}

