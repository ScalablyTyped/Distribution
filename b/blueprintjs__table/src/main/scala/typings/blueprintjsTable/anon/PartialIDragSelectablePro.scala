package typings.blueprintjsTable.anon

import typings.blueprintjsTable.libEsmCommonCellTypesMod.FocusedCellCoordinates
import typings.blueprintjsTable.libEsmInteractionsDragTypesMod.ICoordinateData
import typings.blueprintjsTable.libEsmInteractionsSelectableMod.ISelectedRegionTransform
import typings.blueprintjsTable.libEsmRegionsMod.Region
import typings.react.mod.ReactNode
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/table.@blueprintjs/table/lib/esm/interactions/selectable.IDragSelectableProps> */
trait PartialIDragSelectablePro extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var disabled: js.UndefOr[Boolean | (js.Function1[/* event */ MouseEvent, Boolean])] = js.undefined
  
  var enableMultipleSelection: js.UndefOr[Boolean] = js.undefined
  
  var focusedCell: js.UndefOr[FocusedCellCoordinates] = js.undefined
  
  var ignoredSelectors: js.UndefOr[js.Array[String]] = js.undefined
  
  var locateClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Region]] = js.undefined
  
  var locateDrag: js.UndefOr[
    js.Function3[
      /* event */ MouseEvent, 
      /* coords */ ICoordinateData, 
      /* returnEndOnly */ js.UndefOr[Boolean], 
      js.UndefOr[Region]
    ]
  ] = js.undefined
  
  var onFocusedCell: js.UndefOr[js.Function1[/* focusedCell */ FocusedCellCoordinates, Unit]] = js.undefined
  
  var onSelection: js.UndefOr[js.Function1[/* regions */ js.Array[Region], Unit]] = js.undefined
  
  var onSelectionEnd: js.UndefOr[js.Function1[/* regions */ js.Array[Region], Unit]] = js.undefined
  
  var selectedRegionTransform: js.UndefOr[ISelectedRegionTransform] = js.undefined
  
  var selectedRegions: js.UndefOr[js.Array[Region]] = js.undefined
}
object PartialIDragSelectablePro {
  
  inline def apply(): PartialIDragSelectablePro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIDragSelectablePro]
  }
  
  extension [Self <: PartialIDragSelectablePro](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDisabled(value: Boolean | (js.Function1[/* event */ MouseEvent, Boolean])): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledFunction1(value: /* event */ MouseEvent => Boolean): Self = StObject.set(x, "disabled", js.Any.fromFunction1(value))
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEnableMultipleSelection(value: Boolean): Self = StObject.set(x, "enableMultipleSelection", value.asInstanceOf[js.Any])
    
    inline def setEnableMultipleSelectionUndefined: Self = StObject.set(x, "enableMultipleSelection", js.undefined)
    
    inline def setFocusedCell(value: FocusedCellCoordinates): Self = StObject.set(x, "focusedCell", value.asInstanceOf[js.Any])
    
    inline def setFocusedCellUndefined: Self = StObject.set(x, "focusedCell", js.undefined)
    
    inline def setIgnoredSelectors(value: js.Array[String]): Self = StObject.set(x, "ignoredSelectors", value.asInstanceOf[js.Any])
    
    inline def setIgnoredSelectorsUndefined: Self = StObject.set(x, "ignoredSelectors", js.undefined)
    
    inline def setIgnoredSelectorsVarargs(value: String*): Self = StObject.set(x, "ignoredSelectors", js.Array(value*))
    
    inline def setLocateClick(value: /* event */ MouseEvent => Region): Self = StObject.set(x, "locateClick", js.Any.fromFunction1(value))
    
    inline def setLocateClickUndefined: Self = StObject.set(x, "locateClick", js.undefined)
    
    inline def setLocateDrag(
      value: (/* event */ MouseEvent, /* coords */ ICoordinateData, /* returnEndOnly */ js.UndefOr[Boolean]) => js.UndefOr[Region]
    ): Self = StObject.set(x, "locateDrag", js.Any.fromFunction3(value))
    
    inline def setLocateDragUndefined: Self = StObject.set(x, "locateDrag", js.undefined)
    
    inline def setOnFocusedCell(value: /* focusedCell */ FocusedCellCoordinates => Unit): Self = StObject.set(x, "onFocusedCell", js.Any.fromFunction1(value))
    
    inline def setOnFocusedCellUndefined: Self = StObject.set(x, "onFocusedCell", js.undefined)
    
    inline def setOnSelection(value: /* regions */ js.Array[Region] => Unit): Self = StObject.set(x, "onSelection", js.Any.fromFunction1(value))
    
    inline def setOnSelectionEnd(value: /* regions */ js.Array[Region] => Unit): Self = StObject.set(x, "onSelectionEnd", js.Any.fromFunction1(value))
    
    inline def setOnSelectionEndUndefined: Self = StObject.set(x, "onSelectionEnd", js.undefined)
    
    inline def setOnSelectionUndefined: Self = StObject.set(x, "onSelection", js.undefined)
    
    inline def setSelectedRegionTransform(
      value: (/* region */ Region, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => Region
    ): Self = StObject.set(x, "selectedRegionTransform", js.Any.fromFunction3(value))
    
    inline def setSelectedRegionTransformUndefined: Self = StObject.set(x, "selectedRegionTransform", js.undefined)
    
    inline def setSelectedRegions(value: js.Array[Region]): Self = StObject.set(x, "selectedRegions", value.asInstanceOf[js.Any])
    
    inline def setSelectedRegionsUndefined: Self = StObject.set(x, "selectedRegions", js.undefined)
    
    inline def setSelectedRegionsVarargs(value: Region*): Self = StObject.set(x, "selectedRegions", js.Array(value*))
  }
}
