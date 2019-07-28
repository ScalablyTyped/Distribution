package typings.atBlueprintjsTable.libEsmHeadersHeaderMod

import typings.react.reactMod.Component
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
  var isDragReorderableDisabled: js.Any = js.native
  var isDragSelectableDisabled: js.Any = js.native
  var isEntireCellTargetReorderable: js.Any = js.native
  var locateClick: js.Any = js.native
  var locateDragForReordering: js.Any = js.native
  var locateDragForSelection: js.Any = js.native
  var renderCell: js.Any = js.native
  var renderCells: js.Any = js.native
  var renderNewCell: js.Any = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MHeader(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MHeader(nextProps: IInternalHeaderProps): Unit = js.native
  /* private */ def isColumnHeader(): js.Any = js.native
  /* private */ def isReorderHandleEnabled(): js.Any = js.native
  /* private */ def isSelectedRegionsControlledAndNonEmpty(): js.Any = js.native
  /* private */ def isSelectedRegionsControlledAndNonEmpty(props: js.Any): js.Any = js.native
  /* private */ def maybeRenderReorderHandle(index: js.Any): js.Any = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MHeader(): Boolean = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MHeader(nextProps: IInternalHeaderProps): Boolean = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MHeader(nextProps: IInternalHeaderProps, nextState: IHeaderState): Boolean = js.native
  /* private */ def wrapInDragReorderable(index: js.Any, children: js.Any, disabled: js.Any): js.Any = js.native
}

