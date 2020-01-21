package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAffectedAccountsForOrganizationResponse extends js.Object {
  /**
    * A JSON set of elements of the affected accounts.
    */
  var affectedAccounts: js.UndefOr[affectedAccountsList] = js.native
  /**
    * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
    */
  var nextToken: js.UndefOr[typings.awsSdk.healthMod.nextToken] = js.native
}

object DescribeAffectedAccountsForOrganizationResponse {
  @scala.inline
  def apply(affectedAccounts: affectedAccountsList = null, nextToken: nextToken = null): DescribeAffectedAccountsForOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    if (affectedAccounts != null) __obj.updateDynamic("affectedAccounts")(affectedAccounts.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAffectedAccountsForOrganizationResponse]
  }
}

