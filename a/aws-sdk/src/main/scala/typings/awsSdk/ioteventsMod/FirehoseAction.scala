package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseAction extends js.Object {
  /**
    * The name of the Kinesis Data Firehose delivery stream where the data is written.
    */
  var deliveryStreamName: DeliveryStreamName = js.native
  /**
    * You can configure the action payload when you send a message to an Amazon Kinesis Data Firehose delivery stream.
    */
  var payload: js.UndefOr[Payload] = js.native
  /**
    * A character separator that is used to separate records written to the Kinesis Data Firehose delivery stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
    */
  var separator: js.UndefOr[FirehoseSeparator] = js.native
}

object FirehoseAction {
  @scala.inline
  def apply(deliveryStreamName: DeliveryStreamName): FirehoseAction = {
    val __obj = js.Dynamic.literal(deliveryStreamName = deliveryStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseAction]
  }
  @scala.inline
  implicit class FirehoseActionOps[Self <: FirehoseAction] (val x: Self) extends AnyVal {
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
    def setDeliveryStreamName(value: DeliveryStreamName): Self = this.set("deliveryStreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: Payload): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setSeparator(value: FirehoseSeparator): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
  }
  
}

