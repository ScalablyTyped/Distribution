package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelingJobForWorkteamSummary extends StObject {
  
  /**
    * The date and time that the labeling job was created.
    */
  var CreationTime: Timestamp
  
  /**
    * A unique identifier for a labeling job. You can use this to refer to a specific labeling job.
    */
  var JobReferenceCode: typings.awsSdk.sagemakerMod.JobReferenceCode
  
  /**
    * Provides information about the progress of a labeling job.
    */
  var LabelCounters: js.UndefOr[LabelCountersForWorkteam] = js.undefined
  
  /**
    * The name of the labeling job that the work team is assigned to.
    */
  var LabelingJobName: js.UndefOr[typings.awsSdk.sagemakerMod.LabelingJobName] = js.undefined
  
  /**
    * The configured number of workers per data object.
    */
  var NumberOfHumanWorkersPerDataObject: js.UndefOr[typings.awsSdk.sagemakerMod.NumberOfHumanWorkersPerDataObject] = js.undefined
  
  /**
    * 
    */
  var WorkRequesterAccountId: AccountId
}
object LabelingJobForWorkteamSummary {
  
  inline def apply(CreationTime: Timestamp, JobReferenceCode: JobReferenceCode, WorkRequesterAccountId: AccountId): LabelingJobForWorkteamSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], JobReferenceCode = JobReferenceCode.asInstanceOf[js.Any], WorkRequesterAccountId = WorkRequesterAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobForWorkteamSummary]
  }
  
  extension [Self <: LabelingJobForWorkteamSummary](x: Self) {
    
    inline def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setJobReferenceCode(value: JobReferenceCode): Self = StObject.set(x, "JobReferenceCode", value.asInstanceOf[js.Any])
    
    inline def setLabelCounters(value: LabelCountersForWorkteam): Self = StObject.set(x, "LabelCounters", value.asInstanceOf[js.Any])
    
    inline def setLabelCountersUndefined: Self = StObject.set(x, "LabelCounters", js.undefined)
    
    inline def setLabelingJobName(value: LabelingJobName): Self = StObject.set(x, "LabelingJobName", value.asInstanceOf[js.Any])
    
    inline def setLabelingJobNameUndefined: Self = StObject.set(x, "LabelingJobName", js.undefined)
    
    inline def setNumberOfHumanWorkersPerDataObject(value: NumberOfHumanWorkersPerDataObject): Self = StObject.set(x, "NumberOfHumanWorkersPerDataObject", value.asInstanceOf[js.Any])
    
    inline def setNumberOfHumanWorkersPerDataObjectUndefined: Self = StObject.set(x, "NumberOfHumanWorkersPerDataObject", js.undefined)
    
    inline def setWorkRequesterAccountId(value: AccountId): Self = StObject.set(x, "WorkRequesterAccountId", value.asInstanceOf[js.Any])
  }
}
