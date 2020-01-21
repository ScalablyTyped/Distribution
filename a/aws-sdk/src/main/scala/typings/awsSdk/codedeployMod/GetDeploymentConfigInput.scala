package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeploymentConfigInput extends js.Object {
  /**
    * The name of a deployment configuration associated with the IAM user or AWS account.
    */
  var deploymentConfigName: DeploymentConfigName = js.native
}

object GetDeploymentConfigInput {
  @scala.inline
  def apply(deploymentConfigName: DeploymentConfigName): GetDeploymentConfigInput = {
    val __obj = js.Dynamic.literal(deploymentConfigName = deploymentConfigName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDeploymentConfigInput]
  }
}

