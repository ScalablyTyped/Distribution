package typings.blueprintjsTable.anon

import typings.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typings.blueprintjsTable.dragTypesMod.ICoordinateData
import typings.blueprintjsTable.esmRegionsMod.IRegion
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/table.@blueprintjs/table/lib/esm/interactions/reorderable.IDragReorderable> */
@js.native
trait PartialIDragReorderable extends StObject {
  
  var disabled: js.UndefOr[Boolean | (js.Function1[/* event */ MouseEvent, Boolean])] = js.native
  
  var locateClick: js.UndefOr[js.Function1[/* event */ MouseEvent, IRegion]] = js.native
  
  var locateDrag: js.UndefOr[js.Function2[/* event */ MouseEvent, /* coords */ ICoordinateData, Double]] = js.native
  
  var onFocusedCell: js.UndefOr[js.Function1[/* focusedCell */ IFocusedCellCoordinates, Unit]] = js.native
  
  var onReordered: js.UndefOr[
    js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit]
  ] = js.native
  
  var onReordering: js.UndefOr[
    js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit]
  ] = js.native
  
  var onSelection: js.UndefOr[js.Function1[/* regions */ js.Array[IRegion], Unit]] = js.native
  
  var selectedRegions: js.UndefOr[js.Array[IRegion]] = js.native
  
  var toRegion: js.UndefOr[js.Function2[/* index1 */ Double, /* index2 */ js.UndefOr[Double], IRegion]] = js.native
}
object PartialIDragReorderable {
  
  @scala.inline
  def apply(): PartialIDragReorderable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIDragReorderable]
  }
  
  @scala.inline
  implicit class PartialIDragReorderableMutableBuilder[Self <: PartialIDragReorderable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean | (js.Function1[/* event */ MouseEvent, Boolean])): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledFunction1(value: /* event */ MouseEvent => Boolean): Self = StObject.set(x, "disabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setLocateClick(value: /* event */ MouseEvent => IRegion): Self = StObject.set(x, "locateClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocateClickUndefined: Self = StObject.set(x, "locateClick", js.undefined)
    
    @scala.inline
    def setLocateDrag(value: (/* event */ MouseEvent, /* coords */ ICoordinateData) => Double): Self = StObject.set(x, "locateDrag", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLocateDragUndefined: Self = StObject.set(x, "locateDrag", js.undefined)
    
    @scala.inline
    def setOnFocusedCell(value: /* focusedCell */ IFocusedCellCoordinates => Unit): Self = StObject.set(x, "onFocusedCell", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusedCellUndefined: Self = StObject.set(x, "onFocusedCell", js.undefined)
    
    @scala.inline
    def setOnReordered(value: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Unit): Self = StObject.set(x, "onReordered", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnReorderedUndefined: Self = StObject.set(x, "onReordered", js.undefined)
    
    @scala.inline
    def setOnReordering(value: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Unit): Self = StObject.set(x, "onReordering", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnReorderingUndefined: Self = StObject.set(x, "onReordering", js.undefined)
    
    @scala.inline
    def setOnSelection(value: /* regions */ js.Array[IRegion] => Unit): Self = StObject.set(x, "onSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectionUndefined: Self = StObject.set(x, "onSelection", js.undefined)
    
    @scala.inline
    def setSelectedRegions(value: js.Array[IRegion]): Self = StObject.set(x, "selectedRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedRegionsUndefined: Self = StObject.set(x, "selectedRegions", js.undefined)
    
    @scala.inline
    def setSelectedRegionsVarargs(value: IRegion*): Self = StObject.set(x, "selectedRegions", js.Array(value :_*))
    
    @scala.inline
    def setToRegion(value: (/* index1 */ Double, /* index2 */ js.UndefOr[Double]) => IRegion): Self = StObject.set(x, "toRegion", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToRegionUndefined: Self = StObject.set(x, "toRegion", js.undefined)
  }
}
