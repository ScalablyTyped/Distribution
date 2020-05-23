package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMembersRequest extends js.Object {
  /**
    * The maximum number of items to include in each page of a paginated response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The nextToken string that specifies which page of results to return in a paginated response.
    */
  var nextToken: js.UndefOr[string] = js.native
  /**
    * Specifies which accounts to include in the response, based on the status of an account's relationship with the master account. By default, the response includes only current member accounts. To include all accounts, set the value for this parameter to false.
    */
  var onlyAssociated: js.UndefOr[string] = js.native
}

object ListMembersRequest {
  @scala.inline
  def apply(
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: string = null,
    onlyAssociated: string = null
  ): ListMembersRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (onlyAssociated != null) __obj.updateDynamic("onlyAssociated")(onlyAssociated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMembersRequest]
  }
}

