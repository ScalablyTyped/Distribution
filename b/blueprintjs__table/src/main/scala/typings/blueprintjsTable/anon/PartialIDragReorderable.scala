package typings.blueprintjsTable.anon

import typings.blueprintjsTable.libEsmCommonCellTypesMod.FocusedCellCoordinates
import typings.blueprintjsTable.libEsmInteractionsDragTypesMod.ICoordinateData
import typings.blueprintjsTable.libEsmRegionsMod.Region
import typings.react.mod.ReactNode
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/table.@blueprintjs/table/lib/esm/interactions/reorderable.IDragReorderable> */
trait PartialIDragReorderable extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var disabled: js.UndefOr[Boolean | (js.Function1[/* event */ MouseEvent, Boolean])] = js.undefined
  
  var locateClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Region]] = js.undefined
  
  var locateDrag: js.UndefOr[
    js.Function2[/* event */ MouseEvent, /* coords */ ICoordinateData, js.UndefOr[Double]]
  ] = js.undefined
  
  var onFocusedCell: js.UndefOr[js.Function1[/* focusedCell */ FocusedCellCoordinates, Unit]] = js.undefined
  
  var onReordered: js.UndefOr[
    js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit]
  ] = js.undefined
  
  var onReordering: js.UndefOr[
    js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit]
  ] = js.undefined
  
  var onSelection: js.UndefOr[js.Function1[/* regions */ js.Array[Region], Unit]] = js.undefined
  
  var selectedRegions: js.UndefOr[js.Array[Region]] = js.undefined
  
  var toRegion: js.UndefOr[js.Function2[/* index1 */ Double, /* index2 */ js.UndefOr[Double], Region]] = js.undefined
}
object PartialIDragReorderable {
  
  inline def apply(): PartialIDragReorderable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIDragReorderable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialIDragReorderable] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDisabled(value: Boolean | (js.Function1[/* event */ MouseEvent, Boolean])): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledFunction1(value: /* event */ MouseEvent => Boolean): Self = StObject.set(x, "disabled", js.Any.fromFunction1(value))
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLocateClick(value: /* event */ MouseEvent => Region): Self = StObject.set(x, "locateClick", js.Any.fromFunction1(value))
    
    inline def setLocateClickUndefined: Self = StObject.set(x, "locateClick", js.undefined)
    
    inline def setLocateDrag(value: (/* event */ MouseEvent, /* coords */ ICoordinateData) => js.UndefOr[Double]): Self = StObject.set(x, "locateDrag", js.Any.fromFunction2(value))
    
    inline def setLocateDragUndefined: Self = StObject.set(x, "locateDrag", js.undefined)
    
    inline def setOnFocusedCell(value: /* focusedCell */ FocusedCellCoordinates => Unit): Self = StObject.set(x, "onFocusedCell", js.Any.fromFunction1(value))
    
    inline def setOnFocusedCellUndefined: Self = StObject.set(x, "onFocusedCell", js.undefined)
    
    inline def setOnReordered(value: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Unit): Self = StObject.set(x, "onReordered", js.Any.fromFunction3(value))
    
    inline def setOnReorderedUndefined: Self = StObject.set(x, "onReordered", js.undefined)
    
    inline def setOnReordering(value: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Unit): Self = StObject.set(x, "onReordering", js.Any.fromFunction3(value))
    
    inline def setOnReorderingUndefined: Self = StObject.set(x, "onReordering", js.undefined)
    
    inline def setOnSelection(value: /* regions */ js.Array[Region] => Unit): Self = StObject.set(x, "onSelection", js.Any.fromFunction1(value))
    
    inline def setOnSelectionUndefined: Self = StObject.set(x, "onSelection", js.undefined)
    
    inline def setSelectedRegions(value: js.Array[Region]): Self = StObject.set(x, "selectedRegions", value.asInstanceOf[js.Any])
    
    inline def setSelectedRegionsUndefined: Self = StObject.set(x, "selectedRegions", js.undefined)
    
    inline def setSelectedRegionsVarargs(value: Region*): Self = StObject.set(x, "selectedRegions", js.Array(value*))
    
    inline def setToRegion(value: (/* index1 */ Double, /* index2 */ js.UndefOr[Double]) => Region): Self = StObject.set(x, "toRegion", js.Any.fromFunction2(value))
    
    inline def setToRegionUndefined: Self = StObject.set(x, "toRegion", js.undefined)
  }
}
