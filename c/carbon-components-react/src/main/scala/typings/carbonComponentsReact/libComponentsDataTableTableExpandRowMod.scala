package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import typings.std.HTMLTableRowElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDataTableTableExpandRowMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/DataTable/TableExpandRow", JSImport.Default)
  @js.native
  val default: FC[TableExpandRowProps] = js.native
  
  trait TableExpandRowProps
    extends StObject
       with HTMLAttributes[HTMLTableRowElement] {
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var expandHeader: js.UndefOr[String] = js.undefined
    
    var expandIconDescription: js.UndefOr[String] = js.undefined
    
    var isExpanded: js.UndefOr[Boolean] = js.undefined
    
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    var onExpand: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Unit]] = js.undefined
  }
  object TableExpandRowProps {
    
    inline def apply(): TableExpandRowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableExpandRowProps]
    }
    
    extension [Self <: TableExpandRowProps](x: Self) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setExpandHeader(value: String): Self = StObject.set(x, "expandHeader", value.asInstanceOf[js.Any])
      
      inline def setExpandHeaderUndefined: Self = StObject.set(x, "expandHeader", js.undefined)
      
      inline def setExpandIconDescription(value: String): Self = StObject.set(x, "expandIconDescription", value.asInstanceOf[js.Any])
      
      inline def setExpandIconDescriptionUndefined: Self = StObject.set(x, "expandIconDescription", js.undefined)
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setOnExpand(value: /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction1(value))
      
      inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
    }
  }
  
  type _To = FC[TableExpandRowProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsDataTableTableExpandRowMod.foo` */
  override def _to: FC[TableExpandRowProps] = default
}
