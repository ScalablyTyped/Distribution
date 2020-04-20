package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDeliveryStreamOutput extends js.Object {
  /**
    * Information about the delivery stream.
    */
  var DeliveryStreamDescription: typings.awsSdk.firehoseMod.DeliveryStreamDescription = js.native
}

object DescribeDeliveryStreamOutput {
  @scala.inline
  def apply(DeliveryStreamDescription: DeliveryStreamDescription): DescribeDeliveryStreamOutput = {
    val __obj = js.Dynamic.literal(DeliveryStreamDescription = DeliveryStreamDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDeliveryStreamOutput]
  }
}

