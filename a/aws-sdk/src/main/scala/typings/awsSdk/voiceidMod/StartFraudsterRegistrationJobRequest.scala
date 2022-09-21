package typings.awsSdk.voiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartFraudsterRegistrationJobRequest extends StObject {
  
  /**
    * The idempotency token for starting a new fraudster registration job. If not provided, Amazon Web Services SDK populates this field.
    */
  var ClientToken: js.UndefOr[ClientTokenString] = js.undefined
  
  /**
    * The IAM role Amazon Resource Name (ARN) that grants Voice ID permissions to access customer's buckets to read the input manifest file and write the Job output file. Refer to the Create and edit a fraudster watchlist documentation for the permissions needed in this role.
    */
  var DataAccessRoleArn: IamRoleArn
  
  /**
    * The identifier of the domain containing the fraudster registration job and in which the fraudsters are registered.
    */
  var DomainId: typings.awsSdk.voiceidMod.DomainId
  
  /**
    * The input data config containing an S3 URI for the input manifest file that contains the list of fraudster registration requests.
    */
  var InputDataConfig: typings.awsSdk.voiceidMod.InputDataConfig
  
  /**
    * The name of the new fraudster registration job.
    */
  var JobName: js.UndefOr[typings.awsSdk.voiceidMod.JobName] = js.undefined
  
  /**
    * The output data config containing the S3 location where Voice ID writes the job output file; you must also include a KMS key ID to encrypt the file.
    */
  var OutputDataConfig: typings.awsSdk.voiceidMod.OutputDataConfig
  
  /**
    * The registration config containing details such as the action to take when a duplicate fraudster is detected, and the similarity threshold to use for detecting a duplicate fraudster. 
    */
  var RegistrationConfig: js.UndefOr[typings.awsSdk.voiceidMod.RegistrationConfig] = js.undefined
}
object StartFraudsterRegistrationJobRequest {
  
  inline def apply(
    DataAccessRoleArn: IamRoleArn,
    DomainId: DomainId,
    InputDataConfig: InputDataConfig,
    OutputDataConfig: OutputDataConfig
  ): StartFraudsterRegistrationJobRequest = {
    val __obj = js.Dynamic.literal(DataAccessRoleArn = DataAccessRoleArn.asInstanceOf[js.Any], DomainId = DomainId.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFraudsterRegistrationJobRequest]
  }
  
  extension [Self <: StartFraudsterRegistrationJobRequest](x: Self) {
    
    inline def setClientToken(value: ClientTokenString): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setRegistrationConfig(value: RegistrationConfig): Self = StObject.set(x, "RegistrationConfig", value.asInstanceOf[js.Any])
    
    inline def setRegistrationConfigUndefined: Self = StObject.set(x, "RegistrationConfig", js.undefined)
  }
}
