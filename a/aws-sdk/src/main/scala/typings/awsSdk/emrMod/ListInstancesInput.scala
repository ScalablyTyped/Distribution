package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInstancesInput extends js.Object {
  /**
    * The identifier of the cluster for which to list the instances.
    */
  var ClusterId: typings.awsSdk.emrMod.ClusterId = js.native
  /**
    * The unique identifier of the instance fleet.
    */
  var InstanceFleetId: js.UndefOr[typings.awsSdk.emrMod.InstanceFleetId] = js.native
  /**
    * The node type of the instance fleet. For example MASTER, CORE, or TASK.
    */
  var InstanceFleetType: js.UndefOr[typings.awsSdk.emrMod.InstanceFleetType] = js.native
  /**
    * The identifier of the instance group for which to list the instances.
    */
  var InstanceGroupId: js.UndefOr[typings.awsSdk.emrMod.InstanceGroupId] = js.native
  /**
    * The type of instance group for which to list the instances.
    */
  var InstanceGroupTypes: js.UndefOr[InstanceGroupTypeList] = js.native
  /**
    * A list of instance states that will filter the instances returned with this request.
    */
  var InstanceStates: js.UndefOr[InstanceStateList] = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.emrMod.Marker] = js.native
}

object ListInstancesInput {
  @scala.inline
  def apply(
    ClusterId: ClusterId,
    InstanceFleetId: InstanceFleetId = null,
    InstanceFleetType: InstanceFleetType = null,
    InstanceGroupId: InstanceGroupId = null,
    InstanceGroupTypes: InstanceGroupTypeList = null,
    InstanceStates: InstanceStateList = null,
    Marker: Marker = null
  ): ListInstancesInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    if (InstanceFleetId != null) __obj.updateDynamic("InstanceFleetId")(InstanceFleetId.asInstanceOf[js.Any])
    if (InstanceFleetType != null) __obj.updateDynamic("InstanceFleetType")(InstanceFleetType.asInstanceOf[js.Any])
    if (InstanceGroupId != null) __obj.updateDynamic("InstanceGroupId")(InstanceGroupId.asInstanceOf[js.Any])
    if (InstanceGroupTypes != null) __obj.updateDynamic("InstanceGroupTypes")(InstanceGroupTypes.asInstanceOf[js.Any])
    if (InstanceStates != null) __obj.updateDynamic("InstanceStates")(InstanceStates.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInstancesInput]
  }
}

