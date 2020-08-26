package typings.blueprintjsTable.tableBodyCellsMod

import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsTable.cellMod.ICellRenderer
import typings.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typings.blueprintjsTable.gridMod.Grid
import typings.blueprintjsTable.gridMod.IColumnIndices
import typings.blueprintjsTable.gridMod.IRowIndices
import typings.blueprintjsTable.rectMod.Rect
import typings.blueprintjsTable.renderModeMod.RenderMode.BATCH
import typings.blueprintjsTable.renderModeMod.RenderMode.NONE
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITableBodyCellsProps
  extends IRowIndices
     with IColumnIndices
     with IProps {
  /**
    * A cell renderer for the cells in the body.
    */
  var cellRenderer: ICellRenderer = js.native
  /**
    * The coordinates of the currently focused cell, for setting the "isFocused" prop on cells.
    */
  var focusedCell: js.UndefOr[IFocusedCellCoordinates] = js.native
  /**
    * The grid computes sizes of cells, rows, or columns from the
    * configurable `columnWidths` and `rowHeights`.
    */
  var grid: Grid = js.native
  /**
    * If true, all `Cell`s render their loading state except for those who have
    * their `loading` prop explicitly set to false.
    */
  var loading: Boolean = js.native
  /**
    * An optional callback invoked when all cells in view have completely rendered.
    */
  var onCompleteRender: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Dictates how cells should be rendered. This component doesn't support
    * `RenderMode.BATCH_ON_UPDATE`, because there are actually multiple updates
    * that need to happen at higher levels before the table is considered fully
    * "mounted"; thus, we let higher components tell us when to switch modes.
    * @default RenderMode.BATCH
    */
  var renderMode: js.UndefOr[BATCH | NONE] = js.native
  /**
    * The `Rect` bounds of the visible viewport with respect to its parent
    * scrollable pane. While not directly used by the component, this prop is
    * necessary for shouldComponentUpdate logic to run properly.
    */
  var viewportRect: Rect = js.native
}

object ITableBodyCellsProps {
  @scala.inline
  def apply(
    cellRenderer: (/* rowIndex */ Double, /* columnIndex */ Double) => ReactElement,
    columnIndexEnd: Double,
    columnIndexStart: Double,
    grid: Grid,
    loading: Boolean,
    rowIndexEnd: Double,
    rowIndexStart: Double,
    viewportRect: Rect
  ): ITableBodyCellsProps = {
    val __obj = js.Dynamic.literal(cellRenderer = js.Any.fromFunction2(cellRenderer), columnIndexEnd = columnIndexEnd.asInstanceOf[js.Any], columnIndexStart = columnIndexStart.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], rowIndexEnd = rowIndexEnd.asInstanceOf[js.Any], rowIndexStart = rowIndexStart.asInstanceOf[js.Any], viewportRect = viewportRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableBodyCellsProps]
  }
  @scala.inline
  implicit class ITableBodyCellsPropsOps[Self <: ITableBodyCellsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCellRenderer(value: (/* rowIndex */ Double, /* columnIndex */ Double) => ReactElement): Self = this.set("cellRenderer", js.Any.fromFunction2(value))
    @scala.inline
    def setGrid(value: Grid): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewportRect(value: Rect): Self = this.set("viewportRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusedCell(value: IFocusedCellCoordinates): Self = this.set("focusedCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusedCell: Self = this.set("focusedCell", js.undefined)
    @scala.inline
    def setOnCompleteRender(value: () => Unit): Self = this.set("onCompleteRender", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnCompleteRender: Self = this.set("onCompleteRender", js.undefined)
    @scala.inline
    def setRenderMode(value: BATCH | NONE): Self = this.set("renderMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderMode: Self = this.set("renderMode", js.undefined)
  }
  
}

