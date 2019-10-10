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
    val __obj = js.Dynamic.literal(childrenArray = childrenArray, columnIdToIndex = columnIdToIndex, columnWidths = columnWidths, focusedCell = focusedCell, numFrozenColumnsClamped = numFrozenColumnsClamped, numFrozenRowsClamped = numFrozenRowsClamped, rowHeights = rowHeights, selectedRegions = selectedRegions)
  
    __obj.asInstanceOf[Anon_ChildrenArray]
  }
}

