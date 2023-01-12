package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.updateNavigation()
trait UpdateNavigationConfig extends StObject {
  
  var stateOnly: js.UndefOr[Boolean] = js.undefined
  
  var updateTapp: js.UndefOr[Boolean] = js.undefined
}
object UpdateNavigationConfig {
  
  inline def apply(): UpdateNavigationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateNavigationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateNavigationConfig] (val x: Self) extends AnyVal {
    
    inline def setStateOnly(value: Boolean): Self = StObject.set(x, "stateOnly", value.asInstanceOf[js.Any])
    
    inline def setStateOnlyUndefined: Self = StObject.set(x, "stateOnly", js.undefined)
    
    inline def setUpdateTapp(value: Boolean): Self = StObject.set(x, "updateTapp", value.asInstanceOf[js.Any])
    
    inline def setUpdateTappUndefined: Self = StObject.set(x, "updateTapp", js.undefined)
  }
}
