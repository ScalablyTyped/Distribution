package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentOverview extends js.Object {
  /**
    * The number of instances in the deployment in a failed state.
    */
  var Failed: js.UndefOr[InstanceCount] = js.native
  /**
    * The number of instances in which the deployment is in progress.
    */
  var InProgress: js.UndefOr[InstanceCount] = js.native
  /**
    * The number of instances in the deployment in a pending state.
    */
  var Pending: js.UndefOr[InstanceCount] = js.native
  /**
    * The number of instances in a replacement environment ready to receive traffic in a blue/green deployment.
    */
  var Ready: js.UndefOr[InstanceCount] = js.native
  /**
    * The number of instances in the deployment in a skipped state.
    */
  var Skipped: js.UndefOr[InstanceCount] = js.native
  /**
    * The number of instances in the deployment to which revisions have been successfully deployed.
    */
  var Succeeded: js.UndefOr[InstanceCount] = js.native
}

object DeploymentOverview {
  @scala.inline
  def apply(
    Failed: js.UndefOr[InstanceCount] = js.undefined,
    InProgress: js.UndefOr[InstanceCount] = js.undefined,
    Pending: js.UndefOr[InstanceCount] = js.undefined,
    Ready: js.UndefOr[InstanceCount] = js.undefined,
    Skipped: js.UndefOr[InstanceCount] = js.undefined,
    Succeeded: js.UndefOr[InstanceCount] = js.undefined
  ): DeploymentOverview = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Failed)) __obj.updateDynamic("Failed")(Failed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(InProgress)) __obj.updateDynamic("InProgress")(InProgress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Pending)) __obj.updateDynamic("Pending")(Pending.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Ready)) __obj.updateDynamic("Ready")(Ready.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Skipped)) __obj.updateDynamic("Skipped")(Skipped.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Succeeded)) __obj.updateDynamic("Succeeded")(Succeeded.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentOverview]
  }
}

