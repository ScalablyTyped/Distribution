package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDeliveryStreamInput extends js.Object {
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typings.awsSdk.firehoseMod.DeliveryStreamName = js.native
  /**
    * The ID of the destination to start returning the destination information. Kinesis Data Firehose supports one destination per delivery stream.
    */
  var ExclusiveStartDestinationId: js.UndefOr[DestinationId] = js.native
  /**
    * The limit on the number of destinations to return. You can have one destination per delivery stream.
    */
  var Limit: js.UndefOr[DescribeDeliveryStreamInputLimit] = js.native
}

object DescribeDeliveryStreamInput {
  @scala.inline
  def apply(
    DeliveryStreamName: DeliveryStreamName,
    ExclusiveStartDestinationId: DestinationId = null,
    Limit: js.UndefOr[DescribeDeliveryStreamInputLimit] = js.undefined
  ): DescribeDeliveryStreamInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any])
    if (ExclusiveStartDestinationId != null) __obj.updateDynamic("ExclusiveStartDestinationId")(ExclusiveStartDestinationId.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDeliveryStreamInput]
  }
}

