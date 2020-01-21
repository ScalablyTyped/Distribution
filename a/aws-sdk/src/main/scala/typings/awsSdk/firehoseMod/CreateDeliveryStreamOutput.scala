package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeliveryStreamOutput extends js.Object {
  /**
    * The ARN of the delivery stream.
    */
  var DeliveryStreamARN: js.UndefOr[typings.awsSdk.firehoseMod.DeliveryStreamARN] = js.native
}

object CreateDeliveryStreamOutput {
  @scala.inline
  def apply(DeliveryStreamARN: DeliveryStreamARN = null): CreateDeliveryStreamOutput = {
    val __obj = js.Dynamic.literal()
    if (DeliveryStreamARN != null) __obj.updateDynamic("DeliveryStreamARN")(DeliveryStreamARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeliveryStreamOutput]
  }
}

