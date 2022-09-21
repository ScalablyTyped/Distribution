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
  
  inline def apply(): DescribeDeliveryChannelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeliveryChannelsResponse]
  }
  
  extension [Self <: DescribeDeliveryChannelsResponse](x: Self) {
    
    inline def setDeliveryChannels(value: DeliveryChannelList): Self = StObject.set(x, "DeliveryChannels", value.asInstanceOf[js.Any])
    
    inline def setDeliveryChannelsUndefined: Self = StObject.set(x, "DeliveryChannels", js.undefined)
    
    inline def setDeliveryChannelsVarargs(value: DeliveryChannel*): Self = StObject.set(x, "DeliveryChannels", js.Array(value*))
  }
}
