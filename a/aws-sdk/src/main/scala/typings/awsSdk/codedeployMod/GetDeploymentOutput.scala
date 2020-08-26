package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeploymentOutput extends js.Object {
  /**
    * Information about the deployment.
    */
  var deploymentInfo: js.UndefOr[DeploymentInfo] = js.native
}

object GetDeploymentOutput {
  @scala.inline
  def apply(): GetDeploymentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeploymentOutput]
  }
  @scala.inline
  implicit class GetDeploymentOutputOps[Self <: GetDeploymentOutput] (val x: Self) extends AnyVal {
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
    def setDeploymentInfo(value: DeploymentInfo): Self = this.set("deploymentInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentInfo: Self = this.set("deploymentInfo", js.undefined)
  }
  
}

