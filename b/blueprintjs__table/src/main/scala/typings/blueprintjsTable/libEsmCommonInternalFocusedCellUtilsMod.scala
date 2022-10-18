package typings.blueprintjsTable

import typings.blueprintjsTable.libEsmCommonCellTypesMod.CellCoordinates
import typings.blueprintjsTable.libEsmCommonCellTypesMod.FocusedCellCoordinates
import typings.blueprintjsTable.libEsmRegionsMod.IRegion
import typings.blueprintjsTable.libEsmRegionsMod.Region
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonInternalFocusedCellUtilsMod {
  
  @JSImport("@blueprintjs/table/lib/esm/common/internal/focusedCellUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def expandFocusedRegion(focusedCell: FocusedCellCoordinates, newRegion: Region): IRegion = (^.asInstanceOf[js.Dynamic].applyDynamic("expandFocusedRegion")(focusedCell.asInstanceOf[js.Any], newRegion.asInstanceOf[js.Any])).asInstanceOf[IRegion]
  
  inline def getFocusedOrLastSelectedIndex(selectedRegions: js.Array[Region]): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusedOrLastSelectedIndex")(selectedRegions.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def getFocusedOrLastSelectedIndex(selectedRegions: js.Array[Region], focusedCell: FocusedCellCoordinates): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusedOrLastSelectedIndex")(selectedRegions.asInstanceOf[js.Any], focusedCell.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def getInitialFocusedCell(
    enableFocusedCell: Boolean,
    focusedCellFromProps: Unit,
    focusedCellFromState: Unit,
    selectedRegions: js.Array[Region]
  ): js.UndefOr[FocusedCellCoordinates] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitialFocusedCell")(enableFocusedCell.asInstanceOf[js.Any], focusedCellFromProps.asInstanceOf[js.Any], focusedCellFromState.asInstanceOf[js.Any], selectedRegions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[FocusedCellCoordinates]]
  inline def getInitialFocusedCell(
    enableFocusedCell: Boolean,
    focusedCellFromProps: Unit,
    focusedCellFromState: FocusedCellCoordinates,
    selectedRegions: js.Array[Region]
  ): js.UndefOr[FocusedCellCoordinates] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitialFocusedCell")(enableFocusedCell.asInstanceOf[js.Any], focusedCellFromProps.asInstanceOf[js.Any], focusedCellFromState.asInstanceOf[js.Any], selectedRegions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[FocusedCellCoordinates]]
  inline def getInitialFocusedCell(
    enableFocusedCell: Boolean,
    focusedCellFromProps: FocusedCellCoordinates,
    focusedCellFromState: Unit,
    selectedRegions: js.Array[Region]
  ): js.UndefOr[FocusedCellCoordinates] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitialFocusedCell")(enableFocusedCell.asInstanceOf[js.Any], focusedCellFromProps.asInstanceOf[js.Any], focusedCellFromState.asInstanceOf[js.Any], selectedRegions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[FocusedCellCoordinates]]
  inline def getInitialFocusedCell(
    enableFocusedCell: Boolean,
    focusedCellFromProps: FocusedCellCoordinates,
    focusedCellFromState: FocusedCellCoordinates,
    selectedRegions: js.Array[Region]
  ): js.UndefOr[FocusedCellCoordinates] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitialFocusedCell")(enableFocusedCell.asInstanceOf[js.Any], focusedCellFromProps.asInstanceOf[js.Any], focusedCellFromState.asInstanceOf[js.Any], selectedRegions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[FocusedCellCoordinates]]
  
  inline def isFocusedCellAtRegionBottom(region: Region, focusedCell: FocusedCellCoordinates): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFocusedCellAtRegionBottom")(region.asInstanceOf[js.Any], focusedCell.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isFocusedCellAtRegionLeft(region: Region, focusedCell: FocusedCellCoordinates): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFocusedCellAtRegionLeft")(region.asInstanceOf[js.Any], focusedCell.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isFocusedCellAtRegionRight(region: Region, focusedCell: FocusedCellCoordinates): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFocusedCellAtRegionRight")(region.asInstanceOf[js.Any], focusedCell.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isFocusedCellAtRegionTop(region: Region, focusedCell: FocusedCellCoordinates): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFocusedCellAtRegionTop")(region.asInstanceOf[js.Any], focusedCell.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def toFullCoordinates(cellCoords: CellCoordinates): FocusedCellCoordinates = ^.asInstanceOf[js.Dynamic].applyDynamic("toFullCoordinates")(cellCoords.asInstanceOf[js.Any]).asInstanceOf[FocusedCellCoordinates]
  inline def toFullCoordinates(cellCoords: CellCoordinates, focusSelectionIndex: Double): FocusedCellCoordinates = (^.asInstanceOf[js.Dynamic].applyDynamic("toFullCoordinates")(cellCoords.asInstanceOf[js.Any], focusSelectionIndex.asInstanceOf[js.Any])).asInstanceOf[FocusedCellCoordinates]
}
