package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentTarget extends js.Object {
  var cloudFormationTarget: js.UndefOr[CloudFormationTarget] = js.native
  /**
    * The deployment type that is specific to the deployment's compute platform or deployments initiated by a CloudFormation stack update.
    */
  var deploymentTargetType: js.UndefOr[DeploymentTargetType] = js.native
  /**
    *  Information about the target for a deployment that uses the Amazon ECS compute platform. 
    */
  var ecsTarget: js.UndefOr[ECSTarget] = js.native
  /**
    *  Information about the target for a deployment that uses the EC2/On-premises compute platform. 
    */
  var instanceTarget: js.UndefOr[InstanceTarget] = js.native
  /**
    *  Information about the target for a deployment that uses the AWS Lambda compute platform. 
    */
  var lambdaTarget: js.UndefOr[LambdaTarget] = js.native
}

object DeploymentTarget {
  @scala.inline
  def apply(
    cloudFormationTarget: CloudFormationTarget = null,
    deploymentTargetType: DeploymentTargetType = null,
    ecsTarget: ECSTarget = null,
    instanceTarget: InstanceTarget = null,
    lambdaTarget: LambdaTarget = null
  ): DeploymentTarget = {
    val __obj = js.Dynamic.literal()
    if (cloudFormationTarget != null) __obj.updateDynamic("cloudFormationTarget")(cloudFormationTarget.asInstanceOf[js.Any])
    if (deploymentTargetType != null) __obj.updateDynamic("deploymentTargetType")(deploymentTargetType.asInstanceOf[js.Any])
    if (ecsTarget != null) __obj.updateDynamic("ecsTarget")(ecsTarget.asInstanceOf[js.Any])
    if (instanceTarget != null) __obj.updateDynamic("instanceTarget")(instanceTarget.asInstanceOf[js.Any])
    if (lambdaTarget != null) __obj.updateDynamic("lambdaTarget")(lambdaTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentTarget]
  }
}

