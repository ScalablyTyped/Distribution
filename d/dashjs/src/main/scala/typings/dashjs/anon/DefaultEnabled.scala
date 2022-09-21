package typings.dashjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultEnabled extends StObject {
  
  var defaultEnabled: js.UndefOr[Boolean] = js.undefined
}
object DefaultEnabled {
  
  inline def apply(): DefaultEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultEnabled]
  }
  
  extension [Self <: DefaultEnabled](x: Self) {
    
    inline def setDefaultEnabled(value: Boolean): Self = StObject.set(x, "defaultEnabled", value.asInstanceOf[js.Any])
    
    inline def setDefaultEnabledUndefined: Self = StObject.set(x, "defaultEnabled", js.undefined)
  }
}
