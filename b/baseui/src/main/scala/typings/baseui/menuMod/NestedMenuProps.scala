package typings.baseui.menuMod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NestedMenuProps extends StObject {
  
  var children: ReactNode
}
object NestedMenuProps {
  
  inline def apply(): NestedMenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NestedMenuProps]
  }
  
  extension [Self <: NestedMenuProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
