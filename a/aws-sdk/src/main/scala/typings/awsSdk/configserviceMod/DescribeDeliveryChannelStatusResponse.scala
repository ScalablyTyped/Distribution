package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDeliveryChannelStatusResponse extends js.Object {
  /**
    * A list that contains the status of a specified delivery channel.
    */
  var DeliveryChannelsStatus: js.UndefOr[DeliveryChannelStatusList] = js.native
}

object DescribeDeliveryChannelStatusResponse {
  @scala.inline
  def apply(DeliveryChannelsStatus: DeliveryChannelStatusList = null): DescribeDeliveryChannelStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (DeliveryChannelsStatus != null) __obj.updateDynamic("DeliveryChannelsStatus")(DeliveryChannelsStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDeliveryChannelStatusResponse]
  }
}

