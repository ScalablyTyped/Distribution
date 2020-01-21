package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePatchBaselineRequest extends js.Object {
  /**
    * A set of rules used to include patches in the baseline.
    */
  var ApprovalRules: js.UndefOr[PatchRuleGroup] = js.native
  /**
    * A list of explicitly approved patches for the baseline. For information about accepted formats for lists of approved patches and rejected patches, see Package Name Formats for Approved and Rejected Patch Lists in the AWS Systems Manager User Guide.
    */
  var ApprovedPatches: js.UndefOr[PatchIdList] = js.native
  /**
    * Assigns a new compliance severity level to an existing patch baseline.
    */
  var ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.native
  /**
    * Indicates whether the list of approved patches includes non-security updates that should be applied to the instances. The default value is 'false'. Applies to Linux instances only.
    */
  var ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the patch baseline to update.
    */
  var BaselineId: typings.awsSdk.ssmMod.BaselineId = js.native
  /**
    * A description of the patch baseline.
    */
  var Description: js.UndefOr[BaselineDescription] = js.native
  /**
    * A set of global filters used to include patches in the baseline.
    */
  var GlobalFilters: js.UndefOr[PatchFilterGroup] = js.native
  /**
    * The name of the patch baseline.
    */
  var Name: js.UndefOr[BaselineName] = js.native
  /**
    * A list of explicitly rejected patches for the baseline. For information about accepted formats for lists of approved patches and rejected patches, see Package Name Formats for Approved and Rejected Patch Lists in the AWS Systems Manager User Guide.
    */
  var RejectedPatches: js.UndefOr[PatchIdList] = js.native
  /**
    * The action for Patch Manager to take on patches included in the RejectedPackages list.    ALLOW_AS_DEPENDENCY: A package in the Rejected patches list is installed only if it is a dependency of another package. It is considered compliant with the patch baseline, and its status is reported as InstalledOther. This is the default action if no option is specified.    BLOCK: Packages in the RejectedPatches list, and packages that include them as dependencies, are not installed under any circumstances. If a package was installed before it was added to the Rejected patches list, it is considered non-compliant with the patch baseline, and its status is reported as InstalledRejected.  
    */
  var RejectedPatchesAction: js.UndefOr[PatchAction] = js.native
  /**
    * If True, then all fields that are required by the CreatePatchBaseline action are also required for this API request. Optional fields that are not specified are set to null.
    */
  var Replace: js.UndefOr[Boolean] = js.native
  /**
    * Information about the patches to use to update the instances, including target operating systems and source repositories. Applies to Linux instances only.
    */
  var Sources: js.UndefOr[PatchSourceList] = js.native
}

object UpdatePatchBaselineRequest {
  @scala.inline
  def apply(
    BaselineId: BaselineId,
    ApprovalRules: PatchRuleGroup = null,
    ApprovedPatches: PatchIdList = null,
    ApprovedPatchesComplianceLevel: PatchComplianceLevel = null,
    ApprovedPatchesEnableNonSecurity: js.UndefOr[scala.Boolean] = js.undefined,
    Description: BaselineDescription = null,
    GlobalFilters: PatchFilterGroup = null,
    Name: BaselineName = null,
    RejectedPatches: PatchIdList = null,
    RejectedPatchesAction: PatchAction = null,
    Replace: js.UndefOr[scala.Boolean] = js.undefined,
    Sources: PatchSourceList = null
  ): UpdatePatchBaselineRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any])
    if (ApprovalRules != null) __obj.updateDynamic("ApprovalRules")(ApprovalRules.asInstanceOf[js.Any])
    if (ApprovedPatches != null) __obj.updateDynamic("ApprovedPatches")(ApprovedPatches.asInstanceOf[js.Any])
    if (ApprovedPatchesComplianceLevel != null) __obj.updateDynamic("ApprovedPatchesComplianceLevel")(ApprovedPatchesComplianceLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(ApprovedPatchesEnableNonSecurity)) __obj.updateDynamic("ApprovedPatchesEnableNonSecurity")(ApprovedPatchesEnableNonSecurity.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (GlobalFilters != null) __obj.updateDynamic("GlobalFilters")(GlobalFilters.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RejectedPatches != null) __obj.updateDynamic("RejectedPatches")(RejectedPatches.asInstanceOf[js.Any])
    if (RejectedPatchesAction != null) __obj.updateDynamic("RejectedPatchesAction")(RejectedPatchesAction.asInstanceOf[js.Any])
    if (!js.isUndefined(Replace)) __obj.updateDynamic("Replace")(Replace.asInstanceOf[js.Any])
    if (Sources != null) __obj.updateDynamic("Sources")(Sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePatchBaselineRequest]
  }
}

