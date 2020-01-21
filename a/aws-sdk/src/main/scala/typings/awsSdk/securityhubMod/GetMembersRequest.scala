package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMembersRequest extends js.Object {
  /**
    * A list of account IDs for the Security Hub member accounts that you want to return the details for. 
    */
  var AccountIds: AccountIdList = js.native
}

object GetMembersRequest {
  @scala.inline
  def apply(AccountIds: AccountIdList): GetMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetMembersRequest]
  }
}

