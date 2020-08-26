package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseAction extends js.Object {
  /**
    * The delivery stream name.
    */
  var deliveryStreamName: DeliveryStreamName = js.native
  /**
    * The IAM role that grants access to the Amazon Kinesis Firehose stream.
    */
  var roleArn: AwsArn = js.native
  /**
    * A character separator that will be used to separate records written to the Firehose stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
    */
  var separator: js.UndefOr[FirehoseSeparator] = js.native
}

object FirehoseAction {
  @scala.inline
  def apply(deliveryStreamName: DeliveryStreamName, roleArn: AwsArn): FirehoseAction = {
    val __obj = js.Dynamic.literal(deliveryStreamName = deliveryStreamName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseAction]
  }
  @scala.inline
  implicit class FirehoseActionOps[Self <: FirehoseAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeliveryStreamName(value: DeliveryStreamName): Self = this.set("deliveryStreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: AwsArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeparator(value: FirehoseSeparator): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
  }
  
}

