package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisFirehoseDestination extends js.Object {
  /**
    * The ARN of the Amazon Kinesis Firehose stream that email sending events should be published to.
    */
  var DeliveryStreamARN: AmazonResourceName = js.native
  /**
    * The ARN of the IAM role under which Amazon SES publishes email sending events to the Amazon Kinesis Firehose stream.
    */
  var IAMRoleARN: AmazonResourceName = js.native
}

object KinesisFirehoseDestination {
  @scala.inline
  def apply(DeliveryStreamARN: AmazonResourceName, IAMRoleARN: AmazonResourceName): KinesisFirehoseDestination = {
    val __obj = js.Dynamic.literal(DeliveryStreamARN = DeliveryStreamARN.asInstanceOf[js.Any], IAMRoleARN = IAMRoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisFirehoseDestination]
  }
  @scala.inline
  implicit class KinesisFirehoseDestinationOps[Self <: KinesisFirehoseDestination] (val x: Self) extends AnyVal {
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
    def setDeliveryStreamARN(value: AmazonResourceName): Self = this.set("DeliveryStreamARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setIAMRoleARN(value: AmazonResourceName): Self = this.set("IAMRoleARN", value.asInstanceOf[js.Any])
  }
  
}

