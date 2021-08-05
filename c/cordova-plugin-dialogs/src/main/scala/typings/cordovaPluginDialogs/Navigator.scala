package typings.cordovaPluginDialogs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  /** This plugin provides access to some native dialog UI elements. */
  var notification: Notification
}
object Navigator {
  
  inline def apply(notification: Notification): Navigator = {
    val __obj = js.Dynamic.literal(notification = notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  extension [Self <: Navigator](x: Self) {
    
    inline def setNotification(value: Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
  }
}
