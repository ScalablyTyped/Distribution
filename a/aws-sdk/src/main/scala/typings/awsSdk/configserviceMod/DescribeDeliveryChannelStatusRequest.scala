package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDeliveryChannelStatusRequest extends StObject {
  
  /**
    * A list of delivery channel names.
    */
  var DeliveryChannelNames: js.UndefOr[DeliveryChannelNameList] = js.native
}
object DescribeDeliveryChannelStatusRequest {
  
  @scala.inline
  def apply(): DescribeDeliveryChannelStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeliveryChannelStatusRequest]
  }
  
  @scala.inline
  implicit class DescribeDeliveryChannelStatusRequestMutableBuilder[Self <: DescribeDeliveryChannelStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryChannelNames(value: DeliveryChannelNameList): Self = StObject.set(x, "DeliveryChannelNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryChannelNamesUndefined: Self = StObject.set(x, "DeliveryChannelNames", js.undefined)
    
    @scala.inline
    def setDeliveryChannelNamesVarargs(value: ChannelName*): Self = StObject.set(x, "DeliveryChannelNames", js.Array(value :_*))
  }
}
