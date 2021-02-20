package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePatchBaselineRequest extends StObject {
  
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
  implicit class UpdatePatchBaselineRequestMutableBuilder[Self <: UpdatePatchBaselineRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalRules(value: PatchRuleGroup): Self = StObject.set(x, "ApprovalRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalRulesUndefined: Self = StObject.set(x, "ApprovalRules", js.undefined)
    
    @scala.inline
    def setApprovedPatches(value: PatchIdList): Self = StObject.set(x, "ApprovedPatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovedPatchesComplianceLevel(value: PatchComplianceLevel): Self = StObject.set(x, "ApprovedPatchesComplianceLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovedPatchesComplianceLevelUndefined: Self = StObject.set(x, "ApprovedPatchesComplianceLevel", js.undefined)
    
    @scala.inline
    def setApprovedPatchesEnableNonSecurity(value: Boolean): Self = StObject.set(x, "ApprovedPatchesEnableNonSecurity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovedPatchesEnableNonSecurityUndefined: Self = StObject.set(x, "ApprovedPatchesEnableNonSecurity", js.undefined)
    
    @scala.inline
    def setApprovedPatchesUndefined: Self = StObject.set(x, "ApprovedPatches", js.undefined)
    
    @scala.inline
    def setApprovedPatchesVarargs(value: PatchId*): Self = StObject.set(x, "ApprovedPatches", js.Array(value :_*))
    
    @scala.inline
    def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: BaselineDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setGlobalFilters(value: PatchFilterGroup): Self = StObject.set(x, "GlobalFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalFiltersUndefined: Self = StObject.set(x, "GlobalFilters", js.undefined)
    
    @scala.inline
    def setName(value: BaselineName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRejectedPatches(value: PatchIdList): Self = StObject.set(x, "RejectedPatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectedPatchesAction(value: PatchAction): Self = StObject.set(x, "RejectedPatchesAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectedPatchesActionUndefined: Self = StObject.set(x, "RejectedPatchesAction", js.undefined)
    
    @scala.inline
    def setRejectedPatchesUndefined: Self = StObject.set(x, "RejectedPatches", js.undefined)
    
    @scala.inline
    def setRejectedPatchesVarargs(value: PatchId*): Self = StObject.set(x, "RejectedPatches", js.Array(value :_*))
    
    @scala.inline
    def setReplace(value: Boolean): Self = StObject.set(x, "Replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "Replace", js.undefined)
    
    @scala.inline
    def setSources(value: PatchSourceList): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "Sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: PatchSource*): Self = StObject.set(x, "Sources", js.Array(value :_*))
  }
}
