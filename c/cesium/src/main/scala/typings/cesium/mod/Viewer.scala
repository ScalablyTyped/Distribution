package typings.cesium.mod

import typings.cesium.anon.Duration
import typings.cesium.cesiumBooleans.`false`
import typings.cesium.mod.Viewer.ConstructorOptions
import typings.cesium.mod.Viewer.ViewerMixin
import typings.std.Element
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Viewer")
@js.native
open class Viewer protected () extends StObject {
  def this(container: String) = this()
  def this(container: Element) = this()
  def this(container: String, options: ConstructorOptions) = this()
  def this(container: Element, options: ConstructorOptions) = this()
  
  /**
    * Gets or sets whether or not data sources can temporarily pause
    * animation in order to avoid showing an incomplete picture to the user.
    * For example, if asynchronous primitives are being processed in the
    * background, the clock will not advance until the geometry is ready.
    */
  var allowDataSourcesToSuspendAnimation: Boolean = js.native
  
  /**
    * Gets the Animation widget.
    */
  val animation: Animation = js.native
  
  /**
    * Gets the BaseLayerPicker.
    */
  val baseLayerPicker: BaseLayerPicker = js.native
  
  /**
    * Gets the DOM element for the area at the bottom of the window containing the
    * {@link CreditDisplay} and potentially other things.
    */
  val bottomContainer: Element = js.native
  
  /**
    * Gets the camera.
    */
  val camera: Camera = js.native
  
  /**
    * Gets the canvas.
    */
  val canvas: HTMLCanvasElement = js.native
  
  /**
    * Gets the CesiumWidget.
    */
  val cesiumWidget: CesiumWidget = js.native
  
  /**
    * Gets the clock.
    */
  val clock: Clock = js.native
  
  /**
    * Gets or sets the data source to track with the viewer's clock.
    */
  var clockTrackedDataSource: DataSource = js.native
  
  /**
    * Gets the clock view model.
    */
  val clockViewModel: ClockViewModel = js.native
  
  /**
    * Gets the parent container.
    */
  val container: Element = js.native
  
  /**
    * Gets the display used for {@link DataSource} visualization.
    */
  val dataSourceDisplay: DataSourceDisplay = js.native
  
  /**
    * Gets the set of {@link DataSource} instances to be visualized.
    */
  val dataSources: DataSourceCollection = js.native
  
  /**
    * Destroys the widget.  Should be called if permanently
    * removing the widget from layout.
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets the collection of entities not tied to a particular data source.
    * This is a shortcut to [dataSourceDisplay.defaultDataSource.entities]{@link Viewer#dataSourceDisplay}.
    */
  val entities: EntityCollection = js.native
  
  /**
    * Extends the base viewer functionality with the provided mixin.
    * A mixin may add additional properties, functions, or other behavior
    * to the provided viewer instance.
    * @param mixin - The Viewer mixin to add to this instance.
    * @param [options] - The options object to be passed to the mixin function.
    */
  def extend(mixin: ViewerMixin): Unit = js.native
  def extend(mixin: ViewerMixin, options: Any): Unit = js.native
  
  def flyTo(target: js.Array[Entity]): js.Promise[Boolean] = js.native
  def flyTo(target: js.Array[Entity], options: Duration): js.Promise[Boolean] = js.native
  def flyTo(
    target: js.Promise[
      Entity | js.Array[Entity] | EntityCollection | DataSource | ImageryLayer | Cesium3DTileset | TimeDynamicPointCloud
    ]
  ): js.Promise[Boolean] = js.native
  def flyTo(
    target: js.Promise[
      Entity | js.Array[Entity] | EntityCollection | DataSource | ImageryLayer | Cesium3DTileset | TimeDynamicPointCloud
    ],
    options: Duration
  ): js.Promise[Boolean] = js.native
  def flyTo(target: Cesium3DTileset): js.Promise[Boolean] = js.native
  def flyTo(target: Cesium3DTileset, options: Duration): js.Promise[Boolean] = js.native
  def flyTo(target: DataSource): js.Promise[Boolean] = js.native
  def flyTo(target: DataSource, options: Duration): js.Promise[Boolean] = js.native
  /**
    * Flies the camera to the provided entity, entities, or data source.
    * If the data source is still in the process of loading or the visualization is otherwise still loading,
    * this method waits for the data to be ready before performing the flight.
    *
    * <p>The offset is heading/pitch/range in the local east-north-up reference frame centered at the center of the bounding sphere.
    * The heading and the pitch angles are defined in the local east-north-up reference frame.
    * The heading is the angle from y axis and increasing towards the x axis. Pitch is the rotation from the xy-plane. Positive pitch
    * angles are above the plane. Negative pitch angles are below the plane. The range is the distance from the center. If the range is
    * zero, a range will be computed such that the whole bounding sphere is visible.</p>
    *
    * <p>In 2D, there must be a top down view. The camera will be placed above the target looking down. The height above the
    * target will be the range. The heading will be determined from the offset. If the heading cannot be
    * determined from the offset, the heading will be north.</p>
    * @param target - The entity, array of entities, entity collection, data source, Cesium3DTileset, point cloud, or imagery layer to view. You can also pass a promise that resolves to one of the previously mentioned types.
    * @param [options] - Object with the following properties:
    * @param [options.duration = 3.0] - The duration of the flight in seconds.
    * @param [options.maximumHeight] - The maximum height at the peak of the flight.
    * @param [options.offset] - The offset from the target in the local east-north-up reference frame centered at the target.
    * @returns A Promise that resolves to true if the flight was successful or false if the target is not currently visualized in the scene or the flight was cancelled. //TODO: Cleanup entity mentions
    */
  def flyTo(target: Entity): js.Promise[Boolean] = js.native
  def flyTo(target: EntityCollection): js.Promise[Boolean] = js.native
  def flyTo(target: EntityCollection, options: Duration): js.Promise[Boolean] = js.native
  def flyTo(target: Entity, options: Duration): js.Promise[Boolean] = js.native
  def flyTo(target: ImageryLayer): js.Promise[Boolean] = js.native
  def flyTo(target: ImageryLayer, options: Duration): js.Promise[Boolean] = js.native
  def flyTo(target: TimeDynamicPointCloud): js.Promise[Boolean] = js.native
  def flyTo(target: TimeDynamicPointCloud, options: Duration): js.Promise[Boolean] = js.native
  
  /**
    * This forces the widget to re-think its layout, including
    * widget sizes and credit placement.
    */
  def forceResize(): Unit = js.native
  
  /**
    * Gets the FullscreenButton.
    */
  val fullscreenButton: FullscreenButton = js.native
  
  /**
    * Gets the Geocoder.
    */
  val geocoder: Geocoder = js.native
  
  /**
    * Gets the HomeButton.
    */
  val homeButton: HomeButton = js.native
  
  /**
    * Gets the collection of image layers that will be rendered on the globe.
    */
  val imageryLayers: ImageryLayerCollection = js.native
  
  /**
    * Gets the info box.
    */
  val infoBox: InfoBox = js.native
  
  /**
    * @returns true if the object has been destroyed, false otherwise.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets the NavigationHelpButton.
    */
  val navigationHelpButton: NavigationHelpButton = js.native
  
  /**
    * Gets the post-process stages.
    */
  val postProcessStages: PostProcessStageCollection = js.native
  
  /**
    * Gets the ProjectionPicker.
    */
  val projectionPicker: ProjectionPicker = js.native
  
  /**
    * Renders the scene.  This function is called automatically
    * unless <code>useDefaultRenderLoop</code> is set to false;
    */
  def render(): Unit = js.native
  
  /**
    * Resizes the widget to match the container size.
    * This function is called automatically as needed unless
    * <code>useDefaultRenderLoop</code> is set to false.
    */
  def resize(): Unit = js.native
  
  /**
    * Gets or sets a scaling factor for rendering resolution.  Values less than 1.0 can improve
    * performance on less powerful devices while values greater than 1.0 will render at a higher
    * resolution and then scale down, resulting in improved visual fidelity.
    * For example, if the widget is laid out at a size of 640x480, setting this value to 0.5
    * will cause the scene to be rendered at 320x240 and then scaled up while setting
    * it to 2.0 will cause the scene to be rendered at 1280x960 and then scaled down.
    */
  var resolutionScale: Double = js.native
  
  /**
    * Gets the scene.
    */
  val scene: Scene = js.native
  
  /**
    * Gets the SceneModePicker.
    */
  val sceneModePicker: SceneModePicker = js.native
  
  /**
    * Gets the screen space event handler.
    */
  val screenSpaceEventHandler: ScreenSpaceEventHandler = js.native
  
  /**
    * Gets or sets the object instance for which to display a selection indicator.
    *
    * If a user interactively picks a Cesium3DTilesFeature instance, then this property
    * will contain a transient Entity instance with a property named "feature" that is
    * the instance that was picked.
    */
  var selectedEntity: js.UndefOr[Entity] = js.native
  
  /**
    * Gets the event that is raised when the selected entity changes.
    */
  val selectedEntityChanged: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets the selection indicator.
    */
  val selectionIndicator: SelectionIndicator = js.native
  
  /**
    * Get the scene's shadow map
    */
  val shadowMap: ShadowMap = js.native
  
  /**
    * Determines if shadows are cast by light sources.
    */
  var shadows: Boolean = js.native
  
  /**
    * Gets or sets the target frame rate of the widget when <code>useDefaultRenderLoop</code>
    * is true. If undefined, the browser's requestAnimationFrame implementation
    * determines the frame rate.  If defined, this value must be greater than 0.  A value higher
    * than the underlying requestAnimationFrame implementation will have no effect.
    */
  var targetFrameRate: Double = js.native
  
  /**
    * The terrain provider providing surface geometry for the globe.
    */
  var terrainProvider: TerrainProvider = js.native
  
  /**
    * Determines if the terrain casts or shadows from light sources.
    */
  var terrainShadows: ShadowMode = js.native
  
  /**
    * Gets the Timeline widget.
    */
  val timeline: Timeline = js.native
  
  /**
    * Gets or sets the Entity instance currently being tracked by the camera.
    */
  var trackedEntity: js.UndefOr[Entity] = js.native
  
  /**
    * Gets the event that is raised when the tracked entity changes.
    */
  val trackedEntityChanged: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Boolean flag indicating if the browser's recommended resolution is used.
    * If true, the browser's device pixel ratio is ignored and 1.0 is used instead,
    * effectively rendering based on CSS pixels instead of device pixels. This can improve
    * performance on less powerful devices that have high pixel density. When false, rendering
    * will be in device pixels. {@link Viewer#resolutionScale} will still take effect whether
    * this flag is true or false.
    */
  var useBrowserRecommendedResolution: Boolean = js.native
  
  /**
    * Gets or sets whether or not this widget should control the render loop.
    * If true the widget will use requestAnimationFrame to
    * perform rendering and resizing of the widget, as well as drive the
    * simulation clock. If set to false, you must manually call the
    * <code>resize</code>, <code>render</code> methods
    * as part of a custom render loop.  If an error occurs during rendering, {@link Scene}'s
    * <code>renderError</code> event will be raised and this property
    * will be set to false.  It must be set back to true to continue rendering
    * after the error.
    */
  var useDefaultRenderLoop: Boolean = js.native
  
  /**
    * Gets the VRButton.
    */
  val vrButton: VRButton = js.native
  
  def zoomTo(target: js.Array[Entity]): js.Promise[Boolean] = js.native
  def zoomTo(target: js.Array[Entity], offset: HeadingPitchRange): js.Promise[Boolean] = js.native
  def zoomTo(
    target: js.Promise[
      Entity | js.Array[Entity] | EntityCollection | DataSource | ImageryLayer | Cesium3DTileset | TimeDynamicPointCloud
    ]
  ): js.Promise[Boolean] = js.native
  def zoomTo(
    target: js.Promise[
      Entity | js.Array[Entity] | EntityCollection | DataSource | ImageryLayer | Cesium3DTileset | TimeDynamicPointCloud
    ],
    offset: HeadingPitchRange
  ): js.Promise[Boolean] = js.native
  def zoomTo(target: Cesium3DTileset): js.Promise[Boolean] = js.native
  def zoomTo(target: Cesium3DTileset, offset: HeadingPitchRange): js.Promise[Boolean] = js.native
  def zoomTo(target: DataSource): js.Promise[Boolean] = js.native
  def zoomTo(target: DataSource, offset: HeadingPitchRange): js.Promise[Boolean] = js.native
  /**
    * Asynchronously sets the camera to view the provided entity, entities, or data source.
    * If the data source is still in the process of loading or the visualization is otherwise still loading,
    * this method waits for the data to be ready before performing the zoom.
    *
    * <p>The offset is heading/pitch/range in the local east-north-up reference frame centered at the center of the bounding sphere.
    * The heading and the pitch angles are defined in the local east-north-up reference frame.
    * The heading is the angle from y axis and increasing towards the x axis. Pitch is the rotation from the xy-plane. Positive pitch
    * angles are above the plane. Negative pitch angles are below the plane. The range is the distance from the center. If the range is
    * zero, a range will be computed such that the whole bounding sphere is visible.</p>
    *
    * <p>In 2D, there must be a top down view. The camera will be placed above the target looking down. The height above the
    * target will be the range. The heading will be determined from the offset. If the heading cannot be
    * determined from the offset, the heading will be north.</p>
    * @param target - The entity, array of entities, entity collection, data source, Cesium3DTileset, point cloud, or imagery layer to view. You can also pass a promise that resolves to one of the previously mentioned types.
    * @param [offset] - The offset from the center of the entity in the local east-north-up reference frame.
    * @returns A Promise that resolves to true if the zoom was successful or false if the target is not currently visualized in the scene or the zoom was cancelled.
    */
  def zoomTo(target: Entity): js.Promise[Boolean] = js.native
  def zoomTo(target: EntityCollection): js.Promise[Boolean] = js.native
  def zoomTo(target: EntityCollection, offset: HeadingPitchRange): js.Promise[Boolean] = js.native
  def zoomTo(target: Entity, offset: HeadingPitchRange): js.Promise[Boolean] = js.native
  def zoomTo(target: ImageryLayer): js.Promise[Boolean] = js.native
  def zoomTo(target: ImageryLayer, offset: HeadingPitchRange): js.Promise[Boolean] = js.native
  def zoomTo(target: TimeDynamicPointCloud): js.Promise[Boolean] = js.native
  def zoomTo(target: TimeDynamicPointCloud, offset: HeadingPitchRange): js.Promise[Boolean] = js.native
}
object Viewer {
  
  /**
    * Initialization options for the Viewer constructor
    * @property [animation = true] - If set to false, the Animation widget will not be created.
    * @property [baseLayerPicker = true] - If set to false, the BaseLayerPicker widget will not be created.
    * @property [fullscreenButton = true] - If set to false, the FullscreenButton widget will not be created.
    * @property [vrButton = false] - If set to true, the VRButton widget will be created.
    * @property [geocoder = true] - If set to false, the Geocoder widget will not be created.
    * @property [homeButton = true] - If set to false, the HomeButton widget will not be created.
    * @property [infoBox = true] - If set to false, the InfoBox widget will not be created.
    * @property [sceneModePicker = true] - If set to false, the SceneModePicker widget will not be created.
    * @property [selectionIndicator = true] - If set to false, the SelectionIndicator widget will not be created.
    * @property [timeline = true] - If set to false, the Timeline widget will not be created.
    * @property [navigationHelpButton = true] - If set to false, the navigation help button will not be created.
    * @property [navigationInstructionsInitiallyVisible = true] - True if the navigation instructions should initially be visible, or false if the should not be shown until the user explicitly clicks the button.
    * @property [scene3DOnly = false] - When <code>true</code>, each geometry instance will only be rendered in 3D to save GPU memory.
    * @property [shouldAnimate = false] - <code>true</code> if the clock should attempt to advance simulation time by default, <code>false</code> otherwise.  This option takes precedence over setting {@link Viewer#clockViewModel}.
    * @property [clockViewModel = new ClockViewModel(clock)] - The clock view model to use to control current time.
    * @property [selectedImageryProviderViewModel] - The view model for the current base imagery layer, if not supplied the first available base layer is used.  This value is only valid if `baseLayerPicker` is set to true.
    * @property [imageryProviderViewModels = createDefaultImageryProviderViewModels()] - The array of ProviderViewModels to be selectable from the BaseLayerPicker.  This value is only valid if `baseLayerPicker` is set to true.
    * @property [selectedTerrainProviderViewModel] - The view model for the current base terrain layer, if not supplied the first available base layer is used.  This value is only valid if `baseLayerPicker` is set to true.
    * @property [terrainProviderViewModels = createDefaultTerrainProviderViewModels()] - The array of ProviderViewModels to be selectable from the BaseLayerPicker.  This value is only valid if `baseLayerPicker` is set to true.
    * @property [imageryProvider = createWorldImagery()] - The imagery provider to use.  This value is only valid if `baseLayerPicker` is set to false.
    * @property [terrainProvider = new EllipsoidTerrainProvider()] - The terrain provider to use
    * @property [skyBox] - The skybox used to render the stars.  When <code>undefined</code>, the default stars are used. If set to <code>false</code>, no skyBox, Sun, or Moon will be added.
    * @property [skyAtmosphere] - Blue sky, and the glow around the Earth's limb.  Set to <code>false</code> to turn it off.
    * @property [fullscreenElement = document.body] - The element or id to be placed into fullscreen mode when the full screen button is pressed.
    * @property [useDefaultRenderLoop = true] - True if this widget should control the render loop, false otherwise.
    * @property [targetFrameRate] - The target frame rate when using the default render loop.
    * @property [showRenderLoopErrors = true] - If true, this widget will automatically display an HTML panel to the user containing the error, if a render loop error occurs.
    * @property [useBrowserRecommendedResolution = true] - If true, render at the browser's recommended resolution and ignore <code>window.devicePixelRatio</code>.
    * @property [automaticallyTrackDataSourceClocks = true] - If true, this widget will automatically track the clock settings of newly added DataSources, updating if the DataSource's clock changes.  Set this to false if you want to configure the clock independently.
    * @property [contextOptions] - Context and WebGL creation properties corresponding to <code>options</code> passed to {@link Scene}.
    * @property [sceneMode = SceneMode.SCENE3D] - The initial scene mode.
    * @property [mapProjection = new GeographicProjection()] - The map projection to use in 2D and Columbus View modes.
    * @property [globe = new Globe(mapProjection.ellipsoid)] - The globe to use in the scene.  If set to <code>false</code>, no globe will be added.
    * @property [orderIndependentTranslucency = true] - If true and the configuration supports it, use order independent translucency.
    * @property [creditContainer] - The DOM element or ID that will contain the {@link CreditDisplay}.  If not specified, the credits are added to the bottom of the widget itself.
    * @property [creditViewport] - The DOM element or ID that will contain the credit pop up created by the {@link CreditDisplay}.  If not specified, it will appear over the widget itself.
    * @property [dataSources = new DataSourceCollection()] - The collection of data sources visualized by the widget.  If this parameter is provided,
    *                               the instance is assumed to be owned by the caller and will not be destroyed when the viewer is destroyed.
    * @property [shadows = false] - Determines if shadows are cast by light sources.
    * @property [terrainShadows = ShadowMode.RECEIVE_ONLY] - Determines if the terrain casts or receives shadows from light sources.
    * @property [mapMode2D = MapMode2D.INFINITE_SCROLL] - Determines if the 2D map is rotatable or can be scrolled infinitely in the horizontal direction.
    * @property [projectionPicker = false] - If set to true, the ProjectionPicker widget will be created.
    * @property [blurActiveElementOnCanvasFocus = true] - If true, the active element will blur when the viewer's canvas is clicked. Setting this to false is useful for cases when the canvas is clicked only for retrieving position or an entity data without actually meaning to set the canvas to be the active element.
    * @property [requestRenderMode = false] - If true, rendering a frame will only occur when needed as determined by changes within the scene. Enabling reduces the CPU/GPU usage of your application and uses less battery on mobile, but requires using {@link Scene#requestRender} to render a new frame explicitly in this mode. This will be necessary in many cases after making changes to the scene in other parts of the API. See {@link https://cesium.com/blog/2018/01/24/cesium-scene-rendering-performance/|Improving Performance with Explicit Rendering}.
    * @property [maximumRenderTimeChange = 0.0] - If requestRenderMode is true, this value defines the maximum change in simulation time allowed before a render is requested. See {@link https://cesium.com/blog/2018/01/24/cesium-scene-rendering-performance/|Improving Performance with Explicit Rendering}.
    * @property [depthPlaneEllipsoidOffset = 0.0] - Adjust the DepthPlane to address rendering artefacts below ellipsoid zero elevation.
    * @property [msaaSamples = 1] - If provided, this value controls the rate of multisample antialiasing. Typical multisampling rates are 2, 4, and sometimes 8 samples per pixel. Higher sampling rates of MSAA may impact performance in exchange for improved visual quality. This value only applies to WebGL2 contexts that support multisample render targets.
    */
  trait ConstructorOptions extends StObject {
    
    var animation: js.UndefOr[Boolean] = js.undefined
    
    var automaticallyTrackDataSourceClocks: js.UndefOr[Boolean] = js.undefined
    
    var baseLayerPicker: js.UndefOr[Boolean] = js.undefined
    
    var blurActiveElementOnCanvasFocus: js.UndefOr[Boolean] = js.undefined
    
    var clockViewModel: js.UndefOr[ClockViewModel] = js.undefined
    
    var contextOptions: js.UndefOr[Any] = js.undefined
    
    var creditContainer: js.UndefOr[Element | String] = js.undefined
    
    var creditViewport: js.UndefOr[Element | String] = js.undefined
    
    var dataSources: js.UndefOr[DataSourceCollection] = js.undefined
    
    var depthPlaneEllipsoidOffset: js.UndefOr[Double] = js.undefined
    
    var fullscreenButton: js.UndefOr[Boolean] = js.undefined
    
    var fullscreenElement: js.UndefOr[Element | String] = js.undefined
    
    var geocoder: js.UndefOr[Boolean | js.Array[GeocoderService]] = js.undefined
    
    var globe: js.UndefOr[Globe | `false`] = js.undefined
    
    var homeButton: js.UndefOr[Boolean] = js.undefined
    
    var imageryProvider: js.UndefOr[ImageryProvider] = js.undefined
    
    var imageryProviderViewModels: js.UndefOr[js.Array[ProviderViewModel]] = js.undefined
    
    var infoBox: js.UndefOr[Boolean] = js.undefined
    
    var mapMode2D: js.UndefOr[MapMode2D] = js.undefined
    
    var mapProjection: js.UndefOr[MapProjection] = js.undefined
    
    var maximumRenderTimeChange: js.UndefOr[Double] = js.undefined
    
    var msaaSamples: js.UndefOr[Double] = js.undefined
    
    var navigationHelpButton: js.UndefOr[Boolean] = js.undefined
    
    var navigationInstructionsInitiallyVisible: js.UndefOr[Boolean] = js.undefined
    
    var orderIndependentTranslucency: js.UndefOr[Boolean] = js.undefined
    
    var projectionPicker: js.UndefOr[Boolean] = js.undefined
    
    var requestRenderMode: js.UndefOr[Boolean] = js.undefined
    
    var scene3DOnly: js.UndefOr[Boolean] = js.undefined
    
    var sceneMode: js.UndefOr[SceneMode] = js.undefined
    
    var sceneModePicker: js.UndefOr[Boolean] = js.undefined
    
    var selectedImageryProviderViewModel: js.UndefOr[ProviderViewModel] = js.undefined
    
    var selectedTerrainProviderViewModel: js.UndefOr[ProviderViewModel] = js.undefined
    
    var selectionIndicator: js.UndefOr[Boolean] = js.undefined
    
    var shadows: js.UndefOr[Boolean] = js.undefined
    
    var shouldAnimate: js.UndefOr[Boolean] = js.undefined
    
    var showRenderLoopErrors: js.UndefOr[Boolean] = js.undefined
    
    var skyAtmosphere: js.UndefOr[SkyAtmosphere | `false`] = js.undefined
    
    var skyBox: js.UndefOr[SkyBox | `false`] = js.undefined
    
    var targetFrameRate: js.UndefOr[Double] = js.undefined
    
    var terrainProvider: js.UndefOr[TerrainProvider] = js.undefined
    
    var terrainProviderViewModels: js.UndefOr[js.Array[ProviderViewModel]] = js.undefined
    
    var terrainShadows: js.UndefOr[ShadowMode] = js.undefined
    
    var timeline: js.UndefOr[Boolean] = js.undefined
    
    var useBrowserRecommendedResolution: js.UndefOr[Boolean] = js.undefined
    
    var useDefaultRenderLoop: js.UndefOr[Boolean] = js.undefined
    
    var vrButton: js.UndefOr[Boolean] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAutomaticallyTrackDataSourceClocks(value: Boolean): Self = StObject.set(x, "automaticallyTrackDataSourceClocks", value.asInstanceOf[js.Any])
      
      inline def setAutomaticallyTrackDataSourceClocksUndefined: Self = StObject.set(x, "automaticallyTrackDataSourceClocks", js.undefined)
      
      inline def setBaseLayerPicker(value: Boolean): Self = StObject.set(x, "baseLayerPicker", value.asInstanceOf[js.Any])
      
      inline def setBaseLayerPickerUndefined: Self = StObject.set(x, "baseLayerPicker", js.undefined)
      
      inline def setBlurActiveElementOnCanvasFocus(value: Boolean): Self = StObject.set(x, "blurActiveElementOnCanvasFocus", value.asInstanceOf[js.Any])
      
      inline def setBlurActiveElementOnCanvasFocusUndefined: Self = StObject.set(x, "blurActiveElementOnCanvasFocus", js.undefined)
      
      inline def setClockViewModel(value: ClockViewModel): Self = StObject.set(x, "clockViewModel", value.asInstanceOf[js.Any])
      
      inline def setClockViewModelUndefined: Self = StObject.set(x, "clockViewModel", js.undefined)
      
      inline def setContextOptions(value: Any): Self = StObject.set(x, "contextOptions", value.asInstanceOf[js.Any])
      
      inline def setContextOptionsUndefined: Self = StObject.set(x, "contextOptions", js.undefined)
      
      inline def setCreditContainer(value: Element | String): Self = StObject.set(x, "creditContainer", value.asInstanceOf[js.Any])
      
      inline def setCreditContainerUndefined: Self = StObject.set(x, "creditContainer", js.undefined)
      
      inline def setCreditViewport(value: Element | String): Self = StObject.set(x, "creditViewport", value.asInstanceOf[js.Any])
      
      inline def setCreditViewportUndefined: Self = StObject.set(x, "creditViewport", js.undefined)
      
      inline def setDataSources(value: DataSourceCollection): Self = StObject.set(x, "dataSources", value.asInstanceOf[js.Any])
      
      inline def setDataSourcesUndefined: Self = StObject.set(x, "dataSources", js.undefined)
      
      inline def setDepthPlaneEllipsoidOffset(value: Double): Self = StObject.set(x, "depthPlaneEllipsoidOffset", value.asInstanceOf[js.Any])
      
      inline def setDepthPlaneEllipsoidOffsetUndefined: Self = StObject.set(x, "depthPlaneEllipsoidOffset", js.undefined)
      
      inline def setFullscreenButton(value: Boolean): Self = StObject.set(x, "fullscreenButton", value.asInstanceOf[js.Any])
      
      inline def setFullscreenButtonUndefined: Self = StObject.set(x, "fullscreenButton", js.undefined)
      
      inline def setFullscreenElement(value: Element | String): Self = StObject.set(x, "fullscreenElement", value.asInstanceOf[js.Any])
      
      inline def setFullscreenElementUndefined: Self = StObject.set(x, "fullscreenElement", js.undefined)
      
      inline def setGeocoder(value: Boolean | js.Array[GeocoderService]): Self = StObject.set(x, "geocoder", value.asInstanceOf[js.Any])
      
      inline def setGeocoderUndefined: Self = StObject.set(x, "geocoder", js.undefined)
      
      inline def setGeocoderVarargs(value: GeocoderService*): Self = StObject.set(x, "geocoder", js.Array(value*))
      
      inline def setGlobe(value: Globe | `false`): Self = StObject.set(x, "globe", value.asInstanceOf[js.Any])
      
      inline def setGlobeUndefined: Self = StObject.set(x, "globe", js.undefined)
      
      inline def setHomeButton(value: Boolean): Self = StObject.set(x, "homeButton", value.asInstanceOf[js.Any])
      
      inline def setHomeButtonUndefined: Self = StObject.set(x, "homeButton", js.undefined)
      
      inline def setImageryProvider(value: ImageryProvider): Self = StObject.set(x, "imageryProvider", value.asInstanceOf[js.Any])
      
      inline def setImageryProviderUndefined: Self = StObject.set(x, "imageryProvider", js.undefined)
      
      inline def setImageryProviderViewModels(value: js.Array[ProviderViewModel]): Self = StObject.set(x, "imageryProviderViewModels", value.asInstanceOf[js.Any])
      
      inline def setImageryProviderViewModelsUndefined: Self = StObject.set(x, "imageryProviderViewModels", js.undefined)
      
      inline def setImageryProviderViewModelsVarargs(value: ProviderViewModel*): Self = StObject.set(x, "imageryProviderViewModels", js.Array(value*))
      
      inline def setInfoBox(value: Boolean): Self = StObject.set(x, "infoBox", value.asInstanceOf[js.Any])
      
      inline def setInfoBoxUndefined: Self = StObject.set(x, "infoBox", js.undefined)
      
      inline def setMapMode2D(value: MapMode2D): Self = StObject.set(x, "mapMode2D", value.asInstanceOf[js.Any])
      
      inline def setMapMode2DUndefined: Self = StObject.set(x, "mapMode2D", js.undefined)
      
      inline def setMapProjection(value: MapProjection): Self = StObject.set(x, "mapProjection", value.asInstanceOf[js.Any])
      
      inline def setMapProjectionUndefined: Self = StObject.set(x, "mapProjection", js.undefined)
      
      inline def setMaximumRenderTimeChange(value: Double): Self = StObject.set(x, "maximumRenderTimeChange", value.asInstanceOf[js.Any])
      
      inline def setMaximumRenderTimeChangeUndefined: Self = StObject.set(x, "maximumRenderTimeChange", js.undefined)
      
      inline def setMsaaSamples(value: Double): Self = StObject.set(x, "msaaSamples", value.asInstanceOf[js.Any])
      
      inline def setMsaaSamplesUndefined: Self = StObject.set(x, "msaaSamples", js.undefined)
      
      inline def setNavigationHelpButton(value: Boolean): Self = StObject.set(x, "navigationHelpButton", value.asInstanceOf[js.Any])
      
      inline def setNavigationHelpButtonUndefined: Self = StObject.set(x, "navigationHelpButton", js.undefined)
      
      inline def setNavigationInstructionsInitiallyVisible(value: Boolean): Self = StObject.set(x, "navigationInstructionsInitiallyVisible", value.asInstanceOf[js.Any])
      
      inline def setNavigationInstructionsInitiallyVisibleUndefined: Self = StObject.set(x, "navigationInstructionsInitiallyVisible", js.undefined)
      
      inline def setOrderIndependentTranslucency(value: Boolean): Self = StObject.set(x, "orderIndependentTranslucency", value.asInstanceOf[js.Any])
      
      inline def setOrderIndependentTranslucencyUndefined: Self = StObject.set(x, "orderIndependentTranslucency", js.undefined)
      
      inline def setProjectionPicker(value: Boolean): Self = StObject.set(x, "projectionPicker", value.asInstanceOf[js.Any])
      
      inline def setProjectionPickerUndefined: Self = StObject.set(x, "projectionPicker", js.undefined)
      
      inline def setRequestRenderMode(value: Boolean): Self = StObject.set(x, "requestRenderMode", value.asInstanceOf[js.Any])
      
      inline def setRequestRenderModeUndefined: Self = StObject.set(x, "requestRenderMode", js.undefined)
      
      inline def setScene3DOnly(value: Boolean): Self = StObject.set(x, "scene3DOnly", value.asInstanceOf[js.Any])
      
      inline def setScene3DOnlyUndefined: Self = StObject.set(x, "scene3DOnly", js.undefined)
      
      inline def setSceneMode(value: SceneMode): Self = StObject.set(x, "sceneMode", value.asInstanceOf[js.Any])
      
      inline def setSceneModePicker(value: Boolean): Self = StObject.set(x, "sceneModePicker", value.asInstanceOf[js.Any])
      
      inline def setSceneModePickerUndefined: Self = StObject.set(x, "sceneModePicker", js.undefined)
      
      inline def setSceneModeUndefined: Self = StObject.set(x, "sceneMode", js.undefined)
      
      inline def setSelectedImageryProviderViewModel(value: ProviderViewModel): Self = StObject.set(x, "selectedImageryProviderViewModel", value.asInstanceOf[js.Any])
      
      inline def setSelectedImageryProviderViewModelUndefined: Self = StObject.set(x, "selectedImageryProviderViewModel", js.undefined)
      
      inline def setSelectedTerrainProviderViewModel(value: ProviderViewModel): Self = StObject.set(x, "selectedTerrainProviderViewModel", value.asInstanceOf[js.Any])
      
      inline def setSelectedTerrainProviderViewModelUndefined: Self = StObject.set(x, "selectedTerrainProviderViewModel", js.undefined)
      
      inline def setSelectionIndicator(value: Boolean): Self = StObject.set(x, "selectionIndicator", value.asInstanceOf[js.Any])
      
      inline def setSelectionIndicatorUndefined: Self = StObject.set(x, "selectionIndicator", js.undefined)
      
      inline def setShadows(value: Boolean): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
      
      inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
      
      inline def setShouldAnimate(value: Boolean): Self = StObject.set(x, "shouldAnimate", value.asInstanceOf[js.Any])
      
      inline def setShouldAnimateUndefined: Self = StObject.set(x, "shouldAnimate", js.undefined)
      
      inline def setShowRenderLoopErrors(value: Boolean): Self = StObject.set(x, "showRenderLoopErrors", value.asInstanceOf[js.Any])
      
      inline def setShowRenderLoopErrorsUndefined: Self = StObject.set(x, "showRenderLoopErrors", js.undefined)
      
      inline def setSkyAtmosphere(value: SkyAtmosphere | `false`): Self = StObject.set(x, "skyAtmosphere", value.asInstanceOf[js.Any])
      
      inline def setSkyAtmosphereUndefined: Self = StObject.set(x, "skyAtmosphere", js.undefined)
      
      inline def setSkyBox(value: SkyBox | `false`): Self = StObject.set(x, "skyBox", value.asInstanceOf[js.Any])
      
      inline def setSkyBoxUndefined: Self = StObject.set(x, "skyBox", js.undefined)
      
      inline def setTargetFrameRate(value: Double): Self = StObject.set(x, "targetFrameRate", value.asInstanceOf[js.Any])
      
      inline def setTargetFrameRateUndefined: Self = StObject.set(x, "targetFrameRate", js.undefined)
      
      inline def setTerrainProvider(value: TerrainProvider): Self = StObject.set(x, "terrainProvider", value.asInstanceOf[js.Any])
      
      inline def setTerrainProviderUndefined: Self = StObject.set(x, "terrainProvider", js.undefined)
      
      inline def setTerrainProviderViewModels(value: js.Array[ProviderViewModel]): Self = StObject.set(x, "terrainProviderViewModels", value.asInstanceOf[js.Any])
      
      inline def setTerrainProviderViewModelsUndefined: Self = StObject.set(x, "terrainProviderViewModels", js.undefined)
      
      inline def setTerrainProviderViewModelsVarargs(value: ProviderViewModel*): Self = StObject.set(x, "terrainProviderViewModels", js.Array(value*))
      
      inline def setTerrainShadows(value: ShadowMode): Self = StObject.set(x, "terrainShadows", value.asInstanceOf[js.Any])
      
      inline def setTerrainShadowsUndefined: Self = StObject.set(x, "terrainShadows", js.undefined)
      
      inline def setTimeline(value: Boolean): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
      
      inline def setTimelineUndefined: Self = StObject.set(x, "timeline", js.undefined)
      
      inline def setUseBrowserRecommendedResolution(value: Boolean): Self = StObject.set(x, "useBrowserRecommendedResolution", value.asInstanceOf[js.Any])
      
      inline def setUseBrowserRecommendedResolutionUndefined: Self = StObject.set(x, "useBrowserRecommendedResolution", js.undefined)
      
      inline def setUseDefaultRenderLoop(value: Boolean): Self = StObject.set(x, "useDefaultRenderLoop", value.asInstanceOf[js.Any])
      
      inline def setUseDefaultRenderLoopUndefined: Self = StObject.set(x, "useDefaultRenderLoop", js.undefined)
      
      inline def setVrButton(value: Boolean): Self = StObject.set(x, "vrButton", value.asInstanceOf[js.Any])
      
      inline def setVrButtonUndefined: Self = StObject.set(x, "vrButton", js.undefined)
    }
  }
  
  /**
    * A function that augments a Viewer instance with additional functionality.
    * @param viewer - The viewer instance.
    * @param options - Options object to be passed to the mixin function.
    */
  type ViewerMixin = js.Function2[/* viewer */ Viewer, /* options */ Any, Unit]
}
