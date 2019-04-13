package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CesiumInspectorViewModel")
@js.native
class CesiumInspectorViewModel protected () extends js.Object {
  def this(scene: Scene) = this()
  var doFilterPrimitive: Command = js.native
  var doFilterTile: Command = js.native
  var doSuspendUpdates: Command = js.native
  var dropDownVisible: scala.Boolean = js.native
  var filterPrimitive: scala.Boolean = js.native
  var filterTile: scala.Boolean = js.native
  var frustumStatisticText: java.lang.String = js.native
  var frustums: scala.Boolean = js.native
  var generalSwitchText: java.lang.String = js.native
  var generalVisible: scala.Boolean = js.native
  var hasPickedPrimitive: scala.Boolean = js.native
  var hasPickedTile: scala.Boolean = js.native
  var performance: scala.Boolean = js.native
  var performanceContainer: stdLib.Element = js.native
  var pickPimitiveActive: scala.Boolean = js.native
  var pickPrimitive: Command = js.native
  var pickTile: Command = js.native
  var pickTileActive: scala.Boolean = js.native
  var primitive: Command = js.native
  var primitiveBoundingSphere: scala.Boolean = js.native
  var primitiveReferenceFrame: scala.Boolean = js.native
  var primitivesSwitchText: java.lang.String = js.native
  var primitivesVisible: scala.Boolean = js.native
  var scene: Scene = js.native
  var selectNE: Command = js.native
  var selectNW: Command = js.native
  var selectParent: Command = js.native
  var selectSE: Command = js.native
  var selectSW: Command = js.native
  var shaderCacheText: java.lang.String = js.native
  var showFrustums: Command = js.native
  var showPerformance: Command = js.native
  var showPrimitiveBoundingSphere: Command = js.native
  var showPrimitiveReferenceFrame: Command = js.native
  var showTileBoundingSphere: Command = js.native
  var showTileCoordinates: Command = js.native
  var showWireframe: Command = js.native
  var suspendUpdates: scala.Boolean = js.native
  var terrainSwitchText: java.lang.String = js.native
  var terrainVisible: scala.Boolean = js.native
  var tile: Command = js.native
  var tileBoundingSphere: scala.Boolean = js.native
  var tileCoordinates: scala.Boolean = js.native
  var tileText: java.lang.String = js.native
  var toggleDropDown: Command = js.native
  var toggleGeneral: Command = js.native
  var togglePrimitives: Command = js.native
  var toggleTerrain: Command = js.native
  var wireframe: scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
}

