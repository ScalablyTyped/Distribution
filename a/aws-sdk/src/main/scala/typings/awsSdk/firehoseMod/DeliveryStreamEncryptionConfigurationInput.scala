package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryStreamEncryptionConfigurationInput extends js.Object {
  /**
    * If you set KeyType to CUSTOMER_MANAGED_CMK, you must specify the Amazon Resource Name (ARN) of the CMK. If you set KeyType to AWS_OWNED_CMK, Kinesis Data Firehose uses a service-account CMK.
    */
  var KeyARN: js.UndefOr[AWSKMSKeyARN] = js.native
  /**
    * Indicates the type of customer master key (CMK) to use for encryption. The default setting is AWS_OWNED_CMK. For more information about CMKs, see Customer Master Keys (CMKs). When you invoke CreateDeliveryStream or StartDeliveryStreamEncryption with KeyType set to CUSTOMER_MANAGED_CMK, Kinesis Data Firehose invokes the Amazon KMS operation CreateGrant to create a grant that allows the Kinesis Data Firehose service to use the customer managed CMK to perform encryption and decryption. Kinesis Data Firehose manages that grant.  When you invoke StartDeliveryStreamEncryption to change the CMK for a delivery stream that is already encrypted with a customer managed CMK, Kinesis Data Firehose schedules the grant it had on the old CMK for retirement.
    */
  var KeyType: typings.awsSdk.firehoseMod.KeyType = js.native
}

object DeliveryStreamEncryptionConfigurationInput {
  @scala.inline
  def apply(KeyType: KeyType, KeyARN: AWSKMSKeyARN = null): DeliveryStreamEncryptionConfigurationInput = {
    val __obj = js.Dynamic.literal(KeyType = KeyType.asInstanceOf[js.Any])
    if (KeyARN != null) __obj.updateDynamic("KeyARN")(KeyARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryStreamEncryptionConfigurationInput]
  }
}

