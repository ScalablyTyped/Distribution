package typings.blueprintjsTable.headerCellMod

import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/headers/headerCell", "HeaderCell")
@js.native
class HeaderCell ()
  extends Component[IInternalHeaderCellProps, IHeaderCellState, js.Any] {
  def renderContextMenu(_event: MouseEvent[HTMLElement, NativeMouseEvent]): Element = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MHeaderCell(nextProps: IHeaderCellProps): Boolean = js.native
}

