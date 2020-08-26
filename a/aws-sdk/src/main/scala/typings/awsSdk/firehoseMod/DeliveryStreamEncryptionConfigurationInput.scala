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
    * Indicates the type of customer master key (CMK) to use for encryption. The default setting is AWS_OWNED_CMK. For more information about CMKs, see Customer Master Keys (CMKs). When you invoke CreateDeliveryStream or StartDeliveryStreamEncryption with KeyType set to CUSTOMER_MANAGED_CMK, Kinesis Data Firehose invokes the Amazon KMS operation CreateGrant to create a grant that allows the Kinesis Data Firehose service to use the customer managed CMK to perform encryption and decryption. Kinesis Data Firehose manages that grant.  When you invoke StartDeliveryStreamEncryption to change the CMK for a delivery stream that is encrypted with a customer managed CMK, Kinesis Data Firehose schedules the grant it had on the old CMK for retirement. You can use a CMK of type CUSTOMER_MANAGED_CMK to encrypt up to 500 delivery streams. If a CreateDeliveryStream or StartDeliveryStreamEncryption operation exceeds this limit, Kinesis Data Firehose throws a LimitExceededException.   To encrypt your delivery stream, use symmetric CMKs. Kinesis Data Firehose doesn't support asymmetric CMKs. For information about symmetric and asymmetric CMKs, see About Symmetric and Asymmetric CMKs in the AWS Key Management Service developer guide. 
    */
  var KeyType: typings.awsSdk.firehoseMod.KeyType = js.native
}

object DeliveryStreamEncryptionConfigurationInput {
  @scala.inline
  def apply(KeyType: KeyType): DeliveryStreamEncryptionConfigurationInput = {
    val __obj = js.Dynamic.literal(KeyType = KeyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryStreamEncryptionConfigurationInput]
  }
  @scala.inline
  implicit class DeliveryStreamEncryptionConfigurationInputOps[Self <: DeliveryStreamEncryptionConfigurationInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKeyType(value: KeyType): Self = this.set("KeyType", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyARN(value: AWSKMSKeyARN): Self = this.set("KeyARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyARN: Self = this.set("KeyARN", js.undefined)
  }
  
}

