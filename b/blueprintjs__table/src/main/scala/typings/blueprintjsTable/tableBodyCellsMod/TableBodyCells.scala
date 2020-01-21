package typings.blueprintjsTable.tableBodyCellsMod

import typings.blueprintjsCore.mod.AbstractComponent2
import typings.blueprintjsTable.AnonRenderMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/tableBodyCells", "TableBodyCells")
@js.native
class TableBodyCells ()
  extends AbstractComponent2[ITableBodyCellsProps, js.Object, js.Object] {
  var batcher: js.Any = js.native
  var didViewportRectChange: js.Any = js.native
  var maybeInvokeOnCompleteRender: js.Any = js.native
  var renderAllCells: js.Any = js.native
  var renderBatchedCells: js.Any = js.native
  var renderCell: js.Any = js.native
  var renderNewCell: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MTableBodyCells(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTableBodyCells(prevProps: ITableBodyCellsProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTableBodyCells(): Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MTableBodyCells(): Boolean = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MTableBodyCells(nextProps: ITableBodyCellsProps): Boolean = js.native
}

/* static members */
@JSImport("@blueprintjs/table/lib/esm/tableBodyCells", "TableBodyCells")
@js.native
object TableBodyCells extends js.Object {
  var cellReactKey: js.Any = js.native
  var defaultProps: AnonRenderMode = js.native
}

