package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityRecognizerProperties extends StObject {
  
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
  implicit class EntityRecognizerPropertiesMutableBuilder[Self <: EntityRecognizerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataAccessRoleArnUndefined: Self = StObject.set(x, "DataAccessRoleArn", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setEntityRecognizerArn(value: EntityRecognizerArn): Self = StObject.set(x, "EntityRecognizerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityRecognizerArnUndefined: Self = StObject.set(x, "EntityRecognizerArn", js.undefined)
    
    @scala.inline
    def setInputDataConfig(value: EntityRecognizerInputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDataConfigUndefined: Self = StObject.set(x, "InputDataConfig", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    @scala.inline
    def setMessage(value: AnyLengthString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setRecognizerMetadata(value: EntityRecognizerMetadata): Self = StObject.set(x, "RecognizerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecognizerMetadataUndefined: Self = StObject.set(x, "RecognizerMetadata", js.undefined)
    
    @scala.inline
    def setStatus(value: ModelStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setSubmitTime(value: Timestamp): Self = StObject.set(x, "SubmitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitTimeUndefined: Self = StObject.set(x, "SubmitTime", js.undefined)
    
    @scala.inline
    def setTrainingEndTime(value: Timestamp): Self = StObject.set(x, "TrainingEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingEndTimeUndefined: Self = StObject.set(x, "TrainingEndTime", js.undefined)
    
    @scala.inline
    def setTrainingStartTime(value: Timestamp): Self = StObject.set(x, "TrainingStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingStartTimeUndefined: Self = StObject.set(x, "TrainingStartTime", js.undefined)
    
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
