package typings.blueprintjsTable.menuContextMod

import typings.blueprintjsTable.esmRegionsMod.ICellCoordinate
import typings.blueprintjsTable.esmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/interactions/menus/menuContext", "MenuContext")
@js.native
class MenuContext protected () extends IMenuContext {
  def this(target: IRegion, selectedRegions: js.Array[IRegion], numRows: Double, numCols: Double) = this()
  var numCols: js.Any = js.native
  var numRows: js.Any = js.native
  var regions: js.Any = js.native
  var selectedRegions: js.Any = js.native
  var target: js.Any = js.native
  /**
    * Returns an array of `IRegion`s that represent the user-intended context
    * of this menu. If the mouse click was on a selection, the array will
    * contain all selected regions. Otherwise it will have one `IRegion` that
    * represents the clicked cell (the same `IRegion` from `getTarget`).
    */
  /* CompleteClass */
  override def getRegions(): js.Array[IRegion] = js.native
  /**
    * Returns the list of selected `IRegion` in the table, regardless of
    * where the users clicked to launch the context menu. For the user-
    * intended regions for this context, use `getRegions` instead.
    */
  /* CompleteClass */
  override def getSelectedRegions(): js.Array[IRegion] = js.native
  /**
    * Returns a region containing the single cell that was clicked to launch
    * this context menu.
    */
  /* CompleteClass */
  override def getTarget(): IRegion = js.native
  /**
    * Returns an array containing all of the unique, potentially non-
    * contiguous, cells contained in all the regions from `getRegions`. The
    * cell coordinates are sorted by rows then columns.
    */
  /* CompleteClass */
  override def getUniqueCells(): js.Array[ICellCoordinate] = js.native
}

