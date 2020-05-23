package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSSLPoliciesInput extends js.Object {
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[typings.awsSdk.elbv2Mod.Marker] = js.native
  /**
    * The names of the policies.
    */
  var Names: js.UndefOr[SslPolicyNames] = js.native
  /**
    * The maximum number of results to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsSdk.elbv2Mod.PageSize] = js.native
}

object DescribeSSLPoliciesInput {
  @scala.inline
  def apply(Marker: Marker = null, Names: SslPolicyNames = null, PageSize: js.UndefOr[PageSize] = js.undefined): DescribeSSLPoliciesInput = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (Names != null) __obj.updateDynamic("Names")(Names.asInstanceOf[js.Any])
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSSLPoliciesInput]
  }
}

