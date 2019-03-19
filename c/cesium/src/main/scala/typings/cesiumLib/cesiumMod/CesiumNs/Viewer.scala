package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Viewer extends js.Object {
  var allowDataSourcesToSuspendAnimation: scala.Boolean = js.native
  val animation: Animation = js.native
  val baseLayerPicker: BaseLayerPicker = js.native
  val bottomContainer: stdLib.Element = js.native
  val camera: Camera = js.native
  val canvas: stdLib.HTMLCanvasElement = js.native
  val cesiumWidget: CesiumWidget = js.native
  val clock: Clock = js.native
  var clockTrackedDataSource: DataSource = js.native
  val clockViewModel: ClockViewModel = js.native
  val container: stdLib.Element = js.native
  val dataSourceDisplay: DataSourceDisplay = js.native
  val dataSources: DataSourceCollection = js.native
  val entities: EntityCollection = js.native
  val fullscreenButton: FullscreenButton = js.native
  val geocoder: Geocoder = js.native
  val homeButton: HomeButton = js.native
  val imageryLayers: ImageryLayerCollection = js.native
  val infoBox: InfoBox = js.native
  val navigationHelpButton: NavigationHelpButton = js.native
  val projectionPicker: ProjectionPicker = js.native
  var resolutionScale: scala.Double = js.native
  val scene: Scene = js.native
  val sceneModePicker: SceneModePicker = js.native
  val screenSpaceEventHandler: ScreenSpaceEventHandler = js.native
  var selectedEntity: Entity = js.native
  val selectedEntityChanged: Event[js.Array[js.UndefOr[Entity]]] = js.native
  val selectionIndicator: SelectionIndicator = js.native
  val shadowMap: ShadowMap = js.native
  var shadows: scala.Boolean = js.native
  var targetFrameRate: scala.Double = js.native
  var terrainProvider: TerrainProvider = js.native
  var terrainShadows: ShadowMode = js.native
  val timeline: Timeline = js.native
  var trackedEntity: Entity = js.native
  val trackedEntityChanged: Event[js.Array[js.UndefOr[Entity]]] = js.native
  var useDefaultRenderLoop: scala.Boolean = js.native
  val vrButton: VRButton = js.native
  def destroy(): scala.Unit = js.native
  def extend(mixin: cesiumLib.cesiumMod.CesiumNs.ViewerNs.ViewerMixin, options: js.Any): scala.Unit = js.native
  def flyTo(target: DataSource): js.Promise[scala.Boolean] = js.native
  def flyTo(target: DataSource, options: cesiumLib.Anon_Duration): js.Promise[scala.Boolean] = js.native
  def flyTo(target: Entity): js.Promise[scala.Boolean] = js.native
  def flyTo(target: EntityCollection): js.Promise[scala.Boolean] = js.native
  def flyTo(target: EntityCollection, options: cesiumLib.Anon_Duration): js.Promise[scala.Boolean] = js.native
  def flyTo(target: Entity, options: cesiumLib.Anon_Duration): js.Promise[scala.Boolean] = js.native
  def flyTo(target: js.Array[Entity]): js.Promise[scala.Boolean] = js.native
  def flyTo(target: js.Array[Entity], options: cesiumLib.Anon_Duration): js.Promise[scala.Boolean] = js.native
  def flyTo(target: js.Promise[Entity | js.Array[Entity] | EntityCollection | DataSource]): js.Promise[scala.Boolean] = js.native
  def flyTo(
    target: js.Promise[Entity | js.Array[Entity] | EntityCollection | DataSource],
    options: cesiumLib.Anon_Duration
  ): js.Promise[scala.Boolean] = js.native
  def forceResize(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
  def render(): scala.Unit = js.native
  def resize(): scala.Unit = js.native
  def zoomTo(target: DataSource): js.Promise[scala.Boolean] = js.native
  def zoomTo(target: DataSource, offset: HeadingPitchRange): js.Promise[scala.Boolean] = js.native
  def zoomTo(target: Entity): js.Promise[scala.Boolean] = js.native
  def zoomTo(target: EntityCollection): js.Promise[scala.Boolean] = js.native
  def zoomTo(target: EntityCollection, offset: HeadingPitchRange): js.Promise[scala.Boolean] = js.native
  def zoomTo(target: Entity, offset: HeadingPitchRange): js.Promise[scala.Boolean] = js.native
  def zoomTo(target: js.Array[Entity]): js.Promise[scala.Boolean] = js.native
  def zoomTo(target: js.Array[Entity], offset: HeadingPitchRange): js.Promise[scala.Boolean] = js.native
  def zoomTo(target: js.Promise[Entity | js.Array[Entity] | EntityCollection | DataSource]): js.Promise[scala.Boolean] = js.native
  def zoomTo(
    target: js.Promise[Entity | js.Array[Entity] | EntityCollection | DataSource],
    offset: HeadingPitchRange
  ): js.Promise[scala.Boolean] = js.native
}

