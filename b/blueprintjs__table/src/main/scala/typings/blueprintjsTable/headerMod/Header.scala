package typings.blueprintjsTable.headerMod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/headers/header", "Header")
@js.native
class Header ()
  extends Component[IInternalHeaderProps, IHeaderState, js.Any] {
  def this(props: IInternalHeaderProps) = this()
  def this(props: IInternalHeaderProps, context: js.Any) = this()
  var activationIndex: Double = js.native
  var convertEventToIndex: js.Any = js.native
  var handleDragSelectableSelection: js.Any = js.native
  var handleDragSelectableSelectionEnd: js.Any = js.native
  var isColumnHeader: js.Any = js.native
  var isDragReorderableDisabled: js.Any = js.native
  var isDragSelectableDisabled: js.Any = js.native
  var isEntireCellTargetReorderable: js.Any = js.native
  var isReorderHandleEnabled: js.Any = js.native
  var isSelectedRegionsControlledAndNonEmpty: js.Any = js.native
  var locateClick: js.Any = js.native
  var locateDragForReordering: js.Any = js.native
  var locateDragForSelection: js.Any = js.native
  var maybeRenderReorderHandle: js.Any = js.native
  var renderCell: js.Any = js.native
  var renderCells: js.Any = js.native
  var renderNewCell: js.Any = js.native
  var wrapInDragReorderable: js.Any = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MHeader(_underscore: IInternalHeaderProps, prevState: IHeaderState): Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MHeader(): Boolean = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MHeader(nextProps: IInternalHeaderProps): Boolean = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MHeader(nextProps: IInternalHeaderProps, nextState: IHeaderState): Boolean = js.native
}

