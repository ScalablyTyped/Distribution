package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLTableRowElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableRowMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/DataTable/TableRow", JSImport.Default)
  @js.native
  val default: FC[TableRowProps] = js.native
  
  trait TableRowProps
    extends StObject
       with HTMLAttributes[HTMLTableRowElement] {
    
    var isSelected: js.UndefOr[Boolean] = js.undefined
  }
  object TableRowProps {
    
    @scala.inline
    def apply(): TableRowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableRowProps]
    }
    
    @scala.inline
    implicit class TableRowPropsMutableBuilder[Self <: TableRowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
    }
  }
  
  type _To = FC[TableRowProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableRowMod.foo` */
  override def _to: FC[TableRowProps] = default
}
