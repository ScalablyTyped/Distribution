package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNodegroupConfigRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.native
  /**
    * The name of the Amazon EKS cluster that the managed node group resides in.
    */
  var clusterName: String = js.native
  /**
    * The Kubernetes labels to be applied to the nodes in the node group after the update.
    */
  var labels: js.UndefOr[UpdateLabelsPayload] = js.native
  /**
    * The name of the managed node group to update.
    */
  var nodegroupName: String = js.native
  /**
    * The scaling configuration details for the Auto Scaling group after the update.
    */
  var scalingConfig: js.UndefOr[NodegroupScalingConfig] = js.native
}

object UpdateNodegroupConfigRequest {
  @scala.inline
  def apply(
    clusterName: String,
    nodegroupName: String,
    clientRequestToken: String = null,
    labels: UpdateLabelsPayload = null,
    scalingConfig: NodegroupScalingConfig = null
  ): UpdateNodegroupConfigRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], nodegroupName = nodegroupName.asInstanceOf[js.Any])
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (scalingConfig != null) __obj.updateDynamic("scalingConfig")(scalingConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNodegroupConfigRequest]
  }
}

