package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeploymentJobRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: ClientRequestToken = js.native
  /**
    * The deployment application configuration.
    */
  var deploymentApplicationConfigs: DeploymentApplicationConfigs = js.native
  /**
    * The requested deployment configuration.
    */
  var deploymentConfig: js.UndefOr[DeploymentConfig] = js.native
  /**
    * The Amazon Resource Name (ARN) of the fleet to deploy.
    */
  var fleet: Arn = js.native
  /**
    * A map that contains tag keys and tag values that are attached to the deployment job.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateDeploymentJobRequest {
  @scala.inline
  def apply(
    clientRequestToken: ClientRequestToken,
    deploymentApplicationConfigs: DeploymentApplicationConfigs,
    fleet: Arn
  ): CreateDeploymentJobRequest = {
    val __obj = js.Dynamic.literal(clientRequestToken = clientRequestToken.asInstanceOf[js.Any], deploymentApplicationConfigs = deploymentApplicationConfigs.asInstanceOf[js.Any], fleet = fleet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentJobRequest]
  }
  @scala.inline
  implicit class CreateDeploymentJobRequestOps[Self <: CreateDeploymentJobRequest] (val x: Self) extends AnyVal {
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
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeploymentApplicationConfigsVarargs(value: DeploymentApplicationConfig*): Self = this.set("deploymentApplicationConfigs", js.Array(value :_*))
    @scala.inline
    def setDeploymentApplicationConfigs(value: DeploymentApplicationConfigs): Self = this.set("deploymentApplicationConfigs", value.asInstanceOf[js.Any])
    @scala.inline
    def setFleet(value: Arn): Self = this.set("fleet", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeploymentConfig(value: DeploymentConfig): Self = this.set("deploymentConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentConfig: Self = this.set("deploymentConfig", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

