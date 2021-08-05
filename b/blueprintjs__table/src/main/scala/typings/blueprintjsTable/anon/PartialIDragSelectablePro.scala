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
  
  inline def apply(): PartialIDragSelectablePro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIDragSelectablePro]
  }
  
  extension [Self <: PartialIDragSelectablePro](x: Self) {
    
    inline def setDisabled(value: Boolean | (js.Function1[/* event */ MouseEvent, Boolean])): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledFunction1(value: /* event */ MouseEvent => Boolean): Self = StObject.set(x, "disabled", js.Any.fromFunction1(value))
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEnableMultipleSelection(value: Boolean): Self = StObject.set(x, "enableMultipleSelection", value.asInstanceOf[js.Any])
    
    inline def setEnableMultipleSelectionUndefined: Self = StObject.set(x, "enableMultipleSelection", js.undefined)
    
    inline def setFocusedCell(value: IFocusedCellCoordinates): Self = StObject.set(x, "focusedCell", value.asInstanceOf[js.Any])
    
    inline def setFocusedCellUndefined: Self = StObject.set(x, "focusedCell", js.undefined)
    
    inline def setIgnoredSelectors(value: js.Array[String]): Self = StObject.set(x, "ignoredSelectors", value.asInstanceOf[js.Any])
    
    inline def setIgnoredSelectorsUndefined: Self = StObject.set(x, "ignoredSelectors", js.undefined)
    
    inline def setIgnoredSelectorsVarargs(value: String*): Self = StObject.set(x, "ignoredSelectors", js.Array(value :_*))
    
    inline def setLocateClick(value: /* event */ MouseEvent => IRegion): Self = StObject.set(x, "locateClick", js.Any.fromFunction1(value))
    
    inline def setLocateClickUndefined: Self = StObject.set(x, "locateClick", js.undefined)
    
    inline def setLocateDrag(
      value: (/* event */ MouseEvent, /* coords */ ICoordinateData, /* returnEndOnly */ js.UndefOr[Boolean]) => IRegion
    ): Self = StObject.set(x, "locateDrag", js.Any.fromFunction3(value))
    
    inline def setLocateDragUndefined: Self = StObject.set(x, "locateDrag", js.undefined)
    
    inline def setOnFocusedCell(value: /* focusedCell */ IFocusedCellCoordinates => Unit): Self = StObject.set(x, "onFocusedCell", js.Any.fromFunction1(value))
    
    inline def setOnFocusedCellUndefined: Self = StObject.set(x, "onFocusedCell", js.undefined)
    
    inline def setOnSelection(value: /* regions */ js.Array[IRegion] => Unit): Self = StObject.set(x, "onSelection", js.Any.fromFunction1(value))
    
    inline def setOnSelectionEnd(value: /* regions */ js.Array[IRegion] => Unit): Self = StObject.set(x, "onSelectionEnd", js.Any.fromFunction1(value))
    
    inline def setOnSelectionEndUndefined: Self = StObject.set(x, "onSelectionEnd", js.undefined)
    
    inline def setOnSelectionUndefined: Self = StObject.set(x, "onSelection", js.undefined)
    
    inline def setSelectedRegionTransform(
      value: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => IRegion
    ): Self = StObject.set(x, "selectedRegionTransform", js.Any.fromFunction3(value))
    
    inline def setSelectedRegionTransformUndefined: Self = StObject.set(x, "selectedRegionTransform", js.undefined)
    
    inline def setSelectedRegions(value: js.Array[IRegion]): Self = StObject.set(x, "selectedRegions", value.asInstanceOf[js.Any])
    
    inline def setSelectedRegionsUndefined: Self = StObject.set(x, "selectedRegions", js.undefined)
    
    inline def setSelectedRegionsVarargs(value: IRegion*): Self = StObject.set(x, "selectedRegions", js.Array(value :_*))
  }
}
