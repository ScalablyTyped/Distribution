package typings.blueprintjsTable.menuContextMod

import typings.blueprintjsTable.esmRegionsMod.ICellCoordinate
import typings.blueprintjsTable.esmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMenuContext extends js.Object {
  
  /**
    * Returns an array of `IRegion`s that represent the user-intended context
    * of this menu. If the mouse click was on a selection, the array will
    * contain all selected regions. Otherwise it will have one `IRegion` that
    * represents the clicked cell (the same `IRegion` from `getTarget`).
    */
  def getRegions(): js.Array[IRegion] = js.native
  
  /**
    * Returns the list of selected `IRegion` in the table, regardless of
    * where the users clicked to launch the context menu. For the user-
    * intended regions for this context, use `getRegions` instead.
    */
  def getSelectedRegions(): js.Array[IRegion] = js.native
  
  /**
    * Returns a region containing the single cell that was clicked to launch
    * this context menu.
    */
  def getTarget(): IRegion = js.native
  
  /**
    * Returns an array containing all of the unique, potentially non-
    * contiguous, cells contained in all the regions from `getRegions`. The
    * cell coordinates are sorted by rows then columns.
    */
  def getUniqueCells(): js.Array[ICellCoordinate] = js.native
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
  
  @scala.inline
  implicit class IMenuContextOps[Self <: IMenuContext] (val x: Self) extends AnyVal {
    
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
    def setGetRegions(value: () => js.Array[IRegion]): Self = this.set("getRegions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedRegions(value: () => js.Array[IRegion]): Self = this.set("getSelectedRegions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTarget(value: () => IRegion): Self = this.set("getTarget", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUniqueCells(value: () => js.Array[ICellCoordinate]): Self = this.set("getUniqueCells", js.Any.fromFunction0(value))
  }
}
