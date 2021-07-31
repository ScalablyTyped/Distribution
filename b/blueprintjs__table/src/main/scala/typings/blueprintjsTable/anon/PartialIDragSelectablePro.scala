package typings.blueprintjsTable.anon

import typings.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typings.blueprintjsTable.dragTypesMod.ICoordinateData
import typings.blueprintjsTable.esmRegionsMod.IRegion
import typings.blueprintjsTable.selectableMod.ISelectedRegionTransform
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/table.@blueprintjs/table/lib/esm/interactions/selectable.IDragSelectableProps> */
trait PartialIDragSelectablePro extends StObject {
  
  var disabled: js.UndefOr[Boolean | (js.Function1[/* event */ MouseEvent, Boolean])] = js.undefined
  
  var enableMultipleSelection: js.UndefOr[Boolean] = js.undefined
  
  var focusedCell: js.UndefOr[IFocusedCellCoordinates] = js.undefined
  
  var ignoredSelectors: js.UndefOr[js.Array[String]] = js.undefined
  
  var locateClick: js.UndefOr[js.Function1[/* event */ MouseEvent, IRegion]] = js.undefined
  
  var locateDrag: js.UndefOr[
    js.Function3[
      /* event */ MouseEvent, 
      /* coords */ ICoordinateData, 
      /* returnEndOnly */ js.UndefOr[Boolean], 
      IRegion
    ]
  ] = js.undefined
  
  var onFocusedCell: js.UndefOr[js.Function1[/* focusedCell */ IFocusedCellCoordinates, Unit]] = js.undefined
  
  var onSelection: js.UndefOr[js.Function1[/* regions */ js.Array[IRegion], Unit]] = js.undefined
  
  var onSelectionEnd: js.UndefOr[js.Function1[/* regions */ js.Array[IRegion], Unit]] = js.undefined
  
  var selectedRegionTransform: js.UndefOr[ISelectedRegionTransform] = js.undefined
  
  var selectedRegions: js.UndefOr[js.Array[IRegion]] = js.undefined
}
object PartialIDragSelectablePro {
  
  @scala.inline
  def apply(): PartialIDragSelectablePro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIDragSelectablePro]
  }
  
  @scala.inline
  implicit class PartialIDragSelectableProMutableBuilder[Self <: PartialIDragSelectablePro] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean | (js.Function1[/* event */ MouseEvent, Boolean])): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledFunction1(value: /* event */ MouseEvent => Boolean): Self = StObject.set(x, "disabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setEnableMultipleSelection(value: Boolean): Self = StObject.set(x, "enableMultipleSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableMultipleSelectionUndefined: Self = StObject.set(x, "enableMultipleSelection", js.undefined)
    
    @scala.inline
    def setFocusedCell(value: IFocusedCellCoordinates): Self = StObject.set(x, "focusedCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusedCellUndefined: Self = StObject.set(x, "focusedCell", js.undefined)
    
    @scala.inline
    def setIgnoredSelectors(value: js.Array[String]): Self = StObject.set(x, "ignoredSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoredSelectorsUndefined: Self = StObject.set(x, "ignoredSelectors", js.undefined)
    
    @scala.inline
    def setIgnoredSelectorsVarargs(value: String*): Self = StObject.set(x, "ignoredSelectors", js.Array(value :_*))
    
    @scala.inline
    def setLocateClick(value: /* event */ MouseEvent => IRegion): Self = StObject.set(x, "locateClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocateClickUndefined: Self = StObject.set(x, "locateClick", js.undefined)
    
    @scala.inline
    def setLocateDrag(
      value: (/* event */ MouseEvent, /* coords */ ICoordinateData, /* returnEndOnly */ js.UndefOr[Boolean]) => IRegion
    ): Self = StObject.set(x, "locateDrag", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLocateDragUndefined: Self = StObject.set(x, "locateDrag", js.undefined)
    
    @scala.inline
    def setOnFocusedCell(value: /* focusedCell */ IFocusedCellCoordinates => Unit): Self = StObject.set(x, "onFocusedCell", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusedCellUndefined: Self = StObject.set(x, "onFocusedCell", js.undefined)
    
    @scala.inline
    def setOnSelection(value: /* regions */ js.Array[IRegion] => Unit): Self = StObject.set(x, "onSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectionEnd(value: /* regions */ js.Array[IRegion] => Unit): Self = StObject.set(x, "onSelectionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectionEndUndefined: Self = StObject.set(x, "onSelectionEnd", js.undefined)
    
    @scala.inline
    def setOnSelectionUndefined: Self = StObject.set(x, "onSelection", js.undefined)
    
    @scala.inline
    def setSelectedRegionTransform(
      value: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => IRegion
    ): Self = StObject.set(x, "selectedRegionTransform", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSelectedRegionTransformUndefined: Self = StObject.set(x, "selectedRegionTransform", js.undefined)
    
    @scala.inline
    def setSelectedRegions(value: js.Array[IRegion]): Self = StObject.set(x, "selectedRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedRegionsUndefined: Self = StObject.set(x, "selectedRegions", js.undefined)
    
    @scala.inline
    def setSelectedRegionsVarargs(value: IRegion*): Self = StObject.set(x, "selectedRegions", js.Array(value :_*))
  }
}
