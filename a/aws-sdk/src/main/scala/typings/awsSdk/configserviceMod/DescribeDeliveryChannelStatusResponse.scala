package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeliveryChannelStatusResponse extends StObject {
  
  /**
    * A list that contains the status of a specified delivery channel.
    */
  var DeliveryChannelsStatus: js.UndefOr[DeliveryChannelStatusList] = js.undefined
}
object DescribeDeliveryChannelStatusResponse {
  
  @scala.inline
  def apply(): DescribeDeliveryChannelStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeliveryChannelStatusResponse]
  }
  
  @scala.inline
  implicit class DescribeDeliveryChannelStatusResponseMutableBuilder[Self <: DescribeDeliveryChannelStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryChannelsStatus(value: DeliveryChannelStatusList): Self = StObject.set(x, "DeliveryChannelsStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryChannelsStatusUndefined: Self = StObject.set(x, "DeliveryChannelsStatus", js.undefined)
    
    @scala.inline
    def setDeliveryChannelsStatusVarargs(value: DeliveryChannelStatus*): Self = StObject.set(x, "DeliveryChannelsStatus", js.Array(value :_*))
  }
}
