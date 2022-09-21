package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendDataToMulticastGroupResponse extends StObject {
  
  var MessageId: js.UndefOr[MulticastGroupMessageId] = js.undefined
}
object SendDataToMulticastGroupResponse {
  
  inline def apply(): SendDataToMulticastGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendDataToMulticastGroupResponse]
  }
  
  extension [Self <: SendDataToMulticastGroupResponse](x: Self) {
    
    inline def setMessageId(value: MulticastGroupMessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
  }
}
