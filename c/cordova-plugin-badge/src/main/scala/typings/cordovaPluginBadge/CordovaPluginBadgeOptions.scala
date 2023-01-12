package typings.cordovaPluginBadge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CordovaPluginBadgeOptions extends StObject {
  
  var autoClear: Boolean
}
object CordovaPluginBadgeOptions {
  
  inline def apply(autoClear: Boolean): CordovaPluginBadgeOptions = {
    val __obj = js.Dynamic.literal(autoClear = autoClear.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPluginBadgeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CordovaPluginBadgeOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoClear(value: Boolean): Self = StObject.set(x, "autoClear", value.asInstanceOf[js.Any])
  }
}
