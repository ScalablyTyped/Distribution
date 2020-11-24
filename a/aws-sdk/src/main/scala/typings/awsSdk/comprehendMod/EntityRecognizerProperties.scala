package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityRecognizerProperties extends js.Object {
  
  /**
    *  The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend read access to your input data.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.native
  
  /**
    * The time that the recognizer creation completed.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The Amazon Resource Name (ARN) that identifies the entity recognizer.
    */
  var EntityRecognizerArn: js.UndefOr[typings.awsSdk.comprehendMod.EntityRecognizerArn] = js.native
  
  /**
    * The input data properties of an entity recognizer.
    */
  var InputDataConfig: js.UndefOr[EntityRecognizerInputDataConfig] = js.native
  
  /**
    *  The language of the input documents. All documents must be in the same language. Only English ("en") is currently supported.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.comprehendMod.LanguageCode] = js.native
  
  /**
    *  A description of the status of the recognizer.
    */
  var Message: js.UndefOr[AnyLengthString] = js.native
  
  /**
    *  Provides information about an entity recognizer.
    */
  var RecognizerMetadata: js.UndefOr[EntityRecognizerMetadata] = js.native
  
  /**
    * Provides the status of the entity recognizer.
    */
  var Status: js.UndefOr[ModelStatus] = js.native
  
  /**
    * The time that the recognizer was submitted for processing.
    */
  var SubmitTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The time that training of the entity recognizer was completed.
    */
  var TrainingEndTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The time that training of the entity recognizer started.
    */
  var TrainingStartTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the following formats:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"    Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.native
  
  /**
    *  Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you are using for your custom entity recognizer. For more information, see Amazon VPC. 
    */
  var VpcConfig: js.UndefOr[typings.awsSdk.comprehendMod.VpcConfig] = js.native
}
object EntityRecognizerProperties {
  
  @scala.inline
  def apply(): EntityRecognizerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityRecognizerProperties]
  }
  
  @scala.inline
  implicit class EntityRecognizerPropertiesOps[Self <: EntityRecognizerProperties] (val x: Self) extends AnyVal {
    
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
    def deleteDataAccessRoleArn: Self = this.set("DataAccessRoleArn", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    
    @scala.inline
    def setEntityRecognizerArn(value: EntityRecognizerArn): Self = this.set("EntityRecognizerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityRecognizerArn: Self = this.set("EntityRecognizerArn", js.undefined)
    
    @scala.inline
    def setInputDataConfig(value: EntityRecognizerInputDataConfig): Self = this.set("InputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputDataConfig: Self = this.set("InputDataConfig", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("LanguageCode", js.undefined)
    
    @scala.inline
    def setMessage(value: AnyLengthString): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    
    @scala.inline
    def setRecognizerMetadata(value: EntityRecognizerMetadata): Self = this.set("RecognizerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecognizerMetadata: Self = this.set("RecognizerMetadata", js.undefined)
    
    @scala.inline
    def setStatus(value: ModelStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setSubmitTime(value: Timestamp): Self = this.set("SubmitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitTime: Self = this.set("SubmitTime", js.undefined)
    
    @scala.inline
    def setTrainingEndTime(value: Timestamp): Self = this.set("TrainingEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingEndTime: Self = this.set("TrainingEndTime", js.undefined)
    
    @scala.inline
    def setTrainingStartTime(value: Timestamp): Self = this.set("TrainingStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingStartTime: Self = this.set("TrainingStartTime", js.undefined)
    
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
