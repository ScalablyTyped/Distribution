package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobListEntry extends StObject {
  
  /**
    * The creation date for this job.
    */
  var CreationDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The optional description of this specific job, for example Important Photos 2016-08-11.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates that this job is a main job. A main job represents a successful request to create an export job. Main jobs aren't associated with any Snowballs. Instead, each main job will have at least one job part, and each job part is associated with a Snowball. It might take some time before the job parts associated with a particular main job are listed, because they are created after the main job is created.
    */
  var IsMaster: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The automatically generated ID for a job, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of this job.
    */
  var JobState: js.UndefOr[typings.awsSdk.snowballMod.JobState] = js.undefined
  
  /**
    * The type of job.
    */
  var JobType: js.UndefOr[typings.awsSdk.snowballMod.JobType] = js.undefined
  
  /**
    * The type of device used with this job.
    */
  var SnowballType: js.UndefOr[typings.awsSdk.snowballMod.SnowballType] = js.undefined
}
object JobListEntry {
  
  inline def apply(): JobListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobListEntry]
  }
  
  extension [Self <: JobListEntry](x: Self) {
    
    inline def setCreationDate(value: Timestamp): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIsMaster(value: Boolean): Self = StObject.set(x, "IsMaster", value.asInstanceOf[js.Any])
    
    inline def setIsMasterUndefined: Self = StObject.set(x, "IsMaster", js.undefined)
    
    inline def setJobId(value: String): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobState(value: JobState): Self = StObject.set(x, "JobState", value.asInstanceOf[js.Any])
    
    inline def setJobStateUndefined: Self = StObject.set(x, "JobState", js.undefined)
    
    inline def setJobType(value: JobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    inline def setJobTypeUndefined: Self = StObject.set(x, "JobType", js.undefined)
    
    inline def setSnowballType(value: SnowballType): Self = StObject.set(x, "SnowballType", value.asInstanceOf[js.Any])
    
    inline def setSnowballTypeUndefined: Self = StObject.set(x, "SnowballType", js.undefined)
  }
}
