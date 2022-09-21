package typings.blueprintjsTable

import typings.blueprintjsTable.cellTypesMod.FocusedCellCoordinates
import typings.blueprintjsTable.directionMod.Direction
import typings.blueprintjsTable.esmRegionsMod.IRegion
import typings.blueprintjsTable.esmRegionsMod.Region
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionUtilsMod {
  
  @JSImport("@blueprintjs/table/lib/esm/common/internal/selectionUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resizeRegion(region: Region, direction: Direction): IRegion = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeRegion")(region.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[IRegion]
  inline def resizeRegion(region: Region, direction: Direction, focusedCell: FocusedCellCoordinates): IRegion = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeRegion")(region.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], focusedCell.asInstanceOf[js.Any])).asInstanceOf[IRegion]
}
