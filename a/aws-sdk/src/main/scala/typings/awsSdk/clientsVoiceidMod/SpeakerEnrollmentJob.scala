package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpeakerEnrollmentJob extends StObject {
  
  /**
    * A timestamp of when the speaker enrollment job was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The IAM role Amazon Resource Name (ARN) that grants Voice ID permissions to access customer's buckets to read the input manifest file and write the job output file.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * The identifier of the domain that contains the speaker enrollment job.
    */
  var DomainId: js.UndefOr[typings.awsSdk.clientsVoiceidMod.DomainId] = js.undefined
  
  /**
    * A timestamp of when the speaker enrollment job ended. 
    */
  var EndedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The configuration that defines the action to take when the speaker is already enrolled in Voice ID, and the FraudDetectionConfig to use.
    */
  var EnrollmentConfig: js.UndefOr[typings.awsSdk.clientsVoiceidMod.EnrollmentConfig] = js.undefined
  
  /**
    * Contains details that are populated when an entire batch job fails. In cases of individual registration job failures, the batch job as a whole doesn't fail; it is completed with a JobStatus of COMPLETED_WITH_ERRORS. You can use the job output file to identify the individual registration requests that failed.
    */
  var FailureDetails: js.UndefOr[typings.awsSdk.clientsVoiceidMod.FailureDetails] = js.undefined
  
  /**
    * The input data config containing an S3 URI for the input manifest file that contains the list of speaker enrollment job requests.
    */
  var InputDataConfig: js.UndefOr[typings.awsSdk.clientsVoiceidMod.InputDataConfig] = js.undefined
  
  /**
    * The service-generated identifier for the speaker enrollment job.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsVoiceidMod.JobId] = js.undefined
  
  /**
    * The client-provided name for the speaker enrollment job.
    */
  var JobName: js.UndefOr[typings.awsSdk.clientsVoiceidMod.JobName] = js.undefined
  
  /**
    * Provides details on job progress. This field shows the completed percentage of registration requests listed in the input file.
    */
  var JobProgress: js.UndefOr[typings.awsSdk.clientsVoiceidMod.JobProgress] = js.undefined
  
  /**
    * The current status of the speaker enrollment job.
    */
  var JobStatus: js.UndefOr[SpeakerEnrollmentJobStatus] = js.undefined
  
  /**
    * The output data config containing the S3 location where Voice ID writes the job output file; you must also include a KMS key ID to encrypt the file.
    */
  var OutputDataConfig: js.UndefOr[typings.awsSdk.clientsVoiceidMod.OutputDataConfig] = js.undefined
}
object SpeakerEnrollmentJob {
  
  inline def apply(): SpeakerEnrollmentJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpeakerEnrollmentJob]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpeakerEnrollmentJob] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDataAccessRoleArnUndefined: Self = StObject.set(x, "DataAccessRoleArn", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setDomainIdUndefined: Self = StObject.set(x, "DomainId", js.undefined)
    
    inline def setEndedAt(value: js.Date): Self = StObject.set(x, "EndedAt", value.asInstanceOf[js.Any])
    
    inline def setEndedAtUndefined: Self = StObject.set(x, "EndedAt", js.undefined)
    
    inline def setEnrollmentConfig(value: EnrollmentConfig): Self = StObject.set(x, "EnrollmentConfig", value.asInstanceOf[js.Any])
    
    inline def setEnrollmentConfigUndefined: Self = StObject.set(x, "EnrollmentConfig", js.undefined)
    
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
    
    inline def setJobStatus(value: SpeakerEnrollmentJobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    inline def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputDataConfigUndefined: Self = StObject.set(x, "OutputDataConfig", js.undefined)
  }
}
