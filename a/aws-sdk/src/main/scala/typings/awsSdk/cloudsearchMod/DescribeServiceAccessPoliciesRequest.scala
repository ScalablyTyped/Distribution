package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeServiceAccessPoliciesRequest extends js.Object {
  /**
    * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.native
  /**
    * The name of the domain you want to describe.
    */
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName = js.native
}

object DescribeServiceAccessPoliciesRequest {
  @scala.inline
  def apply(DomainName: DomainName, Deployed: js.UndefOr[Boolean] = js.undefined): DescribeServiceAccessPoliciesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    if (!js.isUndefined(Deployed)) __obj.updateDynamic("Deployed")(Deployed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeServiceAccessPoliciesRequest]
  }
}

