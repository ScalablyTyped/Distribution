package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsMenuMenuGroupMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Menu/MenuGroup", JSImport.Default)
  @js.native
  val default: FC[MenuGroupProps] = js.native
  
  trait MenuGroupProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var label: String
  }
  object MenuGroupProps {
    
    inline def apply(label: String): MenuGroupProps = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuGroupProps]
    }
    
    extension [Self <: MenuGroupProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[MenuGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsMenuMenuGroupMod.foo` */
  override def _to: FC[MenuGroupProps] = default
}
