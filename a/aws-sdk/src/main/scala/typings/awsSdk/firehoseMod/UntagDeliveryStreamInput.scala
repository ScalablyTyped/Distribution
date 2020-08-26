package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagDeliveryStreamInput extends js.Object {
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typings.awsSdk.firehoseMod.DeliveryStreamName = js.native
  /**
    * A list of tag keys. Each corresponding tag is removed from the delivery stream.
    */
  var TagKeys: TagKeyList = js.native
}

object UntagDeliveryStreamInput {
  @scala.inline
  def apply(DeliveryStreamName: DeliveryStreamName, TagKeys: TagKeyList): UntagDeliveryStreamInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagDeliveryStreamInput]
  }
  @scala.inline
  implicit class UntagDeliveryStreamInputOps[Self <: UntagDeliveryStreamInput] (val x: Self) extends AnyVal {
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
    def setTagKeysVarargs(value: TagKey*): Self = this.set("TagKeys", js.Array(value :_*))
    @scala.inline
    def setTagKeys(value: TagKeyList): Self = this.set("TagKeys", value.asInstanceOf[js.Any])
  }
  
}

