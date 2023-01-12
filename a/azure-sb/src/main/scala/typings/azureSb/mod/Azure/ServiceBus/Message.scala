package typings.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  var body: String
  
  var brokerProperties: js.UndefOr[BrokerProperties] = js.undefined
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var customProperties: js.UndefOr[Dictionary[Any]] = js.undefined
}
object Message {
  
  inline def apply(body: String): Message = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBrokerProperties(value: BrokerProperties): Self = StObject.set(x, "brokerProperties", value.asInstanceOf[js.Any])
    
    inline def setBrokerPropertiesUndefined: Self = StObject.set(x, "brokerProperties", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setCustomProperties(value: Dictionary[Any]): Self = StObject.set(x, "customProperties", value.asInstanceOf[js.Any])
    
    inline def setCustomPropertiesUndefined: Self = StObject.set(x, "customProperties", js.undefined)
  }
}
