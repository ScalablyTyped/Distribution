package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Scene")
@js.native
class Scene () extends js.Object {
  def this(options: cesiumLib.Anon_Canvas) = this()
  var backgroundColor: Color = js.native
  val camera: Camera = js.native
  val canvas: stdLib.Element = js.native
  var completeMorphOnUserInput: scala.Boolean = js.native
  val debugFrustumStatistics: js.Any = js.native
  var debugShowCommands: scala.Boolean = js.native
  var debugShowDepthFrustum: scala.Double = js.native
  var debugShowFramesPerSecond: scala.Boolean = js.native
  var debugShowFrustumPlanes: scala.Boolean = js.native
  var debugShowFrustums: scala.Boolean = js.native
  val drawingBufferHeight: scala.Double = js.native
  val drawingBufferWidth: scala.Double = js.native
  var eyeSeparation: scala.Double = js.native
  var farToNearRatio: scala.Double = js.native
  var focalLength: scala.Double = js.native
  var fog: Fog = js.native
  var fxaa: scala.Boolean = js.native
  var globe: Globe = js.native
  val groundPrimitives: PrimitiveCollection = js.native
  var highDynamicRange: scala.Boolean = js.native
  var highDynamicRangeSupported: scala.Boolean = js.native
  val id: java.lang.String = js.native
  val imageryLayers: ImageryLayerCollection = js.native
  var imagerySplitPosition: scala.Double = js.native
  var invertClassification: scala.Boolean = js.native
  var invertClassificationColor: Color = js.native
  val lastRenderTime: JulianDate = js.native
  var logarithmicDepthFarToNearRatio: scala.Double = js.native
  var mapMode2D: scala.Boolean = js.native
  val mapProjection: MapProjection = js.native
  val maximumAliasedLineWidth: scala.Double = js.native
  val maximumCubeMapSize: scala.Double = js.native
  var maximumRenderTimeChange: scala.Double = js.native
  var minimumDisableDepthTestDistance: scala.Double = js.native
  var mode: SceneMode = js.native
  var moon: js.UndefOr[Moon] = js.native
  var morphComplete: Event[js.Array[_]] = js.native
  var morphStart: Event[js.Array[_]] = js.native
  var morphTime: scala.Double = js.native
  var nearToFarDistance2D: scala.Double = js.native
  val orderIndependentTranslucency: scala.Boolean = js.native
  val pickPositionSupported: scala.Boolean = js.native
  var pickTranslucentDepth: scala.Boolean = js.native
  var postProcessStages: PostProcessStageCollection = js.native
  val postRender: Event[js.Array[_]] = js.native
  val preRender: Event[js.Array[_]] = js.native
  val preUpdate: Event[js.Array[_]] = js.native
  val primitives: PrimitiveCollection = js.native
  val renderError: Event[js.Array[_]] = js.native
  var requestRenderMode: scala.Boolean = js.native
  var rethrowRenderErrors: scala.Boolean = js.native
  val scene3DOnly: scala.Boolean = js.native
  val screenSpaceCameraController: ScreenSpaceCameraController = js.native
  var shadowMap: ShadowMap = js.native
  var skyAtmosphere: js.UndefOr[SkyAtmosphere] = js.native
  var skyBox: js.UndefOr[SkyBox] = js.native
  var sun: js.UndefOr[Sun] = js.native
  var sunBloom: scala.Boolean = js.native
  var terrainExaggeration: scala.Double = js.native
  var terrainProvider: TerrainProvider = js.native
  val terrainProviderChanged: Event[js.Array[_]] = js.native
  var useDepthPicking: scala.Boolean = js.native
  var useWebVR: scala.Boolean = js.native
  def cartesianToCanvasCoordinates(position: Cartesian3): Cartesian2 = js.native
  def cartesianToCanvasCoordinates(position: Cartesian3, result: Cartesian2): Cartesian2 = js.native
  def completeMorph(): scala.Unit = js.native
  def debugCommandFilter(command: js.Any): scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  def drillPick(windowPosition: Cartesian2): js.Array[_] = js.native
  def drillPick(windowPosition: Cartesian2, limit: scala.Double): js.Array[_] = js.native
  def getCompressedTextureFormatSupported(format: java.lang.String): scala.Boolean = js.native
  def isDestroyed(): scala.Boolean = js.native
  def morphTo2D(): scala.Unit = js.native
  def morphTo2D(duration: scala.Double): scala.Unit = js.native
  def morphTo3D(): scala.Unit = js.native
  def morphTo3D(duration: scala.Double): scala.Unit = js.native
  def morphToColumbusView(): scala.Unit = js.native
  def morphToColumbusView(duration: scala.Double): scala.Unit = js.native
  def pick(windowPosition: Cartesian2): js.Any = js.native
  def pick(windowPosition: Cartesian2, width: scala.Double): js.Any = js.native
  def pick(windowPosition: Cartesian2, width: scala.Double, height: scala.Double): js.Any = js.native
  def pickPosition(windowPosition: Cartesian2): Cartesian3 = js.native
  def pickPosition(windowPosition: Cartesian2, result: Cartesian3): Cartesian3 = js.native
  def requestRender(): scala.Unit = js.native
}

