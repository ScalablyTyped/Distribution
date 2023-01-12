package typings.baseui.menuTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuProps extends StObject {
  
  var overrides: js.UndefOr[MenuOverrides] = js.undefined
  
  /** Renders all menu content for SEO purposes regardless of menu  state */
  var renderAll: js.UndefOr[Boolean] = js.undefined
}
object MenuProps {
  
  inline def apply(): MenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuProps] (val x: Self) extends AnyVal {
    
    inline def setOverrides(value: MenuOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
    
    inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
  }
}
