package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDeploymentsResult extends js.Object {
  /**
    * An array of Deployment objects that describe the deployments.
    */
  var Deployments: js.UndefOr[typings.awsSdk.opsworksMod.Deployments] = js.native
}

object DescribeDeploymentsResult {
  @scala.inline
  def apply(Deployments: Deployments = null): DescribeDeploymentsResult = {
    val __obj = js.Dynamic.literal()
    if (Deployments != null) __obj.updateDynamic("Deployments")(Deployments.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDeploymentsResult]
  }
}

