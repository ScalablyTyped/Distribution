package typings.azureSb

import typings.azureSb.mod.Azure.ServiceBus.CreateNotificationHubOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationhubresultMod {
  
  object Azure {
    
    object ServiceBus {
      
      object Results {
        
        @js.native
        trait NotificationHubResult extends StObject {
          
          def parse(xml: js.Object): js.Object | js.Array[js.Object] = js.native
          
          def serialize(resource: CreateNotificationHubOptions): String = js.native
        }
        object NotificationHubResult {
          
          @scala.inline
          def apply(
            parse: js.Object => js.Object | js.Array[js.Object],
            serialize: CreateNotificationHubOptions => String
          ): NotificationHubResult = {
            val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), serialize = js.Any.fromFunction1(serialize))
            __obj.asInstanceOf[NotificationHubResult]
          }
          
          @scala.inline
          implicit class NotificationHubResultMutableBuilder[Self <: NotificationHubResult] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setParse(value: js.Object => js.Object | js.Array[js.Object]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
            
            @scala.inline
            def setSerialize(value: CreateNotificationHubOptions => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
          }
        }
      }
    }
  }
}
