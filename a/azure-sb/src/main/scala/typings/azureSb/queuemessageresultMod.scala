package typings.azureSb

import typings.azureSb.mod.Azure.ServiceBus.BrokerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queuemessageresultMod {
  
  object Azure {
    
    object ServiceBus {
      
      object Results {
        
        trait QueueMessageResponse extends StObject {
          
          var body: js.Any
          
          var brokerProperties: js.UndefOr[BrokerProperties] = js.undefined
          
          var contentType: js.UndefOr[String] = js.undefined
          
          var customProperties: js.UndefOr[
                    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<any> */ js.Any
                  ] = js.undefined
          
          var location: js.UndefOr[String] = js.undefined
        }
        object QueueMessageResponse {
          
          inline def apply(body: js.Any): QueueMessageResponse = {
            val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
            __obj.asInstanceOf[QueueMessageResponse]
          }
          
          extension [Self <: QueueMessageResponse](x: Self) {
            
            inline def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
            
            inline def setBrokerProperties(value: BrokerProperties): Self = StObject.set(x, "brokerProperties", value.asInstanceOf[js.Any])
            
            inline def setBrokerPropertiesUndefined: Self = StObject.set(x, "brokerProperties", js.undefined)
            
            inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
            
            inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
            
            inline def setCustomProperties(
              value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<any> */ js.Any
            ): Self = StObject.set(x, "customProperties", value.asInstanceOf[js.Any])
            
            inline def setCustomPropertiesUndefined: Self = StObject.set(x, "customProperties", js.undefined)
            
            inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
            
            inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
          }
        }
        
        @js.native
        trait QueueMessageResult extends StObject {
          
          def isRFC1123(value: String): Boolean = js.native
          def isRFC1123(value: js.Any): Boolean = js.native
          
          def parse(responseObject: js.Object): QueueMessageResponse = js.native
        }
        
        trait QueueResponse extends StObject {
          
          var body: js.Any
          
          var headers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any
        }
        object QueueResponse {
          
          inline def apply(
            body: js.Any,
            headers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any
          ): QueueResponse = {
            val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
            __obj.asInstanceOf[QueueResponse]
          }
          
          extension [Self <: QueueResponse](x: Self) {
            
            inline def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
            
            inline def setHeaders(
              value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any
            ): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
          }
        }
      }
    }
  }
}
