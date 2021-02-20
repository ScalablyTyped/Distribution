package typings.braintree.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseWebhookNotification extends StObject {
  
  var kind: WebhookNotificationKind = js.native
  
  var timestamp: Date = js.native
}
object BaseWebhookNotification {
  
  @scala.inline
  def apply(kind: WebhookNotificationKind, timestamp: Date): BaseWebhookNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseWebhookNotification]
  }
  
  @scala.inline
  implicit class BaseWebhookNotificationMutableBuilder[Self <: BaseWebhookNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: WebhookNotificationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
