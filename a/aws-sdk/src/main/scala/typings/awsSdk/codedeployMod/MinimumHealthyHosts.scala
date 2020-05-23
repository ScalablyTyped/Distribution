package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinimumHealthyHosts extends js.Object {
  /**
    * The minimum healthy instance type:    HOST_COUNT: The minimum number of healthy instances as an absolute value.    FLEET_PERCENT: The minimum number of healthy instances as a percentage of the total number of instances in the deployment.   In an example of nine instances, if a HOST_COUNT of six is specified, deploy to up to three instances at a time. The deployment is successful if six or more instances are deployed to successfully. Otherwise, the deployment fails. If a FLEET_PERCENT of 40 is specified, deploy to up to five instances at a time. The deployment is successful if four or more instances are deployed to successfully. Otherwise, the deployment fails.  In a call to the GetDeploymentConfig, CodeDeployDefault.OneAtATime returns a minimum healthy instance type of MOST_CONCURRENCY and a value of 1. This means a deployment to only one instance at a time. (You cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or FLEET_PERCENT.) In addition, with CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to ensure that all instances but one are kept in a healthy state during the deployment. Although this allows one instance at a time to be taken offline for a new deployment, it also means that if the deployment to the last instance fails, the overall deployment is still successful.  For more information, see AWS CodeDeploy Instance Health in the AWS CodeDeploy User Guide.
    */
  var `type`: js.UndefOr[MinimumHealthyHostsType] = js.native
  /**
    * The minimum healthy instance value.
    */
  var value: js.UndefOr[MinimumHealthyHostsValue] = js.native
}

object MinimumHealthyHosts {
  @scala.inline
  def apply(`type`: MinimumHealthyHostsType = null, value: js.UndefOr[MinimumHealthyHostsValue] = js.undefined): MinimumHealthyHosts = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinimumHealthyHosts]
  }
}

