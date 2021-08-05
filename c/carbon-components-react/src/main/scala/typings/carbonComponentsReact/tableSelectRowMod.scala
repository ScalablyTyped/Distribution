package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableSelectRowMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/DataTable/TableSelectRow", JSImport.Default)
  @js.native
  val default: FC[TableSelectRowProps] = js.native
  
  trait TableSelectRowProps extends StObject {
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var checked: Boolean
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: String
    
    var name: String
    
    def onSelect(event: MouseEvent[HTMLInputElement, NativeMouseEvent]): Unit
    
    var radio: js.UndefOr[Boolean] = js.undefined
  }
  object TableSelectRowProps {
    
    inline def apply(
      checked: Boolean,
      id: String,
      name: String,
      onSelect: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit
    ): TableSelectRowProps = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1(onSelect))
      __obj.asInstanceOf[TableSelectRowProps]
    }
    
    extension [Self <: TableSelectRowProps](x: Self) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnSelect(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setRadio(value: Boolean): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
      
      inline def setRadioUndefined: Self = StObject.set(x, "radio", js.undefined)
    }
  }
  
  type _To = FC[TableSelectRowProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableSelectRowMod.foo` */
  override def _to: FC[TableSelectRowProps] = default
}
