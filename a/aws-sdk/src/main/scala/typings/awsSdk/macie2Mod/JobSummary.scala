package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobSummary extends StObject {
  
  /**
    * The S3 buckets that the job is configured to analyze.
    */
  var bucketDefinitions: js.UndefOr[listOfS3BucketDefinitionForJob] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the job was created.
    */
  var createdAt: js.UndefOr[timestampIso8601] = js.undefined
  
  /**
    * The unique identifier for the job.
    */
  var jobId: js.UndefOr[string] = js.undefined
  
  /**
    * The current status of the job. Possible values are: CANCELLED - You cancelled the job, or you paused the job while it had a status of RUNNING and you didn't resume it within 30 days of pausing it. COMPLETE - For a one-time job, Amazon Macie finished processing the data specified for the job. This value doesn't apply to recurring jobs. IDLE - For a recurring job, the previous scheduled run is complete and the next scheduled run is pending. This value doesn't apply to one-time jobs. PAUSED - Amazon Macie started running the job but additional processing would exceed the monthly sensitive data discovery quota for your account or one or more member accounts that the job analyzes data for. RUNNING - For a one-time job, the job is in progress. For a recurring job, a scheduled run is in progress. USER_PAUSED - You paused the job. If you paused the job while it had a status of RUNNING and you don't resume the job within 30 days of pausing it, the job expires and is cancelled. To check the job's expiration date, refer to the UserPausedDetails.jobExpiresAt property.
    */
  var jobStatus: js.UndefOr[JobStatus] = js.undefined
  
  /**
    * The schedule for running the job. Possible values are: ONE_TIME - The job runs only once. SCHEDULED - The job runs on a daily, weekly, or monthly basis.
    */
  var jobType: js.UndefOr[JobType] = js.undefined
  
  /**
    * Specifies whether any account- or bucket-level access errors occurred when the job ran. For a recurring job, this value indicates the error status of the job's most recent run.
    */
  var lastRunErrorStatus: js.UndefOr[LastRunErrorStatus] = js.undefined
  
  /**
    * The custom name of the job.
    */
  var name: js.UndefOr[string] = js.undefined
  
  /**
    * If the current status of the job is USER_PAUSED, specifies when the job was paused and when the job will expire and be cancelled if it isn't resumed. This value is present only if the value for jobStatus is USER_PAUSED.
    */
  var userPausedDetails: js.UndefOr[UserPausedDetails] = js.undefined
}
object JobSummary {
  
  @scala.inline
  def apply(): JobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobSummary]
  }
  
  @scala.inline
  implicit class JobSummaryMutableBuilder[Self <: JobSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketDefinitions(value: listOfS3BucketDefinitionForJob): Self = StObject.set(x, "bucketDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketDefinitionsUndefined: Self = StObject.set(x, "bucketDefinitions", js.undefined)
    
    @scala.inline
    def setBucketDefinitionsVarargs(value: S3BucketDefinitionForJob*): Self = StObject.set(x, "bucketDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setCreatedAt(value: timestampIso8601): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setJobId(value: string): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    @scala.inline
    def setJobStatus(value: JobStatus): Self = StObject.set(x, "jobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStatusUndefined: Self = StObject.set(x, "jobStatus", js.undefined)
    
    @scala.inline
    def setJobType(value: JobType): Self = StObject.set(x, "jobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTypeUndefined: Self = StObject.set(x, "jobType", js.undefined)
    
    @scala.inline
    def setLastRunErrorStatus(value: LastRunErrorStatus): Self = StObject.set(x, "lastRunErrorStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRunErrorStatusUndefined: Self = StObject.set(x, "lastRunErrorStatus", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUserPausedDetails(value: UserPausedDetails): Self = StObject.set(x, "userPausedDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPausedDetailsUndefined: Self = StObject.set(x, "userPausedDetails", js.undefined)
  }
}
