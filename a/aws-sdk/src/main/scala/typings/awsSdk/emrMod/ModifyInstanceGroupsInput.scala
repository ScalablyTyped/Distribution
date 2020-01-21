package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyInstanceGroupsInput extends js.Object {
  /**
    * The ID of the cluster to which the instance group belongs.
    */
  var ClusterId: js.UndefOr[typings.awsSdk.emrMod.ClusterId] = js.native
  /**
    * Instance groups to change.
    */
  var InstanceGroups: js.UndefOr[InstanceGroupModifyConfigList] = js.native
}

object ModifyInstanceGroupsInput {
  @scala.inline
  def apply(ClusterId: ClusterId = null, InstanceGroups: InstanceGroupModifyConfigList = null): ModifyInstanceGroupsInput = {
    val __obj = js.Dynamic.literal()
    if (ClusterId != null) __obj.updateDynamic("ClusterId")(ClusterId.asInstanceOf[js.Any])
    if (InstanceGroups != null) __obj.updateDynamic("InstanceGroups")(InstanceGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceGroupsInput]
  }
}

