package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkloadInput extends StObject {
  
  var AccountIds: js.UndefOr[WorkloadAccountIds] = js.undefined
  
  var ArchitecturalDesign: js.UndefOr[WorkloadArchitecturalDesign] = js.undefined
  
  var AwsRegions: js.UndefOr[WorkloadAwsRegions] = js.undefined
  
  var Description: js.UndefOr[WorkloadDescription] = js.undefined
  
  var Environment: js.UndefOr[WorkloadEnvironment] = js.undefined
  
  var ImprovementStatus: js.UndefOr[WorkloadImprovementStatus] = js.undefined
  
  var Industry: js.UndefOr[WorkloadIndustry] = js.undefined
  
  var IndustryType: js.UndefOr[WorkloadIndustryType] = js.undefined
  
  /**
    * Flag indicating whether the workload owner has acknowledged that the Review owner field is required. If a Review owner is not added to the workload within 60 days of acknowledgement, access to the workload is restricted until an owner is added.
    */
  var IsReviewOwnerUpdateAcknowledged: js.UndefOr[typings.awsSdk.wellarchitectedMod.IsReviewOwnerUpdateAcknowledged] = js.undefined
  
  var NonAwsRegions: js.UndefOr[WorkloadNonAwsRegions] = js.undefined
  
  var Notes: js.UndefOr[typings.awsSdk.wellarchitectedMod.Notes] = js.undefined
  
  var PillarPriorities: js.UndefOr[WorkloadPillarPriorities] = js.undefined
  
  var ReviewOwner: js.UndefOr[WorkloadReviewOwner] = js.undefined
  
  var WorkloadId: typings.awsSdk.wellarchitectedMod.WorkloadId
  
  var WorkloadName: js.UndefOr[typings.awsSdk.wellarchitectedMod.WorkloadName] = js.undefined
}
object UpdateWorkloadInput {
  
  inline def apply(WorkloadId: WorkloadId): UpdateWorkloadInput = {
    val __obj = js.Dynamic.literal(WorkloadId = WorkloadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkloadInput]
  }
  
  extension [Self <: UpdateWorkloadInput](x: Self) {
    
    inline def setAccountIds(value: WorkloadAccountIds): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "AccountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: AwsAccountId*): Self = StObject.set(x, "AccountIds", js.Array(value*))
    
    inline def setArchitecturalDesign(value: WorkloadArchitecturalDesign): Self = StObject.set(x, "ArchitecturalDesign", value.asInstanceOf[js.Any])
    
    inline def setArchitecturalDesignUndefined: Self = StObject.set(x, "ArchitecturalDesign", js.undefined)
    
    inline def setAwsRegions(value: WorkloadAwsRegions): Self = StObject.set(x, "AwsRegions", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionsUndefined: Self = StObject.set(x, "AwsRegions", js.undefined)
    
    inline def setAwsRegionsVarargs(value: AwsRegion*): Self = StObject.set(x, "AwsRegions", js.Array(value*))
    
    inline def setDescription(value: WorkloadDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
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
    
    inline def setNonAwsRegions(value: WorkloadNonAwsRegions): Self = StObject.set(x, "NonAwsRegions", value.asInstanceOf[js.Any])
    
    inline def setNonAwsRegionsUndefined: Self = StObject.set(x, "NonAwsRegions", js.undefined)
    
    inline def setNonAwsRegionsVarargs(value: WorkloadNonAwsRegion*): Self = StObject.set(x, "NonAwsRegions", js.Array(value*))
    
    inline def setNotes(value: Notes): Self = StObject.set(x, "Notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "Notes", js.undefined)
    
    inline def setPillarPriorities(value: WorkloadPillarPriorities): Self = StObject.set(x, "PillarPriorities", value.asInstanceOf[js.Any])
    
    inline def setPillarPrioritiesUndefined: Self = StObject.set(x, "PillarPriorities", js.undefined)
    
    inline def setPillarPrioritiesVarargs(value: PillarId*): Self = StObject.set(x, "PillarPriorities", js.Array(value*))
    
    inline def setReviewOwner(value: WorkloadReviewOwner): Self = StObject.set(x, "ReviewOwner", value.asInstanceOf[js.Any])
    
    inline def setReviewOwnerUndefined: Self = StObject.set(x, "ReviewOwner", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadName(value: WorkloadName): Self = StObject.set(x, "WorkloadName", value.asInstanceOf[js.Any])
    
    inline def setWorkloadNameUndefined: Self = StObject.set(x, "WorkloadName", js.undefined)
  }
}
