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
  def apply(): DescribeDeliveryChannelStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeliveryChannelStatusResponse]
  }
  @scala.inline
  implicit class DescribeDeliveryChannelStatusResponseOps[Self <: DescribeDeliveryChannelStatusResponse] (val x: Self) extends AnyVal {
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
    def setDeliveryChannelsStatusVarargs(value: DeliveryChannelStatus*): Self = this.set("DeliveryChannelsStatus", js.Array(value :_*))
    @scala.inline
    def setDeliveryChannelsStatus(value: DeliveryChannelStatusList): Self = this.set("DeliveryChannelsStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliveryChannelsStatus: Self = this.set("DeliveryChannelsStatus", js.undefined)
  }
  
}

