package typings.blueprintjsTable.anon

import org.scalablytyped.runtime.StringDictionary
import typings.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typings.blueprintjsTable.esmRegionsMod.IRegion
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildrenArray extends js.Object {
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
  implicit class ChildrenArrayOps[Self <: ChildrenArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildrenArrayVarargs(value: ReactElement*): Self = this.set("childrenArray", js.Array(value :_*))
    @scala.inline
    def setChildrenArray(value: js.Array[ReactElement]): Self = this.set("childrenArray", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnIdToIndex(value: StringDictionary[Double]): Self = this.set("columnIdToIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnWidthsVarargs(value: Double*): Self = this.set("columnWidths", js.Array(value :_*))
    @scala.inline
    def setColumnWidths(value: js.Array[Double]): Self = this.set("columnWidths", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusedCell(value: IFocusedCellCoordinates): Self = this.set("focusedCell", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumFrozenColumnsClamped(value: Double): Self = this.set("numFrozenColumnsClamped", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumFrozenRowsClamped(value: Double): Self = this.set("numFrozenRowsClamped", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowHeightsVarargs(value: Double*): Self = this.set("rowHeights", js.Array(value :_*))
    @scala.inline
    def setRowHeights(value: js.Array[Double]): Self = this.set("rowHeights", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedRegionsVarargs(value: IRegion*): Self = this.set("selectedRegions", js.Array(value :_*))
    @scala.inline
    def setSelectedRegions(value: js.Array[IRegion]): Self = this.set("selectedRegions", value.asInstanceOf[js.Any])
  }
  
}

