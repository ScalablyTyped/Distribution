package typings.blueprintjsTable

import typings.blueprintjsTable.anon.ScrollLeft
import typings.blueprintjsTable.blueprintjsTableStrings.horizontal
import typings.blueprintjsTable.blueprintjsTableStrings.vertical
import typings.blueprintjsTable.esmRegionsMod.IRegion
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollUtilsMod {
  
  @JSImport("@blueprintjs/table/lib/esm/common/internal/scrollUtils", "getScrollPositionForRegion")
  @js.native
  def getScrollPositionForRegion(
    region: IRegion,
    currScrollLeft: Double,
    currScrollTop: Double,
    getLeftOffset: js.Function1[/* columnIndex */ Double, Double],
    getTopOffset: js.Function1[/* rowIndex */ Double, Double]
  ): ScrollLeft = js.native
  @JSImport("@blueprintjs/table/lib/esm/common/internal/scrollUtils", "getScrollPositionForRegion")
  @js.native
  def getScrollPositionForRegion(
    region: IRegion,
    currScrollLeft: Double,
    currScrollTop: Double,
    getLeftOffset: js.Function1[/* columnIndex */ Double, Double],
    getTopOffset: js.Function1[/* rowIndex */ Double, Double],
    numFrozenRows: js.UndefOr[scala.Nothing],
    numFrozenColumns: Double
  ): ScrollLeft = js.native
  @JSImport("@blueprintjs/table/lib/esm/common/internal/scrollUtils", "getScrollPositionForRegion")
  @js.native
  def getScrollPositionForRegion(
    region: IRegion,
    currScrollLeft: Double,
    currScrollTop: Double,
    getLeftOffset: js.Function1[/* columnIndex */ Double, Double],
    getTopOffset: js.Function1[/* rowIndex */ Double, Double],
    numFrozenRows: Double
  ): ScrollLeft = js.native
  @JSImport("@blueprintjs/table/lib/esm/common/internal/scrollUtils", "getScrollPositionForRegion")
  @js.native
  def getScrollPositionForRegion(
    region: IRegion,
    currScrollLeft: Double,
    currScrollTop: Double,
    getLeftOffset: js.Function1[/* columnIndex */ Double, Double],
    getTopOffset: js.Function1[/* rowIndex */ Double, Double],
    numFrozenRows: Double,
    numFrozenColumns: Double
  ): ScrollLeft = js.native
  
  @JSImport("@blueprintjs/table/lib/esm/common/internal/scrollUtils", "measureScrollBarThickness")
  @js.native
  def measureScrollBarThickness_horizontal(element: HTMLElement, direction: horizontal): Double = js.native
  @JSImport("@blueprintjs/table/lib/esm/common/internal/scrollUtils", "measureScrollBarThickness")
  @js.native
  def measureScrollBarThickness_vertical(element: HTMLElement, direction: vertical): Double = js.native
}
