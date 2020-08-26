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
  def apply(): DescribeStreamConsumerInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStreamConsumerInput]
  }
  @scala.inline
  implicit class DescribeStreamConsumerInputOps[Self <: DescribeStreamConsumerInput] (val x: Self) extends AnyVal {
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
    def setConsumerARN(value: ConsumerARN): Self = this.set("ConsumerARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumerARN: Self = this.set("ConsumerARN", js.undefined)
    @scala.inline
    def setConsumerName(value: ConsumerName): Self = this.set("ConsumerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumerName: Self = this.set("ConsumerName", js.undefined)
    @scala.inline
    def setStreamARN(value: StreamARN): Self = this.set("StreamARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamARN: Self = this.set("StreamARN", js.undefined)
  }
  
}

