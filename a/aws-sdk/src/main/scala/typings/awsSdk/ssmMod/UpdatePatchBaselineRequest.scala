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
    * A list of explicitly approved patches for the baseline. For information about accepted formats for lists of approved patches and rejected patches, see About package name formats for approved and rejected patch lists in the AWS Systems Manager User Guide.
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
    * A list of explicitly rejected patches for the baseline. For information about accepted formats for lists of approved patches and rejected patches, see About package name formats for approved and rejected patch lists in the AWS Systems Manager User Guide.
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
  def apply(BaselineId: BaselineId): UpdatePatchBaselineRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePatchBaselineRequest]
  }
  @scala.inline
  implicit class UpdatePatchBaselineRequestOps[Self <: UpdatePatchBaselineRequest] (val x: Self) extends AnyVal {
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
    def setApprovalRules(value: PatchRuleGroup): Self = this.set("ApprovalRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovalRules: Self = this.set("ApprovalRules", js.undefined)
    @scala.inline
    def setApprovedPatchesVarargs(value: PatchId*): Self = this.set("ApprovedPatches", js.Array(value :_*))
    @scala.inline
    def setApprovedPatches(value: PatchIdList): Self = this.set("ApprovedPatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovedPatches: Self = this.set("ApprovedPatches", js.undefined)
    @scala.inline
    def setApprovedPatchesComplianceLevel(value: PatchComplianceLevel): Self = this.set("ApprovedPatchesComplianceLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovedPatchesComplianceLevel: Self = this.set("ApprovedPatchesComplianceLevel", js.undefined)
    @scala.inline
    def setApprovedPatchesEnableNonSecurity(value: Boolean): Self = this.set("ApprovedPatchesEnableNonSecurity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovedPatchesEnableNonSecurity: Self = this.set("ApprovedPatchesEnableNonSecurity", js.undefined)
    @scala.inline
    def setDescription(value: BaselineDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setGlobalFilters(value: PatchFilterGroup): Self = this.set("GlobalFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalFilters: Self = this.set("GlobalFilters", js.undefined)
    @scala.inline
    def setName(value: BaselineName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setRejectedPatchesVarargs(value: PatchId*): Self = this.set("RejectedPatches", js.Array(value :_*))
    @scala.inline
    def setRejectedPatches(value: PatchIdList): Self = this.set("RejectedPatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectedPatches: Self = this.set("RejectedPatches", js.undefined)
    @scala.inline
    def setRejectedPatchesAction(value: PatchAction): Self = this.set("RejectedPatchesAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectedPatchesAction: Self = this.set("RejectedPatchesAction", js.undefined)
    @scala.inline
    def setReplace(value: Boolean): Self = this.set("Replace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplace: Self = this.set("Replace", js.undefined)
    @scala.inline
    def setSourcesVarargs(value: PatchSource*): Self = this.set("Sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: PatchSourceList): Self = this.set("Sources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSources: Self = this.set("Sources", js.undefined)
  }
  
}

