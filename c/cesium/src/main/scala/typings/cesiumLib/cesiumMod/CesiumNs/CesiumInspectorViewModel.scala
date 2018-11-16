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

