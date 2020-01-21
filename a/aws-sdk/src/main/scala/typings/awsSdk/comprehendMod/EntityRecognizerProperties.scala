package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    DataAccessRoleArn: IamRoleArn = null,
    EndTime: Timestamp = null,
    EntityRecognizerArn: EntityRecognizerArn = null,
    InputDataConfig: EntityRecognizerInputDataConfig = null,
    LanguageCode: LanguageCode = null,
    Message: AnyLengthString = null,
    RecognizerMetadata: EntityRecognizerMetadata = null,
    Status: ModelStatus = null,
    SubmitTime: Timestamp = null,
    TrainingEndTime: Timestamp = null,
    TrainingStartTime: Timestamp = null,
    VolumeKmsKeyId: KmsKeyId = null,
    VpcConfig: VpcConfig = null
  ): EntityRecognizerProperties = {
    val __obj = js.Dynamic.literal()
    if (DataAccessRoleArn != null) __obj.updateDynamic("DataAccessRoleArn")(DataAccessRoleArn.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (EntityRecognizerArn != null) __obj.updateDynamic("EntityRecognizerArn")(EntityRecognizerArn.asInstanceOf[js.Any])
    if (InputDataConfig != null) __obj.updateDynamic("InputDataConfig")(InputDataConfig.asInstanceOf[js.Any])
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (RecognizerMetadata != null) __obj.updateDynamic("RecognizerMetadata")(RecognizerMetadata.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (SubmitTime != null) __obj.updateDynamic("SubmitTime")(SubmitTime.asInstanceOf[js.Any])
    if (TrainingEndTime != null) __obj.updateDynamic("TrainingEndTime")(TrainingEndTime.asInstanceOf[js.Any])
    if (TrainingStartTime != null) __obj.updateDynamic("TrainingStartTime")(TrainingStartTime.asInstanceOf[js.Any])
    if (VolumeKmsKeyId != null) __obj.updateDynamic("VolumeKmsKeyId")(VolumeKmsKeyId.asInstanceOf[js.Any])
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityRecognizerProperties]
  }
}

