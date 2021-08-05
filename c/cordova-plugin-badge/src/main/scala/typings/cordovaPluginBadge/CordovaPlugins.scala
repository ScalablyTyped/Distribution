package typings.cordovaPluginBadge

import typings.cordovaPluginBadge.anon.Badge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CordovaPlugins extends StObject {
  
  var notification: Badge
}
object CordovaPlugins {
  
  inline def apply(notification: Badge): CordovaPlugins = {
    val __obj = js.Dynamic.literal(notification = notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
  
  extension [Self <: CordovaPlugins](x: Self) {
    
    inline def setNotification(value: Badge): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
  }
}
