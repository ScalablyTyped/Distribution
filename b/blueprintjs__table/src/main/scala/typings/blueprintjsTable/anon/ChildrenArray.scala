package typings.blueprintjsTable.anon

import org.scalablytyped.runtime.StringDictionary
import typings.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typings.blueprintjsTable.esmRegionsMod.IRegion
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildrenArray extends StObject {
  
  var childrenArray: js.Array[ReactElement] = js.native
  
  var columnIdToIndex: StringDictionary[Double] = js.native
  
  var columnWidths: js.Array[Double] = js.native
  
  var focusedCell: IFocusedCellCoordinates = js.native
  
  var numFrozenColumnsClamped: Double = js.native
  
  var numFrozenRowsClamped: Double = js.native
  
  var rowHeights: js.Array[Double] = js.native
  
  var selectedRegions: js.Array[IRegion] = js.native
}
object ChildrenArray {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ChildrenArrayMutableBuilder[Self <: ChildrenArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildrenArray(value: js.Array[ReactElement]): Self = StObject.set(x, "childrenArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenArrayVarargs(value: ReactElement*): Self = StObject.set(x, "childrenArray", js.Array(value :_*))
    
    @scala.inline
    def setColumnIdToIndex(value: StringDictionary[Double]): Self = StObject.set(x, "columnIdToIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnWidths(value: js.Array[Double]): Self = StObject.set(x, "columnWidths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnWidthsVarargs(value: Double*): Self = StObject.set(x, "columnWidths", js.Array(value :_*))
    
    @scala.inline
    def setFocusedCell(value: IFocusedCellCoordinates): Self = StObject.set(x, "focusedCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumFrozenColumnsClamped(value: Double): Self = StObject.set(x, "numFrozenColumnsClamped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumFrozenRowsClamped(value: Double): Self = StObject.set(x, "numFrozenRowsClamped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeights(value: js.Array[Double]): Self = StObject.set(x, "rowHeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeightsVarargs(value: Double*): Self = StObject.set(x, "rowHeights", js.Array(value :_*))
    
    @scala.inline
    def setSelectedRegions(value: js.Array[IRegion]): Self = StObject.set(x, "selectedRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedRegionsVarargs(value: IRegion*): Self = StObject.set(x, "selectedRegions", js.Array(value :_*))
  }
}
