package typings.blueprintjsTable.anon

import org.scalablytyped.runtime.StringDictionary
import typings.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typings.blueprintjsTable.esmRegionsMod.IRegion
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenArray extends StObject {
  
  var childrenArray: js.Array[ReactElement]
  
  var columnIdToIndex: StringDictionary[Double]
  
  var columnWidths: js.Array[Double]
  
  var focusedCell: IFocusedCellCoordinates
  
  var numFrozenColumnsClamped: Double
  
  var numFrozenRowsClamped: Double
  
  var rowHeights: js.Array[Double]
  
  var selectedRegions: js.Array[IRegion]
}
object ChildrenArray {
  
  inline def apply(
    childrenArray: js.Array[ReactElement],
    columnIdToIndex: StringDictionary[Double],
    columnWidths: js.Array[Double],
    focusedCell: IFocusedCellCoordinates,
    numFrozenColumnsClamped: Double,
    numFrozenRowsClamped: Double,
    rowHeights: js.Array[Double],
    selectedRegions: js.Array[IRegion]
  ): ChildrenArray = {
    val __obj = js.Dynamic.literal(childrenArray = childrenArray.asInstanceOf[js.Any], columnIdToIndex = columnIdToIndex.asInstanceOf[js.Any], columnWidths = columnWidths.asInstanceOf[js.Any], focusedCell = focusedCell.asInstanceOf[js.Any], numFrozenColumnsClamped = numFrozenColumnsClamped.asInstanceOf[js.Any], numFrozenRowsClamped = numFrozenRowsClamped.asInstanceOf[js.Any], rowHeights = rowHeights.asInstanceOf[js.Any], selectedRegions = selectedRegions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenArray]
  }
  
  extension [Self <: ChildrenArray](x: Self) {
    
    inline def setChildrenArray(value: js.Array[ReactElement]): Self = StObject.set(x, "childrenArray", value.asInstanceOf[js.Any])
    
    inline def setChildrenArrayVarargs(value: ReactElement*): Self = StObject.set(x, "childrenArray", js.Array(value :_*))
    
    inline def setColumnIdToIndex(value: StringDictionary[Double]): Self = StObject.set(x, "columnIdToIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnWidths(value: js.Array[Double]): Self = StObject.set(x, "columnWidths", value.asInstanceOf[js.Any])
    
    inline def setColumnWidthsVarargs(value: Double*): Self = StObject.set(x, "columnWidths", js.Array(value :_*))
    
    inline def setFocusedCell(value: IFocusedCellCoordinates): Self = StObject.set(x, "focusedCell", value.asInstanceOf[js.Any])
    
    inline def setNumFrozenColumnsClamped(value: Double): Self = StObject.set(x, "numFrozenColumnsClamped", value.asInstanceOf[js.Any])
    
    inline def setNumFrozenRowsClamped(value: Double): Self = StObject.set(x, "numFrozenRowsClamped", value.asInstanceOf[js.Any])
    
    inline def setRowHeights(value: js.Array[Double]): Self = StObject.set(x, "rowHeights", value.asInstanceOf[js.Any])
    
    inline def setRowHeightsVarargs(value: Double*): Self = StObject.set(x, "rowHeights", js.Array(value :_*))
    
    inline def setSelectedRegions(value: js.Array[IRegion]): Self = StObject.set(x, "selectedRegions", value.asInstanceOf[js.Any])
    
    inline def setSelectedRegionsVarargs(value: IRegion*): Self = StObject.set(x, "selectedRegions", js.Array(value :_*))
  }
}
