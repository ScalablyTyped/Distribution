package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisStreamSourceDescription extends js.Object {
  /**
    * Kinesis Data Firehose starts retrieving records from the Kinesis data stream starting with this timestamp.
    */
  var DeliveryStartTimestamp: js.UndefOr[typings.awsSdk.firehoseMod.DeliveryStartTimestamp] = js.native
  /**
    * The Amazon Resource Name (ARN) of the source Kinesis data stream. For more information, see Amazon Kinesis Data Streams ARN Format.
    */
  var KinesisStreamARN: js.UndefOr[typings.awsSdk.firehoseMod.KinesisStreamARN] = js.native
  /**
    * The ARN of the role used by the source Kinesis data stream. For more information, see AWS Identity and Access Management (IAM) ARN Format.
    */
  var RoleARN: js.UndefOr[typings.awsSdk.firehoseMod.RoleARN] = js.native
}

object KinesisStreamSourceDescription {
  @scala.inline
  def apply(
    DeliveryStartTimestamp: DeliveryStartTimestamp = null,
    KinesisStreamARN: KinesisStreamARN = null,
    RoleARN: RoleARN = null
  ): KinesisStreamSourceDescription = {
    val __obj = js.Dynamic.literal()
    if (DeliveryStartTimestamp != null) __obj.updateDynamic("DeliveryStartTimestamp")(DeliveryStartTimestamp.asInstanceOf[js.Any])
    if (KinesisStreamARN != null) __obj.updateDynamic("KinesisStreamARN")(KinesisStreamARN.asInstanceOf[js.Any])
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamSourceDescription]
  }
}

