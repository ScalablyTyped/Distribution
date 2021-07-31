package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentClassifierProperties extends StObject {
  
  /**
    * Information about the document classifier, including the number of documents used for training the classifier, the number of documents used for test the classifier, and an accuracy rating.
    */
  var ClassifierMetadata: js.UndefOr[typings.awsSdk.comprehendMod.ClassifierMetadata] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend read access to your input data.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that identifies the document classifier.
    */
  var DocumentClassifierArn: js.UndefOr[typings.awsSdk.comprehendMod.DocumentClassifierArn] = js.undefined
  
  /**
    * The time that training the document classifier completed.
    */
  var EndTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The input data configuration that you supplied when you created the document classifier for training.
    */
  var InputDataConfig: js.UndefOr[DocumentClassifierInputDataConfig] = js.undefined
  
  /**
    * The language code for the language of the documents that the classifier was trained on.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.comprehendMod.LanguageCode] = js.undefined
  
  /**
    * Additional information about the status of the classifier.
    */
  var Message: js.UndefOr[AnyLengthString] = js.undefined
  
  /**
    * Indicates the mode in which the specific classifier was trained. This also indicates the format of input documents and the format of the confusion matrix. Each classifier can only be trained in one mode and this cannot be changed once the classifier is trained.
    */
  var Mode: js.UndefOr[DocumentClassifierMode] = js.undefined
  
  /**
    *  Provides output results configuration parameters for custom classifier jobs.
    */
  var OutputDataConfig: js.UndefOr[DocumentClassifierOutputDataConfig] = js.undefined
  
  /**
    * The status of the document classifier. If the status is TRAINED the classifier is ready to use. If the status is FAILED you can see additional information about why the classifier wasn't trained in the Message field.
    */
  var Status: js.UndefOr[ModelStatus] = js.undefined
  
  /**
    * The time that the document classifier was submitted for training.
    */
  var SubmitTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The time that training of the document classifier was completed. Indicates the time when the training completes on documentation classifiers. You are billed for the time interval between this time and the value of TrainingStartTime.
    */
  var TrainingEndTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Indicates the time when the training starts on documentation classifiers. You are billed for the time interval between this time and the value of TrainingEndTime. 
    */
  var TrainingStartTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the following formats:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"    Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    *  Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you are using for your custom classifier. For more information, see Amazon VPC. 
    */
  var VpcConfig: js.UndefOr[typings.awsSdk.comprehendMod.VpcConfig] = js.undefined
}
object DocumentClassifierProperties {
  
  @scala.inline
  def apply(): DocumentClassifierProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentClassifierProperties]
  }
  
  @scala.inline
  implicit class DocumentClassifierPropertiesMutableBuilder[Self <: DocumentClassifierProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassifierMetadata(value: ClassifierMetadata): Self = StObject.set(x, "ClassifierMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassifierMetadataUndefined: Self = StObject.set(x, "ClassifierMetadata", js.undefined)
    
    @scala.inline
    def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataAccessRoleArnUndefined: Self = StObject.set(x, "DataAccessRoleArn", js.undefined)
    
    @scala.inline
    def setDocumentClassifierArn(value: DocumentClassifierArn): Self = StObject.set(x, "DocumentClassifierArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentClassifierArnUndefined: Self = StObject.set(x, "DocumentClassifierArn", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setInputDataConfig(value: DocumentClassifierInputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
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
    def setMode(value: DocumentClassifierMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    @scala.inline
    def setOutputDataConfig(value: DocumentClassifierOutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputDataConfigUndefined: Self = StObject.set(x, "OutputDataConfig", js.undefined)
    
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
