package typings.awsSdk.healthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportJobProperties extends StObject {
  
  /**
    * The Amazon Resource Name used during the initiation of the job.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * The AWS generated ID for the Data Store from which files are being exported for an export job.
    */
  var DatastoreId: typings.awsSdk.healthlakeMod.DatastoreId
  
  /**
    * The time an export job completed.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The AWS generated ID for an export job.
    */
  var JobId: typings.awsSdk.healthlakeMod.JobId
  
  /**
    * The user generated name for an export job.
    */
  var JobName: js.UndefOr[typings.awsSdk.healthlakeMod.JobName] = js.undefined
  
  /**
    * The status of a FHIR export job. Possible statuses are SUBMITTED, IN_PROGRESS, COMPLETED, or FAILED.
    */
  var JobStatus: typings.awsSdk.healthlakeMod.JobStatus
  
  /**
    * An explanation of any errors that may have occurred during the export job.
    */
  var Message: js.UndefOr[typings.awsSdk.healthlakeMod.Message] = js.undefined
  
  /**
    * The output data configuration that was supplied when the export job was created.
    */
  var OutputDataConfig: typings.awsSdk.healthlakeMod.OutputDataConfig
  
  /**
    * The time an export job was initiated.
    */
  var SubmitTime: js.Date
}
object ExportJobProperties {
  
  inline def apply(
    DatastoreId: DatastoreId,
    JobId: JobId,
    JobStatus: JobStatus,
    OutputDataConfig: OutputDataConfig,
    SubmitTime: js.Date
  ): ExportJobProperties = {
    val __obj = js.Dynamic.literal(DatastoreId = DatastoreId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any], JobStatus = JobStatus.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any], SubmitTime = SubmitTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportJobProperties]
  }
  
  extension [Self <: ExportJobProperties](x: Self) {
    
    inline def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDataAccessRoleArnUndefined: Self = StObject.set(x, "DataAccessRoleArn", js.undefined)
    
    inline def setDatastoreId(value: DatastoreId): Self = StObject.set(x, "DatastoreId", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setSubmitTime(value: js.Date): Self = StObject.set(x, "SubmitTime", value.asInstanceOf[js.Any])
  }
}
