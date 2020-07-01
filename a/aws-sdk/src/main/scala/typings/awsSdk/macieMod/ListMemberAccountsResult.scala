package typings.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMemberAccountsResult extends js.Object {
  /**
    * A list of the Amazon Macie Classic member accounts returned by the action. The current master account is also included in this list. 
    */
  var memberAccounts: js.UndefOr[MemberAccounts] = js.native
  /**
    * When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListMemberAccountsResult {
  @scala.inline
  def apply(memberAccounts: MemberAccounts = null, nextToken: NextToken = null): ListMemberAccountsResult = {
    val __obj = js.Dynamic.literal()
    if (memberAccounts != null) __obj.updateDynamic("memberAccounts")(memberAccounts.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMemberAccountsResult]
  }
}

