package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeploymentTargetInput extends js.Object {
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.native
  /**
    *  The unique ID of a deployment target. 
    */
  var targetId: js.UndefOr[TargetId] = js.native
}

object GetDeploymentTargetInput {
  @scala.inline
  def apply(): GetDeploymentTargetInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeploymentTargetInput]
  }
  @scala.inline
  implicit class GetDeploymentTargetInputOps[Self <: GetDeploymentTargetInput] (val x: Self) extends AnyVal {
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
    def deleteDeploymentId: Self = this.set("deploymentId", js.undefined)
    @scala.inline
    def setTargetId(value: TargetId): Self = this.set("targetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetId: Self = this.set("targetId", js.undefined)
  }
  
}

