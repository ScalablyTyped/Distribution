package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentConfigInfo extends js.Object {
  /**
    * The destination platform type for the deployment (Lambda, Server, or ECS).
    */
  var computePlatform: js.UndefOr[ComputePlatform] = js.native
  /**
    * The time at which the deployment configuration was created.
    */
  var createTime: js.UndefOr[Timestamp] = js.native
  /**
    * The deployment configuration ID.
    */
  var deploymentConfigId: js.UndefOr[DeploymentConfigId] = js.native
  /**
    * The deployment configuration name.
    */
  var deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.native
  /**
    * Information about the number or percentage of minimum healthy instance.
    */
  var minimumHealthyHosts: js.UndefOr[MinimumHealthyHosts] = js.native
  /**
    * The configuration that specifies how the deployment traffic is routed. Used for deployments with a Lambda or ECS compute platform only.
    */
  var trafficRoutingConfig: js.UndefOr[TrafficRoutingConfig] = js.native
}

object DeploymentConfigInfo {
  @scala.inline
  def apply(): DeploymentConfigInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentConfigInfo]
  }
  @scala.inline
  implicit class DeploymentConfigInfoOps[Self <: DeploymentConfigInfo] (val x: Self) extends AnyVal {
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
    def setComputePlatform(value: ComputePlatform): Self = this.set("computePlatform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputePlatform: Self = this.set("computePlatform", js.undefined)
    @scala.inline
    def setCreateTime(value: Timestamp): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setDeploymentConfigId(value: DeploymentConfigId): Self = this.set("deploymentConfigId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentConfigId: Self = this.set("deploymentConfigId", js.undefined)
    @scala.inline
    def setDeploymentConfigName(value: DeploymentConfigName): Self = this.set("deploymentConfigName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentConfigName: Self = this.set("deploymentConfigName", js.undefined)
    @scala.inline
    def setMinimumHealthyHosts(value: MinimumHealthyHosts): Self = this.set("minimumHealthyHosts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumHealthyHosts: Self = this.set("minimumHealthyHosts", js.undefined)
    @scala.inline
    def setTrafficRoutingConfig(value: TrafficRoutingConfig): Self = this.set("trafficRoutingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrafficRoutingConfig: Self = this.set("trafficRoutingConfig", js.undefined)
  }
  
}

