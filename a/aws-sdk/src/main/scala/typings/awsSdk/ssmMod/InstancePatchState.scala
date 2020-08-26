package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancePatchState extends js.Object {
  /**
    * The ID of the patch baseline used to patch the instance.
    */
  var BaselineId: typings.awsSdk.ssmMod.BaselineId = js.native
  /**
    * The number of patches from the patch baseline that were attempted to be installed during the last patching operation, but failed to install.
    */
  var FailedCount: js.UndefOr[PatchFailedCount] = js.native
  /**
    * An https URL or an Amazon S3 path-style URL to a list of patches to be installed. This patch installation list, which you maintain in an S3 bucket in YAML format and specify in the SSM document AWS-RunPatchBaseline, overrides the patches specified by the default patch baseline. For more information about the InstallOverrideList parameter, see About the SSM document AWS-RunPatchBaseline in the AWS Systems Manager User Guide.
    */
  var InstallOverrideList: js.UndefOr[typings.awsSdk.ssmMod.InstallOverrideList] = js.native
  /**
    * The number of patches from the patch baseline that are installed on the instance.
    */
  var InstalledCount: js.UndefOr[PatchInstalledCount] = js.native
  /**
    * The number of patches not specified in the patch baseline that are installed on the instance.
    */
  var InstalledOtherCount: js.UndefOr[PatchInstalledOtherCount] = js.native
  /**
    * The number of patches installed by Patch Manager since the last time the instance was rebooted.
    */
  var InstalledPendingRebootCount: js.UndefOr[PatchInstalledPendingRebootCount] = js.native
  /**
    * The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a status of InstalledRejected were typically installed before they were added to a RejectedPatches list.  If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of InstalledRejectedCount will always be 0 (zero). 
    */
  var InstalledRejectedCount: js.UndefOr[PatchInstalledRejectedCount] = js.native
  /**
    * The ID of the managed instance the high-level patch compliance information was collected for.
    */
  var InstanceId: typings.awsSdk.ssmMod.InstanceId = js.native
  /**
    * The time of the last attempt to patch the instance with NoReboot specified as the reboot option.
    */
  var LastNoRebootInstallOperationTime: js.UndefOr[DateTime] = js.native
  /**
    * The number of patches from the patch baseline that are applicable for the instance but aren't currently installed.
    */
  var MissingCount: js.UndefOr[PatchMissingCount] = js.native
  /**
    * The number of patches from the patch baseline that aren't applicable for the instance and therefore aren't installed on the instance. This number may be truncated if the list of patch names is very large. The number of patches beyond this limit are reported in UnreportedNotApplicableCount.
    */
  var NotApplicableCount: js.UndefOr[PatchNotApplicableCount] = js.native
  /**
    * The type of patching operation that was performed: SCAN (assess patch compliance state) or INSTALL (install missing patches).
    */
  var Operation: PatchOperationType = js.native
  /**
    * The time the most recent patching operation completed on the instance.
    */
  var OperationEndTime: DateTime = js.native
  /**
    * The time the most recent patching operation was started on the instance.
    */
  var OperationStartTime: DateTime = js.native
  /**
    * Placeholder information. This field will always be empty in the current release of the service.
    */
  var OwnerInformation: js.UndefOr[typings.awsSdk.ssmMod.OwnerInformation] = js.native
  /**
    * The name of the patch group the managed instance belongs to.
    */
  var PatchGroup: typings.awsSdk.ssmMod.PatchGroup = js.native
  /**
    * Indicates the reboot option specified in the patch baseline.  Reboot options apply to Install operations only. Reboots are not attempted for Patch Manager Scan operations.     RebootIfNeeded: Patch Manager tries to reboot the instance if it installed any patches, or if any patches are detected with a status of InstalledPendingReboot.    NoReboot: Patch Manager attempts to install missing packages without trying to reboot the system. Patches installed with this option are assigned a status of InstalledPendingReboot. These patches might not be in effect until a reboot is performed.  
    */
  var RebootOption: js.UndefOr[typings.awsSdk.ssmMod.RebootOption] = js.native
  /**
    * The ID of the patch baseline snapshot used during the patching operation when this compliance data was collected.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.ssmMod.SnapshotId] = js.native
  /**
    * The number of patches beyond the supported limit of NotApplicableCount that are not reported by name to Systems Manager Inventory.
    */
  var UnreportedNotApplicableCount: js.UndefOr[PatchUnreportedNotApplicableCount] = js.native
}

object InstancePatchState {
  @scala.inline
  def apply(
    BaselineId: BaselineId,
    InstanceId: InstanceId,
    Operation: PatchOperationType,
    OperationEndTime: DateTime,
    OperationStartTime: DateTime,
    PatchGroup: PatchGroup
  ): InstancePatchState = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], Operation = Operation.asInstanceOf[js.Any], OperationEndTime = OperationEndTime.asInstanceOf[js.Any], OperationStartTime = OperationStartTime.asInstanceOf[js.Any], PatchGroup = PatchGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancePatchState]
  }
  @scala.inline
  implicit class InstancePatchStateOps[Self <: InstancePatchState] (val x: Self) extends AnyVal {
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
    def setBaselineId(value: BaselineId): Self = this.set("BaselineId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: PatchOperationType): Self = this.set("Operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationEndTime(value: DateTime): Self = this.set("OperationEndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationStartTime(value: DateTime): Self = this.set("OperationStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatchGroup(value: PatchGroup): Self = this.set("PatchGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailedCount(value: PatchFailedCount): Self = this.set("FailedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedCount: Self = this.set("FailedCount", js.undefined)
    @scala.inline
    def setInstallOverrideList(value: InstallOverrideList): Self = this.set("InstallOverrideList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstallOverrideList: Self = this.set("InstallOverrideList", js.undefined)
    @scala.inline
    def setInstalledCount(value: PatchInstalledCount): Self = this.set("InstalledCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstalledCount: Self = this.set("InstalledCount", js.undefined)
    @scala.inline
    def setInstalledOtherCount(value: PatchInstalledOtherCount): Self = this.set("InstalledOtherCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstalledOtherCount: Self = this.set("InstalledOtherCount", js.undefined)
    @scala.inline
    def setInstalledPendingRebootCount(value: PatchInstalledPendingRebootCount): Self = this.set("InstalledPendingRebootCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstalledPendingRebootCount: Self = this.set("InstalledPendingRebootCount", js.undefined)
    @scala.inline
    def setInstalledRejectedCount(value: PatchInstalledRejectedCount): Self = this.set("InstalledRejectedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstalledRejectedCount: Self = this.set("InstalledRejectedCount", js.undefined)
    @scala.inline
    def setLastNoRebootInstallOperationTime(value: DateTime): Self = this.set("LastNoRebootInstallOperationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastNoRebootInstallOperationTime: Self = this.set("LastNoRebootInstallOperationTime", js.undefined)
    @scala.inline
    def setMissingCount(value: PatchMissingCount): Self = this.set("MissingCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMissingCount: Self = this.set("MissingCount", js.undefined)
    @scala.inline
    def setNotApplicableCount(value: PatchNotApplicableCount): Self = this.set("NotApplicableCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotApplicableCount: Self = this.set("NotApplicableCount", js.undefined)
    @scala.inline
    def setOwnerInformation(value: OwnerInformation): Self = this.set("OwnerInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerInformation: Self = this.set("OwnerInformation", js.undefined)
    @scala.inline
    def setRebootOption(value: RebootOption): Self = this.set("RebootOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRebootOption: Self = this.set("RebootOption", js.undefined)
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = this.set("SnapshotId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotId: Self = this.set("SnapshotId", js.undefined)
    @scala.inline
    def setUnreportedNotApplicableCount(value: PatchUnreportedNotApplicableCount): Self = this.set("UnreportedNotApplicableCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnreportedNotApplicableCount: Self = this.set("UnreportedNotApplicableCount", js.undefined)
  }
  
}

