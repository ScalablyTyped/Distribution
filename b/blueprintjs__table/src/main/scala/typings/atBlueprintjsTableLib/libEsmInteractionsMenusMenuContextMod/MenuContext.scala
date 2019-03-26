package typings
package atBlueprintjsTableLib.libEsmInteractionsMenusMenuContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/interactions/menus/menuContext", "MenuContext")
@js.native
class MenuContext protected () extends IMenuContext {
  def this(target: atBlueprintjsTableLib.libEsmRegionsMod.IRegion, selectedRegions: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion], numRows: scala.Double, numCols: scala.Double) = this()
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
  override def getRegions(): js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion] = js.native
  /**
    * Returns the list of selected `IRegion` in the table, regardless of
    * where the users clicked to launch the context menu. For the user-
    * intended regions for this context, use `getRegions` instead.
    */
  /* CompleteClass */
  override def getSelectedRegions(): js.Array[atBlueprintjsTableLib.libEsmRegionsMod.IRegion] = js.native
  /**
    * Returns a region containing the single cell that was clicked to launch
    * this context menu.
    */
  /* CompleteClass */
  override def getTarget(): atBlueprintjsTableLib.libEsmRegionsMod.IRegion = js.native
  /**
    * Returns an array containing all of the unique, potentially non-
    * contiguous, cells contained in all the regions from `getRegions`. The
    * cell coordinates are sorted by rows then columns.
    */
  /* CompleteClass */
  override def getUniqueCells(): js.Array[atBlueprintjsTableLib.libEsmRegionsMod.ICellCoordinate] = js.native
}

