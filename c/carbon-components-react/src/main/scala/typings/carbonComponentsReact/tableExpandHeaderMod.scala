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

object tableExpandHeaderMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/DataTable/TableExpandHeader", JSImport.Default)
  @js.native
  val default: FC[TableExpandHeaderProps] = js.native
  
  trait TableExpandHeaderProps
    extends StObject
       with ThHTMLAttributes[HTMLTableHeaderCellElement] {
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var enableExpando: js.UndefOr[Boolean] = js.undefined
    
    var expandIconDescription: js.UndefOr[String] = js.undefined
    
    var isExpanded: js.UndefOr[Boolean] = js.undefined
    
    var onExpand: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Unit]] = js.undefined
  }
  object TableExpandHeaderProps {
    
    @scala.inline
    def apply(): TableExpandHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableExpandHeaderProps]
    }
    
    @scala.inline
    implicit class TableExpandHeaderPropsMutableBuilder[Self <: TableExpandHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setEnableExpando(value: Boolean): Self = StObject.set(x, "enableExpando", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableExpandoUndefined: Self = StObject.set(x, "enableExpando", js.undefined)
      
      @scala.inline
      def setExpandIconDescription(value: String): Self = StObject.set(x, "expandIconDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandIconDescriptionUndefined: Self = StObject.set(x, "expandIconDescription", js.undefined)
      
      @scala.inline
      def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      @scala.inline
      def setOnExpand(value: /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
    }
  }
  
  type _To = FC[TableExpandHeaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableExpandHeaderMod.foo` */
  override def _to: FC[TableExpandHeaderProps] = default
}
