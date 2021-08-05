package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeliveryChannelsRequest extends StObject {
  
  /**
    * A list of delivery channel names.
    */
  var DeliveryChannelNames: js.UndefOr[DeliveryChannelNameList] = js.undefined
}
object DescribeDeliveryChannelsRequest {
  
  inline def apply(): DescribeDeliveryChannelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeliveryChannelsRequest]
  }
  
  extension [Self <: DescribeDeliveryChannelsRequest](x: Self) {
    
    inline def setDeliveryChannelNames(value: DeliveryChannelNameList): Self = StObject.set(x, "DeliveryChannelNames", value.asInstanceOf[js.Any])
    
    inline def setDeliveryChannelNamesUndefined: Self = StObject.set(x, "DeliveryChannelNames", js.undefined)
    
    inline def setDeliveryChannelNamesVarargs(value: ChannelName*): Self = StObject.set(x, "DeliveryChannelNames", js.Array(value :_*))
  }
}
