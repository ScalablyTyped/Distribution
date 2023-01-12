package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsMenuMenuRadioGroupMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Menu/MenuRadioGroup", JSImport.Default)
  @js.native
  val default: FC[MenuRadioGroupProps] = js.native
  
  trait MenuRadioGroupProps extends StObject {
    
    var initialSelectedItem: js.UndefOr[String] = js.undefined
    
    var items: js.Array[String]
    
    var label: String
  }
  object MenuRadioGroupProps {
    
    inline def apply(items: js.Array[String], label: String): MenuRadioGroupProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuRadioGroupProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuRadioGroupProps] (val x: Self) extends AnyVal {
      
      inline def setInitialSelectedItem(value: String): Self = StObject.set(x, "initialSelectedItem", value.asInstanceOf[js.Any])
      
      inline def setInitialSelectedItemUndefined: Self = StObject.set(x, "initialSelectedItem", js.undefined)
      
      inline def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[MenuRadioGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsMenuMenuRadioGroupMod.foo` */
  override def _to: FC[MenuRadioGroupProps] = default
}
