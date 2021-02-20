package typings.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends StObject {
  
  var body: String = js.native
  
  var brokerProperties: js.UndefOr[BrokerProperties] = js.native
  
  var contentType: js.UndefOr[String] = js.native
  
  var customProperties: js.UndefOr[Dictionary[_]] = js.native
}
object Message {
  
  @scala.inline
  def apply(body: String): Message = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokerProperties(value: BrokerProperties): Self = StObject.set(x, "brokerProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokerPropertiesUndefined: Self = StObject.set(x, "brokerProperties", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setCustomProperties(value: Dictionary[_]): Self = StObject.set(x, "customProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomPropertiesUndefined: Self = StObject.set(x, "customProperties", js.undefined)
  }
}
