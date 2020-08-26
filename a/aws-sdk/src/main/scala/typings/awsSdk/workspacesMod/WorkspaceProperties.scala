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
    * The size of the root volume. For important information about how to modify the size of the root and user volumes, see Modify a WorkSpace.
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
    * The size of the user storage. For important information about how to modify the size of the root and user volumes, see Modify a WorkSpace.
    */
  var UserVolumeSizeGib: js.UndefOr[typings.awsSdk.workspacesMod.UserVolumeSizeGib] = js.native
}

object WorkspaceProperties {
  @scala.inline
  def apply(): WorkspaceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceProperties]
  }
  @scala.inline
  implicit class WorkspacePropertiesOps[Self <: WorkspaceProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComputeTypeName(value: Compute): Self = this.set("ComputeTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputeTypeName: Self = this.set("ComputeTypeName", js.undefined)
    @scala.inline
    def setRootVolumeSizeGib(value: RootVolumeSizeGib): Self = this.set("RootVolumeSizeGib", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootVolumeSizeGib: Self = this.set("RootVolumeSizeGib", js.undefined)
    @scala.inline
    def setRunningMode(value: RunningMode): Self = this.set("RunningMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunningMode: Self = this.set("RunningMode", js.undefined)
    @scala.inline
    def setRunningModeAutoStopTimeoutInMinutes(value: RunningModeAutoStopTimeoutInMinutes): Self = this.set("RunningModeAutoStopTimeoutInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunningModeAutoStopTimeoutInMinutes: Self = this.set("RunningModeAutoStopTimeoutInMinutes", js.undefined)
    @scala.inline
    def setUserVolumeSizeGib(value: UserVolumeSizeGib): Self = this.set("UserVolumeSizeGib", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserVolumeSizeGib: Self = this.set("UserVolumeSizeGib", js.undefined)
  }
  
}

