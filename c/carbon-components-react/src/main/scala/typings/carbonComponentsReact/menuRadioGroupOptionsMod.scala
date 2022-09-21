package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuRadioGroupOptionsMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Menu/MenuRadioGroupOptions", JSImport.Default)
  @js.native
  val default: FC[MenuRadioGroupOptionsProps] = js.native
  
  trait MenuRadioGroupOptionsProps extends StObject {
    
    var initialSelectedItem: js.UndefOr[String] = js.undefined
    
    var items: js.Array[String]
    
    var onChange: js.UndefOr[js.Function1[/* item */ String, Unit]] = js.undefined
  }
  object MenuRadioGroupOptionsProps {
    
    inline def apply(items: js.Array[String]): MenuRadioGroupOptionsProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuRadioGroupOptionsProps]
    }
    
    extension [Self <: MenuRadioGroupOptionsProps](x: Self) {
      
      inline def setInitialSelectedItem(value: String): Self = StObject.set(x, "initialSelectedItem", value.asInstanceOf[js.Any])
      
      inline def setInitialSelectedItemUndefined: Self = StObject.set(x, "initialSelectedItem", js.undefined)
      
      inline def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOnChange(value: /* item */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
  
  type _To = FC[MenuRadioGroupOptionsProps]
  
  /* This means you don't have to write `default`, but can instead just say `menuRadioGroupOptionsMod.foo` */
  override def _to: FC[MenuRadioGroupOptionsProps] = default
}
