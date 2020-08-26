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
  def apply(): DescribeDeploymentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeploymentsResult]
  }
  @scala.inline
  implicit class DescribeDeploymentsResultOps[Self <: DescribeDeploymentsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeploymentsVarargs(value: Deployment*): Self = this.set("Deployments", js.Array(value :_*))
    @scala.inline
    def setDeployments(value: Deployments): Self = this.set("Deployments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeployments: Self = this.set("Deployments", js.undefined)
  }
  
}

