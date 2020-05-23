package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceProperties extends js.Object {
  /**
    * The compute type. For more information, see Amazon WorkSpaces Bundles.
    */
  var ComputeTypeName: js.UndefOr[Compute] = js.native
  /**
    * The size of the root volume.
    */
  var RootVolumeSizeGib: js.UndefOr[typings.awsSdk.workspacesMod.RootVolumeSizeGib] = js.native
  /**
    * The running mode. For more information, see Manage the WorkSpace Running Mode.
    */
  var RunningMode: js.UndefOr[typings.awsSdk.workspacesMod.RunningMode] = js.native
  /**
    * The time after a user logs off when WorkSpaces are automatically stopped. Configured in 60-minute intervals.
    */
  var RunningModeAutoStopTimeoutInMinutes: js.UndefOr[typings.awsSdk.workspacesMod.RunningModeAutoStopTimeoutInMinutes] = js.native
  /**
    * The size of the user storage.
    */
  var UserVolumeSizeGib: js.UndefOr[typings.awsSdk.workspacesMod.UserVolumeSizeGib] = js.native
}

object WorkspaceProperties {
  @scala.inline
  def apply(
    ComputeTypeName: Compute = null,
    RootVolumeSizeGib: js.UndefOr[RootVolumeSizeGib] = js.undefined,
    RunningMode: RunningMode = null,
    RunningModeAutoStopTimeoutInMinutes: js.UndefOr[RunningModeAutoStopTimeoutInMinutes] = js.undefined,
    UserVolumeSizeGib: js.UndefOr[UserVolumeSizeGib] = js.undefined
  ): WorkspaceProperties = {
    val __obj = js.Dynamic.literal()
    if (ComputeTypeName != null) __obj.updateDynamic("ComputeTypeName")(ComputeTypeName.asInstanceOf[js.Any])
    if (!js.isUndefined(RootVolumeSizeGib)) __obj.updateDynamic("RootVolumeSizeGib")(RootVolumeSizeGib.get.asInstanceOf[js.Any])
    if (RunningMode != null) __obj.updateDynamic("RunningMode")(RunningMode.asInstanceOf[js.Any])
    if (!js.isUndefined(RunningModeAutoStopTimeoutInMinutes)) __obj.updateDynamic("RunningModeAutoStopTimeoutInMinutes")(RunningModeAutoStopTimeoutInMinutes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(UserVolumeSizeGib)) __obj.updateDynamic("UserVolumeSizeGib")(UserVolumeSizeGib.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceProperties]
  }
}

