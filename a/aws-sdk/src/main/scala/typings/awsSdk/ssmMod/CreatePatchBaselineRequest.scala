package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePatchBaselineRequest extends StObject {
  
  /**
    * A set of rules used to include patches in the baseline.
    */
  var ApprovalRules: js.UndefOr[PatchRuleGroup] = js.native
  
  /**
    * A list of explicitly approved patches for the baseline. For information about accepted formats for lists of approved patches and rejected patches, see About package name formats for approved and rejected patch lists in the AWS Systems Manager User Guide.
    */
  var ApprovedPatches: js.UndefOr[PatchIdList] = js.native
  
  /**
    * Defines the compliance level for approved patches. This means that if an approved patch is reported as missing, this is the severity of the compliance violation. The default value is UNSPECIFIED.
    */
  var ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.native
  
  /**
    * Indicates whether the list of approved patches includes non-security updates that should be applied to the instances. The default value is 'false'. Applies to Linux instances only.
    */
  var ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean] = js.native
  
  /**
    * User-provided idempotency token.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.ssmMod.ClientToken] = js.native
  
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
  var Name: BaselineName = js.native
  
  /**
    * Defines the operating system the patch baseline applies to. The Default value is WINDOWS.
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.ssmMod.OperatingSystem] = js.native
  
  /**
    * A list of explicitly rejected patches for the baseline. For information about accepted formats for lists of approved patches and rejected patches, see About package name formats for approved and rejected patch lists in the AWS Systems Manager User Guide.
    */
  var RejectedPatches: js.UndefOr[PatchIdList] = js.native
  
  /**
    * The action for Patch Manager to take on patches included in the RejectedPackages list.    ALLOW_AS_DEPENDENCY: A package in the Rejected patches list is installed only if it is a dependency of another package. It is considered compliant with the patch baseline, and its status is reported as InstalledOther. This is the default action if no option is specified.    BLOCK: Packages in the RejectedPatches list, and packages that include them as dependencies, are not installed under any circumstances. If a package was installed before it was added to the Rejected patches list, it is considered non-compliant with the patch baseline, and its status is reported as InstalledRejected.  
    */
  var RejectedPatchesAction: js.UndefOr[PatchAction] = js.native
  
  /**
    * Information about the patches to use to update the instances, including target operating systems and source repositories. Applies to Linux instances only.
    */
  var Sources: js.UndefOr[PatchSourceList] = js.native
  
  /**
    * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag a patch baseline to identify the severity level of patches it specifies and the operating system family it applies to. In this case, you could specify the following key name/value pairs:    Key=PatchSeverity,Value=Critical     Key=OS,Value=Windows     To add tags to an existing patch baseline, use the AddTagsToResource action. 
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreatePatchBaselineRequest {
  
  @scala.inline
  def apply(Name: BaselineName): CreatePatchBaselineRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePatchBaselineRequest]
  }
  
  @scala.inline
  implicit class CreatePatchBaselineRequestMutableBuilder[Self <: CreatePatchBaselineRequest] (val x: Self) extends AnyVal {
    
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
    def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
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
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
