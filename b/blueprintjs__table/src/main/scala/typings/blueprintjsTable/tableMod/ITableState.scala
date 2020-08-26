package typings.blueprintjsTable.tableMod

import org.scalablytyped.runtime.StringDictionary
import typings.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typings.blueprintjsTable.esmRegionsMod.IRegion
import typings.blueprintjsTable.rectMod.Rect
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITableState extends js.Object {
  var childrenArray: js.Array[ReactElement] = js.native
  var columnIdToIndex: StringDictionary[Double] = js.native
  /**
    * An array of column widths. These are initialized from the column props
    * and updated when the user drags column header resize handles.
    */
  var columnWidths: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The coordinates of the currently focused table cell
    */
  var focusedCell: js.UndefOr[IFocusedCellCoordinates] = js.native
  /**
    * An array of pixel offsets for resize guides, which are drawn over the
    * table body when a row is being resized.
    */
  var horizontalGuides: js.UndefOr[js.Array[Double]] = js.native
  /**
    * If `true`, will disable updates that will cause re-renders of children
    * components. This is used, for example, to disable layout updates while
    * the user is dragging a resize handle.
    */
  var isLayoutLocked: js.UndefOr[Boolean] = js.native
  /**
    * Whether the user is currently dragging to reorder one or more elements.
    * Can be referenced to toggle the reordering-cursor overlay, which
    * displays a `grabbing` CSS cursor wherever the mouse moves in the table
    * for the duration of the dragging interaction.
    */
  var isReordering: js.UndefOr[Boolean] = js.native
  /**
    * The number of frozen columns, clamped to [0, num <Column>s].
    */
  var numFrozenColumnsClamped: js.UndefOr[Double] = js.native
  /**
    * The number of frozen rows, clamped to [0, numRows].
    */
  var numFrozenRowsClamped: js.UndefOr[Double] = js.native
  /**
    * An array of row heights. These are initialized updated when the user
    * drags row header resize handles.
    */
  var rowHeights: js.UndefOr[js.Array[Double]] = js.native
  /**
    * An array of Regions representing the selections of the table.
    */
  var selectedRegions: js.UndefOr[js.Array[IRegion]] = js.native
  /**
    * An array of pixel offsets for resize guides, which are drawn over the
    * table body when a column is being resized.
    */
  var verticalGuides: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The `Rect` bounds of the viewport used to perform virtual viewport
    * performance enhancements.
    */
  var viewportRect: js.UndefOr[Rect] = js.native
}

object ITableState {
  @scala.inline
  def apply(childrenArray: js.Array[ReactElement], columnIdToIndex: StringDictionary[Double]): ITableState = {
    val __obj = js.Dynamic.literal(childrenArray = childrenArray.asInstanceOf[js.Any], columnIdToIndex = columnIdToIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableState]
  }
  @scala.inline
  implicit class ITableStateOps[Self <: ITableState] (val x: Self) extends AnyVal {
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
    def deleteColumnWidths: Self = this.set("columnWidths", js.undefined)
    @scala.inline
    def setFocusedCell(value: IFocusedCellCoordinates): Self = this.set("focusedCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusedCell: Self = this.set("focusedCell", js.undefined)
    @scala.inline
    def setHorizontalGuidesVarargs(value: Double*): Self = this.set("horizontalGuides", js.Array(value :_*))
    @scala.inline
    def setHorizontalGuides(value: js.Array[Double]): Self = this.set("horizontalGuides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalGuides: Self = this.set("horizontalGuides", js.undefined)
    @scala.inline
    def setIsLayoutLocked(value: Boolean): Self = this.set("isLayoutLocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLayoutLocked: Self = this.set("isLayoutLocked", js.undefined)
    @scala.inline
    def setIsReordering(value: Boolean): Self = this.set("isReordering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsReordering: Self = this.set("isReordering", js.undefined)
    @scala.inline
    def setNumFrozenColumnsClamped(value: Double): Self = this.set("numFrozenColumnsClamped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumFrozenColumnsClamped: Self = this.set("numFrozenColumnsClamped", js.undefined)
    @scala.inline
    def setNumFrozenRowsClamped(value: Double): Self = this.set("numFrozenRowsClamped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumFrozenRowsClamped: Self = this.set("numFrozenRowsClamped", js.undefined)
    @scala.inline
    def setRowHeightsVarargs(value: Double*): Self = this.set("rowHeights", js.Array(value :_*))
    @scala.inline
    def setRowHeights(value: js.Array[Double]): Self = this.set("rowHeights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowHeights: Self = this.set("rowHeights", js.undefined)
    @scala.inline
    def setSelectedRegionsVarargs(value: IRegion*): Self = this.set("selectedRegions", js.Array(value :_*))
    @scala.inline
    def setSelectedRegions(value: js.Array[IRegion]): Self = this.set("selectedRegions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedRegions: Self = this.set("selectedRegions", js.undefined)
    @scala.inline
    def setVerticalGuidesVarargs(value: Double*): Self = this.set("verticalGuides", js.Array(value :_*))
    @scala.inline
    def setVerticalGuides(value: js.Array[Double]): Self = this.set("verticalGuides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalGuides: Self = this.set("verticalGuides", js.undefined)
    @scala.inline
    def setViewportRect(value: Rect): Self = this.set("viewportRect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewportRect: Self = this.set("viewportRect", js.undefined)
  }
  
}

