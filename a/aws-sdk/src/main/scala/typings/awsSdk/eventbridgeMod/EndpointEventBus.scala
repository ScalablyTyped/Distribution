package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointEventBus extends StObject {
  
  /**
    * The ARN of the event bus the endpoint is associated with.
    */
  var EventBusArn: NonPartnerEventBusArn
}
object EndpointEventBus {
  
  inline def apply(EventBusArn: NonPartnerEventBusArn): EndpointEventBus = {
    val __obj = js.Dynamic.literal(EventBusArn = EventBusArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointEventBus]
  }
  
  extension [Self <: EndpointEventBus](x: Self) {
    
    inline def setEventBusArn(value: NonPartnerEventBusArn): Self = StObject.set(x, "EventBusArn", value.asInstanceOf[js.Any])
  }
}
