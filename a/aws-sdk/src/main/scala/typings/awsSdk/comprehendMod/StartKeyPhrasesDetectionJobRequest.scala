package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartKeyPhrasesDetectionJobRequest extends StObject {
  
  /**
    * A unique identifier for the request. If you don't set the client request token, Amazon Comprehend generates one.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon Comprehend read access to your input data. For more information, see https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-permissions.
    */
  var DataAccessRoleArn: IamRoleArn = js.native
  
  /**
    * Specifies the format and location of the input data for the job.
    */
  var InputDataConfig: typings.awsSdk.comprehendMod.InputDataConfig = js.native
  
  /**
    * The identifier of the job.
    */
  var JobName: js.UndefOr[typings.awsSdk.comprehendMod.JobName] = js.native
  
  /**
    * The language of the input documents. You can specify any of the primary languages supported by Amazon Comprehend. All documents must be in the same language.
    */
  var LanguageCode: typings.awsSdk.comprehendMod.LanguageCode = js.native
  
  /**
    * Specifies where to send the output files.
    */
  var OutputDataConfig: typings.awsSdk.comprehendMod.OutputDataConfig = js.native
  
  /**
    * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the following formats:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"    Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.native
  
  /**
    *  Configuration parameters for an optional private Virtual Private Cloud (VPC) containing the resources you are using for your key phrases detection job. For more information, see Amazon VPC. 
    */
  var VpcConfig: js.UndefOr[typings.awsSdk.comprehendMod.VpcConfig] = js.native
}
object StartKeyPhrasesDetectionJobRequest {
  
  @scala.inline
  def apply(
    DataAccessRoleArn: IamRoleArn,
    InputDataConfig: InputDataConfig,
    LanguageCode: LanguageCode,
    OutputDataConfig: OutputDataConfig
  ): StartKeyPhrasesDetectionJobRequest = {
    val __obj = js.Dynamic.literal(DataAccessRoleArn = DataAccessRoleArn.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], LanguageCode = LanguageCode.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartKeyPhrasesDetectionJobRequest]
  }
  
  @scala.inline
  implicit class StartKeyPhrasesDetectionJobRequestMutableBuilder[Self <: StartKeyPhrasesDetectionJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestTokenString): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    @scala.inline
    def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "VolumeKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeKmsKeyIdUndefined: Self = StObject.set(x, "VolumeKmsKeyId", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
