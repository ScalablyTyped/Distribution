package typings
package atBlueprintjsTableLib.libEsmTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITableState extends js.Object {
  /**
    * An array of column widths. These are initialized from the column props
    * and updated when the user drags column header resize handles.
    */
  var columnWidths: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * The coordinates of the currently focused table cell
    */
  var focusedCell: js.UndefOr[atBlueprintjsTableLib.libEsmCommonCellMod.IFocusedCellCoordinates] = js.undefined
  /**
    * An array of pixel offsets for resize guides, which are drawn over the
    * table body when a row is being resized.
    */
  var horizontalGuides: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * If `true`, will disable updates that will cause re-renders of children
    * components. This is used, for example, to disable layout updates while
    * the user is dragging a resize handle.
    */
  var isLayoutLocked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the user is currently dragging to reorder one or more elements.
    * Can be referenced to toggle the reordering-cursor overlay, which
    * displays a `grabbing` CSS cursor wherever the mouse moves in the table
    * for the duration of the dragging interaction.
    */
  var isReordering: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The number of frozen columns, clamped to [0, num <Column>s].
    */
  var numFrozenColumnsClamped: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of frozen rows, clamped to [0, numRows].
    */
  var numFrozenRowsClamped: js.UndefOr[scala.Double] = js.undefined
  /**
    * An array of row heights. These are initialized updated when the user
    * drags row header resize handles.
    */
  var rowHeights: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * An array of Regions representing the selections of the table.
    */
  var selectedRegions: js.UndefOr[js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion]] = js.undefined
  /**
    * An array of pixel offsets for resize guides, which are drawn over the
    * table body when a column is being resized.
    */
  var verticalGuides: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * The `Rect` bounds of the viewport used to perform virtual viewport
    * performance enhancements.
    */
  var viewportRect: js.UndefOr[atBlueprintjsTableLib.libEsmCommonRectMod.Rect] = js.undefined
}

object ITableState {
  @scala.inline
  def apply(
    columnWidths: js.Array[scala.Double] = null,
    focusedCell: atBlueprintjsTableLib.libEsmCommonCellMod.IFocusedCellCoordinates = null,
    horizontalGuides: js.Array[scala.Double] = null,
    isLayoutLocked: js.UndefOr[scala.Boolean] = js.undefined,
    isReordering: js.UndefOr[scala.Boolean] = js.undefined,
    numFrozenColumnsClamped: scala.Int | scala.Double = null,
    numFrozenRowsClamped: scala.Int | scala.Double = null,
    rowHeights: js.Array[scala.Double] = null,
    selectedRegions: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion] = null,
    verticalGuides: js.Array[scala.Double] = null,
    viewportRect: atBlueprintjsTableLib.libEsmCommonRectMod.Rect = null
  ): ITableState = {
    val __obj = js.Dynamic.literal()
    if (columnWidths != null) __obj.updateDynamic("columnWidths")(columnWidths)
    if (focusedCell != null) __obj.updateDynamic("focusedCell")(focusedCell)
    if (horizontalGuides != null) __obj.updateDynamic("horizontalGuides")(horizontalGuides)
    if (!js.isUndefined(isLayoutLocked)) __obj.updateDynamic("isLayoutLocked")(isLayoutLocked)
    if (!js.isUndefined(isReordering)) __obj.updateDynamic("isReordering")(isReordering)
    if (numFrozenColumnsClamped != null) __obj.updateDynamic("numFrozenColumnsClamped")(numFrozenColumnsClamped.asInstanceOf[js.Any])
    if (numFrozenRowsClamped != null) __obj.updateDynamic("numFrozenRowsClamped")(numFrozenRowsClamped.asInstanceOf[js.Any])
    if (rowHeights != null) __obj.updateDynamic("rowHeights")(rowHeights)
    if (selectedRegions != null) __obj.updateDynamic("selectedRegions")(selectedRegions)
    if (verticalGuides != null) __obj.updateDynamic("verticalGuides")(verticalGuides)
    if (viewportRect != null) __obj.updateDynamic("viewportRect")(viewportRect)
    __obj.asInstanceOf[ITableState]
  }
}

