package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaselineOverride extends StObject {
  
  var ApprovalRules: js.UndefOr[PatchRuleGroup] = js.undefined
  
  /**
    * A list of explicitly approved patches for the baseline. For information about accepted formats for lists of approved patches and rejected patches, see About package name formats for approved and rejected patch lists in the Amazon Web Services Systems Manager User Guide.
    */
  var ApprovedPatches: js.UndefOr[PatchIdList] = js.undefined
  
  /**
    * Defines the compliance level for approved patches. When an approved patch is reported as missing, this value describes the severity of the compliance violation.
    */
  var ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined
  
  /**
    * Indicates whether the list of approved patches includes non-security updates that should be applied to the managed nodes. The default value is false. Applies to Linux managed nodes only.
    */
  var ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean] = js.undefined
  
  var GlobalFilters: js.UndefOr[PatchFilterGroup] = js.undefined
  
  /**
    * The operating system rule used by the patch baseline override.
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.OperatingSystem] = js.undefined
  
  /**
    * A list of explicitly rejected patches for the baseline. For information about accepted formats for lists of approved patches and rejected patches, see About package name formats for approved and rejected patch lists in the Amazon Web Services Systems Manager User Guide.
    */
  var RejectedPatches: js.UndefOr[PatchIdList] = js.undefined
  
  /**
    * The action for Patch Manager to take on patches included in the RejectedPackages list. A patch can be allowed only if it is a dependency of another package, or blocked entirely along with packages that include it as a dependency.
    */
  var RejectedPatchesAction: js.UndefOr[PatchAction] = js.undefined
  
  /**
    * Information about the patches to use to update the managed nodes, including target operating systems and source repositories. Applies to Linux managed nodes only.
    */
  var Sources: js.UndefOr[PatchSourceList] = js.undefined
}
object BaselineOverride {
  
  inline def apply(): BaselineOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaselineOverride]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaselineOverride] (val x: Self) extends AnyVal {
    
    inline def setApprovalRules(value: PatchRuleGroup): Self = StObject.set(x, "ApprovalRules", value.asInstanceOf[js.Any])
    
    inline def setApprovalRulesUndefined: Self = StObject.set(x, "ApprovalRules", js.undefined)
    
    inline def setApprovedPatches(value: PatchIdList): Self = StObject.set(x, "ApprovedPatches", value.asInstanceOf[js.Any])
    
    inline def setApprovedPatchesComplianceLevel(value: PatchComplianceLevel): Self = StObject.set(x, "ApprovedPatchesComplianceLevel", value.asInstanceOf[js.Any])
    
    inline def setApprovedPatchesComplianceLevelUndefined: Self = StObject.set(x, "ApprovedPatchesComplianceLevel", js.undefined)
    
    inline def setApprovedPatchesEnableNonSecurity(value: Boolean): Self = StObject.set(x, "ApprovedPatchesEnableNonSecurity", value.asInstanceOf[js.Any])
    
    inline def setApprovedPatchesEnableNonSecurityUndefined: Self = StObject.set(x, "ApprovedPatchesEnableNonSecurity", js.undefined)
    
    inline def setApprovedPatchesUndefined: Self = StObject.set(x, "ApprovedPatches", js.undefined)
    
    inline def setApprovedPatchesVarargs(value: PatchId*): Self = StObject.set(x, "ApprovedPatches", js.Array(value*))
    
    inline def setGlobalFilters(value: PatchFilterGroup): Self = StObject.set(x, "GlobalFilters", value.asInstanceOf[js.Any])
    
    inline def setGlobalFiltersUndefined: Self = StObject.set(x, "GlobalFilters", js.undefined)
    
    inline def setOperatingSystem(value: OperatingSystem): Self = StObject.set(x, "OperatingSystem", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemUndefined: Self = StObject.set(x, "OperatingSystem", js.undefined)
    
    inline def setRejectedPatches(value: PatchIdList): Self = StObject.set(x, "RejectedPatches", value.asInstanceOf[js.Any])
    
    inline def setRejectedPatchesAction(value: PatchAction): Self = StObject.set(x, "RejectedPatchesAction", value.asInstanceOf[js.Any])
    
    inline def setRejectedPatchesActionUndefined: Self = StObject.set(x, "RejectedPatchesAction", js.undefined)
    
    inline def setRejectedPatchesUndefined: Self = StObject.set(x, "RejectedPatches", js.undefined)
    
    inline def setRejectedPatchesVarargs(value: PatchId*): Self = StObject.set(x, "RejectedPatches", js.Array(value*))
    
    inline def setSources(value: PatchSourceList): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "Sources", js.undefined)
    
    inline def setSourcesVarargs(value: PatchSource*): Self = StObject.set(x, "Sources", js.Array(value*))
  }
}
