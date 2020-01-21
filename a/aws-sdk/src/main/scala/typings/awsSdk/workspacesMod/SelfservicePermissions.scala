package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelfservicePermissions extends js.Object {
  /**
    * Specifies whether users can change the compute type (bundle) for their WorkSpace.
    */
  var ChangeComputeType: js.UndefOr[ReconnectEnum] = js.native
  /**
    * Specifies whether users can increase the volume size of the drives on their WorkSpace.
    */
  var IncreaseVolumeSize: js.UndefOr[ReconnectEnum] = js.native
  /**
    * Specifies whether users can rebuild the operating system of a WorkSpace to its original state.
    */
  var RebuildWorkspace: js.UndefOr[ReconnectEnum] = js.native
  /**
    * Specifies whether users can restart their WorkSpace.
    */
  var RestartWorkspace: js.UndefOr[ReconnectEnum] = js.native
  /**
    * Specifies whether users can switch the running mode of their WorkSpace.
    */
  var SwitchRunningMode: js.UndefOr[ReconnectEnum] = js.native
}

object SelfservicePermissions {
  @scala.inline
  def apply(
    ChangeComputeType: ReconnectEnum = null,
    IncreaseVolumeSize: ReconnectEnum = null,
    RebuildWorkspace: ReconnectEnum = null,
    RestartWorkspace: ReconnectEnum = null,
    SwitchRunningMode: ReconnectEnum = null
  ): SelfservicePermissions = {
    val __obj = js.Dynamic.literal()
    if (ChangeComputeType != null) __obj.updateDynamic("ChangeComputeType")(ChangeComputeType.asInstanceOf[js.Any])
    if (IncreaseVolumeSize != null) __obj.updateDynamic("IncreaseVolumeSize")(IncreaseVolumeSize.asInstanceOf[js.Any])
    if (RebuildWorkspace != null) __obj.updateDynamic("RebuildWorkspace")(RebuildWorkspace.asInstanceOf[js.Any])
    if (RestartWorkspace != null) __obj.updateDynamic("RestartWorkspace")(RestartWorkspace.asInstanceOf[js.Any])
    if (SwitchRunningMode != null) __obj.updateDynamic("SwitchRunningMode")(SwitchRunningMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelfservicePermissions]
  }
}

