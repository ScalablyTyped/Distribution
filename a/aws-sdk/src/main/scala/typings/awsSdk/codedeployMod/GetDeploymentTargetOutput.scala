package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeploymentTargetOutput extends js.Object {
  /**
    *  A deployment target that contains information about a deployment such as its status, lifecycle events, and when it was last updated. It also contains metadata about the deployment target. The deployment target metadata depends on the deployment target's type (instanceTarget, lambdaTarget, or ecsTarget). 
    */
  var deploymentTarget: js.UndefOr[DeploymentTarget] = js.native
}

object GetDeploymentTargetOutput {
  @scala.inline
  def apply(): GetDeploymentTargetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeploymentTargetOutput]
  }
  @scala.inline
  implicit class GetDeploymentTargetOutputOps[Self <: GetDeploymentTargetOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeploymentTarget(value: DeploymentTarget): Self = this.set("deploymentTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentTarget: Self = this.set("deploymentTarget", js.undefined)
  }
  
}

