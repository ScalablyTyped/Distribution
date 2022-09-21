package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBulkImportJobResponse extends StObject {
  
  /**
    * The Amazon S3 destination where errors associated with the job creation request are saved.
    */
  var errorReportLocation: ErrorReportLocation
  
  /**
    * The files in the specified Amazon S3 bucket that contain your data.
    */
  var files: Files
  
  /**
    * Contains the configuration information of a job, such as the file format used to save data in Amazon S3.
    */
  var jobConfiguration: JobConfiguration
  
  /**
    * The date the job was created, in Unix epoch TIME.
    */
  var jobCreationDate: js.Date
  
  /**
    * The ID of the job.
    */
  var jobId: ID
  
  /**
    * The date the job was last updated, in Unix epoch time.
    */
  var jobLastUpdateDate: js.Date
  
  /**
    * The unique name that helps identify the job request.
    */
  var jobName: Name
  
  /**
    * The ARN of the IAM role that allows IoT SiteWise to read Amazon S3 data.
    */
  var jobRoleArn: ARN
  
  /**
    * The status of the bulk import job can be one of following values.    PENDING – IoT SiteWise is waiting for the current bulk import job to finish.    CANCELLED – The bulk import job has been canceled.    RUNNING – IoT SiteWise is processing your request to import your data from Amazon S3.    COMPLETED – IoT SiteWise successfully completed your request to import data from Amazon S3.    FAILED – IoT SiteWise couldn't process your request to import data from Amazon S3. You can use logs saved in the specified error report location in Amazon S3 to troubleshoot issues.    COMPLETED_WITH_FAILURES – IoT SiteWise completed your request to import data from Amazon S3 with errors. You can use logs saved in the specified error report location in Amazon S3 to troubleshoot issues.  
    */
  var jobStatus: JobStatus
}
object DescribeBulkImportJobResponse {
  
  inline def apply(
    errorReportLocation: ErrorReportLocation,
    files: Files,
    jobConfiguration: JobConfiguration,
    jobCreationDate: js.Date,
    jobId: ID,
    jobLastUpdateDate: js.Date,
    jobName: Name,
    jobRoleArn: ARN,
    jobStatus: JobStatus
  ): DescribeBulkImportJobResponse = {
    val __obj = js.Dynamic.literal(errorReportLocation = errorReportLocation.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], jobConfiguration = jobConfiguration.asInstanceOf[js.Any], jobCreationDate = jobCreationDate.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobLastUpdateDate = jobLastUpdateDate.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], jobRoleArn = jobRoleArn.asInstanceOf[js.Any], jobStatus = jobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBulkImportJobResponse]
  }
  
  extension [Self <: DescribeBulkImportJobResponse](x: Self) {
    
    inline def setErrorReportLocation(value: ErrorReportLocation): Self = StObject.set(x, "errorReportLocation", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: Files): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: File*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setJobConfiguration(value: JobConfiguration): Self = StObject.set(x, "jobConfiguration", value.asInstanceOf[js.Any])
    
    inline def setJobCreationDate(value: js.Date): Self = StObject.set(x, "jobCreationDate", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: ID): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobLastUpdateDate(value: js.Date): Self = StObject.set(x, "jobLastUpdateDate", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: Name): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setJobRoleArn(value: ARN): Self = StObject.set(x, "jobRoleArn", value.asInstanceOf[js.Any])
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "jobStatus", value.asInstanceOf[js.Any])
  }
}
