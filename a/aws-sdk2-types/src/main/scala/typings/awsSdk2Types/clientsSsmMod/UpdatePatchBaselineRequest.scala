package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePatchBaselineRequest extends StObject {
  
  /**
    * A set of rules used to include patches in the baseline.
    */
  var ApprovalRules: js.UndefOr[PatchRuleGroup] = js.undefined
  
  /**
    * A list of explicitly approved patches for the baseline. For information about accepted formats for lists of approved patches and rejected patches, see About package name formats for approved and rejected patch lists in the Amazon Web Services Systems Manager User Guide.
    */
  var ApprovedPatches: js.UndefOr[PatchIdList] = js.undefined
  
  /**
    * Assigns a new compliance severity level to an existing patch baseline.
    */
  var ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined
  
  /**
    * Indicates whether the list of approved patches includes non-security updates that should be applied to the managed nodes. The default value is false. Applies to Linux managed nodes only.
    */
  var ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the patch baseline to update.
    */
  var BaselineId: typings.awsSdk2Types.clientsSsmMod.BaselineId
  
  /**
    * A description of the patch baseline.
    */
  var Description: js.UndefOr[BaselineDescription] = js.undefined
  
  /**
    * A set of global filters used to include patches in the baseline.
    */
  var GlobalFilters: js.UndefOr[PatchFilterGroup] = js.undefined
  
  /**
    * The name of the patch baseline.
    */
  var Name: js.UndefOr[BaselineName] = js.undefined
  
  /**
    * A list of explicitly rejected patches for the baseline. For information about accepted formats for lists of approved patches and rejected patches, see About package name formats for approved and rejected patch lists in the Amazon Web Services Systems Manager User Guide.
    */
  var RejectedPatches: js.UndefOr[PatchIdList] = js.undefined
  
  /**
    * The action for Patch Manager to take on patches included in the RejectedPackages list.     ALLOW_AS_DEPENDENCY : A package in the Rejected patches list is installed only if it is a dependency of another package. It is considered compliant with the patch baseline, and its status is reported as InstalledOther. This is the default action if no option is specified.     BLOCK : Packages in the RejectedPatches list, and packages that include them as dependencies, aren't installed under any circumstances. If a package was installed before it was added to the Rejected patches list, it is considered non-compliant with the patch baseline, and its status is reported as InstalledRejected.  
    */
  var RejectedPatchesAction: js.UndefOr[PatchAction] = js.undefined
  
  /**
    * If True, then all fields that are required by the CreatePatchBaseline operation are also required for this API request. Optional fields that aren't specified are set to null.
    */
  var Replace: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Information about the patches to use to update the managed nodes, including target operating systems and source repositories. Applies to Linux managed nodes only.
    */
  var Sources: js.UndefOr[PatchSourceList] = js.undefined
}
object UpdatePatchBaselineRequest {
  
  inline def apply(BaselineId: BaselineId): UpdatePatchBaselineRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePatchBaselineRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePatchBaselineRequest] (val x: Self) extends AnyVal {
    
    inline def setApprovalRules(value: PatchRuleGroup): Self = StObject.set(x, "ApprovalRules", value.asInstanceOf[js.Any])
    
    inline def setApprovalRulesUndefined: Self = StObject.set(x, "ApprovalRules", js.undefined)
    
    inline def setApprovedPatches(value: PatchIdList): Self = StObject.set(x, "ApprovedPatches", value.asInstanceOf[js.Any])
    
    inline def setApprovedPatchesComplianceLevel(value: PatchComplianceLevel): Self = StObject.set(x, "ApprovedPatchesComplianceLevel", value.asInstanceOf[js.Any])
    
    inline def setApprovedPatchesComplianceLevelUndefined: Self = StObject.set(x, "ApprovedPatchesComplianceLevel", js.undefined)
    
    inline def setApprovedPatchesEnableNonSecurity(value: Boolean): Self = StObject.set(x, "ApprovedPatchesEnableNonSecurity", value.asInstanceOf[js.Any])
    
    inline def setApprovedPatchesEnableNonSecurityUndefined: Self = StObject.set(x, "ApprovedPatchesEnableNonSecurity", js.undefined)
    
    inline def setApprovedPatchesUndefined: Self = StObject.set(x, "ApprovedPatches", js.undefined)
    
    inline def setApprovedPatchesVarargs(value: PatchId*): Self = StObject.set(x, "ApprovedPatches", js.Array(value*))
    
    inline def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: BaselineDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGlobalFilters(value: PatchFilterGroup): Self = StObject.set(x, "GlobalFilters", value.asInstanceOf[js.Any])
    
    inline def setGlobalFiltersUndefined: Self = StObject.set(x, "GlobalFilters", js.undefined)
    
    inline def setName(value: BaselineName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRejectedPatches(value: PatchIdList): Self = StObject.set(x, "RejectedPatches", value.asInstanceOf[js.Any])
    
    inline def setRejectedPatchesAction(value: PatchAction): Self = StObject.set(x, "RejectedPatchesAction", value.asInstanceOf[js.Any])
    
    inline def setRejectedPatchesActionUndefined: Self = StObject.set(x, "RejectedPatchesAction", js.undefined)
    
    inline def setRejectedPatchesUndefined: Self = StObject.set(x, "RejectedPatches", js.undefined)
    
    inline def setRejectedPatchesVarargs(value: PatchId*): Self = StObject.set(x, "RejectedPatches", js.Array(value*))
    
    inline def setReplace(value: Boolean): Self = StObject.set(x, "Replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "Replace", js.undefined)
    
    inline def setSources(value: PatchSourceList): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "Sources", js.undefined)
    
    inline def setSourcesVarargs(value: PatchSource*): Self = StObject.set(x, "Sources", js.Array(value*))
  }
}
