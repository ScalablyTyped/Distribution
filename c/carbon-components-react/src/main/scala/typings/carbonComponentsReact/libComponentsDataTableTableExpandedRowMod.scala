package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLTableRowElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDataTableTableExpandedRowMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/DataTable/TableExpandedRow", JSImport.Default)
  @js.native
  val default: FC[TableExpandedRowProps] = js.native
  
  trait TableExpandedRowProps
    extends StObject
       with HTMLAttributes[HTMLTableRowElement] {
    
    var colSpan: Double
  }
  object TableExpandedRowProps {
    
    inline def apply(colSpan: Double): TableExpandedRowProps = {
      val __obj = js.Dynamic.literal(colSpan = colSpan.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableExpandedRowProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableExpandedRowProps] (val x: Self) extends AnyVal {
      
      inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[TableExpandedRowProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsDataTableTableExpandedRowMod.foo` */
  override def _to: FC[TableExpandedRowProps] = default
}
