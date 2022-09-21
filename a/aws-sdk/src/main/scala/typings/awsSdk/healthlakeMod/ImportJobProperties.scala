package typings.awsSdk.healthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportJobProperties extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that gives Amazon HealthLake access to your input data.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * The datastore id used when the Import job was created. 
    */
  var DatastoreId: typings.awsSdk.healthlakeMod.DatastoreId
  
  /**
    * The time that the Import job was completed.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The input data configuration that was supplied when the Import job was created.
    */
  var InputDataConfig: typings.awsSdk.healthlakeMod.InputDataConfig
  
  /**
    * The AWS-generated id number for the Import job.
    */
  var JobId: typings.awsSdk.healthlakeMod.JobId
  
  /**
    * The user-generated name for an Import job.
    */
  var JobName: js.UndefOr[typings.awsSdk.healthlakeMod.JobName] = js.undefined
  
  var JobOutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined
  
  /**
    * The job status for an Import job. Possible statuses are SUBMITTED, IN_PROGRESS, COMPLETED, FAILED.
    */
  var JobStatus: typings.awsSdk.healthlakeMod.JobStatus
  
  /**
    * An explanation of any errors that may have occurred during the FHIR import job. 
    */
  var Message: js.UndefOr[typings.awsSdk.healthlakeMod.Message] = js.undefined
  
  /**
    * The time that the Import job was submitted for processing.
    */
  var SubmitTime: js.Date
}
object ImportJobProperties {
  
  inline def apply(
    DatastoreId: DatastoreId,
    InputDataConfig: InputDataConfig,
    JobId: JobId,
    JobStatus: JobStatus,
    SubmitTime: js.Date
  ): ImportJobProperties = {
    val __obj = js.Dynamic.literal(DatastoreId = DatastoreId.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any], JobStatus = JobStatus.asInstanceOf[js.Any], SubmitTime = SubmitTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportJobProperties]
  }
  
  extension [Self <: ImportJobProperties](x: Self) {
    
    inline def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDataAccessRoleArnUndefined: Self = StObject.set(x, "DataAccessRoleArn", js.undefined)
    
    inline def setDatastoreId(value: DatastoreId): Self = StObject.set(x, "DatastoreId", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setJobOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "JobOutputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setJobOutputDataConfigUndefined: Self = StObject.set(x, "JobOutputDataConfig", js.undefined)
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setSubmitTime(value: js.Date): Self = StObject.set(x, "SubmitTime", value.asInstanceOf[js.Any])
  }
}
