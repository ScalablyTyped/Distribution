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
    val __obj = js.Dynamic.literal(destroy = destroy, doFilterPrimitive = doFilterPrimitive, doFilterTile = doFilterTile, doSuspendUpdates = doSuspendUpdates, dropDownVisible = dropDownVisible, filterPrimitive = filterPrimitive, filterTile = filterTile, frustumStatisticText = frustumStatisticText, frustums = frustums, generalSwitchText = generalSwitchText, generalVisible = generalVisible, hasPickedPrimitive = hasPickedPrimitive, hasPickedTile = hasPickedTile, isDestroyed = isDestroyed, performance = performance, performanceContainer = performanceContainer, pickPimitiveActive = pickPimitiveActive, pickPrimitive = pickPrimitive, pickTile = pickTile, pickTileActive = pickTileActive, primitive = primitive, primitiveBoundingSphere = primitiveBoundingSphere, primitiveReferenceFrame = primitiveReferenceFrame, primitivesSwitchText = primitivesSwitchText, primitivesVisible = primitivesVisible, scene = scene, selectNE = selectNE, selectNW = selectNW, selectParent = selectParent, selectSE = selectSE, selectSW = selectSW, shaderCacheText = shaderCacheText, showFrustums = showFrustums, showPerformance = showPerformance, showPrimitiveBoundingSphere = showPrimitiveBoundingSphere, showPrimitiveReferenceFrame = showPrimitiveReferenceFrame, showTileBoundingSphere = showTileBoundingSphere, showTileCoordinates = showTileCoordinates, showWireframe = showWireframe, suspendUpdates = suspendUpdates, terrainSwitchText = terrainSwitchText, terrainVisible = terrainVisible, tile = tile, tileBoundingSphere = tileBoundingSphere, tileCoordinates = tileCoordinates, tileText = tileText, toggleDropDown = toggleDropDown, toggleGeneral = toggleGeneral, togglePrimitives = togglePrimitives, toggleTerrain = toggleTerrain, wireframe = wireframe)
  
    __obj.asInstanceOf[CesiumInspectorViewModel]
  }
}

