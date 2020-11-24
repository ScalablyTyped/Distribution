package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobDetails extends js.Object {
  
  /**
    * Specifies whether any one-time or recurring jobs are configured to analyze data in the bucket. Possible values are: TRUE - One or more jobs is configured to analyze data in the bucket, and at least one of those jobs has a status other than CANCELLED. FALSE - No jobs are configured to analyze data in the bucket, or all the jobs that are configured to analyze data in the bucket have a status of CANCELLED. UNKNOWN - An exception occurred when Amazon Macie attempted to retrieve job data for the bucket. 
    */
  var isDefinedInJob: js.UndefOr[IsDefinedInJob] = js.native
  
  /**
    * Specifies whether any recurring jobs are configured to analyze data in the bucket. Possible values are: TRUE - One or more recurring jobs is configured to analyze data in the bucket, and at least one of those jobs has a status other than CANCELLED. FALSE - No recurring jobs are configured to analyze data in the bucket, or all the recurring jobs that are configured to analyze data in the bucket have a status of CANCELLED. UNKNOWN - An exception occurred when Amazon Macie attempted to retrieve job data for the bucket.
    */
  var isMonitoredByJob: js.UndefOr[IsMonitoredByJob] = js.native
  
  /**
    * The unique identifier for the job that ran most recently (either the latest run of a recurring job or the only run of a one-time job) and is configured to analyze data in the bucket. This value is null if the value for the isDefinedInJob property is FALSE or UNKNOWN.
    */
  var lastJobId: js.UndefOr[string] = js.native
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the job (lastJobId) started. If the job is a recurring job, this value indicates when the most recent run started. This value is null if the value for the isDefinedInJob property is FALSE or UNKNOWN.
    */
  var lastJobRunTime: js.UndefOr[timestampIso8601] = js.native
}
object JobDetails {
  
  @scala.inline
  def apply(): JobDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobDetails]
  }
  
  @scala.inline
  implicit class JobDetailsOps[Self <: JobDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsDefinedInJob(value: IsDefinedInJob): Self = this.set("isDefinedInJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDefinedInJob: Self = this.set("isDefinedInJob", js.undefined)
    
    @scala.inline
    def setIsMonitoredByJob(value: IsMonitoredByJob): Self = this.set("isMonitoredByJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMonitoredByJob: Self = this.set("isMonitoredByJob", js.undefined)
    
    @scala.inline
    def setLastJobId(value: string): Self = this.set("lastJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastJobId: Self = this.set("lastJobId", js.undefined)
    
    @scala.inline
    def setLastJobRunTime(value: timestampIso8601): Self = this.set("lastJobRunTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastJobRunTime: Self = this.set("lastJobRunTime", js.undefined)
  }
}
