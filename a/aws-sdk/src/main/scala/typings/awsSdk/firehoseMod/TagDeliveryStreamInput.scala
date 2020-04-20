package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagDeliveryStreamInput extends js.Object {
  /**
    * The name of the delivery stream to which you want to add the tags.
    */
  var DeliveryStreamName: typings.awsSdk.firehoseMod.DeliveryStreamName = js.native
  /**
    * A set of key-value pairs to use to create the tags.
    */
  var Tags: TagDeliveryStreamInputTagList = js.native
}

object TagDeliveryStreamInput {
  @scala.inline
  def apply(DeliveryStreamName: DeliveryStreamName, Tags: TagDeliveryStreamInputTagList): TagDeliveryStreamInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagDeliveryStreamInput]
  }
}

