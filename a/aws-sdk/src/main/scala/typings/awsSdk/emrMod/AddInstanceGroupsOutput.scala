package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddInstanceGroupsOutput extends js.Object {
  /**
    * The Amazon Resource Name of the cluster.
    */
  var ClusterArn: js.UndefOr[ArnType] = js.native
  /**
    * Instance group IDs of the newly created instance groups.
    */
  var InstanceGroupIds: js.UndefOr[InstanceGroupIdsList] = js.native
  /**
    * The job flow ID in which the instance groups are added.
    */
  var JobFlowId: js.UndefOr[XmlStringMaxLen256] = js.native
}

object AddInstanceGroupsOutput {
  @scala.inline
  def apply(
    ClusterArn: ArnType = null,
    InstanceGroupIds: InstanceGroupIdsList = null,
    JobFlowId: XmlStringMaxLen256 = null
  ): AddInstanceGroupsOutput = {
    val __obj = js.Dynamic.literal()
    if (ClusterArn != null) __obj.updateDynamic("ClusterArn")(ClusterArn.asInstanceOf[js.Any])
    if (InstanceGroupIds != null) __obj.updateDynamic("InstanceGroupIds")(InstanceGroupIds.asInstanceOf[js.Any])
    if (JobFlowId != null) __obj.updateDynamic("JobFlowId")(JobFlowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddInstanceGroupsOutput]
  }
}

