package typings.cesium.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CesiumInspectorViewModel")
@js.native
open class CesiumInspectorViewModel protected () extends StObject {
  def this(scene: Scene, performanceContainer: Element) = this()
  
  /**
    * Gets the command to decrement the depth frustum index to be shown
    */
  var decrementDepthFrustum: Command = js.native
  
  /**
    * Gets or sets the index of the depth frustum to display.  This property is observable.
    */
  var depthFrustum: Double = js.native
  
  /**
    * Gets or sets the index of the depth frustum text.  This property is observable.
    */
  var depthFrustumText: String = js.native
  
  /**
    * Destroys the widget.  Should be called if permanently
    * removing the widget from layout.
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets the command to toggle a filter that renders only a selected primitive
    */
  var doFilterPrimitive: Command = js.native
  
  /**
    * Gets the command to toggle a filter that renders only a selected tile
    */
  var doFilterTile: Command = js.native
  
  /**
    * Gets or sets if the cesium inspector drop down is visible.  This property is observable.
    */
  var dropDownVisible: Boolean = js.native
  
  /**
    * Gets or sets the filter primitive state.  This property is observable.
    */
  var filterPrimitive: Boolean = js.native
  
  /**
    * Gets or sets the filter tile state.  This property is observable.
    */
  var filterTile: Boolean = js.native
  
  /**
    * Gets or sets the show frustum planes state.  This property is observable.
    */
  var frustumPlanes: Boolean = js.native
  
  /**
    * Gets or sets the frustum statistic text.  This property is observable.
    */
  var frustumStatisticText: String = js.native
  
  /**
    * Gets or sets the show frustums state.  This property is observable.
    */
  var frustums: Boolean = js.native
  
  /**
    * Gets or sets if the general section is visible.  This property is observable.
    */
  var generalVisible: Boolean = js.native
  
  /**
    * Gets if a primitive has been selected.  This property is observable.
    */
  var hasPickedPrimitive: Boolean = js.native
  
  /**
    * Gets if a tile has been selected.  This property is observable
    */
  var hasPickedTile: Boolean = js.native
  
  /**
    * Gets the command to increment the depth frustum index to be shown
    */
  var incrementDepthFrustum: Command = js.native
  
  /**
    * @returns true if the object has been destroyed, false otherwise.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets or sets the show performance display state.  This property is observable.
    */
  var performance: Boolean = js.native
  
  /**
    * Gets the container of the PerformanceDisplay
    */
  var performanceContainer: Element = js.native
  
  /**
    * Gets the command to pick a primitive
    */
  var pickPrimitive: Command = js.native
  
  /**
    * Gets if the picking primitive command is active.  This property is observable.
    */
  var pickPrimitiveActive: Boolean = js.native
  
  /**
    * Gets the command to pick a tile
    */
  var pickTile: Command = js.native
  
  /**
    * Gets if the picking tile command is active.  This property is observable.
    */
  var pickTileActive: Boolean = js.native
  
  /**
    * Gets or sets the current selected primitive
    */
  var primitive: Command = js.native
  
  /**
    * Gets or sets the show primitive bounding sphere state.  This property is observable.
    */
  var primitiveBoundingSphere: Boolean = js.native
  
  /**
    * Gets or sets the show primitive reference frame state.  This property is observable.
    */
  var primitiveReferenceFrame: Boolean = js.native
  
  /**
    * Gets or sets if the primitive section is visible.  This property is observable.
    */
  var primitivesVisible: Boolean = js.native
  
  /**
    * Gets the scene to control.
    */
  var scene: Scene = js.native
  
  /**
    * Gets the command to pick a tile
    */
  var selectNE: Command = js.native
  
  /**
    * Gets the command to pick a tile
    */
  var selectNW: Command = js.native
  
  /**
    * Gets the command to pick a tile
    */
  var selectParent: Command = js.native
  
  /**
    * Gets the command to pick a tile
    */
  var selectSE: Command = js.native
  
  /**
    * Gets the command to pick a tile
    */
  var selectSW: Command = js.native
  
  /**
    * Gets or sets the shader cache text.  This property is observable.
    */
  var shaderCacheText: String = js.native
  
  /**
    * Gets the command to toggle the visibility of a BoundingSphere for a primitive
    */
  var showPrimitiveBoundingSphere: Command = js.native
  
  /**
    * Gets the command to toggle the visibility of a {@link DebugModelMatrixPrimitive} for the model matrix of a primitive
    */
  var showPrimitiveReferenceFrame: Command = js.native
  
  /**
    * Gets the command to toggle the visibility of a BoundingSphere for a selected tile
    */
  var showTileBoundingSphere: Command = js.native
  
  /**
    * Gets the command to toggle the visibility of tile coordinates
    */
  var showTileCoordinates: Command = js.native
  
  /**
    * Gets or sets the suspend updates state.  This property is observable.
    */
  var suspendUpdates: Boolean = js.native
  
  /**
    * Gets or sets if the terrain section is visible.  This property is observable.
    */
  var terrainVisible: Boolean = js.native
  
  /**
    * Gets or sets the current selected tile
    */
  var tile: Command = js.native
  
  /**
    * Gets or sets the show tile bounding sphere state.  This property is observable.
    */
  var tileBoundingSphere: Boolean = js.native
  
  /**
    * Gets or sets the show tile coordinates state.  This property is observable.
    */
  var tileCoordinates: Boolean = js.native
  
  /**
    * Gets or sets the selected tile information text.  This property is observable.
    */
  var tileText: String = js.native
  
  /**
    * Gets the command to toggle the visibility of the drop down.
    */
  var toggleDropDown: Command = js.native
  
  /**
    * Gets the command to expand and collapse the general section
    */
  var toggleGeneral: Command = js.native
  
  /**
    * Gets the command to expand and collapse the primitives section
    */
  var togglePrimitives: Command = js.native
  
  /**
    * Gets the command to expand and collapse the terrain section
    */
  var toggleTerrain: Command = js.native
  
  /**
    * Gets or sets the show wireframe state.  This property is observable.
    */
  var wireframe: Boolean = js.native
}
