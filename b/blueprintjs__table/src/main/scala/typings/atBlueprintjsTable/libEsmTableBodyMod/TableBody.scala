package typings.atBlueprintjsTable.libEsmTableBodyMod

import typings.atBlueprintjsCore.atBlueprintjsCoreMod.AbstractComponent2
import typings.atBlueprintjsTable.Anon_Loading
import typings.react.reactMod._Global_.JSX.Element
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
  def renderContextMenu(e: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent]): Element = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MTableBody(nextProps: ITableBodyProps): Boolean = js.native
}

/* static members */
@JSImport("@blueprintjs/table/lib/esm/tableBody", "TableBody")
@js.native
object TableBody extends js.Object {
  var defaultProps: Anon_Loading = js.native
  def cellClassNames(rowIndex: Double, columnIndex: Double): js.Array[String] = js.native
}

