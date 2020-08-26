package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateClusterConfigRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.native
  /**
    * Enable or disable exporting the Kubernetes control plane logs for your cluster to CloudWatch Logs. By default, cluster control plane logs aren't exported to CloudWatch Logs. For more information, see Amazon EKS Cluster Control Plane Logs in the  Amazon EKS User Guide .  CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For more information, see Amazon CloudWatch Pricing. 
    */
  var logging: js.UndefOr[Logging] = js.native
  /**
    * The name of the Amazon EKS cluster to update.
    */
  var name: String = js.native
  var resourcesVpcConfig: js.UndefOr[VpcConfigRequest] = js.native
}

object UpdateClusterConfigRequest {
  @scala.inline
  def apply(name: String): UpdateClusterConfigRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterConfigRequest]
  }
  @scala.inline
  implicit class UpdateClusterConfigRequestOps[Self <: UpdateClusterConfigRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientRequestToken(value: String): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientRequestToken: Self = this.set("clientRequestToken", js.undefined)
    @scala.inline
    def setLogging(value: Logging): Self = this.set("logging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    @scala.inline
    def setResourcesVpcConfig(value: VpcConfigRequest): Self = this.set("resourcesVpcConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourcesVpcConfig: Self = this.set("resourcesVpcConfig", js.undefined)
  }
  
}

