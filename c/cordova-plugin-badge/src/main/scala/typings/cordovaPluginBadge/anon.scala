package typings.cordovaPluginBadge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Badge extends StObject {
    
    var badge: CordovaPluginBadge = js.native
  }
  object Badge {
    
    @scala.inline
    def apply(badge: CordovaPluginBadge): Badge = {
      val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any])
      __obj.asInstanceOf[Badge]
    }
    
    @scala.inline
    implicit class BadgeMutableBuilder[Self <: Badge] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadge(value: CordovaPluginBadge): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    }
  }
}
