package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSSLPoliciesOutput extends js.Object {
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
  /**
    * Information about the policies.
    */
  var SslPolicies: js.UndefOr[typings.awsSdk.elbv2Mod.SslPolicies] = js.native
}

object DescribeSSLPoliciesOutput {
  @scala.inline
  def apply(NextMarker: Marker = null, SslPolicies: SslPolicies = null): DescribeSSLPoliciesOutput = {
    val __obj = js.Dynamic.literal()
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    if (SslPolicies != null) __obj.updateDynamic("SslPolicies")(SslPolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSSLPoliciesOutput]
  }
}

