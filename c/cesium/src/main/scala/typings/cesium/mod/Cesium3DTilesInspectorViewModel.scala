package typings.cesium.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Cesium3DTilesInspectorViewModel")
@js.native
open class Cesium3DTilesInspectorViewModel protected () extends StObject {
  def this(scene: Scene, performanceContainer: HTMLElement) = this()
  
  /**
    * Gets or sets the base resolution.  This property is observable.
    */
  var baseResolution: Double = js.native
  
  /**
    * Gets or sets the screen space error that must be reached before skipping levels of detail. This property is observable.
    */
  var baseScreenSpaceError: Double = js.native
  
  /**
    * Gets or sets the color blend mode.  This property is observable.
    */
  var colorBlendMode: Cesium3DTileColorBlendMode = js.native
  
  /**
    * Gets the available blend modes
    */
  val colorBlendModes: js.Array[js.Object] = js.native
  
  /**
    * Gets or sets the flag to colorize tiles.  This property is observable.
    */
  var colorize: Boolean = js.native
  
  /**
    * Compiles the style in the style editor.
    */
  def compileStyle(): Unit = js.native
  
  /**
    * Destroys the widget.  Should be called if permanently
    * removing the widget from layout.
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets or sets the flag to show the display section.  This property is observable.
    */
  var displayVisible: Boolean = js.native
  
  /**
    * Gets or sets the flag to enable dynamic screen space error.  This property is observable.
    */
  var dynamicScreenSpaceError: Boolean = js.native
  
  /**
    * Gets or sets the dynamic screen space error density.  This property is observable.
    */
  var dynamicScreenSpaceErrorDensity: Double = js.native
  
  /**
    * Gets or sets the dynamic screen space error density slider value.
    * This allows the slider to be exponential because values tend to be closer to 0 than 1.
    * This property is observable.
    */
  var dynamicScreenSpaceErrorDensitySliderValue: Double = js.native
  
  /**
    * Gets or sets the dynamic screen space error factor.  This property is observable.
    */
  var dynamicScreenSpaceErrorFactor: Double = js.native
  
  /**
    * Gets the editor error message
    */
  val editorError: String = js.native
  
  /**
    * Gets or sets the flag to enable eye dome lighting. This property is observable.
    */
  var eyeDomeLighting: Boolean = js.native
  
  /**
    * Gets or sets the eye dome lighting radius.  This property is observable.
    */
  var eyeDomeLightingRadius: Double = js.native
  
  /**
    * Gets or sets the eye dome lighting strength.  This property is observable.
    */
  var eyeDomeLightingStrength: Double = js.native
  
  /**
    * Gets the current feature of the view model.
    */
  var feature: Cesium3DTileFeature = js.native
  
  /**
    * Gets or sets the flag to suspend updates.  This property is observable.
    */
  var freezeFrame: Boolean = js.native
  
  /**
    * Gets or sets the geometric error scale.  This property is observable.
    */
  var geometricErrorScale: Double = js.native
  
  /**
    * Gets or sets the JSON for the tileset enableDebugWireframe attribute.  This property is observable.
    */
  var hasEnabledWireframe: Boolean = js.native
  
  /**
    * Gets or sets the flag which, when true, only tiles that meet the maximum screen space error will ever be downloaded.
    * This property is observable.
    */
  var immediatelyLoadDesiredLevelOfDetail: Boolean = js.native
  
  /**
    * Gets or sets the flag to show the inspector.  This property is observable.
    */
  var inspectorVisible: Boolean = js.native
  
  /**
    * @returns true if the object has been destroyed, false otherwise.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets or sets the flag which determines whether siblings of visible tiles are always downloaded during traversal.
    * This property is observable
    */
  var loadSiblings: Boolean = js.native
  
  /**
    * Gets or sets the flag to show the logging section.  This property is observable.
    */
  var loggingVisible: Boolean = js.native
  
  /**
    * Gets or sets the maximum attenuation.  This property is observable.
    */
  var maximumAttenuation: Double = js.native
  
  /**
    * Gets or sets the maximum screen space error.  This property is observable.
    */
  var maximumScreenSpaceError: Double = js.native
  
  /**
    * Gets or sets the flag to show the optimization info section. This property is observable.
    */
  var optimizationVisible: Boolean = js.native
  
  /**
    * Gets or sets the flag to enable performance display.  This property is observable.
    */
  var performance: Boolean = js.native
  
  /**
    * Gets the performance container
    */
  val performanceContainer: HTMLElement = js.native
  
  /**
    * Gets or sets the pick state
    */
  var pickActive: Boolean = js.native
  
  /**
    * Gets the pick statistics text.  This property is observable.
    */
  val pickStatisticsText: String = js.native
  
  /**
    * Gets or sets the flag to enable picking.  This property is observable.
    */
  var picking: Boolean = js.native
  
  /**
    * Gets or sets the flag to enable point cloud shading. This property is observable.
    */
  var pointCloudShading: Boolean = js.native
  
  /**
    * Gets the names of the properties in the tileset.  This property is observable.
    */
  val properties: js.Array[String] = js.native
  
  /**
    * Gets the resource cache statistics text. This property is observable.
    */
  val resourceCacheStatisticsText: String = js.native
  
  /**
    * Gets the scene
    */
  val scene: Scene = js.native
  
  /**
    * Gets or sets the flag to show bounding volumes.  This property is observable.
    */
  var showBoundingVolumes: Boolean = js.native
  
  /**
    * Gets or sets the flag to show content volumes.  This property is observable.
    */
  var showContentBoundingVolumes: Boolean = js.native
  
  /**
    * Gets or sets the flag to show tile geometric error.  This property is observable.
    */
  var showGeometricError: Boolean = js.native
  
  /**
    * Displays the memory used per tile.  This property is observable.
    */
  var showMemoryUsage: Boolean = js.native
  
  /**
    * Gets or sets the flag to show debug labels only for the currently picked tile.  This property is observable.
    */
  var showOnlyPickedTileDebugLabel: Boolean = js.native
  
  /**
    * Gets or sets the flag to show pick statistics.  This property is observable.
    */
  var showPickStatistics: Boolean = js.native
  
  /**
    * Displays the number of commands, points, triangles and features used per tile.  This property is observable.
    */
  var showRenderingStatistics: Boolean = js.native
  
  /**
    * Gets or sets the flag to show request volumes.  This property is observable.
    */
  var showRequestVolumes: Boolean = js.native
  
  /**
    * Gets or sets the flag to show resource cache statistics. This property is
    * observable.
    */
  var showResourceCacheStatistics: Boolean = js.native
  
  /**
    * Gets or sets the flag to show statistics.  This property is observable.
    */
  var showStatistics: Boolean = js.native
  
  /**
    * Gets or sets the flag to show the tile url.  This property is observable.
    */
  var showUrl: Boolean = js.native
  
  /**
    * Gets or sets the flag to determine if level of detail skipping should be applied during the traversal.
    * This property is observable.
    */
  var skipLevelOfDetail: Boolean = js.native
  
  /**
    * Gets or sets the constant defining the minimum number of levels to skip when loading tiles. This property is observable.
    */
  var skipLevels: Double = js.native
  
  /**
    * Gets or sets the multiplier defining the minimum screen space error to skip. This property is observable.
    */
  var skipScreenSpaceErrorFactor: Double = js.native
  
  /**
    * Gets the statistics text.  This property is observable.
    */
  val statisticsText: String = js.native
  
  /**
    * Handles key press events on the style editor.
    */
  def styleEditorKeyPress(): Unit = js.native
  
  /**
    * Gets or sets the JSON for the tileset style.  This property is observable.
    */
  var styleString: String = js.native
  
  /**
    * Gets or sets the flag to show the style section.  This property is observable.
    */
  var styleVisible: Boolean = js.native
  
  /**
    * Gets the current tile of the view model
    */
  var tile: Cesium3DTile = js.native
  
  /**
    * Gets or sets the flag to show the tile info section.  This property is observable.
    */
  var tileDebugLabelsVisible: Boolean = js.native
  
  /**
    * Gets or sets the tileset of the view model.
    */
  var tileset: Cesium3DTileset = js.native
  
  /**
    * Gets or sets the flag to show the tileset section.  This property is observable.
    */
  var tilesetVisible: Boolean = js.native
  
  /**
    * Toggles the visibility of the display section
    */
  def toggleDisplay(): Unit = js.native
  
  /**
    * Toggles the inspector visibility
    */
  def toggleInspector(): Unit = js.native
  
  /**
    * Toggles the visibility of the logging section
    */
  def toggleLogging(): Unit = js.native
  
  /**
    * Toggles the visibility of the optimization section
    */
  def toggleOptimization(): Unit = js.native
  
  /**
    * Toggles the pick tileset mode
    */
  def togglePickTileset(): Unit = js.native
  
  /**
    * Toggles the visibility of the style section
    */
  def toggleStyle(): Unit = js.native
  
  /**
    * Toggles the visibility of the tile Debug Info section
    */
  def toggleTileDebugLabels(): Unit = js.native
  
  /**
    * Toggles the visibility of the tileset section
    */
  def toggleTileset(): Unit = js.native
  
  /**
    * Toggles the visibility of the update section
    */
  def toggleUpdate(): Unit = js.native
  
  /**
    * Trims tile cache
    */
  def trimTilesCache(): Unit = js.native
  
  /**
    * Gets or sets the flag to show the update section.  This property is observable.
    */
  var updateVisible: Boolean = js.native
  
  /**
    * Gets or sets the flag to draw with wireframe.  This property is observable.
    */
  var wireframe: Boolean = js.native
}
/* static members */
object Cesium3DTilesInspectorViewModel {
  
  @JSImport("cesium", "Cesium3DTilesInspectorViewModel")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Generates an HTML string of the statistics
    * @param tileset - The tileset
    * @param isPick - Whether this is getting the statistics for the pick pass
    * @returns The formatted statistics
    */
  inline def getStatistics(tileset: Cesium3DTileset, isPick: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStatistics")(tileset.asInstanceOf[js.Any], isPick.asInstanceOf[js.Any])).asInstanceOf[String]
}
