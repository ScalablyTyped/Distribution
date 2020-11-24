package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDeliveryChannelRequest extends js.Object {
  
  /**
    * The name of the delivery channel to delete.
    */
  var DeliveryChannelName: ChannelName = js.native
}
object DeleteDeliveryChannelRequest {
  
  @scala.inline
  def apply(DeliveryChannelName: ChannelName): DeleteDeliveryChannelRequest = {
    val __obj = js.Dynamic.literal(DeliveryChannelName = DeliveryChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeliveryChannelRequest]
  }
  
  @scala.inline
  implicit class DeleteDeliveryChannelRequestOps[Self <: DeleteDeliveryChannelRequest] (val x: Self) extends AnyVal {
    
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
    def setDeliveryChannelName(value: ChannelName): Self = this.set("DeliveryChannelName", value.asInstanceOf[js.Any])
  }
}
