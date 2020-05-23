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
    PatchGroup: PatchGroup,
    FailedCount: js.UndefOr[PatchFailedCount] = js.undefined,
    InstallOverrideList: InstallOverrideList = null,
    InstalledCount: js.UndefOr[PatchInstalledCount] = js.undefined,
    InstalledOtherCount: js.UndefOr[PatchInstalledOtherCount] = js.undefined,
    InstalledPendingRebootCount: js.UndefOr[PatchInstalledPendingRebootCount] = js.undefined,
    InstalledRejectedCount: js.UndefOr[PatchInstalledRejectedCount] = js.undefined,
    LastNoRebootInstallOperationTime: DateTime = null,
    MissingCount: js.UndefOr[PatchMissingCount] = js.undefined,
    NotApplicableCount: js.UndefOr[PatchNotApplicableCount] = js.undefined,
    OwnerInformation: OwnerInformation = null,
    RebootOption: RebootOption = null,
    SnapshotId: SnapshotId = null,
    UnreportedNotApplicableCount: js.UndefOr[PatchUnreportedNotApplicableCount] = js.undefined
  ): InstancePatchState = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], Operation = Operation.asInstanceOf[js.Any], OperationEndTime = OperationEndTime.asInstanceOf[js.Any], OperationStartTime = OperationStartTime.asInstanceOf[js.Any], PatchGroup = PatchGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(FailedCount)) __obj.updateDynamic("FailedCount")(FailedCount.get.asInstanceOf[js.Any])
    if (InstallOverrideList != null) __obj.updateDynamic("InstallOverrideList")(InstallOverrideList.asInstanceOf[js.Any])
    if (!js.isUndefined(InstalledCount)) __obj.updateDynamic("InstalledCount")(InstalledCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(InstalledOtherCount)) __obj.updateDynamic("InstalledOtherCount")(InstalledOtherCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(InstalledPendingRebootCount)) __obj.updateDynamic("InstalledPendingRebootCount")(InstalledPendingRebootCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(InstalledRejectedCount)) __obj.updateDynamic("InstalledRejectedCount")(InstalledRejectedCount.get.asInstanceOf[js.Any])
    if (LastNoRebootInstallOperationTime != null) __obj.updateDynamic("LastNoRebootInstallOperationTime")(LastNoRebootInstallOperationTime.asInstanceOf[js.Any])
    if (!js.isUndefined(MissingCount)) __obj.updateDynamic("MissingCount")(MissingCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(NotApplicableCount)) __obj.updateDynamic("NotApplicableCount")(NotApplicableCount.get.asInstanceOf[js.Any])
    if (OwnerInformation != null) __obj.updateDynamic("OwnerInformation")(OwnerInformation.asInstanceOf[js.Any])
    if (RebootOption != null) __obj.updateDynamic("RebootOption")(RebootOption.asInstanceOf[js.Any])
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId.asInstanceOf[js.Any])
    if (!js.isUndefined(UnreportedNotApplicableCount)) __obj.updateDynamic("UnreportedNotApplicableCount")(UnreportedNotApplicableCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancePatchState]
  }
}

