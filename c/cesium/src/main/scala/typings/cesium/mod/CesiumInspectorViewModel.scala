package typings.cesium.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CesiumInspectorViewModel")
@js.native
class CesiumInspectorViewModel protected () extends StObject {
  def this(scene: Scene) = this()
  
  def destroy(): Unit = js.native
  
  var doFilterPrimitive: Command = js.native
  
  var doFilterTile: Command = js.native
  
  var doSuspendUpdates: Command = js.native
  
  var dropDownVisible: Boolean = js.native
  
  var filterPrimitive: Boolean = js.native
  
  var filterTile: Boolean = js.native
  
  var frustumStatisticText: String = js.native
  
  var frustums: Boolean = js.native
  
  var generalSwitchText: String = js.native
  
  var generalVisible: Boolean = js.native
  
  var hasPickedPrimitive: Boolean = js.native
  
  var hasPickedTile: Boolean = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var performance: Boolean = js.native
  
  var performanceContainer: Element = js.native
  
  var pickPimitiveActive: Boolean = js.native
  
  var pickPrimitive: Command = js.native
  
  var pickTile: Command = js.native
  
  var pickTileActive: Boolean = js.native
  
  var primitive: Command = js.native
  
  var primitiveBoundingSphere: Boolean = js.native
  
  var primitiveReferenceFrame: Boolean = js.native
  
  var primitivesSwitchText: String = js.native
  
  var primitivesVisible: Boolean = js.native
  
  var scene: Scene = js.native
  
  var selectNE: Command = js.native
  
  var selectNW: Command = js.native
  
  var selectParent: Command = js.native
  
  var selectSE: Command = js.native
  
  var selectSW: Command = js.native
  
  var shaderCacheText: String = js.native
  
  var showFrustums: Command = js.native
  
  var showPerformance: Command = js.native
  
  var showPrimitiveBoundingSphere: Command = js.native
  
  var showPrimitiveReferenceFrame: Command = js.native
  
  var showTileBoundingSphere: Command = js.native
  
  var showTileCoordinates: Command = js.native
  
  var showWireframe: Command = js.native
  
  var suspendUpdates: Boolean = js.native
  
  var terrainSwitchText: String = js.native
  
  var terrainVisible: Boolean = js.native
  
  var tile: Command = js.native
  
  var tileBoundingSphere: Boolean = js.native
  
  var tileCoordinates: Boolean = js.native
  
  var tileText: String = js.native
  
  var toggleDropDown: Command = js.native
  
  var toggleGeneral: Command = js.native
  
  var togglePrimitives: Command = js.native
  
  var toggleTerrain: Command = js.native
  
  var wireframe: Boolean = js.native
}
