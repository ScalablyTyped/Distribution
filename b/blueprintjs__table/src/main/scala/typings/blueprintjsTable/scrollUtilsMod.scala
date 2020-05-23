package typings.blueprintjsTable

import typings.blueprintjsTable.anon.ScrollLeft
import typings.blueprintjsTable.blueprintjsTableStrings.horizontal
import typings.blueprintjsTable.blueprintjsTableStrings.vertical
import typings.blueprintjsTable.esmRegionsMod.IRegion
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/common/internal/scrollUtils", JSImport.Namespace)
@js.native
object scrollUtilsMod extends js.Object {
  def getScrollPositionForRegion(
    region: IRegion,
    currScrollLeft: Double,
    currScrollTop: Double,
    getLeftOffset: js.Function1[/* columnIndex */ Double, Double],
    getTopOffset: js.Function1[/* rowIndex */ Double, Double]
  ): ScrollLeft = js.native
  def getScrollPositionForRegion(
    region: IRegion,
    currScrollLeft: Double,
    currScrollTop: Double,
    getLeftOffset: js.Function1[/* columnIndex */ Double, Double],
    getTopOffset: js.Function1[/* rowIndex */ Double, Double],
    numFrozenRows: Double
  ): ScrollLeft = js.native
  def getScrollPositionForRegion(
    region: IRegion,
    currScrollLeft: Double,
    currScrollTop: Double,
    getLeftOffset: js.Function1[/* columnIndex */ Double, Double],
    getTopOffset: js.Function1[/* rowIndex */ Double, Double],
    numFrozenRows: Double,
    numFrozenColumns: Double
  ): ScrollLeft = js.native
  @JSName("measureScrollBarThickness")
  def measureScrollBarThickness_horizontal(element: HTMLElement, direction: horizontal): Double = js.native
  @JSName("measureScrollBarThickness")
  def measureScrollBarThickness_vertical(element: HTMLElement, direction: vertical): Double = js.native
}

