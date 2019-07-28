package typings.atBlueprintjsTable.libEsmInteractionsReorderableMod

import typings.atBlueprintjsTable.libEsmCommonCellMod.IFocusedCellCoordinates
import typings.atBlueprintjsTable.libEsmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReorderableProps extends js.Object {
  /**
    * An array containing the table's selection Regions.
    * @default []
    */
  var selectedRegions: js.UndefOr[js.Array[IRegion]] = js.undefined
  /**
    * When the user reorders something, this callback is called with the new
    * focus cell for the newly selected set of regions.
    */
  def onFocusedCell(focusedCell: IFocusedCellCoordinates): Unit
  /**
    * A callback that is called when the user is done dragging to reorder.
    *
    * @param oldIndex the original index of the element or set of elements
    * @param newIndex the new index of the element or set of elements
    * @param length the number of contiguous elements that were moved
    */
  def onReordered(oldIndex: Double, newIndex: Double, length: Double): Unit
  /**
    * A callback that is called while the user is dragging to reorder.
    *
    * @param oldIndex the original index of the element or set of elements
    * @param newIndex the new index of the element or set of elements
    * @param length the number of contiguous elements that were moved
    */
  def onReordering(oldIndex: Double, newIndex: Double, length: Double): Unit
  /**
    * When the user reorders something, this callback is called with a new
    * array of `Region`s. This array should be considered the new selection
    * state for the entire table.
    */
  def onSelection(regions: js.Array[IRegion]): Unit
}

object IReorderableProps {
  @scala.inline
  def apply(
    onFocusedCell: IFocusedCellCoordinates => Unit,
    onReordered: (Double, Double, Double) => Unit,
    onReordering: (Double, Double, Double) => Unit,
    onSelection: js.Array[IRegion] => Unit,
    selectedRegions: js.Array[IRegion] = null
  ): IReorderableProps = {
    val __obj = js.Dynamic.literal(onFocusedCell = js.Any.fromFunction1(onFocusedCell), onReordered = js.Any.fromFunction3(onReordered), onReordering = js.Any.fromFunction3(onReordering), onSelection = js.Any.fromFunction1(onSelection))
    if (selectedRegions != null) __obj.updateDynamic("selectedRegions")(selectedRegions)
    __obj.asInstanceOf[IReorderableProps]
  }
}

