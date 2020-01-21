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
}

