package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAccessPoliciesResponse extends js.Object {
  /**
    * A list that summarizes each access policy.
    */
  var accessPolicySummaries: AccessPolicySummaries = js.native
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListAccessPoliciesResponse {
  @scala.inline
  def apply(accessPolicySummaries: AccessPolicySummaries, nextToken: NextToken = null): ListAccessPoliciesResponse = {
    val __obj = js.Dynamic.literal(accessPolicySummaries = accessPolicySummaries.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccessPoliciesResponse]
  }
}

