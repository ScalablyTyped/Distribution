package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePatchBaselineResult extends StObject {
  
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
  def apply(): UpdatePatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePatchBaselineResult]
  }
  
  @scala.inline
  implicit class UpdatePatchBaselineResultMutableBuilder[Self <: UpdatePatchBaselineResult] (val x: Self) extends AnyVal {
    
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
    def setBaselineIdUndefined: Self = StObject.set(x, "BaselineId", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: DateTime): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    @scala.inline
    def setDescription(value: BaselineDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setGlobalFilters(value: PatchFilterGroup): Self = StObject.set(x, "GlobalFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalFiltersUndefined: Self = StObject.set(x, "GlobalFilters", js.undefined)
    
    @scala.inline
    def setModifiedDate(value: DateTime): Self = StObject.set(x, "ModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedDateUndefined: Self = StObject.set(x, "ModifiedDate", js.undefined)
    
    @scala.inline
    def setName(value: BaselineName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOperatingSystem(value: OperatingSystem): Self = StObject.set(x, "OperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemUndefined: Self = StObject.set(x, "OperatingSystem", js.undefined)
    
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
    def setSources(value: PatchSourceList): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "Sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: PatchSource*): Self = StObject.set(x, "Sources", js.Array(value :_*))
  }
}
