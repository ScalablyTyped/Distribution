package typings.blueprintjsTable.selectableMod

import typings.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typings.blueprintjsTable.dragTypesMod.ICoordinateData
import typings.blueprintjsTable.esmRegionsMod.IRegion
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISelectableProps extends js.Object {
  
  /**
    * If `false`, only a single region of a single column/row/cell may be
    * selected at one time. Using `ctrl` or `meta` key will have no effect,
    * and a mouse drag will select the current column/row/cell only.
    * @default false
    */
  var enableMultipleSelection: js.UndefOr[Boolean] = js.native
  
  /**
    * The currently focused cell.
    */
  var focusedCell: js.UndefOr[IFocusedCellCoordinates] = js.native
  
  /**
    * When the user focuses something, this callback is called with new
    * focused cell coordinates. This should be considered the new focused cell
    * state for the entire table.
    */
  def onFocusedCell(focusedCell: IFocusedCellCoordinates): Unit = js.native
  
  /**
    * When the user selects something, this callback is called with a new
    * array of `Region`s. This array should be considered the new selection
    * state for the entire table.
    */
  def onSelection(regions: js.Array[IRegion]): Unit = js.native
  
  /**
    * An additional convenience callback invoked when the user releases the
    * mouse from either a click or a drag, indicating that the selection
    * interaction has ended.
    */
  var onSelectionEnd: js.UndefOr[js.Function1[/* regions */ js.Array[IRegion], Unit]] = js.native
  
  /**
    * An optional transform function that will be applied to the located
    * `Region`.
    *
    * This allows you to, for example, convert cell `Region`s into row
    * `Region`s while maintaining the existing multi-select and meta-click
    * functionality.
    */
  var selectedRegionTransform: js.UndefOr[ISelectedRegionTransform] = js.native
  
  /**
    * An array containing the table's selection Regions.
    * @default []
    */
  var selectedRegions: js.UndefOr[js.Array[IRegion]] = js.native
}
object ISelectableProps {
  
  @scala.inline
  def apply(onFocusedCell: IFocusedCellCoordinates => Unit, onSelection: js.Array[IRegion] => Unit): ISelectableProps = {
    val __obj = js.Dynamic.literal(onFocusedCell = js.Any.fromFunction1(onFocusedCell), onSelection = js.Any.fromFunction1(onSelection))
    __obj.asInstanceOf[ISelectableProps]
  }
  
  @scala.inline
  implicit class ISelectablePropsOps[Self <: ISelectableProps] (val x: Self) extends AnyVal {
    
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
    def setOnSelection(value: js.Array[IRegion] => Unit): Self = this.set("onSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnableMultipleSelection(value: Boolean): Self = this.set("enableMultipleSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableMultipleSelection: Self = this.set("enableMultipleSelection", js.undefined)
    
    @scala.inline
    def setFocusedCell(value: IFocusedCellCoordinates): Self = this.set("focusedCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusedCell: Self = this.set("focusedCell", js.undefined)
    
    @scala.inline
    def setOnSelectionEnd(value: /* regions */ js.Array[IRegion] => Unit): Self = this.set("onSelectionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectionEnd: Self = this.set("onSelectionEnd", js.undefined)
    
    @scala.inline
    def setSelectedRegionTransform(
      value: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => IRegion
    ): Self = this.set("selectedRegionTransform", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSelectedRegionTransform: Self = this.set("selectedRegionTransform", js.undefined)
    
    @scala.inline
    def setSelectedRegionsVarargs(value: IRegion*): Self = this.set("selectedRegions", js.Array(value :_*))
    
    @scala.inline
    def setSelectedRegions(value: js.Array[IRegion]): Self = this.set("selectedRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedRegions: Self = this.set("selectedRegions", js.undefined)
  }
}
