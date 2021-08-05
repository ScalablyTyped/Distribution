package typings.blueprintjsTable

import typings.blueprintjsTable.commonCellMod.ICellCoordinates
import typings.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typings.blueprintjsTable.esmRegionsMod.IRegion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusedCellUtilsMod {
  
  @JSImport("@blueprintjs/table/lib/esm/common/internal/focusedCellUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def expandFocusedRegion(focusedCell: IFocusedCellCoordinates, newRegion: IRegion): IRegion = (^.asInstanceOf[js.Dynamic].applyDynamic("expandFocusedRegion")(focusedCell.asInstanceOf[js.Any], newRegion.asInstanceOf[js.Any])).asInstanceOf[IRegion]
  
  inline def getFocusedOrLastSelectedIndex(selectedRegions: js.Array[IRegion]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusedOrLastSelectedIndex")(selectedRegions.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getFocusedOrLastSelectedIndex(selectedRegions: js.Array[IRegion], focusedCell: IFocusedCellCoordinates): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusedOrLastSelectedIndex")(selectedRegions.asInstanceOf[js.Any], focusedCell.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getInitialFocusedCell(
    enableFocusedCell: Boolean,
    focusedCellFromProps: IFocusedCellCoordinates,
    focusedCellFromState: IFocusedCellCoordinates,
    selectedRegions: js.Array[IRegion]
  ): IFocusedCellCoordinates = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitialFocusedCell")(enableFocusedCell.asInstanceOf[js.Any], focusedCellFromProps.asInstanceOf[js.Any], focusedCellFromState.asInstanceOf[js.Any], selectedRegions.asInstanceOf[js.Any])).asInstanceOf[IFocusedCellCoordinates]
  
  inline def isFocusedCellAtRegionBottom(region: IRegion, focusedCell: IFocusedCellCoordinates): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFocusedCellAtRegionBottom")(region.asInstanceOf[js.Any], focusedCell.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isFocusedCellAtRegionLeft(region: IRegion, focusedCell: IFocusedCellCoordinates): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFocusedCellAtRegionLeft")(region.asInstanceOf[js.Any], focusedCell.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isFocusedCellAtRegionRight(region: IRegion, focusedCell: IFocusedCellCoordinates): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFocusedCellAtRegionRight")(region.asInstanceOf[js.Any], focusedCell.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isFocusedCellAtRegionTop(region: IRegion, focusedCell: IFocusedCellCoordinates): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFocusedCellAtRegionTop")(region.asInstanceOf[js.Any], focusedCell.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def toFullCoordinates(cellCoords: ICellCoordinates): IFocusedCellCoordinates = ^.asInstanceOf[js.Dynamic].applyDynamic("toFullCoordinates")(cellCoords.asInstanceOf[js.Any]).asInstanceOf[IFocusedCellCoordinates]
  inline def toFullCoordinates(cellCoords: ICellCoordinates, focusSelectionIndex: Double): IFocusedCellCoordinates = (^.asInstanceOf[js.Dynamic].applyDynamic("toFullCoordinates")(cellCoords.asInstanceOf[js.Any], focusSelectionIndex.asInstanceOf[js.Any])).asInstanceOf[IFocusedCellCoordinates]
}
