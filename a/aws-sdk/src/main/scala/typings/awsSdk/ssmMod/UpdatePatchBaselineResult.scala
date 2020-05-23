package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePatchBaselineResult extends js.Object {
  /**
    * A set of rules used to include patches in the baseline.
    */
  var ApprovalRules: js.UndefOr[PatchRuleGroup] = js.native
  /**
    * A list of explicitly approved patches for the baseline.
    */
  var ApprovedPatches: js.UndefOr[PatchIdList] = js.native
  /**
    * The compliance severity level assigned to the patch baseline after the update completed.
    */
  var ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.native
  /**
    * Indicates whether the list of approved patches includes non-security updates that should be applied to the instances. The default value is 'false'. Applies to Linux instances only.
    */
  var ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the deleted patch baseline.
    */
  var BaselineId: js.UndefOr[typings.awsSdk.ssmMod.BaselineId] = js.native
  /**
    * The date when the patch baseline was created.
    */
  var CreatedDate: js.UndefOr[DateTime] = js.native
  /**
    * A description of the Patch Baseline.
    */
  var Description: js.UndefOr[BaselineDescription] = js.native
  /**
    * A set of global filters used to exclude patches from the baseline.
    */
  var GlobalFilters: js.UndefOr[PatchFilterGroup] = js.native
  /**
    * The date when the patch baseline was last modified.
    */
  var ModifiedDate: js.UndefOr[DateTime] = js.native
  /**
    * The name of the patch baseline.
    */
  var Name: js.UndefOr[BaselineName] = js.native
  /**
    * The operating system rule used by the updated patch baseline.
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.ssmMod.OperatingSystem] = js.native
  /**
    * A list of explicitly rejected patches for the baseline.
    */
  var RejectedPatches: js.UndefOr[PatchIdList] = js.native
  /**
    * The action specified to take on patches included in the RejectedPatches list. A patch can be allowed only if it is a dependency of another package, or blocked entirely along with packages that include it as a dependency.
    */
  var RejectedPatchesAction: js.UndefOr[PatchAction] = js.native
  /**
    * Information about the patches to use to update the instances, including target operating systems and source repositories. Applies to Linux instances only.
    */
  var Sources: js.UndefOr[PatchSourceList] = js.native
}

object UpdatePatchBaselineResult {
  @scala.inline
  def apply(
    ApprovalRules: PatchRuleGroup = null,
    ApprovedPatches: PatchIdList = null,
    ApprovedPatchesComplianceLevel: PatchComplianceLevel = null,
    ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean] = js.undefined,
    BaselineId: BaselineId = null,
    CreatedDate: DateTime = null,
    Description: BaselineDescription = null,
    GlobalFilters: PatchFilterGroup = null,
    ModifiedDate: DateTime = null,
    Name: BaselineName = null,
    OperatingSystem: OperatingSystem = null,
    RejectedPatches: PatchIdList = null,
    RejectedPatchesAction: PatchAction = null,
    Sources: PatchSourceList = null
  ): UpdatePatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    if (ApprovalRules != null) __obj.updateDynamic("ApprovalRules")(ApprovalRules.asInstanceOf[js.Any])
    if (ApprovedPatches != null) __obj.updateDynamic("ApprovedPatches")(ApprovedPatches.asInstanceOf[js.Any])
    if (ApprovedPatchesComplianceLevel != null) __obj.updateDynamic("ApprovedPatchesComplianceLevel")(ApprovedPatchesComplianceLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(ApprovedPatchesEnableNonSecurity)) __obj.updateDynamic("ApprovedPatchesEnableNonSecurity")(ApprovedPatchesEnableNonSecurity.get.asInstanceOf[js.Any])
    if (BaselineId != null) __obj.updateDynamic("BaselineId")(BaselineId.asInstanceOf[js.Any])
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (GlobalFilters != null) __obj.updateDynamic("GlobalFilters")(GlobalFilters.asInstanceOf[js.Any])
    if (ModifiedDate != null) __obj.updateDynamic("ModifiedDate")(ModifiedDate.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OperatingSystem != null) __obj.updateDynamic("OperatingSystem")(OperatingSystem.asInstanceOf[js.Any])
    if (RejectedPatches != null) __obj.updateDynamic("RejectedPatches")(RejectedPatches.asInstanceOf[js.Any])
    if (RejectedPatchesAction != null) __obj.updateDynamic("RejectedPatchesAction")(RejectedPatchesAction.asInstanceOf[js.Any])
    if (Sources != null) __obj.updateDynamic("Sources")(Sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePatchBaselineResult]
  }
}

