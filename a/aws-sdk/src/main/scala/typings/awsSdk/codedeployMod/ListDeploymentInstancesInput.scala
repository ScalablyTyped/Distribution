package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeploymentInstancesInput extends js.Object {
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: DeploymentId = js.native
  /**
    * A subset of instances to list by status:   Pending: Include those instances with pending deployments.   InProgress: Include those instances where deployments are still in progress.   Succeeded: Include those instances with successful deployments.   Failed: Include those instances with failed deployments.   Skipped: Include those instances with skipped deployments.   Unknown: Include those instances with deployments in an unknown state.  
    */
  var instanceStatusFilter: js.UndefOr[InstanceStatusList] = js.native
  /**
    * The set of instances in a blue/green deployment, either those in the original environment ("BLUE") or those in the replacement environment ("GREEN"), for which you want to view instance information.
    */
  var instanceTypeFilter: js.UndefOr[InstanceTypeList] = js.native
  /**
    * An identifier returned from the previous list deployment instances call. It can be used to return the next set of deployment instances in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDeploymentInstancesInput {
  @scala.inline
  def apply(
    deploymentId: DeploymentId,
    instanceStatusFilter: InstanceStatusList = null,
    instanceTypeFilter: InstanceTypeList = null,
    nextToken: NextToken = null
  ): ListDeploymentInstancesInput = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any])
    if (instanceStatusFilter != null) __obj.updateDynamic("instanceStatusFilter")(instanceStatusFilter.asInstanceOf[js.Any])
    if (instanceTypeFilter != null) __obj.updateDynamic("instanceTypeFilter")(instanceTypeFilter.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeploymentInstancesInput]
  }
}

