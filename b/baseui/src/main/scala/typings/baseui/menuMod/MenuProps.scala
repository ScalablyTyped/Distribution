package typings.baseui.menuMod

import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuProps
  extends StObject
     with BaseMenuPropsT {
  
  var overrides: js.UndefOr[MenuOverrides] = js.undefined
  
  var size: js.UndefOr[default_ | compact] = js.undefined
}
object MenuProps {
  
  inline def apply(): MenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuProps]
  }
  
  extension [Self <: MenuProps](x: Self) {
    
    inline def setOverrides(value: MenuOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setSize(value: default_ | compact): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
