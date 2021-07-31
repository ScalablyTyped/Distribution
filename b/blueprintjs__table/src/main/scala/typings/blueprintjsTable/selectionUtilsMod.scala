package typings.blueprintjsTable

import typings.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typings.blueprintjsTable.directionMod.Direction
import typings.blueprintjsTable.esmRegionsMod.IRegion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionUtilsMod {
  
  @JSImport("@blueprintjs/table/lib/esm/common/internal/selectionUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def resizeRegion(region: IRegion, direction: Direction): IRegion = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeRegion")(region.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[IRegion]
  @scala.inline
  def resizeRegion(region: IRegion, direction: Direction, focusedCell: IFocusedCellCoordinates): IRegion = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeRegion")(region.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], focusedCell.asInstanceOf[js.Any])).asInstanceOf[IRegion]
}
