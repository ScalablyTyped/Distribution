package typings
package atBlueprintjsTableLib.libEsmInteractionsReorderableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReorderableProps extends js.Object {
  /**
    * An array containing the table's selection Regions.
    * @default []
    */
  var selectedRegions: js.UndefOr[js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion]] = js.undefined
  /**
    * When the user reorders something, this callback is called with the new
    * focus cell for the newly selected set of regions.
    */
  def onFocusedCell(focusedCell: atBlueprintjsTableLib.libEsmCommonCellMod.IFocusedCellCoordinates): scala.Unit
  /**
    * A callback that is called when the user is done dragging to reorder.
    *
    * @param oldIndex the original index of the element or set of elements
    * @param newIndex the new index of the element or set of elements
    * @param length the number of contiguous elements that were moved
    */
  def onReordered(oldIndex: scala.Double, newIndex: scala.Double, length: scala.Double): scala.Unit
  /**
    * A callback that is called while the user is dragging to reorder.
    *
    * @param oldIndex the original index of the element or set of elements
    * @param newIndex the new index of the element or set of elements
    * @param length the number of contiguous elements that were moved
    */
  def onReordering(oldIndex: scala.Double, newIndex: scala.Double, length: scala.Double): scala.Unit
  /**
    * When the user reorders something, this callback is called with a new
    * array of `Region`s. This array should be considered the new selection
    * state for the entire table.
    */
  def onSelection(regions: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion]): scala.Unit
}

object IReorderableProps {
  @scala.inline
  def apply(
    onFocusedCell: atBlueprintjsTableLib.libEsmCommonCellMod.IFocusedCellCoordinates => scala.Unit,
    onReordered: (scala.Double, scala.Double, scala.Double) => scala.Unit,
    onReordering: (scala.Double, scala.Double, scala.Double) => scala.Unit,
    onSelection: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion] => scala.Unit,
    selectedRegions: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion] = null
  ): IReorderableProps = {
    val __obj = js.Dynamic.literal(onFocusedCell = js.Any.fromFunction1(onFocusedCell), onReordered = js.Any.fromFunction3(onReordered), onReordering = js.Any.fromFunction3(onReordering), onSelection = js.Any.fromFunction1(onSelection))
    if (selectedRegions != null) __obj.updateDynamic("selectedRegions")(selectedRegions)
    __obj.asInstanceOf[IReorderableProps]
  }
}

