package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeploymentConfigInput extends js.Object {
  /**
    * The destination platform type for the deployment (Lambda, Server, or ECS).
    */
  var computePlatform: js.UndefOr[ComputePlatform] = js.native
  /**
    * The name of the deployment configuration to create.
    */
  var deploymentConfigName: DeploymentConfigName = js.native
  /**
    * The minimum number of healthy instances that should be available at any time during the deployment. There are two parameters expected in the input: type and value. The type parameter takes either of the following values:   HOST_COUNT: The value parameter represents the minimum number of healthy instances as an absolute value.   FLEET_PERCENT: The value parameter represents the minimum number of healthy instances as a percentage of the total number of instances in the deployment. If you specify FLEET_PERCENT, at the start of the deployment, AWS CodeDeploy converts the percentage to the equivalent number of instances and rounds up fractional instances.   The value parameter takes an integer. For example, to set a minimum of 95% healthy instance, specify a type of FLEET_PERCENT and a value of 95.
    */
  var minimumHealthyHosts: js.UndefOr[MinimumHealthyHosts] = js.native
  /**
    * The configuration that specifies how the deployment traffic is routed.
    */
  var trafficRoutingConfig: js.UndefOr[TrafficRoutingConfig] = js.native
}

object CreateDeploymentConfigInput {
  @scala.inline
  def apply(
    deploymentConfigName: DeploymentConfigName,
    computePlatform: ComputePlatform = null,
    minimumHealthyHosts: MinimumHealthyHosts = null,
    trafficRoutingConfig: TrafficRoutingConfig = null
  ): CreateDeploymentConfigInput = {
    val __obj = js.Dynamic.literal(deploymentConfigName = deploymentConfigName.asInstanceOf[js.Any])
    if (computePlatform != null) __obj.updateDynamic("computePlatform")(computePlatform.asInstanceOf[js.Any])
    if (minimumHealthyHosts != null) __obj.updateDynamic("minimumHealthyHosts")(minimumHealthyHosts.asInstanceOf[js.Any])
    if (trafficRoutingConfig != null) __obj.updateDynamic("trafficRoutingConfig")(trafficRoutingConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentConfigInput]
  }
}

