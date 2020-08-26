package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeploymentResponse extends js.Object {
  /**
    * The ARN of the deployment.
    */
  var DeploymentArn: js.UndefOr[string] = js.native
  /**
    * The ID of the deployment.
    */
  var DeploymentId: js.UndefOr[string] = js.native
}

object CreateDeploymentResponse {
  @scala.inline
  def apply(): CreateDeploymentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeploymentResponse]
  }
  @scala.inline
  implicit class CreateDeploymentResponseOps[Self <: CreateDeploymentResponse] (val x: Self) extends AnyVal {
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
    def setDeploymentArn(value: string): Self = this.set("DeploymentArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentArn: Self = this.set("DeploymentArn", js.undefined)
    @scala.inline
    def setDeploymentId(value: string): Self = this.set("DeploymentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentId: Self = this.set("DeploymentId", js.undefined)
  }
  
}

