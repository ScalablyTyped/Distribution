package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDeploymentConfigInput extends js.Object {
  /**
    * The name of a deployment configuration associated with the IAM user or AWS account.
    */
  var deploymentConfigName: DeploymentConfigName = js.native
}

object DeleteDeploymentConfigInput {
  @scala.inline
  def apply(deploymentConfigName: DeploymentConfigName): DeleteDeploymentConfigInput = {
    val __obj = js.Dynamic.literal(deploymentConfigName = deploymentConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeploymentConfigInput]
  }
}

