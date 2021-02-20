package typings.cordovaPluginBadge

import typings.cordovaPluginBadge.anon.Badge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CordovaPlugins extends StObject {
  
  var notification: Badge = js.native
}
object CordovaPlugins {
  
  @scala.inline
  def apply(notification: Badge): CordovaPlugins = {
    val __obj = js.Dynamic.literal(notification = notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
  
  @scala.inline
  implicit class CordovaPluginsMutableBuilder[Self <: CordovaPlugins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotification(value: Badge): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
  }
}
