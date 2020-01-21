package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStreamConsumerInput extends js.Object {
  /**
    * The ARN returned by Kinesis Data Streams when you registered the consumer.
    */
  var ConsumerARN: js.UndefOr[typings.awsSdk.kinesisMod.ConsumerARN] = js.native
  /**
    * The name that you gave to the consumer.
    */
  var ConsumerName: js.UndefOr[typings.awsSdk.kinesisMod.ConsumerName] = js.native
  /**
    * The ARN of the Kinesis data stream that the consumer is registered with. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var StreamARN: js.UndefOr[typings.awsSdk.kinesisMod.StreamARN] = js.native
}

object DescribeStreamConsumerInput {
  @scala.inline
  def apply(ConsumerARN: ConsumerARN = null, ConsumerName: ConsumerName = null, StreamARN: StreamARN = null): DescribeStreamConsumerInput = {
    val __obj = js.Dynamic.literal()
    if (ConsumerARN != null) __obj.updateDynamic("ConsumerARN")(ConsumerARN.asInstanceOf[js.Any])
    if (ConsumerName != null) __obj.updateDynamic("ConsumerName")(ConsumerName.asInstanceOf[js.Any])
    if (StreamARN != null) __obj.updateDynamic("StreamARN")(StreamARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamConsumerInput]
  }
}

