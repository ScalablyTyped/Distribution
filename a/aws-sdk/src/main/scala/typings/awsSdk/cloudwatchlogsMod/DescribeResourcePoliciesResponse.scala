package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeResourcePoliciesResponse extends js.Object {
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The resource policies that exist in this account.
    */
  var resourcePolicies: js.UndefOr[ResourcePolicies] = js.native
}

object DescribeResourcePoliciesResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, resourcePolicies: ResourcePolicies = null): DescribeResourcePoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (resourcePolicies != null) __obj.updateDynamic("resourcePolicies")(resourcePolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResourcePoliciesResponse]
  }
}

