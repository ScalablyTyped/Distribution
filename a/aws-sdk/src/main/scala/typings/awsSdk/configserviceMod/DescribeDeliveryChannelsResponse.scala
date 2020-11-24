package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDeliveryChannelsResponse extends js.Object {
  
  /**
    * A list that contains the descriptions of the specified delivery channel.
    */
  var DeliveryChannels: js.UndefOr[DeliveryChannelList] = js.native
}
object DescribeDeliveryChannelsResponse {
  
  @scala.inline
  def apply(): DescribeDeliveryChannelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeliveryChannelsResponse]
  }
  
  @scala.inline
  implicit class DescribeDeliveryChannelsResponseOps[Self <: DescribeDeliveryChannelsResponse] (val x: Self) extends AnyVal {
    
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
    def setDeliveryChannelsVarargs(value: DeliveryChannel*): Self = this.set("DeliveryChannels", js.Array(value :_*))
    
    @scala.inline
    def setDeliveryChannels(value: DeliveryChannelList): Self = this.set("DeliveryChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryChannels: Self = this.set("DeliveryChannels", js.undefined)
  }
}
