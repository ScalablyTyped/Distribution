package typings.atBlueprintjsTable

import org.scalablytyped.runtime.StringDictionary
import typings.atBlueprintjsTable.libEsmCommonCellMod.IFocusedCellCoordinates
import typings.atBlueprintjsTable.libEsmRegionsMod.IRegion
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenArray extends js.Object {
  var childrenArray: js.Array[ReactElement]
  var columnIdToIndex: StringDictionary[Double]
  var columnWidths: js.Array[Double]
  var focusedCell: IFocusedCellCoordinates
  var numFrozenColumnsClamped: Double
  var numFrozenRowsClamped: Double
  var rowHeights: js.Array[Double]
  var selectedRegions: js.Array[IRegion]
}

object Anon_ChildrenArray {
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
  ): Anon_ChildrenArray = {
    val __obj = js.Dynamic.literal(childrenArray = childrenArray.asInstanceOf[js.Any], columnIdToIndex = columnIdToIndex.asInstanceOf[js.Any], columnWidths = columnWidths.asInstanceOf[js.Any], focusedCell = focusedCell.asInstanceOf[js.Any], numFrozenColumnsClamped = numFrozenColumnsClamped.asInstanceOf[js.Any], numFrozenRowsClamped = numFrozenRowsClamped.asInstanceOf[js.Any], rowHeights = rowHeights.asInstanceOf[js.Any], selectedRegions = selectedRegions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ChildrenArray]
  }
}

