package typings.blueprintjsTable

import typings.blueprintjsTable.commonCellMod.ICellCoordinates
import typings.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typings.blueprintjsTable.esmRegionsMod.IRegion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusedCellUtilsMod {
  
  @JSImport("@blueprintjs/table/lib/esm/common/internal/focusedCellUtils", "expandFocusedRegion")
  @js.native
  def expandFocusedRegion(focusedCell: IFocusedCellCoordinates, newRegion: IRegion): IRegion = js.native
  
  @JSImport("@blueprintjs/table/lib/esm/common/internal/focusedCellUtils", "getFocusedOrLastSelectedIndex")
  @js.native
  def getFocusedOrLastSelectedIndex(selectedRegions: js.Array[IRegion]): Double = js.native
  @JSImport("@blueprintjs/table/lib/esm/common/internal/focusedCellUtils", "getFocusedOrLastSelectedIndex")
  @js.native
  def getFocusedOrLastSelectedIndex(selectedRegions: js.Array[IRegion], focusedCell: IFocusedCellCoordinates): Double = js.native
  
  @JSImport("@blueprintjs/table/lib/esm/common/internal/focusedCellUtils", "getInitialFocusedCell")
  @js.native
  def getInitialFocusedCell(
    enableFocusedCell: Boolean,
    focusedCellFromProps: IFocusedCellCoordinates,
    focusedCellFromState: IFocusedCellCoordinates,
    selectedRegions: js.Array[IRegion]
  ): IFocusedCellCoordinates = js.native
  
  @JSImport("@blueprintjs/table/lib/esm/common/internal/focusedCellUtils", "isFocusedCellAtRegionBottom")
  @js.native
  def isFocusedCellAtRegionBottom(region: IRegion, focusedCell: IFocusedCellCoordinates): Boolean = js.native
  
  @JSImport("@blueprintjs/table/lib/esm/common/internal/focusedCellUtils", "isFocusedCellAtRegionLeft")
  @js.native
  def isFocusedCellAtRegionLeft(region: IRegion, focusedCell: IFocusedCellCoordinates): Boolean = js.native
  
  @JSImport("@blueprintjs/table/lib/esm/common/internal/focusedCellUtils", "isFocusedCellAtRegionRight")
  @js.native
  def isFocusedCellAtRegionRight(region: IRegion, focusedCell: IFocusedCellCoordinates): Boolean = js.native
  
  @JSImport("@blueprintjs/table/lib/esm/common/internal/focusedCellUtils", "isFocusedCellAtRegionTop")
  @js.native
  def isFocusedCellAtRegionTop(region: IRegion, focusedCell: IFocusedCellCoordinates): Boolean = js.native
  
  @JSImport("@blueprintjs/table/lib/esm/common/internal/focusedCellUtils", "toFullCoordinates")
  @js.native
  def toFullCoordinates(cellCoords: ICellCoordinates): IFocusedCellCoordinates = js.native
  @JSImport("@blueprintjs/table/lib/esm/common/internal/focusedCellUtils", "toFullCoordinates")
  @js.native
  def toFullCoordinates(cellCoords: ICellCoordinates, focusSelectionIndex: Double): IFocusedCellCoordinates = js.native
}
