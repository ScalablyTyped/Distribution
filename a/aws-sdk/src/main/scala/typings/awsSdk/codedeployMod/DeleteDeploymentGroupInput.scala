package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDeploymentGroupInput extends js.Object {
  /**
    * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
    */
  var applicationName: ApplicationName = js.native
  /**
    * The name of a deployment group for the specified application.
    */
  var deploymentGroupName: DeploymentGroupName = js.native
}

object DeleteDeploymentGroupInput {
  @scala.inline
  def apply(applicationName: ApplicationName, deploymentGroupName: DeploymentGroupName): DeleteDeploymentGroupInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], deploymentGroupName = deploymentGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeploymentGroupInput]
  }
}

