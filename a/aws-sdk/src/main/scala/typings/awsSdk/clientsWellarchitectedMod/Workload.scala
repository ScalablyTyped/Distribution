package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Workload extends StObject {
  
  var AccountIds: js.UndefOr[WorkloadAccountIds] = js.undefined
  
  /**
    * List of AppRegistry application ARNs associated to the workload.
    */
  var Applications: js.UndefOr[WorkloadApplications] = js.undefined
  
  var ArchitecturalDesign: js.UndefOr[WorkloadArchitecturalDesign] = js.undefined
  
  var AwsRegions: js.UndefOr[WorkloadAwsRegions] = js.undefined
  
  var Description: js.UndefOr[WorkloadDescription] = js.undefined
  
  /**
    * Discovery configuration associated to the workload.
    */
  var DiscoveryConfig: js.UndefOr[WorkloadDiscoveryConfig] = js.undefined
  
  var Environment: js.UndefOr[WorkloadEnvironment] = js.undefined
  
  var ImprovementStatus: js.UndefOr[WorkloadImprovementStatus] = js.undefined
  
  var Industry: js.UndefOr[WorkloadIndustry] = js.undefined
  
  var IndustryType: js.UndefOr[WorkloadIndustryType] = js.undefined
  
  /**
    * Flag indicating whether the workload owner has acknowledged that the Review owner field is required. If a Review owner is not added to the workload within 60 days of acknowledgement, access to the workload is restricted until an owner is added.
    */
  var IsReviewOwnerUpdateAcknowledged: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.IsReviewOwnerUpdateAcknowledged] = js.undefined
  
  var Lenses: js.UndefOr[WorkloadLenses] = js.undefined
  
  var NonAwsRegions: js.UndefOr[WorkloadNonAwsRegions] = js.undefined
  
  var Notes: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.Notes] = js.undefined
  
  var Owner: js.UndefOr[AwsAccountId] = js.undefined
  
  var PillarPriorities: js.UndefOr[WorkloadPillarPriorities] = js.undefined
  
  var ReviewOwner: js.UndefOr[WorkloadReviewOwner] = js.undefined
  
  var ReviewRestrictionDate: js.UndefOr[js.Date] = js.undefined
  
  var RiskCounts: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.RiskCounts] = js.undefined
  
  /**
    * The ID assigned to the share invitation.
    */
  var ShareInvitationId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.ShareInvitationId] = js.undefined
  
  /**
    * The tags associated with the workload.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  var WorkloadArn: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.WorkloadArn] = js.undefined
  
  var WorkloadId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.WorkloadId] = js.undefined
  
  var WorkloadName: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.WorkloadName] = js.undefined
}
object Workload {
  
  inline def apply(): Workload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workload]
  }
  
  extension [Self <: Workload](x: Self) {
    
    inline def setAccountIds(value: WorkloadAccountIds): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "AccountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: AwsAccountId*): Self = StObject.set(x, "AccountIds", js.Array(value*))
    
    inline def setApplications(value: WorkloadApplications): Self = StObject.set(x, "Applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsUndefined: Self = StObject.set(x, "Applications", js.undefined)
    
    inline def setApplicationsVarargs(value: ApplicationArn*): Self = StObject.set(x, "Applications", js.Array(value*))
    
    inline def setArchitecturalDesign(value: WorkloadArchitecturalDesign): Self = StObject.set(x, "ArchitecturalDesign", value.asInstanceOf[js.Any])
    
    inline def setArchitecturalDesignUndefined: Self = StObject.set(x, "ArchitecturalDesign", js.undefined)
    
    inline def setAwsRegions(value: WorkloadAwsRegions): Self = StObject.set(x, "AwsRegions", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionsUndefined: Self = StObject.set(x, "AwsRegions", js.undefined)
    
    inline def setAwsRegionsVarargs(value: AwsRegion*): Self = StObject.set(x, "AwsRegions", js.Array(value*))
    
    inline def setDescription(value: WorkloadDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDiscoveryConfig(value: WorkloadDiscoveryConfig): Self = StObject.set(x, "DiscoveryConfig", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryConfigUndefined: Self = StObject.set(x, "DiscoveryConfig", js.undefined)
    
    inline def setEnvironment(value: WorkloadEnvironment): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    inline def setImprovementStatus(value: WorkloadImprovementStatus): Self = StObject.set(x, "ImprovementStatus", value.asInstanceOf[js.Any])
    
    inline def setImprovementStatusUndefined: Self = StObject.set(x, "ImprovementStatus", js.undefined)
    
    inline def setIndustry(value: WorkloadIndustry): Self = StObject.set(x, "Industry", value.asInstanceOf[js.Any])
    
    inline def setIndustryType(value: WorkloadIndustryType): Self = StObject.set(x, "IndustryType", value.asInstanceOf[js.Any])
    
    inline def setIndustryTypeUndefined: Self = StObject.set(x, "IndustryType", js.undefined)
    
    inline def setIndustryUndefined: Self = StObject.set(x, "Industry", js.undefined)
    
    inline def setIsReviewOwnerUpdateAcknowledged(value: IsReviewOwnerUpdateAcknowledged): Self = StObject.set(x, "IsReviewOwnerUpdateAcknowledged", value.asInstanceOf[js.Any])
    
    inline def setIsReviewOwnerUpdateAcknowledgedUndefined: Self = StObject.set(x, "IsReviewOwnerUpdateAcknowledged", js.undefined)
    
    inline def setLenses(value: WorkloadLenses): Self = StObject.set(x, "Lenses", value.asInstanceOf[js.Any])
    
    inline def setLensesUndefined: Self = StObject.set(x, "Lenses", js.undefined)
    
    inline def setLensesVarargs(value: LensAlias*): Self = StObject.set(x, "Lenses", js.Array(value*))
    
    inline def setNonAwsRegions(value: WorkloadNonAwsRegions): Self = StObject.set(x, "NonAwsRegions", value.asInstanceOf[js.Any])
    
    inline def setNonAwsRegionsUndefined: Self = StObject.set(x, "NonAwsRegions", js.undefined)
    
    inline def setNonAwsRegionsVarargs(value: WorkloadNonAwsRegion*): Self = StObject.set(x, "NonAwsRegions", js.Array(value*))
    
    inline def setNotes(value: Notes): Self = StObject.set(x, "Notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "Notes", js.undefined)
    
    inline def setOwner(value: AwsAccountId): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setPillarPriorities(value: WorkloadPillarPriorities): Self = StObject.set(x, "PillarPriorities", value.asInstanceOf[js.Any])
    
    inline def setPillarPrioritiesUndefined: Self = StObject.set(x, "PillarPriorities", js.undefined)
    
    inline def setPillarPrioritiesVarargs(value: PillarId*): Self = StObject.set(x, "PillarPriorities", js.Array(value*))
    
    inline def setReviewOwner(value: WorkloadReviewOwner): Self = StObject.set(x, "ReviewOwner", value.asInstanceOf[js.Any])
    
    inline def setReviewOwnerUndefined: Self = StObject.set(x, "ReviewOwner", js.undefined)
    
    inline def setReviewRestrictionDate(value: js.Date): Self = StObject.set(x, "ReviewRestrictionDate", value.asInstanceOf[js.Any])
    
    inline def setReviewRestrictionDateUndefined: Self = StObject.set(x, "ReviewRestrictionDate", js.undefined)
    
    inline def setRiskCounts(value: RiskCounts): Self = StObject.set(x, "RiskCounts", value.asInstanceOf[js.Any])
    
    inline def setRiskCountsUndefined: Self = StObject.set(x, "RiskCounts", js.undefined)
    
    inline def setShareInvitationId(value: ShareInvitationId): Self = StObject.set(x, "ShareInvitationId", value.asInstanceOf[js.Any])
    
    inline def setShareInvitationIdUndefined: Self = StObject.set(x, "ShareInvitationId", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
    
    inline def setWorkloadArn(value: WorkloadArn): Self = StObject.set(x, "WorkloadArn", value.asInstanceOf[js.Any])
    
    inline def setWorkloadArnUndefined: Self = StObject.set(x, "WorkloadArn", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdUndefined: Self = StObject.set(x, "WorkloadId", js.undefined)
    
    inline def setWorkloadName(value: WorkloadName): Self = StObject.set(x, "WorkloadName", value.asInstanceOf[js.Any])
    
    inline def setWorkloadNameUndefined: Self = StObject.set(x, "WorkloadName", js.undefined)
  }
}
