package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobDetails extends StObject {
  
  /**
    * Specifies whether any one-time or recurring jobs are configured to analyze data in the bucket. Possible values are: TRUE - The bucket is explicitly included in the bucket definition (S3BucketDefinitionForJob) for one or more jobs and at least one of those jobs has a status other than CANCELLED. Or the bucket matched the bucket criteria (S3BucketCriteriaForJob) for at least one job that previously ran. FALSE - The bucket isn't explicitly included in the bucket definition (S3BucketDefinitionForJob) for any jobs, all the jobs that explicitly include the bucket in their bucket definitions have a status of CANCELLED, or the bucket didn't match the bucket criteria (S3BucketCriteriaForJob) for any jobs that previously ran. UNKNOWN - An exception occurred when Amazon Macie attempted to retrieve job data for the bucket.
    */
  var isDefinedInJob: js.UndefOr[IsDefinedInJob] = js.undefined
  
  /**
    * Specifies whether any recurring jobs are configured to analyze data in the bucket. Possible values are: TRUE - The bucket is explicitly included in the bucket definition (S3BucketDefinitionForJob) for one or more recurring jobs or the bucket matches the bucket criteria (S3BucketCriteriaForJob) for one or more recurring jobs. At least one of those jobs has a status other than CANCELLED. FALSE - The bucket isn't explicitly included in the bucket definition (S3BucketDefinitionForJob) for any recurring jobs, the bucket doesn't match the bucket criteria (S3BucketCriteriaForJob) for any recurring jobs, or all the recurring jobs that are configured to analyze data in the bucket have a status of CANCELLED. UNKNOWN - An exception occurred when Amazon Macie attempted to retrieve job data for the bucket.
    */
  var isMonitoredByJob: js.UndefOr[IsMonitoredByJob] = js.undefined
  
  /**
    * The unique identifier for the job that ran most recently and is configured to analyze data in the bucket, either the latest run of a recurring job or the only run of a one-time job. This value is typically null if the value for the isDefinedInJob property is FALSE or UNKNOWN.
    */
  var lastJobId: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the job (lastJobId) started. If the job is a recurring job, this value indicates when the most recent run started. This value is typically null if the value for the isDefinedInJob property is FALSE or UNKNOWN.
    */
  var lastJobRunTime: js.UndefOr[js.Date] = js.undefined
}
object JobDetails {
  
  inline def apply(): JobDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobDetails]
  }
  
  extension [Self <: JobDetails](x: Self) {
    
    inline def setIsDefinedInJob(value: IsDefinedInJob): Self = StObject.set(x, "isDefinedInJob", value.asInstanceOf[js.Any])
    
    inline def setIsDefinedInJobUndefined: Self = StObject.set(x, "isDefinedInJob", js.undefined)
    
    inline def setIsMonitoredByJob(value: IsMonitoredByJob): Self = StObject.set(x, "isMonitoredByJob", value.asInstanceOf[js.Any])
    
    inline def setIsMonitoredByJobUndefined: Self = StObject.set(x, "isMonitoredByJob", js.undefined)
    
    inline def setLastJobId(value: string): Self = StObject.set(x, "lastJobId", value.asInstanceOf[js.Any])
    
    inline def setLastJobIdUndefined: Self = StObject.set(x, "lastJobId", js.undefined)
    
    inline def setLastJobRunTime(value: js.Date): Self = StObject.set(x, "lastJobRunTime", value.asInstanceOf[js.Any])
    
    inline def setLastJobRunTimeUndefined: Self = StObject.set(x, "lastJobRunTime", js.undefined)
  }
}
