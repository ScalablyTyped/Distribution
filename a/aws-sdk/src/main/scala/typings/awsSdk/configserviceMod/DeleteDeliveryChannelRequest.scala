package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDeliveryChannelRequest extends StObject {
  
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
  implicit class DeleteDeliveryChannelRequestMutableBuilder[Self <: DeleteDeliveryChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryChannelName(value: ChannelName): Self = StObject.set(x, "DeliveryChannelName", value.asInstanceOf[js.Any])
  }
}
