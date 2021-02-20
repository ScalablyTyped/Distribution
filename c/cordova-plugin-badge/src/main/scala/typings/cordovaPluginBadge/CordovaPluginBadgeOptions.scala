package typings.cordovaPluginBadge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CordovaPluginBadgeOptions extends StObject {
  
  var autoClear: Boolean = js.native
}
object CordovaPluginBadgeOptions {
  
  @scala.inline
  def apply(autoClear: Boolean): CordovaPluginBadgeOptions = {
    val __obj = js.Dynamic.literal(autoClear = autoClear.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPluginBadgeOptions]
  }
  
  @scala.inline
  implicit class CordovaPluginBadgeOptionsMutableBuilder[Self <: CordovaPluginBadgeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoClear(value: Boolean): Self = StObject.set(x, "autoClear", value.asInstanceOf[js.Any])
  }
}
