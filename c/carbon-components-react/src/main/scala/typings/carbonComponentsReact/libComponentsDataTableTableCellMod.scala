package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.TdHTMLAttributes
import typings.std.HTMLTableDataCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDataTableTableCellMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/DataTable/TableCell", JSImport.Default)
  @js.native
  val default: FC[TableCellProps] = js.native
  
  type TableCellProps = TdHTMLAttributes[HTMLTableDataCellElement]
  
  type _To = FC[TableCellProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsDataTableTableCellMod.foo` */
  override def _to: FC[TableCellProps] = default
}
