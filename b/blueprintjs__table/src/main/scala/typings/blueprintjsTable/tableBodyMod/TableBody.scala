package typings.blueprintjsTable.tableBodyMod

import typings.blueprintjsCore.mod.AbstractComponent2
import typings.blueprintjsTable.anon.Loading
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table/lib/esm/tableBody", "TableBody")
@js.native
class TableBody ()
  extends AbstractComponent2[ITableBodyProps, js.Object, js.Object] {
  
  var activationCell: js.Any = js.native
  
  var handleSelectionEnd: js.Any = js.native
  
  var locateClick: js.Any = js.native
  
  var locateDrag: js.Any = js.native
  
  def renderContextMenu(e: MouseEvent[HTMLElement, NativeMouseEvent]): Element = js.native
  
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MTableBody(nextProps: ITableBodyProps): Boolean = js.native
}
/* static members */
@JSImport("@blueprintjs/table/lib/esm/tableBody", "TableBody")
@js.native
object TableBody extends js.Object {
  
  def cellClassNames(rowIndex: Double, columnIndex: Double): js.Array[String] = js.native
  
  var defaultProps: Loading = js.native
}
