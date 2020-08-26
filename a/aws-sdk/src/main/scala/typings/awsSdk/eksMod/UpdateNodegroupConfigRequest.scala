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
  def apply(clusterName: String, nodegroupName: String): UpdateNodegroupConfigRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], nodegroupName = nodegroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNodegroupConfigRequest]
  }
  @scala.inline
  implicit class UpdateNodegroupConfigRequestOps[Self <: UpdateNodegroupConfigRequest] (val x: Self) extends AnyVal {
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
    def setClusterName(value: String): Self = this.set("clusterName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodegroupName(value: String): Self = this.set("nodegroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientRequestToken(value: String): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientRequestToken: Self = this.set("clientRequestToken", js.undefined)
    @scala.inline
    def setLabels(value: UpdateLabelsPayload): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setScalingConfig(value: NodegroupScalingConfig): Self = this.set("scalingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScalingConfig: Self = this.set("scalingConfig", js.undefined)
  }
  
}

