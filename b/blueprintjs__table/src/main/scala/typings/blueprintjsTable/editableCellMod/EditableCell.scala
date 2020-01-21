package typings.blueprintjsTable.editableCellMod

import typings.blueprintjsTable.AnonTruncated
import typings.react.mod.Component
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/cell/editableCell", "EditableCell")
@js.native
class EditableCell protected ()
  extends Component[IEditableCellProps, IEditableCellState, js.Any] {
  def this(props: IEditableCellProps) = this()
  def this(props: IEditableCellProps, context: js.Any) = this()
  var cellRef: js.Any = js.native
  var checkShouldFocus: js.Any = js.native
  var handleCancel: js.Any = js.native
  var handleCellActivate: js.Any = js.native
  var handleCellDoubleClick: js.Any = js.native
  var handleChange: js.Any = js.native
  var handleConfirm: js.Any = js.native
  var handleEdit: js.Any = js.native
  var handleKeyPress: js.Any = js.native
  var invokeCallback: js.Any = js.native
  var refHandlers: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MEditableCell(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MEditableCell(prevProps: IEditableCellProps): Unit = js.native
  def renderHotkeys(): Element = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MEditableCell(nextProps: IEditableCellProps, nextState: IEditableCellState): Boolean = js.native
}

/* static members */
@JSImport("@blueprintjs/table/lib/esm/cell/editableCell", "EditableCell")
@js.native
object EditableCell extends js.Object {
  var defaultProps: AnonTruncated = js.native
  var displayName: String = js.native
}

