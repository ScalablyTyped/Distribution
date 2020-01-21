package typings.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisFirehoseDestination extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an IAM role that can write data to an Amazon Kinesis Data Firehose stream.
    */
  var DeliveryStreamArn: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis Data Firehose destination that you want to use in the event destination.
    */
  var IamRoleArn: js.UndefOr[String] = js.native
}

object KinesisFirehoseDestination {
  @scala.inline
  def apply(DeliveryStreamArn: String = null, IamRoleArn: String = null): KinesisFirehoseDestination = {
    val __obj = js.Dynamic.literal()
    if (DeliveryStreamArn != null) __obj.updateDynamic("DeliveryStreamArn")(DeliveryStreamArn.asInstanceOf[js.Any])
    if (IamRoleArn != null) __obj.updateDynamic("IamRoleArn")(IamRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisFirehoseDestination]
  }
}

