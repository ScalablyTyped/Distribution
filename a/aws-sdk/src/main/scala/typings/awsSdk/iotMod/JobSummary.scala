package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobSummary extends StObject {
  
  /**
    * The time, in seconds since the epoch, when the job completed.
    */
  var completedAt: js.UndefOr[DateType] = js.undefined
  
  /**
    * The time, in seconds since the epoch, when the job was created.
    */
  var createdAt: js.UndefOr[DateType] = js.undefined
  
  /**
    * The job ARN.
    */
  var jobArn: js.UndefOr[JobArn] = js.undefined
  
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: js.UndefOr[JobId] = js.undefined
  
  /**
    * The time, in seconds since the epoch, when the job was last updated.
    */
  var lastUpdatedAt: js.UndefOr[DateType] = js.undefined
  
  /**
    * The job summary status.
    */
  var status: js.UndefOr[JobStatus] = js.undefined
  
  /**
    * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is detected in a target. For example, a job will run on a thing when the thing is added to a target group, even after the job was completed by all things originally in the group.
    */
  var targetSelection: js.UndefOr[TargetSelection] = js.undefined
  
  /**
    * The ID of the thing group.
    */
  var thingGroupId: js.UndefOr[ThingGroupId] = js.undefined
}
object JobSummary {
  
  inline def apply(): JobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobSummary]
  }
  
  extension [Self <: JobSummary](x: Self) {
    
    inline def setCompletedAt(value: DateType): Self = StObject.set(x, "completedAt", value.asInstanceOf[js.Any])
    
    inline def setCompletedAtUndefined: Self = StObject.set(x, "completedAt", js.undefined)
    
    inline def setCreatedAt(value: DateType): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setJobArn(value: JobArn): Self = StObject.set(x, "jobArn", value.asInstanceOf[js.Any])
    
    inline def setJobArnUndefined: Self = StObject.set(x, "jobArn", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setLastUpdatedAt(value: DateType): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTargetSelection(value: TargetSelection): Self = StObject.set(x, "targetSelection", value.asInstanceOf[js.Any])
    
    inline def setTargetSelectionUndefined: Self = StObject.set(x, "targetSelection", js.undefined)
    
    inline def setThingGroupId(value: ThingGroupId): Self = StObject.set(x, "thingGroupId", value.asInstanceOf[js.Any])
    
    inline def setThingGroupIdUndefined: Self = StObject.set(x, "thingGroupId", js.undefined)
  }
}
