package typings.blueprintjsTable

import typings.blueprintjsTable.anon.ScrollLeft
import typings.blueprintjsTable.blueprintjsTableStrings.horizontal
import typings.blueprintjsTable.blueprintjsTableStrings.vertical
import typings.blueprintjsTable.esmRegionsMod.IRegion
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollUtilsMod {
  
  @JSImport("@blueprintjs/table/lib/esm/common/internal/scrollUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getScrollPositionForRegion(
    region: IRegion,
    currScrollLeft: Double,
    currScrollTop: Double,
    getLeftOffset: js.Function1[/* columnIndex */ Double, Double],
    getTopOffset: js.Function1[/* rowIndex */ Double, Double]
  ): ScrollLeft = (^.asInstanceOf[js.Dynamic].applyDynamic("getScrollPositionForRegion")(region.asInstanceOf[js.Any], currScrollLeft.asInstanceOf[js.Any], currScrollTop.asInstanceOf[js.Any], getLeftOffset.asInstanceOf[js.Any], getTopOffset.asInstanceOf[js.Any])).asInstanceOf[ScrollLeft]
  @scala.inline
  def getScrollPositionForRegion(
    region: IRegion,
    currScrollLeft: Double,
    currScrollTop: Double,
    getLeftOffset: js.Function1[/* columnIndex */ Double, Double],
    getTopOffset: js.Function1[/* rowIndex */ Double, Double],
    numFrozenRows: Double
  ): ScrollLeft = (^.asInstanceOf[js.Dynamic].applyDynamic("getScrollPositionForRegion")(region.asInstanceOf[js.Any], currScrollLeft.asInstanceOf[js.Any], currScrollTop.asInstanceOf[js.Any], getLeftOffset.asInstanceOf[js.Any], getTopOffset.asInstanceOf[js.Any], numFrozenRows.asInstanceOf[js.Any])).asInstanceOf[ScrollLeft]
  @scala.inline
  def getScrollPositionForRegion(
    region: IRegion,
    currScrollLeft: Double,
    currScrollTop: Double,
    getLeftOffset: js.Function1[/* columnIndex */ Double, Double],
    getTopOffset: js.Function1[/* rowIndex */ Double, Double],
    numFrozenRows: Double,
    numFrozenColumns: Double
  ): ScrollLeft = (^.asInstanceOf[js.Dynamic].applyDynamic("getScrollPositionForRegion")(region.asInstanceOf[js.Any], currScrollLeft.asInstanceOf[js.Any], currScrollTop.asInstanceOf[js.Any], getLeftOffset.asInstanceOf[js.Any], getTopOffset.asInstanceOf[js.Any], numFrozenRows.asInstanceOf[js.Any], numFrozenColumns.asInstanceOf[js.Any])).asInstanceOf[ScrollLeft]
  @scala.inline
  def getScrollPositionForRegion(
    region: IRegion,
    currScrollLeft: Double,
    currScrollTop: Double,
    getLeftOffset: js.Function1[/* columnIndex */ Double, Double],
    getTopOffset: js.Function1[/* rowIndex */ Double, Double],
    numFrozenRows: Unit,
    numFrozenColumns: Double
  ): ScrollLeft = (^.asInstanceOf[js.Dynamic].applyDynamic("getScrollPositionForRegion")(region.asInstanceOf[js.Any], currScrollLeft.asInstanceOf[js.Any], currScrollTop.asInstanceOf[js.Any], getLeftOffset.asInstanceOf[js.Any], getTopOffset.asInstanceOf[js.Any], numFrozenRows.asInstanceOf[js.Any], numFrozenColumns.asInstanceOf[js.Any])).asInstanceOf[ScrollLeft]
  
  @scala.inline
  def measureScrollBarThickness_horizontal(element: HTMLElement, direction: horizontal): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("measureScrollBarThickness")(element.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def measureScrollBarThickness_vertical(element: HTMLElement, direction: vertical): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("measureScrollBarThickness")(element.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Double]
}
