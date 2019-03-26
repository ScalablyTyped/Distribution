package typings
package atBlueprintjsTableLib.libEsmCellEditableCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/cell/editableCell", "EditableCell")
@js.native
class EditableCell protected ()
  extends reactLib.reactMod.Component[IEditableCellProps, IEditableCellState, js.Any] {
  def this(props: IEditableCellProps) = this()
  def this(props: IEditableCellProps, context: js.Any) = this()
  var cellRef: js.Any = js.native
  var handleCancel: js.Any = js.native
  var handleCellActivate: js.Any = js.native
  var handleCellDoubleClick: js.Any = js.native
  var handleChange: js.Any = js.native
  var handleConfirm: js.Any = js.native
  var handleEdit: js.Any = js.native
  var handleKeyPress: js.Any = js.native
  var refHandlers: js.Any = js.native
  /* private */ def checkShouldFocus(): js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MEditableCell(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MEditableCell(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MEditableCell(nextProps: IEditableCellProps): scala.Unit = js.native
  /* private */ def invokeCallback(callback: js.Any, value: js.Any): js.Any = js.native
  def renderHotkeys(): reactLib.reactMod.Global.JSXNs.Element = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MEditableCell(nextProps: IEditableCellProps, nextState: IEditableCellState): scala.Boolean = js.native
}

/* static members */
@JSImport("@blueprintjs/table/lib/esm/cell/editableCell", "EditableCell")
@js.native
object EditableCell extends js.Object {
  var defaultProps: atBlueprintjsTableLib.Anon_Truncated = js.native
  var displayName: java.lang.String = js.native
}

