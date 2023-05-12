package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FraudsterRegistrationJob extends StObject {
  
  /**
    * A timestamp of when the fraudster registration job was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The IAM role Amazon Resource Name (ARN) that grants Voice ID permissions to access customer's buckets to read the input manifest file and write the job output file.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * The identifier of the domain that contains the fraudster registration job.
    */
  var DomainId: js.UndefOr[typings.awsSdk.clientsVoiceidMod.DomainId] = js.undefined
  
  /**
    * A timestamp of when the fraudster registration job ended.
    */
  var EndedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Contains details that are populated when an entire batch job fails. In cases of individual registration job failures, the batch job as a whole doesn't fail; it is completed with a JobStatus of COMPLETED_WITH_ERRORS. You can use the job output file to identify the individual registration requests that failed.
    */
  var FailureDetails: js.UndefOr[typings.awsSdk.clientsVoiceidMod.FailureDetails] = js.undefined
  
  /**
    * The input data config containing an S3 URI for the input manifest file that contains the list of fraudster registration job requests.
    */
  var InputDataConfig: js.UndefOr[typings.awsSdk.clientsVoiceidMod.InputDataConfig] = js.undefined
  
  /**
    * The service-generated identifier for the fraudster registration job.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsVoiceidMod.JobId] = js.undefined
  
  /**
    * The client-provided name for the fraudster registration job.
    */
  var JobName: js.UndefOr[typings.awsSdk.clientsVoiceidMod.JobName] = js.undefined
  
  /**
    * Shows the completed percentage of registration requests listed in the input file.
    */
  var JobProgress: js.UndefOr[typings.awsSdk.clientsVoiceidMod.JobProgress] = js.undefined
  
  /**
    * The current status of the fraudster registration job.
    */
  var JobStatus: js.UndefOr[FraudsterRegistrationJobStatus] = js.undefined
  
  /**
    * The output data config containing the S3 location where you want Voice ID to write your job output file; you must also include a KMS key ID in order to encrypt the file.
    */
  var OutputDataConfig: js.UndefOr[typings.awsSdk.clientsVoiceidMod.OutputDataConfig] = js.undefined
  
  /**
    * The registration config containing details such as the action to take when a duplicate fraudster is detected, and the similarity threshold to use for detecting a duplicate fraudster.
    */
  var RegistrationConfig: js.UndefOr[typings.awsSdk.clientsVoiceidMod.RegistrationConfig] = js.undefined
}
object FraudsterRegistrationJob {
  
  inline def apply(): FraudsterRegistrationJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FraudsterRegistrationJob]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FraudsterRegistrationJob] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDataAccessRoleArnUndefined: Self = StObject.set(x, "DataAccessRoleArn", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setDomainIdUndefined: Self = StObject.set(x, "DomainId", js.undefined)
    
    inline def setEndedAt(value: js.Date): Self = StObject.set(x, "EndedAt", value.asInstanceOf[js.Any])
    
    inline def setEndedAtUndefined: Self = StObject.set(x, "EndedAt", js.undefined)
    
    inline def setFailureDetails(value: FailureDetails): Self = StObject.set(x, "FailureDetails", value.asInstanceOf[js.Any])
    
    inline def setFailureDetailsUndefined: Self = StObject.set(x, "FailureDetails", js.undefined)
    
    inline def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfigUndefined: Self = StObject.set(x, "InputDataConfig", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setJobProgress(value: JobProgress): Self = StObject.set(x, "JobProgress", value.asInstanceOf[js.Any])
    
    inline def setJobProgressUndefined: Self = StObject.set(x, "JobProgress", js.undefined)
    
    inline def setJobStatus(value: FraudsterRegistrationJobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    inline def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputDataConfigUndefined: Self = StObject.set(x, "OutputDataConfig", js.undefined)
    
    inline def setRegistrationConfig(value: RegistrationConfig): Self = StObject.set(x, "RegistrationConfig", value.asInstanceOf[js.Any])
    
    inline def setRegistrationConfigUndefined: Self = StObject.set(x, "RegistrationConfig", js.undefined)
  }
}
