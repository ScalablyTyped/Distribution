package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartDeliveryStreamEncryptionInput extends js.Object {
  /**
    * Used to specify the type and Amazon Resource Name (ARN) of the KMS key needed for Server-Side Encryption (SSE).
    */
  var DeliveryStreamEncryptionConfigurationInput: js.UndefOr[typings.awsSdk.firehoseMod.DeliveryStreamEncryptionConfigurationInput] = js.native
  /**
    * The name of the delivery stream for which you want to enable server-side encryption (SSE).
    */
  var DeliveryStreamName: typings.awsSdk.firehoseMod.DeliveryStreamName = js.native
}

object StartDeliveryStreamEncryptionInput {
  @scala.inline
  def apply(
    DeliveryStreamName: DeliveryStreamName,
    DeliveryStreamEncryptionConfigurationInput: DeliveryStreamEncryptionConfigurationInput = null
  ): StartDeliveryStreamEncryptionInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any])
    if (DeliveryStreamEncryptionConfigurationInput != null) __obj.updateDynamic("DeliveryStreamEncryptionConfigurationInput")(DeliveryStreamEncryptionConfigurationInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDeliveryStreamEncryptionInput]
  }
}

