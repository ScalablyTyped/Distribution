package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartEntitiesDetectionJobRequest extends js.Object {
  /**
    * A unique identifier for the request. If you don't set the client request token, Amazon Comprehend generates one.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon Comprehend read access to your input data. For more information, see https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-permissions.
    */
  var DataAccessRoleArn: IamRoleArn = js.native
  /**
    * The Amazon Resource Name (ARN) that identifies the specific entity recognizer to be used by the StartEntitiesDetectionJob. This ARN is optional and is only used for a custom entity recognition job.
    */
  var EntityRecognizerArn: js.UndefOr[typings.awsSdk.comprehendMod.EntityRecognizerArn] = js.native
  /**
    * Specifies the format and location of the input data for the job.
    */
  var InputDataConfig: typings.awsSdk.comprehendMod.InputDataConfig = js.native
  /**
    * The identifier of the job.
    */
  var JobName: js.UndefOr[typings.awsSdk.comprehendMod.JobName] = js.native
  /**
    * The language of the input documents. All documents must be in the same language. You can specify any of the languages supported by Amazon Comprehend. If custom entities recognition is used, this parameter is ignored and the language used for training the model is used instead.
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
    * Configuration parameters for an optional private Virtual Private Cloud (VPC) containing the resources you are using for your entity detection job. For more information, see Amazon VPC. 
    */
  var VpcConfig: js.UndefOr[typings.awsSdk.comprehendMod.VpcConfig] = js.native
}

object StartEntitiesDetectionJobRequest {
  @scala.inline
  def apply(
    DataAccessRoleArn: IamRoleArn,
    InputDataConfig: InputDataConfig,
    LanguageCode: LanguageCode,
    OutputDataConfig: OutputDataConfig
  ): StartEntitiesDetectionJobRequest = {
    val __obj = js.Dynamic.literal(DataAccessRoleArn = DataAccessRoleArn.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], LanguageCode = LanguageCode.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartEntitiesDetectionJobRequest]
  }
  @scala.inline
  implicit class StartEntitiesDetectionJobRequestOps[Self <: StartEntitiesDetectionJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataAccessRoleArn(value: IamRoleArn): Self = this.set("DataAccessRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputDataConfig(value: InputDataConfig): Self = this.set("InputDataConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputDataConfig(value: OutputDataConfig): Self = this.set("OutputDataConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientRequestToken(value: ClientRequestTokenString): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientRequestToken: Self = this.set("ClientRequestToken", js.undefined)
    @scala.inline
    def setEntityRecognizerArn(value: EntityRecognizerArn): Self = this.set("EntityRecognizerArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityRecognizerArn: Self = this.set("EntityRecognizerArn", js.undefined)
    @scala.inline
    def setJobName(value: JobName): Self = this.set("JobName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobName: Self = this.set("JobName", js.undefined)
    @scala.inline
    def setVolumeKmsKeyId(value: KmsKeyId): Self = this.set("VolumeKmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeKmsKeyId: Self = this.set("VolumeKmsKeyId", js.undefined)
    @scala.inline
    def setVpcConfig(value: VpcConfig): Self = this.set("VpcConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcConfig: Self = this.set("VpcConfig", js.undefined)
  }
  
}

