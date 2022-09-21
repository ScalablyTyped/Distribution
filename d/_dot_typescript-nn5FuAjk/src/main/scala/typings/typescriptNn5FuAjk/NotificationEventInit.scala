package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationEventInit
  extends StObject
     with EventInit {
  
  var action: js.UndefOr[java.lang.String] = js.undefined
  
  var notification: Notification
}
object NotificationEventInit {
  
  inline def apply(notification: Notification): NotificationEventInit = {
    val __obj = js.Dynamic.literal(notification = notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventInit]
  }
  
  extension [Self <: NotificationEventInit](x: Self) {
    
    inline def setAction(value: java.lang.String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setNotification(value: Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
  }
}
