package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDeliveryStreamInput extends js.Object {
  /**
    * Set this to true if you want to delete the delivery stream even if Kinesis Data Firehose is unable to retire the grant for the CMK. Kinesis Data Firehose might be unable to retire the grant due to a customer error, such as when the CMK or the grant are in an invalid state. If you force deletion, you can then use the RevokeGrant operation to revoke the grant you gave to Kinesis Data Firehose. If a failure to retire the grant happens due to an AWS KMS issue, Kinesis Data Firehose keeps retrying the delete operation. The default value is false.
    */
  var AllowForceDelete: js.UndefOr[BooleanObject] = js.native
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typings.awsSdk.firehoseMod.DeliveryStreamName = js.native
}

object DeleteDeliveryStreamInput {
  @scala.inline
  def apply(DeliveryStreamName: DeliveryStreamName): DeleteDeliveryStreamInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeliveryStreamInput]
  }
  @scala.inline
  implicit class DeleteDeliveryStreamInputOps[Self <: DeleteDeliveryStreamInput] (val x: Self) extends AnyVal {
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
    def setDeliveryStreamName(value: DeliveryStreamName): Self = this.set("DeliveryStreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowForceDelete(value: BooleanObject): Self = this.set("AllowForceDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowForceDelete: Self = this.set("AllowForceDelete", js.undefined)
  }
  
}

