package typings
package atBlueprintjsTableLib.libEsmLocatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/locator", "Locator")
@js.native
class Locator protected () extends ILocator {
  def this(tableElement: stdLib.HTMLElement, scrollContainerElement: stdLib.HTMLElement, cellContainerElement: stdLib.HTMLElement) = this()
  var cellContainerElement: js.Any = js.native
  var convertCellIndexToClientX: js.Any = js.native
  var convertCellIndexToClientY: js.Any = js.native
  var convertCellMidpointToClientX: js.Any = js.native
  var convertCellMidpointToClientY: js.Any = js.native
  var grid: js.Any = js.native
  var numFrozenColumns: js.Any = js.native
  var numFrozenRows: js.Any = js.native
  var scrollContainerElement: js.Any = js.native
  var tableElement: js.Any = js.native
  var toGridX: js.Any = js.native
  var toGridY: js.Any = js.native
  /* private */ def getColumnCellSelector(columnIndex: js.Any): js.Any = js.native
  /* private */ def getTableRect(): js.Any = js.native
  def getViewportRect(): atBlueprintjsTableLib.libEsmCommonRectMod.Rect = js.native
  def setGrid(grid: atBlueprintjsTableLib.libEsmCommonGridMod.Grid): this.type = js.native
  def setNumFrozenColumns(numFrozenColumns: scala.Double): this.type = js.native
  def setNumFrozenRows(numFrozenRows: scala.Double): this.type = js.native
}

/* static members */
@JSImport("@blueprintjs/table/lib/esm/locator", "Locator")
@js.native
object Locator extends js.Object {
  var CELL_HORIZONTAL_PADDING: scala.Double = js.native
}

