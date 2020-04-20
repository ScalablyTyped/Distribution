package typings.blueprintjsTable.menuContextMod

import typings.blueprintjsTable.esmRegionsMod.ICellCoordinate
import typings.blueprintjsTable.esmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMenuContext extends js.Object {
  /**
    * Returns an array of `IRegion`s that represent the user-intended context
    * of this menu. If the mouse click was on a selection, the array will
    * contain all selected regions. Otherwise it will have one `IRegion` that
    * represents the clicked cell (the same `IRegion` from `getTarget`).
    */
  def getRegions(): js.Array[IRegion]
  /**
    * Returns the list of selected `IRegion` in the table, regardless of
    * where the users clicked to launch the context menu. For the user-
    * intended regions for this context, use `getRegions` instead.
    */
  def getSelectedRegions(): js.Array[IRegion]
  /**
    * Returns a region containing the single cell that was clicked to launch
    * this context menu.
    */
  def getTarget(): IRegion
  /**
    * Returns an array containing all of the unique, potentially non-
    * contiguous, cells contained in all the regions from `getRegions`. The
    * cell coordinates are sorted by rows then columns.
    */
  def getUniqueCells(): js.Array[ICellCoordinate]
}

object IMenuContext {
  @scala.inline
  def apply(
    getRegions: () => js.Array[IRegion],
    getSelectedRegions: () => js.Array[IRegion],
    getTarget: () => IRegion,
    getUniqueCells: () => js.Array[ICellCoordinate]
  ): IMenuContext = {
    val __obj = js.Dynamic.literal(getRegions = js.Any.fromFunction0(getRegions), getSelectedRegions = js.Any.fromFunction0(getSelectedRegions), getTarget = js.Any.fromFunction0(getTarget), getUniqueCells = js.Any.fromFunction0(getUniqueCells))
    __obj.asInstanceOf[IMenuContext]
  }
}

