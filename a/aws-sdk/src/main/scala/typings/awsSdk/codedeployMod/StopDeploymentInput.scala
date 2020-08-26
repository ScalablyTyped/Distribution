package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopDeploymentInput extends js.Object {
  /**
    *  Indicates, when a deployment is stopped, whether instances that have been updated should be rolled back to the previous version of the application revision. 
    */
  var autoRollbackEnabled: js.UndefOr[NullableBoolean] = js.native
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: DeploymentId = js.native
}

object StopDeploymentInput {
  @scala.inline
  def apply(deploymentId: DeploymentId): StopDeploymentInput = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDeploymentInput]
  }
  @scala.inline
  implicit class StopDeploymentInputOps[Self <: StopDeploymentInput] (val x: Self) extends AnyVal {
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
    def setDeploymentId(value: DeploymentId): Self = this.set("deploymentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoRollbackEnabled(value: NullableBoolean): Self = this.set("autoRollbackEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRollbackEnabled: Self = this.set("autoRollbackEnabled", js.undefined)
  }
  
}

