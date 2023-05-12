package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.Canvas
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "Scene")
@js.native
open class Scene protected () extends StObject {
  def this(options: Canvas) = this()
  
  /**
    * The background color, which is only visible if there is no sky box, i.e., {@link Scene#skyBox} is undefined.
    */
  var backgroundColor: Color = js.native
  
  /**
    * Gets or sets the camera.
    */
  val camera: Camera = js.native
  
  /**
    * Whether or not the camera is underneath the globe.
    */
  val cameraUnderground: Boolean = js.native
  
  /**
    * Gets the canvas element to which this scene is bound.
    */
  val canvas: HTMLCanvasElement = js.native
  
  /**
    * Transforms a position in cartesian coordinates to canvas coordinates.  This is commonly used to place an
    * HTML element at the same screen position as an object in the scene.
    * @example
    * // Output the canvas position of longitude/latitude (0, 0) every time the mouse moves.
    * const scene = widget.scene;
    * const ellipsoid = scene.globe.ellipsoid;
    * const position = Cesium.Cartesian3.fromDegrees(0.0, 0.0);
    * const handler = new Cesium.ScreenSpaceEventHandler(scene.canvas);
    * handler.setInputAction(function(movement) {
    *     console.log(scene.cartesianToCanvasCoordinates(position));
    * }, Cesium.ScreenSpaceEventType.MOUSE_MOVE);
    * @param position - The position in cartesian coordinates.
    * @param [result] - An optional object to return the input position transformed to canvas coordinates.
    * @returns The modified result parameter or a new Cartesian2 instance if one was not provided.  This may be <code>undefined</code> if the input position is near the center of the ellipsoid.
    */
  def cartesianToCanvasCoordinates(position: Cartesian3): Cartesian2 = js.native
  def cartesianToCanvasCoordinates(position: Cartesian3, result: Cartesian2): Cartesian2 = js.native
  
  /**
    * Clamps the given cartesian position to the scene geometry along the geodetic surface normal. Returns the
    * clamped position or <code>undefined</code> if there was no scene geometry to clamp to. May be used to clamp
    * objects to the globe, 3D Tiles, or primitives in the scene.
    * <p>
    * This function only clamps to globe tiles and 3D Tiles that are rendered in the current view. Clamps to
    * all other primitives regardless of their visibility.
    * </p>
    * @example
    * // Clamp an entity to the underlying scene geometry
    * const position = entity.position.getValue(Cesium.JulianDate.now());
    * entity.position = viewer.scene.clampToHeight(position);
    * @param cartesian - The cartesian position.
    * @param [objectsToExclude] - A list of primitives, entities, or 3D Tiles features to not clamp to.
    * @param [width = 0.1] - Width of the intersection volume in meters.
    * @param [result] - An optional object to return the clamped position.
    * @returns The modified result parameter or a new Cartesian3 instance if one was not provided. This may be <code>undefined</code> if there was no scene geometry to clamp to.
    */
  def clampToHeight(cartesian: Cartesian3): Cartesian3 = js.native
  def clampToHeight(cartesian: Cartesian3, objectsToExclude: js.Array[js.Object]): Cartesian3 = js.native
  def clampToHeight(cartesian: Cartesian3, objectsToExclude: js.Array[js.Object], width: Double): Cartesian3 = js.native
  def clampToHeight(cartesian: Cartesian3, objectsToExclude: js.Array[js.Object], width: Double, result: Cartesian3): Cartesian3 = js.native
  def clampToHeight(cartesian: Cartesian3, objectsToExclude: js.Array[js.Object], width: Unit, result: Cartesian3): Cartesian3 = js.native
  def clampToHeight(cartesian: Cartesian3, objectsToExclude: Unit, width: Double): Cartesian3 = js.native
  def clampToHeight(cartesian: Cartesian3, objectsToExclude: Unit, width: Double, result: Cartesian3): Cartesian3 = js.native
  def clampToHeight(cartesian: Cartesian3, objectsToExclude: Unit, width: Unit, result: Cartesian3): Cartesian3 = js.native
  
  /**
    * Initiates an asynchronous {@link Scene#clampToHeight} query for an array of {@link Cartesian3} positions
    * using the maximum level of detail for 3D Tilesets in the scene. Returns a promise that is resolved when
    * the query completes. Each position is modified in place. If a position cannot be clamped because no geometry
    * can be sampled at that location, or another error occurs, the element in the array is set to undefined.
    * @example
    * const cartesians = [
    *     entities[0].position.getValue(Cesium.JulianDate.now()),
    *     entities[1].position.getValue(Cesium.JulianDate.now())
    * ];
    * const promise = viewer.scene.clampToHeightMostDetailed(cartesians);
    * promise.then(function(updatedCartesians) {
    *     entities[0].position = updatedCartesians[0];
    *     entities[1].position = updatedCartesians[1];
    * }
    * @param cartesians - The cartesian positions to update with clamped positions.
    * @param [objectsToExclude] - A list of primitives, entities, or 3D Tiles features to not clamp to.
    * @param [width = 0.1] - Width of the intersection volume in meters.
    * @returns A promise that resolves to the provided list of positions when the query has completed.
    */
  def clampToHeightMostDetailed(cartesians: js.Array[Cartesian3]): js.Promise[js.Array[Cartesian3]] = js.native
  def clampToHeightMostDetailed(cartesians: js.Array[Cartesian3], objectsToExclude: js.Array[js.Object]): js.Promise[js.Array[Cartesian3]] = js.native
  def clampToHeightMostDetailed(cartesians: js.Array[Cartesian3], objectsToExclude: js.Array[js.Object], width: Double): js.Promise[js.Array[Cartesian3]] = js.native
  def clampToHeightMostDetailed(cartesians: js.Array[Cartesian3], objectsToExclude: Unit, width: Double): js.Promise[js.Array[Cartesian3]] = js.native
  
  /**
    * Returns <code>true</code> if the {@link Scene#clampToHeight} and {@link Scene#clampToHeightMostDetailed} functions are supported.
    */
  val clampToHeightSupported: Boolean = js.native
  
  /**
    * Instantly completes an active transition.
    */
  def completeMorph(): Unit = js.native
  
  /**
    * Determines whether or not to instantly complete the
    * scene transition animation on user input.
    */
  var completeMorphOnUserInput: Boolean = js.native
  
  /**
    * This property is for debugging only; it is not for production use.
    * <p>
    * A function that determines what commands are executed.  As shown in the examples below,
    * the function receives the command's <code>owner</code> as an argument, and returns a boolean indicating if the
    * command should be executed.
    * </p>
    * <p>
    * The default is <code>undefined</code>, indicating that all commands are executed.
    * </p>
    * @example
    * // Do not execute any commands.
    * scene.debugCommandFilter = function(command) {
    *     return false;
    * };
    *
    * // Execute only the billboard's commands.  That is, only draw the billboard.
    * const billboards = new Cesium.BillboardCollection();
    * scene.debugCommandFilter = function(command) {
    *     return command.owner === billboards;
    * };
    */
  def debugCommandFilter(params: Any*): Any = js.native
  
  /**
    * This property is for debugging only; it is not for production use.
    * <p>
    * When {@link Scene.debugShowFrustums} is <code>true</code>, this contains
    * properties with statistics about the number of command execute per frustum.
    * <code>totalCommands</code> is the total number of commands executed, ignoring
    * overlap. <code>commandsInFrustums</code> is an array with the number of times
    * commands are executed redundantly, e.g., how many commands overlap two or
    * three frustums.
    * </p>
    */
  val debugFrustumStatistics: Any = js.native
  
  /**
    * This property is for debugging only; it is not for production use.
    * <p>
    * When <code>true</code>, commands are randomly shaded.  This is useful
    * for performance analysis to see what parts of a scene or model are
    * command-dense and could benefit from batching.
    * </p>
    */
  var debugShowCommands: Boolean = js.native
  
  /**
    * This property is for debugging only; it is not for production use.
    * <p>
    * Indicates which frustum will have depth information displayed.
    * </p>
    */
  var debugShowDepthFrustum: Double = js.native
  
  /**
    * This property is for debugging only; it is not for production use.
    * <p>
    * Displays frames per second and time between frames.
    * </p>
    */
  var debugShowFramesPerSecond: Boolean = js.native
  
  /**
    * This property is for debugging only; it is not for production use.
    * <p>
    * When <code>true</code>, draws outlines to show the boundaries of the camera frustums
    * </p>
    */
  var debugShowFrustumPlanes: Boolean = js.native
  
  /**
    * This property is for debugging only; it is not for production use.
    * <p>
    * When <code>true</code>, commands are shaded based on the frustums they
    * overlap.  Commands in the closest frustum are tinted red, commands in
    * the next closest are green, and commands in the farthest frustum are
    * blue.  If a command overlaps more than one frustum, the color components
    * are combined, e.g., a command overlapping the first two frustums is tinted
    * yellow.
    * </p>
    */
  var debugShowFrustums: Boolean = js.native
  
  /**
    * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
    * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
    * <br /><br />
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * @example
    * scene = scene && scene.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * The drawingBufferHeight of the underlying GL context.
    */
  val drawingBufferHeight: Double = js.native
  
  /**
    * The drawingBufferHeight of the underlying GL context.
    */
  val drawingBufferWidth: Double = js.native
  
  /**
    * Returns a list of objects, each containing a `primitive` property, for all primitives at
    * a particular window coordinate position. Other properties may also be set depending on the
    * type of primitive and may be used to further identify the picked object. The primitives in
    * the list are ordered by their visual order in the scene (front to back).
    * @example
    * const pickedObjects = scene.drillPick(new Cesium.Cartesian2(100.0, 200.0));
    * @param windowPosition - Window coordinates to perform picking on.
    * @param [limit] - If supplied, stop drilling after collecting this many picks.
    * @param [width = 3] - Width of the pick rectangle.
    * @param [height = 3] - Height of the pick rectangle.
    * @returns Array of objects, each containing 1 picked primitives.
    */
  def drillPick(windowPosition: Cartesian2): js.Array[Any] = js.native
  def drillPick(windowPosition: Cartesian2, limit: Double): js.Array[Any] = js.native
  def drillPick(windowPosition: Cartesian2, limit: Double, width: Double): js.Array[Any] = js.native
  def drillPick(windowPosition: Cartesian2, limit: Double, width: Double, height: Double): js.Array[Any] = js.native
  def drillPick(windowPosition: Cartesian2, limit: Double, width: Unit, height: Double): js.Array[Any] = js.native
  def drillPick(windowPosition: Cartesian2, limit: Unit, width: Double): js.Array[Any] = js.native
  def drillPick(windowPosition: Cartesian2, limit: Unit, width: Double, height: Double): js.Array[Any] = js.native
  def drillPick(windowPosition: Cartesian2, limit: Unit, width: Unit, height: Double): js.Array[Any] = js.native
  
  /**
    * The eye separation distance in meters for use with cardboard or WebVR.
    */
  var eyeSeparation: Double = js.native
  
  /**
    * The far-to-near ratio of the multi-frustum when using a normal depth buffer.
    * <p>
    * This value is used to create the near and far values for each frustum of the multi-frustum. It is only used
    * when {@link Scene#logarithmicDepthBuffer} is <code>false</code>. When <code>logarithmicDepthBuffer</code> is
    * <code>true</code>, use {@link Scene#logarithmicDepthFarToNearRatio}.
    * </p>
    */
  var farToNearRatio: Double = js.native
  
  /**
    * The focal length for use when with cardboard or WebVR.
    */
  var focalLength: Double = js.native
  
  /**
    * Blends the atmosphere to geometry far from the camera for horizon views. Allows for additional
    * performance improvements by rendering less geometry and dispatching less terrain requests.
    */
  var fog: Fog = js.native
  
  /**
    * The value used for gamma correction. This is only used when rendering with high dynamic range.
    */
  var gamma: Double = js.native
  
  /**
    * Determines if a compressed texture format is supported.
    * @param format - The texture format. May be the name of the format or the WebGL extension name, e.g. s3tc or WEBGL_compressed_texture_s3tc.
    * @returns Whether or not the format is supported.
    */
  def getCompressedTextureFormatSupported(format: String): Boolean = js.native
  
  /**
    * Gets or sets the depth-test ellipsoid.
    */
  var globe: Globe = js.native
  
  /**
    * Gets the collection of ground primitives.
    */
  val groundPrimitives: PrimitiveCollection = js.native
  
  /**
    * Whether or not to use high dynamic range rendering.
    */
  var highDynamicRange: Boolean = js.native
  
  /**
    * Whether or not high dynamic range rendering is supported.
    */
  val highDynamicRangeSupported: Boolean = js.native
  
  /**
    * Gets the unique identifier for this scene.
    */
  val id: String = js.native
  
  /**
    * Gets the collection of image layers that will be rendered on the globe.
    */
  val imageryLayers: ImageryLayerCollection = js.native
  
  /**
    * When <code>false</code>, 3D Tiles will render normally. When <code>true</code>, classified 3D Tile geometry will render normally and
    * unclassified 3D Tile geometry will render with the color multiplied by {@link Scene#invertClassificationColor}.
    */
  var invertClassification: Boolean = js.native
  
  /**
    * The highlight color of unclassified 3D Tile geometry when {@link Scene#invertClassification} is <code>true</code>.
    * <p>When the color's alpha is less than 1.0, the unclassified portions of the 3D Tiles will not blend correctly with the classified positions of the 3D Tiles.</p>
    * <p>Also, when the color's alpha is less than 1.0, the WEBGL_depth_texture and EXT_frag_depth WebGL extensions must be supported.</p>
    */
  var invertClassificationColor: Color = js.native
  
  /**
    * Returns <code>true</code> if the {@link Scene#invertClassification} is supported.
    */
  val invertClassificationSupported: Boolean = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns <code>true</code> if this object was destroyed; otherwise, <code>false</code>.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets the simulation time when the scene was last rendered. Returns undefined if the scene has not yet been
    * rendered.
    */
  val lastRenderTime: JulianDate = js.native
  
  /**
    * The light source for shading. Defaults to a directional light from the Sun.
    */
  var light: Light = js.native
  
  /**
    * Whether or not to use a logarithmic depth buffer. Enabling this option will allow for less frustums in the multi-frustum,
    * increasing performance. This property relies on fragmentDepth being supported.
    */
  var logarithmicDepthBuffer: Boolean = js.native
  
  /**
    * The far-to-near ratio of the multi-frustum when using a logarithmic depth buffer.
    * <p>
    * This value is used to create the near and far values for each frustum of the multi-frustum. It is only used
    * when {@link Scene#logarithmicDepthBuffer} is <code>true</code>. When <code>logarithmicDepthBuffer</code> is
    * <code>false</code>, use {@link Scene#farToNearRatio}.
    * </p>
    */
  var logarithmicDepthFarToNearRatio: Double = js.native
  
  /**
    * Determines if the 2D map is rotatable or can be scrolled infinitely in the horizontal direction.
    */
  val mapMode2D: MapMode2D = js.native
  
  /**
    * Get the map projection to use in 2D and Columbus View modes.
    */
  val mapProjection: MapProjection = js.native
  
  /**
    * The maximum aliased line width, in pixels, supported by this WebGL implementation.  It will be at least one.
    */
  val maximumAliasedLineWidth: Double = js.native
  
  /**
    * The maximum length in pixels of one edge of a cube map, supported by this WebGL implementation.  It will be at least 16.
    */
  val maximumCubeMapSize: Double = js.native
  
  /**
    * If {@link Scene#requestRenderMode} is <code>true</code>, this value defines the maximum change in
    * simulation time allowed before a render is requested. Lower values increase the number of frames rendered
    * and higher values decrease the number of frames rendered. If <code>undefined</code>, changes to
    * the simulation time will never request a render.
    * This value impacts the rate of rendering for changes in the scene like lighting, entity property updates,
    * and animations.
    */
  var maximumRenderTimeChange: Double = js.native
  
  /**
    * The distance from the camera at which to disable the depth test of billboards, labels and points
    * to, for example, prevent clipping against terrain. When set to zero, the depth test should always
    * be applied. When less than zero, the depth test should never be applied. Setting the disableDepthTestDistance
    * property of a billboard, label or point will override this value.
    */
  var minimumDisableDepthTestDistance: Double = js.native
  
  /**
    * Gets or sets the current mode of the scene.
    */
  var mode: SceneMode = js.native
  
  /**
    * The {@link Moon}
    */
  var moon: Moon = js.native
  
  /**
    * The event fired at the completion of a scene transition.
    */
  var morphComplete: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * The event fired at the beginning of a scene transition.
    */
  var morphStart: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * The current morph transition time between 2D/Columbus View and 3D,
    * with 0.0 being 2D or Columbus View and 1.0 being 3D.
    */
  var morphTime: Double = js.native
  
  /**
    * Asynchronously transitions the scene to 2D.
    * @param [duration = 2.0] - The amount of time, in seconds, for transition animations to complete.
    */
  def morphTo2D(): Unit = js.native
  def morphTo2D(duration: Double): Unit = js.native
  
  /**
    * Asynchronously transitions the scene to 3D.
    * @param [duration = 2.0] - The amount of time, in seconds, for transition animations to complete.
    */
  def morphTo3D(): Unit = js.native
  def morphTo3D(duration: Double): Unit = js.native
  
  /**
    * Asynchronously transitions the scene to Columbus View.
    * @param [duration = 2.0] - The amount of time, in seconds, for transition animations to complete.
    */
  def morphToColumbusView(): Unit = js.native
  def morphToColumbusView(duration: Double): Unit = js.native
  
  /**
    * The sample rate of multisample antialiasing (values greater than 1 enable MSAA).
    */
  var msaaSamples: Double = js.native
  
  /**
    * Returns <code>true</code> if the Scene's context supports MSAA.
    */
  val msaaSupported: Boolean = js.native
  
  /**
    * Determines the uniform depth size in meters of each frustum of the multifrustum in 2D. If a primitive or model close
    * to the surface shows z-fighting, decreasing this will eliminate the artifact, but decrease performance. On the
    * other hand, increasing this will increase performance but may cause z-fighting among primitives close to the surface.
    */
  var nearToFarDistance2D: Double = js.native
  
  /**
    * Gets whether or not the scene has order independent translucency enabled.
    * Note that this only reflects the original construction option, and there are
    * other factors that could prevent OIT from functioning on a given system configuration.
    */
  val orderIndependentTranslucency: Boolean = js.native
  
  /**
    * Returns an object with a `primitive` property that contains the first (top) primitive in the scene
    * at a particular window coordinate or undefined if nothing is at the location. Other properties may
    * potentially be set depending on the type of primitive and may be used to further identify the picked object.
    * <p>
    * When a feature of a 3D Tiles tileset is picked, <code>pick</code> returns a {@link Cesium3DTileFeature} object.
    * </p>
    * @example
    * // On mouse over, color the feature yellow.
    * handler.setInputAction(function(movement) {
    *     const feature = scene.pick(movement.endPosition);
    *     if (feature instanceof Cesium.Cesium3DTileFeature) {
    *         feature.color = Cesium.Color.YELLOW;
    *     }
    * }, Cesium.ScreenSpaceEventType.MOUSE_MOVE);
    * @param windowPosition - Window coordinates to perform picking on.
    * @param [width = 3] - Width of the pick rectangle.
    * @param [height = 3] - Height of the pick rectangle.
    * @returns Object containing the picked primitive.
    */
  def pick(windowPosition: Cartesian2): Any = js.native
  def pick(windowPosition: Cartesian2, width: Double): Any = js.native
  def pick(windowPosition: Cartesian2, width: Double, height: Double): Any = js.native
  def pick(windowPosition: Cartesian2, width: Unit, height: Double): Any = js.native
  
  /**
    * Returns the cartesian position reconstructed from the depth buffer and window position.
    * <p>
    * The position reconstructed from the depth buffer in 2D may be slightly different from those
    * reconstructed in 3D and Columbus view. This is caused by the difference in the distribution
    * of depth values of perspective and orthographic projection.
    * </p>
    * <p>
    * Set {@link Scene#pickTranslucentDepth} to <code>true</code> to include the depth of
    * translucent primitives; otherwise, this essentially picks through translucent primitives.
    * </p>
    * @param windowPosition - Window coordinates to perform picking on.
    * @param [result] - The object on which to restore the result.
    * @returns The cartesian position.
    */
  def pickPosition(windowPosition: Cartesian2): Cartesian3 = js.native
  def pickPosition(windowPosition: Cartesian2, result: Cartesian3): Cartesian3 = js.native
  
  /**
    * Returns <code>true</code> if the {@link Scene#pickPosition} function is supported.
    */
  val pickPositionSupported: Boolean = js.native
  
  /**
    * When <code>true</code>, enables picking translucent geometry using the depth buffer. Note that {@link Scene#useDepthPicking} must also be true for enabling this to work.
    *
    * <p>
    * There is a decrease in performance when enabled. There are extra draw calls to write depth for
    * translucent geometry.
    * </p>
    * @example
    * // picking the position of a translucent primitive
    * viewer.screenSpaceEventHandler.setInputAction(function onLeftClick(movement) {
    *      const pickedFeature = viewer.scene.pick(movement.position);
    *      if (!Cesium.defined(pickedFeature)) {
    *          // nothing picked
    *          return;
    *      }
    *      const worldPosition = viewer.scene.pickPosition(movement.position);
    * }, Cesium.ScreenSpaceEventType.LEFT_CLICK);
    */
  var pickTranslucentDepth: Boolean = js.native
  
  /**
    * Post processing effects applied to the final render.
    */
  var postProcessStages: PostProcessStageCollection = js.native
  
  /**
    * Gets the event that will be raised immediately after the scene is rendered.  Subscribers to the event
    * receive the Scene instance as the first parameter and the current time as the second parameter.
    */
  val postRender: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets the event that will be raised immediately after the scene is updated and before the scene is rendered.
    * Subscribers to the event receive the Scene instance as the first parameter and the current time as the second
    * parameter.
    */
  val postUpdate: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets the event that will be raised after the scene is updated and immediately before the scene is rendered.
    * Subscribers to the event receive the Scene instance as the first parameter and the current time as the second
    * parameter.
    */
  val preRender: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets the event that will be raised before the scene is updated or rendered.  Subscribers to the event
    * receive the Scene instance as the first parameter and the current time as the second parameter.
    */
  val preUpdate: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets the collection of primitives.
    */
  val primitives: PrimitiveCollection = js.native
  
  /**
    * Update and render the scene. It is usually not necessary to call this function
    * directly because {@link CesiumWidget} will do it automatically.
    * @param [time] - The simulation time at which to render.
    */
  def render(): Unit = js.native
  def render(time: JulianDate): Unit = js.native
  
  /**
    * Gets the event that will be raised when an error is thrown inside the <code>render</code> function.
    * The Scene instance and the thrown error are the only two parameters passed to the event handler.
    * By default, errors are not rethrown after this event is raised, but that can be changed by setting
    * the <code>rethrowRenderErrors</code> property.
    */
  val renderError: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Requests a new rendered frame when {@link Scene#requestRenderMode} is set to <code>true</code>.
    * The render rate will not exceed the {@link CesiumWidget#targetFrameRate}.
    */
  def requestRender(): Unit = js.native
  
  /**
    * When <code>true</code>, rendering a frame will only occur when needed as determined by changes within the scene.
    * Enabling improves performance of the application, but requires using {@link Scene#requestRender}
    * to render a new frame explicitly in this mode. This will be necessary in many cases after making changes
    * to the scene in other parts of the API.
    */
  var requestRenderMode: Boolean = js.native
  
  /**
    * Exceptions occurring in <code>render</code> are always caught in order to raise the
    * <code>renderError</code> event.  If this property is true, the error is rethrown
    * after the event is raised.  If this property is false, the <code>render</code> function
    * returns normally after raising the event.
    */
  var rethrowRenderErrors: Boolean = js.native
  
  /**
    * Returns the height of scene geometry at the given cartographic position or <code>undefined</code> if there was no
    * scene geometry to sample height from. The height of the input position is ignored. May be used to clamp objects to
    * the globe, 3D Tiles, or primitives in the scene.
    * <p>
    * This function only samples height from globe tiles and 3D Tiles that are rendered in the current view. Samples height
    * from all other primitives regardless of their visibility.
    * </p>
    * @example
    * const position = new Cesium.Cartographic(-1.31968, 0.698874);
    * const height = viewer.scene.sampleHeight(position);
    * console.log(height);
    * @param position - The cartographic position to sample height from.
    * @param [objectsToExclude] - A list of primitives, entities, or 3D Tiles features to not sample height from.
    * @param [width = 0.1] - Width of the intersection volume in meters.
    * @returns The height. This may be <code>undefined</code> if there was no scene geometry to sample height from.
    */
  def sampleHeight(position: Cartographic): Double = js.native
  def sampleHeight(position: Cartographic, objectsToExclude: js.Array[js.Object]): Double = js.native
  def sampleHeight(position: Cartographic, objectsToExclude: js.Array[js.Object], width: Double): Double = js.native
  def sampleHeight(position: Cartographic, objectsToExclude: Unit, width: Double): Double = js.native
  
  /**
    * Initiates an asynchronous {@link Scene#sampleHeight} query for an array of {@link Cartographic} positions
    * using the maximum level of detail for 3D Tilesets in the scene. The height of the input positions is ignored.
    * Returns a promise that is resolved when the query completes. Each point height is modified in place.
    * If a height cannot be determined because no geometry can be sampled at that location, or another error occurs,
    * the height is set to undefined.
    * @example
    * const positions = [
    *     new Cesium.Cartographic(-1.31968, 0.69887),
    *     new Cesium.Cartographic(-1.10489, 0.83923)
    * ];
    * const promise = viewer.scene.sampleHeightMostDetailed(positions);
    * promise.then(function(updatedPosition) {
    *     // positions[0].height and positions[1].height have been updated.
    *     // updatedPositions is just a reference to positions.
    * }
    * @param positions - The cartographic positions to update with sampled heights.
    * @param [objectsToExclude] - A list of primitives, entities, or 3D Tiles features to not sample height from.
    * @param [width = 0.1] - Width of the intersection volume in meters.
    * @returns A promise that resolves to the provided list of positions when the query has completed.
    */
  def sampleHeightMostDetailed(positions: js.Array[Cartographic]): js.Promise[js.Array[Cartographic]] = js.native
  def sampleHeightMostDetailed(positions: js.Array[Cartographic], objectsToExclude: js.Array[js.Object]): js.Promise[js.Array[Cartographic]] = js.native
  def sampleHeightMostDetailed(positions: js.Array[Cartographic], objectsToExclude: js.Array[js.Object], width: Double): js.Promise[js.Array[Cartographic]] = js.native
  def sampleHeightMostDetailed(positions: js.Array[Cartographic], objectsToExclude: Unit, width: Double): js.Promise[js.Array[Cartographic]] = js.native
  
  /**
    * Returns <code>true</code> if the {@link Scene#sampleHeight} and {@link Scene#sampleHeightMostDetailed} functions are supported.
    */
  val sampleHeightSupported: Boolean = js.native
  
  /**
    * Gets whether or not the scene is optimized for 3D only viewing.
    */
  val scene3DOnly: Boolean = js.native
  
  /**
    * Gets the controller for camera input handling.
    */
  val screenSpaceCameraController: ScreenSpaceCameraController = js.native
  
  /**
    * Update the terrain providing surface geometry for the globe.
    * @example
    * // Use Cesium World Terrain
    * scene.setTerrain(Cesium.Terrain.fromWorldTerrain());
    * @example
    * // Use a custom terrain provider
    * const terrain = new Cesium.Terrain(Cesium.CesiumTerrainProvider.fromUrl("https://myTestTerrain.com"));
    * scene.setTerrain(terrain);
    *
    * terrain.errorEvent.addEventListener(error => {
    *   alert(`Encountered an error while creating terrain! ${error}`);
    * });
    * @param terrain - The terrain provider async helper
    * @returns terrain The terrain provider async helper
    */
  def setTerrain(terrain: Terrain): Terrain = js.native
  
  /**
    * The shadow map for the scene's light source. When enabled, models, primitives, and the globe may cast and receive shadows.
    */
  var shadowMap: ShadowMap = js.native
  
  /**
    * The sky atmosphere drawn around the globe.
    */
  var skyAtmosphere: SkyAtmosphere = js.native
  
  /**
    * The {@link SkyBox} used to draw the stars.
    */
  var skyBox: SkyBox = js.native
  
  /**
    * The url to the KTX2 file containing the specular environment map and convoluted mipmaps for image-based lighting of PBR models.
    */
  var specularEnvironmentMaps: String = js.native
  
  /**
    * Returns <code>true</code> if specular environment maps are supported.
    */
  val specularEnvironmentMapsSupported: Boolean = js.native
  
  /**
    * The spherical harmonic coefficients for image-based lighting of PBR models.
    */
  var sphericalHarmonicCoefficients: js.Array[Cartesian3] = js.native
  
  /**
    * Gets or sets the position of the splitter within the viewport.  Valid values are between 0.0 and 1.0.
    */
  var splitPosition: Double = js.native
  
  /**
    * The {@link Sun}.
    */
  var sun: Sun = js.native
  
  /**
    * Uses a bloom filter on the sun when enabled.
    */
  var sunBloom: Boolean = js.native
  
  /**
    * The terrain provider providing surface geometry for the globe.
    */
  var terrainProvider: TerrainProvider = js.native
  
  /**
    * Gets an event that's raised when the terrain provider is changed
    */
  val terrainProviderChanged: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * When <code>true</code>, enables picking using the depth buffer.
    */
  var useDepthPicking: Boolean = js.native
  
  /**
    * When <code>true</code>, splits the scene into two viewports with steroscopic views for the left and right eyes.
    * Used for cardboard and WebVR.
    */
  var useWebVR: Boolean = js.native
}
