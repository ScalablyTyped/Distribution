package typings.azureSb

import typings.azureSb.mod.Azure.ServiceBus.BrokerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queuemessageresultMod {
  
  object Azure {
    
    object ServiceBus {
      
      object Results {
        
        @js.native
        trait QueueMessageResponse extends StObject {
          
          var body: js.Any = js.native
          
          var brokerProperties: js.UndefOr[BrokerProperties] = js.native
          
          var contentType: js.UndefOr[String] = js.native
          
          var customProperties: js.UndefOr[
                    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<any> */ js.Any
                  ] = js.native
          
          var location: js.UndefOr[String] = js.native
        }
        object QueueMessageResponse {
          
          @scala.inline
          def apply(body: js.Any): QueueMessageResponse = {
            val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
            __obj.asInstanceOf[QueueMessageResponse]
          }
          
          @scala.inline
          implicit class QueueMessageResponseMutableBuilder[Self <: QueueMessageResponse] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setBrokerProperties(value: BrokerProperties): Self = StObject.set(x, "brokerProperties", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setBrokerPropertiesUndefined: Self = StObject.set(x, "brokerProperties", js.undefined)
            
            @scala.inline
            def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
            
            @scala.inline
            def setCustomProperties(
              value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<any> */ js.Any
            ): Self = StObject.set(x, "customProperties", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setCustomPropertiesUndefined: Self = StObject.set(x, "customProperties", js.undefined)
            
            @scala.inline
            def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
          }
        }
        
        @js.native
        trait QueueMessageResult extends StObject {
          
          def isRFC1123(value: String): Boolean = js.native
          def isRFC1123(value: js.Any): Boolean = js.native
          
          def parse(responseObject: js.Object): QueueMessageResponse = js.native
        }
        
        @js.native
        trait QueueResponse extends StObject {
          
          var body: js.Any = js.native
          
          var headers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any = js.native
        }
        object QueueResponse {
          
          @scala.inline
          def apply(
            body: js.Any,
            headers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any
          ): QueueResponse = {
            val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
            __obj.asInstanceOf[QueueResponse]
          }
          
          @scala.inline
          implicit class QueueResponseMutableBuilder[Self <: QueueResponse] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setHeaders(
              value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any
            ): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
          }
        }
      }
    }
  }
}
