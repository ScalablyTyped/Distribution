package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourcePoliciesResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * A key policy document, in JSON format.
    */
  var policies: js.UndefOr[PolicyList] = js.native
}

object GetResourcePoliciesResponse {
  @scala.inline
  def apply(nextToken: String = null, policies: PolicyList = null): GetResourcePoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (policies != null) __obj.updateDynamic("policies")(policies.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourcePoliciesResponse]
  }
}

