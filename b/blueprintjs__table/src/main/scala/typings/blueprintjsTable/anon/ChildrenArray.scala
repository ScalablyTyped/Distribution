package typings.blueprintjsTable.anon

import org.scalablytyped.runtime.StringDictionary
import typings.blueprintjsTable.libEsmCommonCellTypesMod.IFocusedCellCoordinates
import typings.blueprintjsTable.libEsmRegionsMod.IRegion
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenArray extends StObject {
  
  var childrenArray: js.Array[ReactElement]
  
  var columnIdToIndex: StringDictionary[Double]
  
  var columnWidths: js.Array[js.UndefOr[Double | Null]]
  
  var focusedCell: js.UndefOr[IFocusedCellCoordinates] = js.undefined
  
  var numFrozenColumnsClamped: Double
  
  var numFrozenRowsClamped: Double
  
  var rowHeights: js.Array[js.UndefOr[Double | Null]]
  
  var selectedRegions: js.Array[IRegion]
}
object ChildrenArray {
  
  inline def apply(
    childrenArray: js.Array[ReactElement],
    columnIdToIndex: StringDictionary[Double],
    columnWidths: js.Array[js.UndefOr[Double | Null]],
    numFrozenColumnsClamped: Double,
    numFrozenRowsClamped: Double,
    rowHeights: js.Array[js.UndefOr[Double | Null]],
    selectedRegions: js.Array[IRegion]
  ): ChildrenArray = {
    val __obj = js.Dynamic.literal(childrenArray = childrenArray.asInstanceOf[js.Any], columnIdToIndex = columnIdToIndex.asInstanceOf[js.Any], columnWidths = columnWidths.asInstanceOf[js.Any], numFrozenColumnsClamped = numFrozenColumnsClamped.asInstanceOf[js.Any], numFrozenRowsClamped = numFrozenRowsClamped.asInstanceOf[js.Any], rowHeights = rowHeights.asInstanceOf[js.Any], selectedRegions = selectedRegions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenArray]
  }
  
  extension [Self <: ChildrenArray](x: Self) {
    
    inline def setChildrenArray(value: js.Array[ReactElement]): Self = StObject.set(x, "childrenArray", value.asInstanceOf[js.Any])
    
    inline def setChildrenArrayVarargs(value: ReactElement*): Self = StObject.set(x, "childrenArray", js.Array(value*))
    
    inline def setColumnIdToIndex(value: StringDictionary[Double]): Self = StObject.set(x, "columnIdToIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnWidths(value: js.Array[js.UndefOr[Double | Null]]): Self = StObject.set(x, "columnWidths", value.asInstanceOf[js.Any])
    
    inline def setColumnWidthsVarargs(value: (js.UndefOr[Double | Null])*): Self = StObject.set(x, "columnWidths", js.Array(value*))
    
    inline def setFocusedCell(value: IFocusedCellCoordinates): Self = StObject.set(x, "focusedCell", value.asInstanceOf[js.Any])
    
    inline def setFocusedCellUndefined: Self = StObject.set(x, "focusedCell", js.undefined)
    
    inline def setNumFrozenColumnsClamped(value: Double): Self = StObject.set(x, "numFrozenColumnsClamped", value.asInstanceOf[js.Any])
    
    inline def setNumFrozenRowsClamped(value: Double): Self = StObject.set(x, "numFrozenRowsClamped", value.asInstanceOf[js.Any])
    
    inline def setRowHeights(value: js.Array[js.UndefOr[Double | Null]]): Self = StObject.set(x, "rowHeights", value.asInstanceOf[js.Any])
    
    inline def setRowHeightsVarargs(value: (js.UndefOr[Double | Null])*): Self = StObject.set(x, "rowHeights", js.Array(value*))
    
    inline def setSelectedRegions(value: js.Array[IRegion]): Self = StObject.set(x, "selectedRegions", value.asInstanceOf[js.Any])
    
    inline def setSelectedRegionsVarargs(value: IRegion*): Self = StObject.set(x, "selectedRegions", js.Array(value*))
  }
}
