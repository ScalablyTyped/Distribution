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
  def apply(
    DeliveryStreamName: DeliveryStreamName,
    ExclusiveStartTagKey: TagKey = null,
    Limit: Int | Double = null
  ): ListTagsForDeliveryStreamInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any])
    if (ExclusiveStartTagKey != null) __obj.updateDynamic("ExclusiveStartTagKey")(ExclusiveStartTagKey.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForDeliveryStreamInput]
  }
}

