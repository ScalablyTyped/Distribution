package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAutoScalingPolicyOutput extends js.Object {
  /**
    * The automatic scaling policy definition.
    */
  var AutoScalingPolicy: js.UndefOr[AutoScalingPolicyDescription] = js.native
  /**
    * The Amazon Resource Name of the cluster.
    */
  var ClusterArn: js.UndefOr[ArnType] = js.native
  /**
    * Specifies the ID of a cluster. The instance group to which the automatic scaling policy is applied is within this cluster.
    */
  var ClusterId: js.UndefOr[typings.awsSdk.emrMod.ClusterId] = js.native
  /**
    * Specifies the ID of the instance group to which the scaling policy is applied.
    */
  var InstanceGroupId: js.UndefOr[typings.awsSdk.emrMod.InstanceGroupId] = js.native
}

object PutAutoScalingPolicyOutput {
  @scala.inline
  def apply(
    AutoScalingPolicy: AutoScalingPolicyDescription = null,
    ClusterArn: ArnType = null,
    ClusterId: ClusterId = null,
    InstanceGroupId: InstanceGroupId = null
  ): PutAutoScalingPolicyOutput = {
    val __obj = js.Dynamic.literal()
    if (AutoScalingPolicy != null) __obj.updateDynamic("AutoScalingPolicy")(AutoScalingPolicy.asInstanceOf[js.Any])
    if (ClusterArn != null) __obj.updateDynamic("ClusterArn")(ClusterArn.asInstanceOf[js.Any])
    if (ClusterId != null) __obj.updateDynamic("ClusterId")(ClusterId.asInstanceOf[js.Any])
    if (InstanceGroupId != null) __obj.updateDynamic("InstanceGroupId")(InstanceGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAutoScalingPolicyOutput]
  }
}

