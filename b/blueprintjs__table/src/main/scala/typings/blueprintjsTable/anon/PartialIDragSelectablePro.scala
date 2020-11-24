package typings.blueprintjsTable.anon

import typings.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typings.blueprintjsTable.dragTypesMod.ICoordinateData
import typings.blueprintjsTable.esmRegionsMod.IRegion
import typings.blueprintjsTable.selectableMod.ISelectedRegionTransform
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/table.@blueprintjs/table/lib/esm/interactions/selectable.IDragSelectableProps> */
@js.native
trait PartialIDragSelectablePro extends js.Object {
  
  var disabled: js.UndefOr[Boolean | (js.Function1[/* event */ MouseEvent, Boolean])] = js.native
  
  var enableMultipleSelection: js.UndefOr[Boolean] = js.native
  
  var focusedCell: js.UndefOr[IFocusedCellCoordinates] = js.native
  
  var ignoredSelectors: js.UndefOr[js.Array[String]] = js.native
  
  var locateClick: js.UndefOr[js.Function1[/* event */ MouseEvent, IRegion]] = js.native
  
  var locateDrag: js.UndefOr[
    js.Function3[
      /* event */ MouseEvent, 
      /* coords */ ICoordinateData, 
      /* returnEndOnly */ js.UndefOr[Boolean], 
      IRegion
    ]
  ] = js.native
  
  var onFocusedCell: js.UndefOr[js.Function1[/* focusedCell */ IFocusedCellCoordinates, Unit]] = js.native
  
  var onSelection: js.UndefOr[js.Function1[/* regions */ js.Array[IRegion], Unit]] = js.native
  
  var onSelectionEnd: js.UndefOr[js.Function1[/* regions */ js.Array[IRegion], Unit]] = js.native
  
  var selectedRegionTransform: js.UndefOr[ISelectedRegionTransform] = js.native
  
  var selectedRegions: js.UndefOr[js.Array[IRegion]] = js.native
}
object PartialIDragSelectablePro {
  
  @scala.inline
  def apply(): PartialIDragSelectablePro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIDragSelectablePro]
  }
  
  @scala.inline
  implicit class PartialIDragSelectableProOps[Self <: PartialIDragSelectablePro] (val x: Self) extends AnyVal {
    
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
    def setDisabledFunction1(value: /* event */ MouseEvent => Boolean): Self = this.set("disabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisabled(value: Boolean | (js.Function1[/* event */ MouseEvent, Boolean])): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setEnableMultipleSelection(value: Boolean): Self = this.set("enableMultipleSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableMultipleSelection: Self = this.set("enableMultipleSelection", js.undefined)
    
    @scala.inline
    def setFocusedCell(value: IFocusedCellCoordinates): Self = this.set("focusedCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusedCell: Self = this.set("focusedCell", js.undefined)
    
    @scala.inline
    def setIgnoredSelectorsVarargs(value: String*): Self = this.set("ignoredSelectors", js.Array(value :_*))
    
    @scala.inline
    def setIgnoredSelectors(value: js.Array[String]): Self = this.set("ignoredSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoredSelectors: Self = this.set("ignoredSelectors", js.undefined)
    
    @scala.inline
    def setLocateClick(value: /* event */ MouseEvent => IRegion): Self = this.set("locateClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLocateClick: Self = this.set("locateClick", js.undefined)
    
    @scala.inline
    def setLocateDrag(
      value: (/* event */ MouseEvent, /* coords */ ICoordinateData, /* returnEndOnly */ js.UndefOr[Boolean]) => IRegion
    ): Self = this.set("locateDrag", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteLocateDrag: Self = this.set("locateDrag", js.undefined)
    
    @scala.inline
    def setOnFocusedCell(value: /* focusedCell */ IFocusedCellCoordinates => Unit): Self = this.set("onFocusedCell", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocusedCell: Self = this.set("onFocusedCell", js.undefined)
    
    @scala.inline
    def setOnSelection(value: /* regions */ js.Array[IRegion] => Unit): Self = this.set("onSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelection: Self = this.set("onSelection", js.undefined)
    
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
