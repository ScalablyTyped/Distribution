package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSpeakerEnrollmentJobRequest extends StObject {
  
  /**
    * The idempotency token for starting a new speaker enrollment Job. If not provided, Amazon Web Services SDK populates this field.
    */
  var ClientToken: js.UndefOr[ClientTokenString] = js.undefined
  
  /**
    * The IAM role Amazon Resource Name (ARN) that grants Voice ID permissions to access customer's buckets to read the input manifest file and write the job output file. Refer to Batch enrollment using audio data from prior calls for the permissions needed in this role.
    */
  var DataAccessRoleArn: IamRoleArn
  
  /**
    * The identifier of the domain that contains the speaker enrollment job and in which the speakers are enrolled. 
    */
  var DomainId: typings.awsSdk.clientsVoiceidMod.DomainId
  
  /**
    * The enrollment config that contains details such as the action to take when a speaker is already enrolled in Voice ID or when a speaker is identified as a fraudster.
    */
  var EnrollmentConfig: js.UndefOr[typings.awsSdk.clientsVoiceidMod.EnrollmentConfig] = js.undefined
  
  /**
    * The input data config containing the S3 location for the input manifest file that contains the list of speaker enrollment requests.
    */
  var InputDataConfig: typings.awsSdk.clientsVoiceidMod.InputDataConfig
  
  /**
    * A name for your speaker enrollment job.
    */
  var JobName: js.UndefOr[typings.awsSdk.clientsVoiceidMod.JobName] = js.undefined
  
  /**
    * The output data config containing the S3 location where Voice ID writes the job output file; you must also include a KMS key ID to encrypt the file.
    */
  var OutputDataConfig: typings.awsSdk.clientsVoiceidMod.OutputDataConfig
}
object StartSpeakerEnrollmentJobRequest {
  
  inline def apply(
    DataAccessRoleArn: IamRoleArn,
    DomainId: DomainId,
    InputDataConfig: InputDataConfig,
    OutputDataConfig: OutputDataConfig
  ): StartSpeakerEnrollmentJobRequest = {
    val __obj = js.Dynamic.literal(DataAccessRoleArn = DataAccessRoleArn.asInstanceOf[js.Any], DomainId = DomainId.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSpeakerEnrollmentJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartSpeakerEnrollmentJobRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientTokenString): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setEnrollmentConfig(value: EnrollmentConfig): Self = StObject.set(x, "EnrollmentConfig", value.asInstanceOf[js.Any])
    
    inline def setEnrollmentConfigUndefined: Self = StObject.set(x, "EnrollmentConfig", js.undefined)
    
    inline def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
  }
}
