package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeliveryChannelsResponse extends StObject {
  
  /**
    * A list that contains the descriptions of the specified delivery channel.
    */
  var DeliveryChannels: js.UndefOr[DeliveryChannelList] = js.undefined
}
object DescribeDeliveryChannelsResponse {
  
  @scala.inline
  def apply(): DescribeDeliveryChannelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeliveryChannelsResponse]
  }
  
  @scala.inline
  implicit class DescribeDeliveryChannelsResponseMutableBuilder[Self <: DescribeDeliveryChannelsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryChannels(value: DeliveryChannelList): Self = StObject.set(x, "DeliveryChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryChannelsUndefined: Self = StObject.set(x, "DeliveryChannels", js.undefined)
    
    @scala.inline
    def setDeliveryChannelsVarargs(value: DeliveryChannel*): Self = StObject.set(x, "DeliveryChannels", js.Array(value :_*))
  }
}
