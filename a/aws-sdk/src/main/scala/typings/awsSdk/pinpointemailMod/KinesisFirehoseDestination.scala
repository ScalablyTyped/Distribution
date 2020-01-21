package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisFirehoseDestination extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis Data Firehose stream that Amazon Pinpoint sends email events to.
    */
  var DeliveryStreamArn: AmazonResourceName = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role that Amazon Pinpoint uses when sending email events to the Amazon Kinesis Data Firehose stream.
    */
  var IamRoleArn: AmazonResourceName = js.native
}

object KinesisFirehoseDestination {
  @scala.inline
  def apply(DeliveryStreamArn: AmazonResourceName, IamRoleArn: AmazonResourceName): KinesisFirehoseDestination = {
    val __obj = js.Dynamic.literal(DeliveryStreamArn = DeliveryStreamArn.asInstanceOf[js.Any], IamRoleArn = IamRoleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KinesisFirehoseDestination]
  }
}

