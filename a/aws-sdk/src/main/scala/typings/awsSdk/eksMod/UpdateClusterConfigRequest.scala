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
  def apply(
    name: String,
    clientRequestToken: String = null,
    logging: Logging = null,
    resourcesVpcConfig: VpcConfigRequest = null
  ): UpdateClusterConfigRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (resourcesVpcConfig != null) __obj.updateDynamic("resourcesVpcConfig")(resourcesVpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterConfigRequest]
  }
}

