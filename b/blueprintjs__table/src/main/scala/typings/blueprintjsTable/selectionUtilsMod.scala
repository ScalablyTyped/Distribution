package typings.blueprintjsTable

import typings.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typings.blueprintjsTable.directionMod.Direction
import typings.blueprintjsTable.esmRegionsMod.IRegion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionUtilsMod {
  
  @JSImport("@blueprintjs/table/lib/esm/common/internal/selectionUtils", "resizeRegion")
  @js.native
  def resizeRegion(region: IRegion, direction: Direction): IRegion = js.native
  @JSImport("@blueprintjs/table/lib/esm/common/internal/selectionUtils", "resizeRegion")
  @js.native
  def resizeRegion(region: IRegion, direction: Direction, focusedCell: IFocusedCellCoordinates): IRegion = js.native
}
