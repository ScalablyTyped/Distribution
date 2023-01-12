package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ThHTMLAttributes
import typings.std.HTMLButtonElement
import typings.std.HTMLTableHeaderCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDataTableTableExpandHeaderMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/DataTable/TableExpandHeader", JSImport.Default)
  @js.native
  val default: FC[TableExpandHeaderProps] = js.native
  
  trait TableExpandHeaderProps
    extends StObject
       with ThHTMLAttributes[HTMLTableHeaderCellElement] {
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * @deprecated
      */
    var enableExpando: js.UndefOr[Boolean] = js.undefined
    
    var enableToggle: js.UndefOr[Boolean] = js.undefined
    
    var expandIconDescription: js.UndefOr[String] = js.undefined
    
    var isExpanded: js.UndefOr[Boolean] = js.undefined
    
    var onExpand: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Unit]] = js.undefined
  }
  object TableExpandHeaderProps {
    
    inline def apply(): TableExpandHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableExpandHeaderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableExpandHeaderProps] (val x: Self) extends AnyVal {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setEnableExpando(value: Boolean): Self = StObject.set(x, "enableExpando", value.asInstanceOf[js.Any])
      
      inline def setEnableExpandoUndefined: Self = StObject.set(x, "enableExpando", js.undefined)
      
      inline def setEnableToggle(value: Boolean): Self = StObject.set(x, "enableToggle", value.asInstanceOf[js.Any])
      
      inline def setEnableToggleUndefined: Self = StObject.set(x, "enableToggle", js.undefined)
      
      inline def setExpandIconDescription(value: String): Self = StObject.set(x, "expandIconDescription", value.asInstanceOf[js.Any])
      
      inline def setExpandIconDescriptionUndefined: Self = StObject.set(x, "expandIconDescription", js.undefined)
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setOnExpand(value: /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction1(value))
      
      inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
    }
  }
  
  type _To = FC[TableExpandHeaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsDataTableTableExpandHeaderMod.foo` */
  override def _to: FC[TableExpandHeaderProps] = default
}
