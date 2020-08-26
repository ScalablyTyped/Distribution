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
    def setDeliveryStreamArn(value: AmazonResourceName): Self = this.set("DeliveryStreamArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setIamRoleArn(value: AmazonResourceName): Self = this.set("IamRoleArn", value.asInstanceOf[js.Any])
  }
  
}

