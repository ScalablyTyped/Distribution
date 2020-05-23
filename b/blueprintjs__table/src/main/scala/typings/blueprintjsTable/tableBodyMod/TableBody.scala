package typings.blueprintjsTable.tableBodyMod

import typings.blueprintjsCore.mod.AbstractComponent2
import typings.blueprintjsTable.anon.Loading
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/tableBody", "TableBody")
@js.native
class TableBody ()
  extends AbstractComponent2[ITableBodyProps, js.Object, js.Object] {
  var activationCell: js.Any = js.native
  var handleSelectionEnd: js.Any = js.native
  var locateClick: js.Any = js.native
  var locateDrag: js.Any = js.native
  def renderContextMenu(e: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Element = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MTableBody(nextProps: ITableBodyProps): Boolean = js.native
}

/* static members */
@JSImport("@blueprintjs/table/lib/esm/tableBody", "TableBody")
@js.native
object TableBody extends js.Object {
  var defaultProps: Loading = js.native
  def cellClassNames(rowIndex: Double, columnIndex: Double): js.Array[String] = js.native
}

