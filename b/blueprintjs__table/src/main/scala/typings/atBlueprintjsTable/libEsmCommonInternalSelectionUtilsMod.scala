package typings.atBlueprintjsTable

import typings.atBlueprintjsTable.libEsmCommonCellMod.IFocusedCellCoordinates
import typings.atBlueprintjsTable.libEsmCommonDirectionMod.Direction
import typings.atBlueprintjsTable.libEsmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/common/internal/selectionUtils", JSImport.Namespace)
@js.native
object libEsmCommonInternalSelectionUtilsMod extends js.Object {
  def resizeRegion(region: IRegion, direction: Direction): IRegion = js.native
  def resizeRegion(region: IRegion, direction: Direction, focusedCell: IFocusedCellCoordinates): IRegion = js.native
}

