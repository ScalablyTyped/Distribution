package typings.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMemberAccountsRequest extends js.Object {
  /**
    * Use this parameter to indicate the maximum number of items that you want in the response. The default value is 250. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * Use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListMemberAccounts action. Subsequent calls to the action fill nextToken in the request with the value of nextToken from the previous response to continue listing data. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListMemberAccountsRequest {
  @scala.inline
  def apply(maxResults: Int | Double = null, nextToken: NextToken = null): ListMemberAccountsRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMemberAccountsRequest]
  }
}

