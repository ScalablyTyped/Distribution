package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryStreamEncryptionConfiguration extends js.Object {
  /**
    * Provides details in case one of the following operations fails due to an error related to KMS: CreateDeliveryStream, DeleteDeliveryStream, StartDeliveryStreamEncryption, StopDeliveryStreamEncryption.
    */
  var FailureDescription: js.UndefOr[typings.awsSdk.firehoseMod.FailureDescription] = js.native
  /**
    * If KeyType is CUSTOMER_MANAGED_CMK, this field contains the ARN of the customer managed CMK. If KeyType is AWS_OWNED_CMK, DeliveryStreamEncryptionConfiguration doesn't contain a value for KeyARN.
    */
  var KeyARN: js.UndefOr[AWSKMSKeyARN] = js.native
  /**
    * Indicates the type of customer master key (CMK) that is used for encryption. The default setting is AWS_OWNED_CMK. For more information about CMKs, see Customer Master Keys (CMKs).
    */
  var KeyType: js.UndefOr[typings.awsSdk.firehoseMod.KeyType] = js.native
  /**
    * This is the server-side encryption (SSE) status for the delivery stream. For a full description of the different values of this status, see StartDeliveryStreamEncryption and StopDeliveryStreamEncryption. If this status is ENABLING_FAILED or DISABLING_FAILED, it is the status of the most recent attempt to enable or disable SSE, respectively.
    */
  var Status: js.UndefOr[DeliveryStreamEncryptionStatus] = js.native
}

object DeliveryStreamEncryptionConfiguration {
  @scala.inline
  def apply(
    FailureDescription: FailureDescription = null,
    KeyARN: AWSKMSKeyARN = null,
    KeyType: KeyType = null,
    Status: DeliveryStreamEncryptionStatus = null
  ): DeliveryStreamEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (FailureDescription != null) __obj.updateDynamic("FailureDescription")(FailureDescription.asInstanceOf[js.Any])
    if (KeyARN != null) __obj.updateDynamic("KeyARN")(KeyARN.asInstanceOf[js.Any])
    if (KeyType != null) __obj.updateDynamic("KeyType")(KeyType.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryStreamEncryptionConfiguration]
  }
}

