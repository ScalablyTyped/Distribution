package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkloadInput extends StObject {
  
  var AccountIds: js.UndefOr[WorkloadAccountIds] = js.undefined
  
  var ArchitecturalDesign: js.UndefOr[WorkloadArchitecturalDesign] = js.undefined
  
  var AwsRegions: js.UndefOr[WorkloadAwsRegions] = js.undefined
  
  var ClientRequestToken: typings.awsSdk.wellarchitectedMod.ClientRequestToken
  
  var Description: WorkloadDescription
  
  var Environment: WorkloadEnvironment
  
  var Industry: js.UndefOr[WorkloadIndustry] = js.undefined
  
  var IndustryType: js.UndefOr[WorkloadIndustryType] = js.undefined
  
  var Lenses: WorkloadLenses
  
  var NonAwsRegions: js.UndefOr[WorkloadNonAwsRegions] = js.undefined
  
  var Notes: js.UndefOr[typings.awsSdk.wellarchitectedMod.Notes] = js.undefined
  
  var PillarPriorities: js.UndefOr[WorkloadPillarPriorities] = js.undefined
  
  var ReviewOwner: js.UndefOr[WorkloadReviewOwner] = js.undefined
  
  /**
    * The tags to be associated with the workload.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  var WorkloadName: typings.awsSdk.wellarchitectedMod.WorkloadName
}
object CreateWorkloadInput {
  
  inline def apply(
    ClientRequestToken: ClientRequestToken,
    Description: WorkloadDescription,
    Environment: WorkloadEnvironment,
    Lenses: WorkloadLenses,
    WorkloadName: WorkloadName
  ): CreateWorkloadInput = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Environment = Environment.asInstanceOf[js.Any], Lenses = Lenses.asInstanceOf[js.Any], WorkloadName = WorkloadName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkloadInput]
  }
  
  extension [Self <: CreateWorkloadInput](x: Self) {
    
    inline def setAccountIds(value: WorkloadAccountIds): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "AccountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: AwsAccountId*): Self = StObject.set(x, "AccountIds", js.Array(value*))
    
    inline def setArchitecturalDesign(value: WorkloadArchitecturalDesign): Self = StObject.set(x, "ArchitecturalDesign", value.asInstanceOf[js.Any])
    
    inline def setArchitecturalDesignUndefined: Self = StObject.set(x, "ArchitecturalDesign", js.undefined)
    
    inline def setAwsRegions(value: WorkloadAwsRegions): Self = StObject.set(x, "AwsRegions", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionsUndefined: Self = StObject.set(x, "AwsRegions", js.undefined)
    
    inline def setAwsRegionsVarargs(value: AwsRegion*): Self = StObject.set(x, "AwsRegions", js.Array(value*))
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: WorkloadDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setEnvironment(value: WorkloadEnvironment): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    inline def setIndustry(value: WorkloadIndustry): Self = StObject.set(x, "Industry", value.asInstanceOf[js.Any])
    
    inline def setIndustryType(value: WorkloadIndustryType): Self = StObject.set(x, "IndustryType", value.asInstanceOf[js.Any])
    
    inline def setIndustryTypeUndefined: Self = StObject.set(x, "IndustryType", js.undefined)
    
    inline def setIndustryUndefined: Self = StObject.set(x, "Industry", js.undefined)
    
    inline def setLenses(value: WorkloadLenses): Self = StObject.set(x, "Lenses", value.asInstanceOf[js.Any])
    
    inline def setLensesVarargs(value: LensAlias*): Self = StObject.set(x, "Lenses", js.Array(value*))
    
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
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setWorkloadName(value: WorkloadName): Self = StObject.set(x, "WorkloadName", value.asInstanceOf[js.Any])
  }
}
