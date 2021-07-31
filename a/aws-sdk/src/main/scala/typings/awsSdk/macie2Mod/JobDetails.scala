package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobDetails extends StObject {
  
  /**
    * Specifies whether any one-time or recurring jobs are configured to analyze data in the bucket. Possible values are: TRUE - One or more jobs is configured to analyze data in the bucket, and at least one of those jobs has a status other than CANCELLED. FALSE - No jobs are configured to analyze data in the bucket, or all the jobs that are configured to analyze data in the bucket have a status of CANCELLED. UNKNOWN - An exception occurred when Amazon Macie attempted to retrieve job data for the bucket. 
    */
  var isDefinedInJob: js.UndefOr[IsDefinedInJob] = js.undefined
  
  /**
    * Specifies whether any recurring jobs are configured to analyze data in the bucket. Possible values are: TRUE - One or more recurring jobs is configured to analyze data in the bucket, and at least one of those jobs has a status other than CANCELLED. FALSE - No recurring jobs are configured to analyze data in the bucket, or all the recurring jobs that are configured to analyze data in the bucket have a status of CANCELLED. UNKNOWN - An exception occurred when Amazon Macie attempted to retrieve job data for the bucket.
    */
  var isMonitoredByJob: js.UndefOr[IsMonitoredByJob] = js.undefined
  
  /**
    * The unique identifier for the job that ran most recently (either the latest run of a recurring job or the only run of a one-time job) and is configured to analyze data in the bucket. This value is null if the value for the isDefinedInJob property is FALSE or UNKNOWN.
    */
  var lastJobId: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the job (lastJobId) started. If the job is a recurring job, this value indicates when the most recent run started. This value is null if the value for the isDefinedInJob property is FALSE or UNKNOWN.
    */
  var lastJobRunTime: js.UndefOr[timestampIso8601] = js.undefined
}
object JobDetails {
  
  @scala.inline
  def apply(): JobDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobDetails]
  }
  
  @scala.inline
  implicit class JobDetailsMutableBuilder[Self <: JobDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDefinedInJob(value: IsDefinedInJob): Self = StObject.set(x, "isDefinedInJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefinedInJobUndefined: Self = StObject.set(x, "isDefinedInJob", js.undefined)
    
    @scala.inline
    def setIsMonitoredByJob(value: IsMonitoredByJob): Self = StObject.set(x, "isMonitoredByJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMonitoredByJobUndefined: Self = StObject.set(x, "isMonitoredByJob", js.undefined)
    
    @scala.inline
    def setLastJobId(value: string): Self = StObject.set(x, "lastJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastJobIdUndefined: Self = StObject.set(x, "lastJobId", js.undefined)
    
    @scala.inline
    def setLastJobRunTime(value: timestampIso8601): Self = StObject.set(x, "lastJobRunTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastJobRunTimeUndefined: Self = StObject.set(x, "lastJobRunTime", js.undefined)
  }
}
