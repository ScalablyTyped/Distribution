package typings.awsSdk.ssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAccountsResponse extends js.Object {
  /**
    * A paginated response with the list of account information and the next token if more results are available.
    */
  var accountList: js.UndefOr[AccountListType] = js.native
  /**
    * The page token client that is used to retrieve the list of accounts.
    */
  var nextToken: js.UndefOr[NextTokenType] = js.native
}

object ListAccountsResponse {
  @scala.inline
  def apply(accountList: AccountListType = null, nextToken: NextTokenType = null): ListAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (accountList != null) __obj.updateDynamic("accountList")(accountList.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccountsResponse]
  }
}

