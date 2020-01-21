package typings.blueprintjsTable.tableQuadrantStackCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/quadrants/tableQuadrantStackCache", "TableQuadrantStackCache")
@js.native
class TableQuadrantStackCache () extends js.Object {
  var cachedColumnHeaderHeight: js.Any = js.native
  var cachedRowHeaderWidth: js.Any = js.native
  var cachedScrollContainerClientHeight: js.Any = js.native
  var cachedScrollContainerClientWidth: js.Any = js.native
  var cachedScrollLeft: js.Any = js.native
  var cachedScrollTop: js.Any = js.native
  def getColumnHeaderHeight(): Double = js.native
  def getRowHeaderWidth(): Double = js.native
  def getScrollContainerClientHeight(): Double = js.native
  def getScrollContainerClientWidth(): Double = js.native
  def getScrollOffset(scrollKey: ScrollKey): Double = js.native
  def reset(): Unit = js.native
  def setColumnHeaderHeight(height: Double): Unit = js.native
  def setRowHeaderWidth(width: Double): Unit = js.native
  def setScrollContainerClientHeight(): Unit = js.native
  def setScrollContainerClientHeight(clientHeight: Double): Unit = js.native
  def setScrollContainerClientWidth(): Unit = js.native
  def setScrollContainerClientWidth(clientWidth: Double): Unit = js.native
  def setScrollOffset(scrollKey: ScrollKey, offset: Double): Unit = js.native
}

