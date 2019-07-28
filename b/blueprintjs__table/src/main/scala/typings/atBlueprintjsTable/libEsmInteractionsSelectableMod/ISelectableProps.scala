package typings.atBlueprintjsTable.libEsmInteractionsSelectableMod

import typings.atBlueprintjsTable.libEsmCommonCellMod.IFocusedCellCoordinates
import typings.atBlueprintjsTable.libEsmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectableProps extends js.Object {
  /**
    * If `false`, only a single region of a single column/row/cell may be
    * selected at one time. Using `ctrl` or `meta` key will have no effect,
    * and a mouse drag will select the current column/row/cell only.
    * @default false
    */
  var enableMultipleSelection: js.UndefOr[Boolean] = js.undefined
  /**
    * The currently focused cell.
    */
  var focusedCell: js.UndefOr[IFocusedCellCoordinates] = js.undefined
  /**
    * An additional convenience callback invoked when the user releases the
    * mouse from either a click or a drag, indicating that the selection
    * interaction has ended.
    */
  var onSelectionEnd: js.UndefOr[js.Function1[/* regions */ js.Array[IRegion], Unit]] = js.undefined
  /**
    * An optional transform function that will be applied to the located
    * `Region`.
    *
    * This allows you to, for example, convert cell `Region`s into row
    * `Region`s while maintaining the existing multi-select and meta-click
    * functionality.
    */
  var selectedRegionTransform: js.UndefOr[ISelectedRegionTransform] = js.undefined
  /**
    * An array containing the table's selection Regions.
    * @default []
    */
  var selectedRegions: js.UndefOr[js.Array[IRegion]] = js.undefined
  /**
    * When the user focuses something, this callback is called with new
    * focused cell coordinates. This should be considered the new focused cell
    * state for the entire table.
    */
  def onFocusedCell(focusedCell: IFocusedCellCoordinates): Unit
  /**
    * When the user selects something, this callback is called with a new
    * array of `Region`s. This array should be considered the new selection
    * state for the entire table.
    */
  def onSelection(regions: js.Array[IRegion]): Unit
}

object ISelectableProps {
  @scala.inline
  def apply(
    onFocusedCell: IFocusedCellCoordinates => Unit,
    onSelection: js.Array[IRegion] => Unit,
    enableMultipleSelection: js.UndefOr[Boolean] = js.undefined,
    focusedCell: IFocusedCellCoordinates = null,
    onSelectionEnd: /* regions */ js.Array[IRegion] => Unit = null,
    selectedRegionTransform: ISelectedRegionTransform = null,
    selectedRegions: js.Array[IRegion] = null
  ): ISelectableProps = {
    val __obj = js.Dynamic.literal(onFocusedCell = js.Any.fromFunction1(onFocusedCell), onSelection = js.Any.fromFunction1(onSelection))
    if (!js.isUndefined(enableMultipleSelection)) __obj.updateDynamic("enableMultipleSelection")(enableMultipleSelection)
    if (focusedCell != null) __obj.updateDynamic("focusedCell")(focusedCell)
    if (onSelectionEnd != null) __obj.updateDynamic("onSelectionEnd")(js.Any.fromFunction1(onSelectionEnd))
    if (selectedRegionTransform != null) __obj.updateDynamic("selectedRegionTransform")(selectedRegionTransform)
    if (selectedRegions != null) __obj.updateDynamic("selectedRegions")(selectedRegions)
    __obj.asInstanceOf[ISelectableProps]
  }
}

