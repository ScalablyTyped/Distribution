package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CesiumInspectorViewModel extends js.Object {
  var doFilterPrimitive: Command
  var doFilterTile: Command
  var doSuspendUpdates: Command
  var dropDownVisible: scala.Boolean
  var filterPrimitive: scala.Boolean
  var filterTile: scala.Boolean
  var frustumStatisticText: java.lang.String
  var frustums: scala.Boolean
  var generalSwitchText: java.lang.String
  var generalVisible: scala.Boolean
  var hasPickedPrimitive: scala.Boolean
  var hasPickedTile: scala.Boolean
  var performance: scala.Boolean
  var performanceContainer: stdLib.Element
  var pickPimitiveActive: scala.Boolean
  var pickPrimitive: Command
  var pickTile: Command
  var pickTileActive: scala.Boolean
  var primitive: Command
  var primitiveBoundingSphere: scala.Boolean
  var primitiveReferenceFrame: scala.Boolean
  var primitivesSwitchText: java.lang.String
  var primitivesVisible: scala.Boolean
  var scene: Scene
  var selectNE: Command
  var selectNW: Command
  var selectParent: Command
  var selectSE: Command
  var selectSW: Command
  var shaderCacheText: java.lang.String
  var showFrustums: Command
  var showPerformance: Command
  var showPrimitiveBoundingSphere: Command
  var showPrimitiveReferenceFrame: Command
  var showTileBoundingSphere: Command
  var showTileCoordinates: Command
  var showWireframe: Command
  var suspendUpdates: scala.Boolean
  var terrainSwitchText: java.lang.String
  var terrainVisible: scala.Boolean
  var tile: Command
  var tileBoundingSphere: scala.Boolean
  var tileCoordinates: scala.Boolean
  var tileText: java.lang.String
  var toggleDropDown: Command
  var toggleGeneral: Command
  var togglePrimitives: Command
  var toggleTerrain: Command
  var wireframe: scala.Boolean
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
}

object CesiumInspectorViewModel {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    doFilterPrimitive: Command,
    doFilterTile: Command,
    doSuspendUpdates: Command,
    dropDownVisible: scala.Boolean,
    filterPrimitive: scala.Boolean,
    filterTile: scala.Boolean,
    frustumStatisticText: java.lang.String,
    frustums: scala.Boolean,
    generalSwitchText: java.lang.String,
    generalVisible: scala.Boolean,
    hasPickedPrimitive: scala.Boolean,
    hasPickedTile: scala.Boolean,
    isDestroyed: js.Function0[scala.Boolean],
    performance: scala.Boolean,
    performanceContainer: stdLib.Element,
    pickPimitiveActive: scala.Boolean,
    pickPrimitive: Command,
    pickTile: Command,
    pickTileActive: scala.Boolean,
    primitive: Command,
    primitiveBoundingSphere: scala.Boolean,
    primitiveReferenceFrame: scala.Boolean,
    primitivesSwitchText: java.lang.String,
    primitivesVisible: scala.Boolean,
    scene: Scene,
    selectNE: Command,
    selectNW: Command,
    selectParent: Command,
    selectSE: Command,
    selectSW: Command,
    shaderCacheText: java.lang.String,
    showFrustums: Command,
    showPerformance: Command,
    showPrimitiveBoundingSphere: Command,
    showPrimitiveReferenceFrame: Command,
    showTileBoundingSphere: Command,
    showTileCoordinates: Command,
    showWireframe: Command,
    suspendUpdates: scala.Boolean,
    terrainSwitchText: java.lang.String,
    terrainVisible: scala.Boolean,
    tile: Command,
    tileBoundingSphere: scala.Boolean,
    tileCoordinates: scala.Boolean,
    tileText: java.lang.String,
    toggleDropDown: Command,
    toggleGeneral: Command,
    togglePrimitives: Command,
    toggleTerrain: Command,
    wireframe: scala.Boolean
  ): CesiumInspectorViewModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("doFilterPrimitive")(doFilterPrimitive)
    __obj.updateDynamic("doFilterTile")(doFilterTile)
    __obj.updateDynamic("doSuspendUpdates")(doSuspendUpdates)
    __obj.updateDynamic("dropDownVisible")(dropDownVisible)
    __obj.updateDynamic("filterPrimitive")(filterPrimitive)
    __obj.updateDynamic("filterTile")(filterTile)
    __obj.updateDynamic("frustumStatisticText")(frustumStatisticText)
    __obj.updateDynamic("frustums")(frustums)
    __obj.updateDynamic("generalSwitchText")(generalSwitchText)
    __obj.updateDynamic("generalVisible")(generalVisible)
    __obj.updateDynamic("hasPickedPrimitive")(hasPickedPrimitive)
    __obj.updateDynamic("hasPickedTile")(hasPickedTile)
    __obj.updateDynamic("isDestroyed")(isDestroyed)
    __obj.updateDynamic("performance")(performance)
    __obj.updateDynamic("performanceContainer")(performanceContainer)
    __obj.updateDynamic("pickPimitiveActive")(pickPimitiveActive)
    __obj.updateDynamic("pickPrimitive")(pickPrimitive)
    __obj.updateDynamic("pickTile")(pickTile)
    __obj.updateDynamic("pickTileActive")(pickTileActive)
    __obj.updateDynamic("primitive")(primitive)
    __obj.updateDynamic("primitiveBoundingSphere")(primitiveBoundingSphere)
    __obj.updateDynamic("primitiveReferenceFrame")(primitiveReferenceFrame)
    __obj.updateDynamic("primitivesSwitchText")(primitivesSwitchText)
    __obj.updateDynamic("primitivesVisible")(primitivesVisible)
    __obj.updateDynamic("scene")(scene)
    __obj.updateDynamic("selectNE")(selectNE)
    __obj.updateDynamic("selectNW")(selectNW)
    __obj.updateDynamic("selectParent")(selectParent)
    __obj.updateDynamic("selectSE")(selectSE)
    __obj.updateDynamic("selectSW")(selectSW)
    __obj.updateDynamic("shaderCacheText")(shaderCacheText)
    __obj.updateDynamic("showFrustums")(showFrustums)
    __obj.updateDynamic("showPerformance")(showPerformance)
    __obj.updateDynamic("showPrimitiveBoundingSphere")(showPrimitiveBoundingSphere)
    __obj.updateDynamic("showPrimitiveReferenceFrame")(showPrimitiveReferenceFrame)
    __obj.updateDynamic("showTileBoundingSphere")(showTileBoundingSphere)
    __obj.updateDynamic("showTileCoordinates")(showTileCoordinates)
    __obj.updateDynamic("showWireframe")(showWireframe)
    __obj.updateDynamic("suspendUpdates")(suspendUpdates)
    __obj.updateDynamic("terrainSwitchText")(terrainSwitchText)
    __obj.updateDynamic("terrainVisible")(terrainVisible)
    __obj.updateDynamic("tile")(tile)
    __obj.updateDynamic("tileBoundingSphere")(tileBoundingSphere)
    __obj.updateDynamic("tileCoordinates")(tileCoordinates)
    __obj.updateDynamic("tileText")(tileText)
    __obj.updateDynamic("toggleDropDown")(toggleDropDown)
    __obj.updateDynamic("toggleGeneral")(toggleGeneral)
    __obj.updateDynamic("togglePrimitives")(togglePrimitives)
    __obj.updateDynamic("toggleTerrain")(toggleTerrain)
    __obj.updateDynamic("wireframe")(wireframe)
    __obj.asInstanceOf[CesiumInspectorViewModel]
  }
}

