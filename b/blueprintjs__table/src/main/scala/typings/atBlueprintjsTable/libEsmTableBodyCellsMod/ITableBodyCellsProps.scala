package typings.atBlueprintjsTable.libEsmTableBodyCellsMod

import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import typings.atBlueprintjsTable.libEsmCellCellMod.ICellRenderer
import typings.atBlueprintjsTable.libEsmCommonCellMod.IFocusedCellCoordinates
import typings.atBlueprintjsTable.libEsmCommonGridMod.Grid
import typings.atBlueprintjsTable.libEsmCommonGridMod.IColumnIndices
import typings.atBlueprintjsTable.libEsmCommonGridMod.IRowIndices
import typings.atBlueprintjsTable.libEsmCommonRectMod.Rect
import typings.atBlueprintjsTable.libEsmCommonRenderModeMod.RenderMode.BATCH
import typings.atBlueprintjsTable.libEsmCommonRenderModeMod.RenderMode.NONE
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITableBodyCellsProps
  extends IRowIndices
     with IColumnIndices
     with IProps {
  /**
    * A cell renderer for the cells in the body.
    */
  var cellRenderer: ICellRenderer
  /**
    * The coordinates of the currently focused cell, for setting the "isFocused" prop on cells.
    */
  var focusedCell: js.UndefOr[IFocusedCellCoordinates] = js.undefined
  /**
    * The grid computes sizes of cells, rows, or columns from the
    * configurable `columnWidths` and `rowHeights`.
    */
  var grid: Grid
  /**
    * If true, all `Cell`s render their loading state except for those who have
    * their `loading` prop explicitly set to false.
    */
  var loading: Boolean
  /**
    * An optional callback invoked when all cells in view have completely rendered.
    */
  var onCompleteRender: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Dictates how cells should be rendered. This component doesn't support
    * `RenderMode.BATCH_ON_UPDATE`, because there are actually multiple updates
    * that need to happen at higher levels before the table is considered fully
    * "mounted"; thus, we let higher components tell us when to switch modes.
    * @default RenderMode.BATCH
    */
  var renderMode: js.UndefOr[BATCH | NONE] = js.undefined
  /**
    * The `Rect` bounds of the visible viewport with respect to its parent
    * scrollable pane. While not directly used by the component, this prop is
    * necessary for shouldComponentUpdate logic to run properly.
    */
  var viewportRect: Rect
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
    viewportRect: Rect,
    className: String = null,
    focusedCell: IFocusedCellCoordinates = null,
    onCompleteRender: () => Unit = null,
    renderMode: BATCH | NONE = null
  ): ITableBodyCellsProps = {
    val __obj = js.Dynamic.literal(cellRenderer = js.Any.fromFunction2(cellRenderer), columnIndexEnd = columnIndexEnd.asInstanceOf[js.Any], columnIndexStart = columnIndexStart.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], rowIndexEnd = rowIndexEnd.asInstanceOf[js.Any], rowIndexStart = rowIndexStart.asInstanceOf[js.Any], viewportRect = viewportRect.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (focusedCell != null) __obj.updateDynamic("focusedCell")(focusedCell.asInstanceOf[js.Any])
    if (onCompleteRender != null) __obj.updateDynamic("onCompleteRender")(js.Any.fromFunction0(onCompleteRender))
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableBodyCellsProps]
  }
}

