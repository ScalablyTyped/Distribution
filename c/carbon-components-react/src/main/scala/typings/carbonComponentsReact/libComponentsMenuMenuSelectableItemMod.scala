package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsMenuMenuSelectableItemMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Menu/MenuSelectableItem", JSImport.Default)
  @js.native
  val default: FC[MenuSelectableItemProps] = js.native
  
  trait MenuSelectableItemProps extends StObject {
    
    var initialChecked: js.UndefOr[Boolean] = js.undefined
    
    var label: String
    
    var onChange: js.UndefOr[js.Function1[/* newChecked */ Boolean, Unit]] = js.undefined
  }
  object MenuSelectableItemProps {
    
    inline def apply(label: String): MenuSelectableItemProps = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuSelectableItemProps]
    }
    
    extension [Self <: MenuSelectableItemProps](x: Self) {
      
      inline def setInitialChecked(value: Boolean): Self = StObject.set(x, "initialChecked", value.asInstanceOf[js.Any])
      
      inline def setInitialCheckedUndefined: Self = StObject.set(x, "initialChecked", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: /* newChecked */ Boolean => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
  
  type _To = FC[MenuSelectableItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsMenuMenuSelectableItemMod.foo` */
  override def _to: FC[MenuSelectableItemProps] = default
}
