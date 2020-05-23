package typings.blueprintjsTable.tableMod

import org.scalablytyped.runtime.StringDictionary
import typings.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typings.blueprintjsTable.esmRegionsMod.IRegion
import typings.blueprintjsTable.rectMod.Rect
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITableState extends js.Object {
  var childrenArray: js.Array[ReactElement]
  var columnIdToIndex: StringDictionary[Double]
  /**
    * An array of column widths. These are initialized from the column props
    * and updated when the user drags column header resize handles.
    */
  var columnWidths: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * The coordinates of the currently focused table cell
    */
  var focusedCell: js.UndefOr[IFocusedCellCoordinates] = js.undefined
  /**
    * An array of pixel offsets for resize guides, which are drawn over the
    * table body when a row is being resized.
    */
  var horizontalGuides: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * If `true`, will disable updates that will cause re-renders of children
    * components. This is used, for example, to disable layout updates while
    * the user is dragging a resize handle.
    */
  var isLayoutLocked: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the user is currently dragging to reorder one or more elements.
    * Can be referenced to toggle the reordering-cursor overlay, which
    * displays a `grabbing` CSS cursor wherever the mouse moves in the table
    * for the duration of the dragging interaction.
    */
  var isReordering: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of frozen columns, clamped to [0, num <Column>s].
    */
  var numFrozenColumnsClamped: js.UndefOr[Double] = js.undefined
  /**
    * The number of frozen rows, clamped to [0, numRows].
    */
  var numFrozenRowsClamped: js.UndefOr[Double] = js.undefined
  /**
    * An array of row heights. These are initialized updated when the user
    * drags row header resize handles.
    */
  var rowHeights: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * An array of Regions representing the selections of the table.
    */
  var selectedRegions: js.UndefOr[js.Array[IRegion]] = js.undefined
  /**
    * An array of pixel offsets for resize guides, which are drawn over the
    * table body when a column is being resized.
    */
  var verticalGuides: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * The `Rect` bounds of the viewport used to perform virtual viewport
    * performance enhancements.
    */
  var viewportRect: js.UndefOr[Rect] = js.undefined
}

object ITableState {
  @scala.inline
  def apply(
    childrenArray: js.Array[ReactElement],
    columnIdToIndex: StringDictionary[Double],
    columnWidths: js.Array[Double] = null,
    focusedCell: IFocusedCellCoordinates = null,
    horizontalGuides: js.Array[Double] = null,
    isLayoutLocked: js.UndefOr[Boolean] = js.undefined,
    isReordering: js.UndefOr[Boolean] = js.undefined,
    numFrozenColumnsClamped: js.UndefOr[Double] = js.undefined,
    numFrozenRowsClamped: js.UndefOr[Double] = js.undefined,
    rowHeights: js.Array[Double] = null,
    selectedRegions: js.Array[IRegion] = null,
    verticalGuides: js.Array[Double] = null,
    viewportRect: Rect = null
  ): ITableState = {
    val __obj = js.Dynamic.literal(childrenArray = childrenArray.asInstanceOf[js.Any], columnIdToIndex = columnIdToIndex.asInstanceOf[js.Any])
    if (columnWidths != null) __obj.updateDynamic("columnWidths")(columnWidths.asInstanceOf[js.Any])
    if (focusedCell != null) __obj.updateDynamic("focusedCell")(focusedCell.asInstanceOf[js.Any])
    if (horizontalGuides != null) __obj.updateDynamic("horizontalGuides")(horizontalGuides.asInstanceOf[js.Any])
    if (!js.isUndefined(isLayoutLocked)) __obj.updateDynamic("isLayoutLocked")(isLayoutLocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isReordering)) __obj.updateDynamic("isReordering")(isReordering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numFrozenColumnsClamped)) __obj.updateDynamic("numFrozenColumnsClamped")(numFrozenColumnsClamped.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numFrozenRowsClamped)) __obj.updateDynamic("numFrozenRowsClamped")(numFrozenRowsClamped.get.asInstanceOf[js.Any])
    if (rowHeights != null) __obj.updateDynamic("rowHeights")(rowHeights.asInstanceOf[js.Any])
    if (selectedRegions != null) __obj.updateDynamic("selectedRegions")(selectedRegions.asInstanceOf[js.Any])
    if (verticalGuides != null) __obj.updateDynamic("verticalGuides")(verticalGuides.asInstanceOf[js.Any])
    if (viewportRect != null) __obj.updateDynamic("viewportRect")(viewportRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableState]
  }
}

