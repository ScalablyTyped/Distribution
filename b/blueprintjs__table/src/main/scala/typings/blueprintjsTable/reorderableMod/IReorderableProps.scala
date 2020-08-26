package typings.blueprintjsTable.reorderableMod

import typings.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typings.blueprintjsTable.esmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IReorderableProps extends js.Object {
  /**
    * An array containing the table's selection Regions.
    * @default []
    */
  var selectedRegions: js.UndefOr[js.Array[IRegion]] = js.native
  /**
    * When the user reorders something, this callback is called with the new
    * focus cell for the newly selected set of regions.
    */
  def onFocusedCell(focusedCell: IFocusedCellCoordinates): Unit = js.native
  /**
    * A callback that is called when the user is done dragging to reorder.
    *
    * @param oldIndex the original index of the element or set of elements
    * @param newIndex the new index of the element or set of elements
    * @param length the number of contiguous elements that were moved
    */
  def onReordered(oldIndex: Double, newIndex: Double, length: Double): Unit = js.native
  /**
    * A callback that is called while the user is dragging to reorder.
    *
    * @param oldIndex the original index of the element or set of elements
    * @param newIndex the new index of the element or set of elements
    * @param length the number of contiguous elements that were moved
    */
  def onReordering(oldIndex: Double, newIndex: Double, length: Double): Unit = js.native
  /**
    * When the user reorders something, this callback is called with a new
    * array of `Region`s. This array should be considered the new selection
    * state for the entire table.
    */
  def onSelection(regions: js.Array[IRegion]): Unit = js.native
}

object IReorderableProps {
  @scala.inline
  def apply(
    onFocusedCell: IFocusedCellCoordinates => Unit,
    onReordered: (Double, Double, Double) => Unit,
    onReordering: (Double, Double, Double) => Unit,
    onSelection: js.Array[IRegion] => Unit
  ): IReorderableProps = {
    val __obj = js.Dynamic.literal(onFocusedCell = js.Any.fromFunction1(onFocusedCell), onReordered = js.Any.fromFunction3(onReordered), onReordering = js.Any.fromFunction3(onReordering), onSelection = js.Any.fromFunction1(onSelection))
    __obj.asInstanceOf[IReorderableProps]
  }
  @scala.inline
  implicit class IReorderablePropsOps[Self <: IReorderableProps] (val x: Self) extends AnyVal {
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
    def setOnFocusedCell(value: IFocusedCellCoordinates => Unit): Self = this.set("onFocusedCell", js.Any.fromFunction1(value))
    @scala.inline
    def setOnReordered(value: (Double, Double, Double) => Unit): Self = this.set("onReordered", js.Any.fromFunction3(value))
    @scala.inline
    def setOnReordering(value: (Double, Double, Double) => Unit): Self = this.set("onReordering", js.Any.fromFunction3(value))
    @scala.inline
    def setOnSelection(value: js.Array[IRegion] => Unit): Self = this.set("onSelection", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectedRegionsVarargs(value: IRegion*): Self = this.set("selectedRegions", js.Array(value :_*))
    @scala.inline
    def setSelectedRegions(value: js.Array[IRegion]): Self = this.set("selectedRegions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedRegions: Self = this.set("selectedRegions", js.undefined)
  }
  
}

