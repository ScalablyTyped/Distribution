package typings.cordovaPluginDialogs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigator extends StObject {
  
  /** This plugin provides access to some native dialog UI elements. */
  var notification: Notification = js.native
}
object Navigator {
  
  @scala.inline
  def apply(notification: Notification): Navigator = {
    val __obj = js.Dynamic.literal(notification = notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit class NavigatorMutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotification(value: Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
  }
}
