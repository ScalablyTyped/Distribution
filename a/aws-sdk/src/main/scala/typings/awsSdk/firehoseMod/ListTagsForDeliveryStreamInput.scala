package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForDeliveryStreamInput extends js.Object {
  /**
    * The name of the delivery stream whose tags you want to list.
    */
  var DeliveryStreamName: typings.awsSdk.firehoseMod.DeliveryStreamName = js.native
  /**
    * The key to use as the starting point for the list of tags. If you set this parameter, ListTagsForDeliveryStream gets all tags that occur after ExclusiveStartTagKey.
    */
  var ExclusiveStartTagKey: js.UndefOr[TagKey] = js.native
  /**
    * The number of tags to return. If this number is less than the total number of tags associated with the delivery stream, HasMoreTags is set to true in the response. To list additional tags, set ExclusiveStartTagKey to the last key in the response. 
    */
  var Limit: js.UndefOr[ListTagsForDeliveryStreamInputLimit] = js.native
}

object ListTagsForDeliveryStreamInput {
  @scala.inline
  def apply(DeliveryStreamName: DeliveryStreamName): ListTagsForDeliveryStreamInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForDeliveryStreamInput]
  }
  @scala.inline
  implicit class ListTagsForDeliveryStreamInputOps[Self <: ListTagsForDeliveryStreamInput] (val x: Self) extends AnyVal {
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
    def setExclusiveStartTagKey(value: TagKey): Self = this.set("ExclusiveStartTagKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusiveStartTagKey: Self = this.set("ExclusiveStartTagKey", js.undefined)
    @scala.inline
    def setLimit(value: ListTagsForDeliveryStreamInputLimit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
  }
  
}

