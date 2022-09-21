package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancePatchState extends StObject {
  
  /**
    * The ID of the patch baseline used to patch the managed node.
    */
  var BaselineId: typings.awsSdk.ssmMod.BaselineId
  
  /**
    * The number of managed nodes where patches that are specified as Critical for compliance reporting in the patch baseline aren't installed. These patches might be missing, have failed installation, were rejected, or were installed but awaiting a required managed node reboot. The status of these managed nodes is NON_COMPLIANT.
    */
  var CriticalNonCompliantCount: js.UndefOr[PatchCriticalNonCompliantCount] = js.undefined
  
  /**
    * The number of patches from the patch baseline that were attempted to be installed during the last patching operation, but failed to install.
    */
  var FailedCount: js.UndefOr[PatchFailedCount] = js.undefined
  
  /**
    * An https URL or an Amazon Simple Storage Service (Amazon S3) path-style URL to a list of patches to be installed. This patch installation list, which you maintain in an S3 bucket in YAML format and specify in the SSM document AWS-RunPatchBaseline, overrides the patches specified by the default patch baseline. For more information about the InstallOverrideList parameter, see About the AWS-RunPatchBaseline  SSM document in the Amazon Web Services Systems Manager User Guide.
    */
  var InstallOverrideList: js.UndefOr[typings.awsSdk.ssmMod.InstallOverrideList] = js.undefined
  
  /**
    * The number of patches from the patch baseline that are installed on the managed node.
    */
  var InstalledCount: js.UndefOr[PatchInstalledCount] = js.undefined
  
  /**
    * The number of patches not specified in the patch baseline that are installed on the managed node.
    */
  var InstalledOtherCount: js.UndefOr[PatchInstalledOtherCount] = js.undefined
  
  /**
    * The number of patches installed by Patch Manager since the last time the managed node was rebooted.
    */
  var InstalledPendingRebootCount: js.UndefOr[PatchInstalledPendingRebootCount] = js.undefined
  
  /**
    * The number of patches installed on a managed node that are specified in a RejectedPatches list. Patches with a status of InstalledRejected were typically installed before they were added to a RejectedPatches list.  If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of InstalledRejectedCount will always be 0 (zero). 
    */
  var InstalledRejectedCount: js.UndefOr[PatchInstalledRejectedCount] = js.undefined
  
  /**
    * The ID of the managed node the high-level patch compliance information was collected for.
    */
  var InstanceId: typings.awsSdk.ssmMod.InstanceId
  
  /**
    * The time of the last attempt to patch the managed node with NoReboot specified as the reboot option.
    */
  var LastNoRebootInstallOperationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of patches from the patch baseline that are applicable for the managed node but aren't currently installed.
    */
  var MissingCount: js.UndefOr[PatchMissingCount] = js.undefined
  
  /**
    * The number of patches from the patch baseline that aren't applicable for the managed node and therefore aren't installed on the node. This number may be truncated if the list of patch names is very large. The number of patches beyond this limit are reported in UnreportedNotApplicableCount.
    */
  var NotApplicableCount: js.UndefOr[PatchNotApplicableCount] = js.undefined
  
  /**
    * The type of patching operation that was performed: or     SCAN assesses the patch compliance state.    INSTALL installs missing patches.  
    */
  var Operation: PatchOperationType
  
  /**
    * The time the most recent patching operation completed on the managed node.
    */
  var OperationEndTime: js.Date
  
  /**
    * The time the most recent patching operation was started on the managed node.
    */
  var OperationStartTime: js.Date
  
  /**
    * The number of managed nodes with patches installed that are specified as other than Critical or Security but aren't compliant with the patch baseline. The status of these managed nodes is NON_COMPLIANT.
    */
  var OtherNonCompliantCount: js.UndefOr[PatchOtherNonCompliantCount] = js.undefined
  
  /**
    * Placeholder information. This field will always be empty in the current release of the service.
    */
  var OwnerInformation: js.UndefOr[typings.awsSdk.ssmMod.OwnerInformation] = js.undefined
  
  /**
    * The name of the patch group the managed node belongs to.
    */
  var PatchGroup: typings.awsSdk.ssmMod.PatchGroup
  
  /**
    * Indicates the reboot option specified in the patch baseline.  Reboot options apply to Install operations only. Reboots aren't attempted for Patch Manager Scan operations.     RebootIfNeeded: Patch Manager tries to reboot the managed node if it installed any patches, or if any patches are detected with a status of InstalledPendingReboot.    NoReboot: Patch Manager attempts to install missing packages without trying to reboot the system. Patches installed with this option are assigned a status of InstalledPendingReboot. These patches might not be in effect until a reboot is performed.  
    */
  var RebootOption: js.UndefOr[typings.awsSdk.ssmMod.RebootOption] = js.undefined
  
  /**
    * The number of managed nodes where patches that are specified as Security in a patch advisory aren't installed. These patches might be missing, have failed installation, were rejected, or were installed but awaiting a required managed node reboot. The status of these managed nodes is NON_COMPLIANT.
    */
  var SecurityNonCompliantCount: js.UndefOr[PatchSecurityNonCompliantCount] = js.undefined
  
  /**
    * The ID of the patch baseline snapshot used during the patching operation when this compliance data was collected.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.ssmMod.SnapshotId] = js.undefined
  
  /**
    * The number of patches beyond the supported limit of NotApplicableCount that aren't reported by name to Inventory. Inventory is a capability of Amazon Web Services Systems Manager.
    */
  var UnreportedNotApplicableCount: js.UndefOr[PatchUnreportedNotApplicableCount] = js.undefined
}
object InstancePatchState {
  
  inline def apply(
    BaselineId: BaselineId,
    InstanceId: InstanceId,
    Operation: PatchOperationType,
    OperationEndTime: js.Date,
    OperationStartTime: js.Date,
    PatchGroup: PatchGroup
  ): InstancePatchState = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], Operation = Operation.asInstanceOf[js.Any], OperationEndTime = OperationEndTime.asInstanceOf[js.Any], OperationStartTime = OperationStartTime.asInstanceOf[js.Any], PatchGroup = PatchGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancePatchState]
  }
  
  extension [Self <: InstancePatchState](x: Self) {
    
    inline def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
    
    inline def setCriticalNonCompliantCount(value: PatchCriticalNonCompliantCount): Self = StObject.set(x, "CriticalNonCompliantCount", value.asInstanceOf[js.Any])
    
    inline def setCriticalNonCompliantCountUndefined: Self = StObject.set(x, "CriticalNonCompliantCount", js.undefined)
    
    inline def setFailedCount(value: PatchFailedCount): Self = StObject.set(x, "FailedCount", value.asInstanceOf[js.Any])
    
    inline def setFailedCountUndefined: Self = StObject.set(x, "FailedCount", js.undefined)
    
    inline def setInstallOverrideList(value: InstallOverrideList): Self = StObject.set(x, "InstallOverrideList", value.asInstanceOf[js.Any])
    
    inline def setInstallOverrideListUndefined: Self = StObject.set(x, "InstallOverrideList", js.undefined)
    
    inline def setInstalledCount(value: PatchInstalledCount): Self = StObject.set(x, "InstalledCount", value.asInstanceOf[js.Any])
    
    inline def setInstalledCountUndefined: Self = StObject.set(x, "InstalledCount", js.undefined)
    
    inline def setInstalledOtherCount(value: PatchInstalledOtherCount): Self = StObject.set(x, "InstalledOtherCount", value.asInstanceOf[js.Any])
    
    inline def setInstalledOtherCountUndefined: Self = StObject.set(x, "InstalledOtherCount", js.undefined)
    
    inline def setInstalledPendingRebootCount(value: PatchInstalledPendingRebootCount): Self = StObject.set(x, "InstalledPendingRebootCount", value.asInstanceOf[js.Any])
    
    inline def setInstalledPendingRebootCountUndefined: Self = StObject.set(x, "InstalledPendingRebootCount", js.undefined)
    
    inline def setInstalledRejectedCount(value: PatchInstalledRejectedCount): Self = StObject.set(x, "InstalledRejectedCount", value.asInstanceOf[js.Any])
    
    inline def setInstalledRejectedCountUndefined: Self = StObject.set(x, "InstalledRejectedCount", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setLastNoRebootInstallOperationTime(value: js.Date): Self = StObject.set(x, "LastNoRebootInstallOperationTime", value.asInstanceOf[js.Any])
    
    inline def setLastNoRebootInstallOperationTimeUndefined: Self = StObject.set(x, "LastNoRebootInstallOperationTime", js.undefined)
    
    inline def setMissingCount(value: PatchMissingCount): Self = StObject.set(x, "MissingCount", value.asInstanceOf[js.Any])
    
    inline def setMissingCountUndefined: Self = StObject.set(x, "MissingCount", js.undefined)
    
    inline def setNotApplicableCount(value: PatchNotApplicableCount): Self = StObject.set(x, "NotApplicableCount", value.asInstanceOf[js.Any])
    
    inline def setNotApplicableCountUndefined: Self = StObject.set(x, "NotApplicableCount", js.undefined)
    
    inline def setOperation(value: PatchOperationType): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
    
    inline def setOperationEndTime(value: js.Date): Self = StObject.set(x, "OperationEndTime", value.asInstanceOf[js.Any])
    
    inline def setOperationStartTime(value: js.Date): Self = StObject.set(x, "OperationStartTime", value.asInstanceOf[js.Any])
    
    inline def setOtherNonCompliantCount(value: PatchOtherNonCompliantCount): Self = StObject.set(x, "OtherNonCompliantCount", value.asInstanceOf[js.Any])
    
    inline def setOtherNonCompliantCountUndefined: Self = StObject.set(x, "OtherNonCompliantCount", js.undefined)
    
    inline def setOwnerInformation(value: OwnerInformation): Self = StObject.set(x, "OwnerInformation", value.asInstanceOf[js.Any])
    
    inline def setOwnerInformationUndefined: Self = StObject.set(x, "OwnerInformation", js.undefined)
    
    inline def setPatchGroup(value: PatchGroup): Self = StObject.set(x, "PatchGroup", value.asInstanceOf[js.Any])
    
    inline def setRebootOption(value: RebootOption): Self = StObject.set(x, "RebootOption", value.asInstanceOf[js.Any])
    
    inline def setRebootOptionUndefined: Self = StObject.set(x, "RebootOption", js.undefined)
    
    inline def setSecurityNonCompliantCount(value: PatchSecurityNonCompliantCount): Self = StObject.set(x, "SecurityNonCompliantCount", value.asInstanceOf[js.Any])
    
    inline def setSecurityNonCompliantCountUndefined: Self = StObject.set(x, "SecurityNonCompliantCount", js.undefined)
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    inline def setUnreportedNotApplicableCount(value: PatchUnreportedNotApplicableCount): Self = StObject.set(x, "UnreportedNotApplicableCount", value.asInstanceOf[js.Any])
    
    inline def setUnreportedNotApplicableCountUndefined: Self = StObject.set(x, "UnreportedNotApplicableCount", js.undefined)
  }
}
