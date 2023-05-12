package typings.cesiumEngine.mod

import typings.cesiumEngine.mod.Cesium3DTileset.ConstructorOptions
import typings.cesiumEngine.mod.Cesium3DTileset.foveatedInterpolationCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "Cesium3DTileset")
@js.native
open class Cesium3DTileset protected () extends StObject {
  def this(options: ConstructorOptions) = this()
  
  /**
    * The event fired to indicate that all tiles that meet the screen space error this frame are loaded. The tileset
    * is completely loaded for this view.
    * <p>
    * This event is fired at the end of the frame after the scene is rendered.
    * </p>
    * @example
    * tileset.allTilesLoaded.addEventListener(function() {
    *     console.log('All tiles are loaded');
    * });
    */
  var allTilesLoaded: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets the tileset's asset object property, which contains metadata about the tileset.
    * <p>
    * See the {@link https://github.com/CesiumGS/3d-tiles/tree/main/specification#reference-asset|asset schema reference}
    * in the 3D Tiles spec for the full set of properties.
    * </p>
    */
  val asset: Any = js.native
  
  /**
    * Whether to cull back-facing geometry. When true, back face culling is determined
    * by the glTF material's doubleSided property; when false, back face culling is disabled.
    */
  var backFaceCulling: Boolean = js.native
  
  /**
    * The base path that non-absolute paths in tileset JSON file are relative to.
    */
  val basePath: String = js.native
  
  /**
    * The screen space error that must be reached before skipping levels of detail.
    * <p>
    * Only used when {@link Cesium3DTileset#skipLevelOfDetail} is <code>true</code>.
    * </p>
    */
  var baseScreenSpaceError: Double = js.native
  
  /**
    * The tileset's bounding sphere.
    * @example
    * const tileset = await Cesium.Cesium3DTileset.fromUrl("http://localhost:8002/tilesets/Seattle/tileset.json");
    *
    * viewer.scene.primitives.add(tileset);
    *
    * // Set the camera to view the newly added tileset
    * viewer.camera.viewBoundingSphere(tileset.boundingSphere, new Cesium.HeadingPitchRange(0, -0.5, 0));
    */
  val boundingSphere: BoundingSphere = js.native
  
  /**
    * Determines whether terrain, 3D Tiles, or both will be classified by this tileset.
    * <p>
    * This option is only applied to tilesets containing batched 3D models,
    * glTF content, geometry data, or vector data. Even when undefined, vector
    * and geometry data must render as classifications and will default to
    * rendering on both terrain and other 3D Tiles tilesets.
    * </p>
    * <p>
    * When enabled for batched 3D model and glTF tilesets, there are a few
    * requirements/limitations on the glTF:
    * <ul>
    *     <li>The glTF cannot contain morph targets, skins, or animations.</li>
    *     <li>The glTF cannot contain the <code>EXT_mesh_gpu_instancing</code> extension.</li>
    *     <li>Only meshes with TRIANGLES can be used to classify other assets.</li>
    *     <li>The <code>POSITION</code> semantic is required.</li>
    *     <li>If <code>_BATCHID</code>s and an index buffer are both present, all indices with the same batch id must occupy contiguous sections of the index buffer.</li>
    *     <li>If <code>_BATCHID</code>s are present with no index buffer, all positions with the same batch id must occupy contiguous sections of the position buffer.</li>
    * </ul>
    * </p>
    * <p>
    * Additionally, classification is not supported for points or instanced 3D
    * models.
    * </p>
    */
  val classificationType: ClassificationType = js.native
  
  /**
    * The {@link ClippingPlaneCollection} used to selectively disable rendering the tileset.
    */
  var clippingPlanes: ClippingPlaneCollection = js.native
  
  /**
    * Defines the value used to linearly interpolate between the source color and feature color when the {@link Cesium3DTileset#colorBlendMode} is <code>MIX</code>.
    * A value of 0.0 results in the source color while a value of 1.0 results in the feature color, with any value in-between
    * resulting in a mix of the source color and feature color.
    */
  var colorBlendAmount: Double = js.native
  
  /**
    * Defines how per-feature colors set from the Cesium API or declarative styling blend with the source colors from
    * the original feature, e.g. glTF material or per-point color in the tile.
    */
  var colorBlendMode: Cesium3DTileColorBlendMode = js.native
  
  /**
    * Optimization option. Don't request tiles that will likely be unused when they come back because of the camera's movement. This optimization only applies to stationary tilesets.
    */
  var cullRequestsWhileMoving: Boolean = js.native
  
  /**
    * Optimization option. Multiplier used in culling requests while moving. Larger is more aggressive culling, smaller less aggressive culling.
    */
  var cullRequestsWhileMovingMultiplier: Double = js.native
  
  /**
    * A custom shader to apply to all tiles in the tileset. Only used for
    * contents that use {@link Model}. Using custom shaders with a
    * {@link Cesium3DTileStyle} may lead to undefined behavior.
    */
  var customShader: js.UndefOr[CustomShader] = js.native
  
  /**
    * This property is for debugging only; it is not optimized for production use.
    * <p>
    * When true, assigns a random color to each tile.  This is useful for visualizing
    * what features belong to what tiles, especially with additive refinement where features
    * from parent tiles may be interleaved with features from child tiles.
    * </p>
    */
  var debugColorizeTiles: Boolean = js.native
  
  /**
    * This property is for debugging only; it is not optimized for production use.
    * <p>
    * Determines if only the tiles from last frame should be used for rendering.  This
    * effectively "freezes" the tileset to the previous frame so it is possible to zoom
    * out and see what was rendered.
    * </p>
    */
  var debugFreezeFrame: Boolean = js.native
  
  /**
    * This property is for debugging only; it is not optimized for production use.
    * <p>
    * When true, renders the bounding volume for each visible tile.  The bounding volume is
    * white if the tile has a content bounding volume or is empty; otherwise, it is red.  Tiles that don't meet the
    * screen space error and are still refining to their descendants are yellow.
    * </p>
    */
  var debugShowBoundingVolume: Boolean = js.native
  
  /**
    * This property is for debugging only; it is not optimized for production use.
    * <p>
    * When true, renders the bounding volume for each visible tile's content. The bounding volume is
    * blue if the tile has a content bounding volume; otherwise it is red.
    * </p>
    */
  var debugShowContentBoundingVolume: Boolean = js.native
  
  /**
    * This property is for debugging only; it is not optimized for production use.
    * <p>
    * When true, draws labels to indicate the geometric error of each tile.
    * </p>
    */
  var debugShowGeometricError: Boolean = js.native
  
  /**
    * This property is for debugging only; it is not optimized for production use.
    * <p>
    * When true, draws labels to indicate the geometry and texture memory usage of each tile.
    * </p>
    */
  var debugShowMemoryUsage: Boolean = js.native
  
  /**
    * This property is for debugging only; it is not optimized for production use.
    * <p>
    * When true, draws labels to indicate the number of commands, points, triangles and features of each tile.
    * </p>
    */
  var debugShowRenderingStatistics: Boolean = js.native
  
  /**
    * This property is for debugging only; it is not optimized for production use.
    * <p>
    * When true, draws labels to indicate the url of each tile.
    * </p>
    */
  var debugShowUrl: Boolean = js.native
  
  /**
    * This property is for debugging only; it is not optimized for production use.
    * <p>
    * When true, renders the viewer request volume for each tile.
    * </p>
    */
  var debugShowViewerRequestVolume: Boolean = js.native
  
  /**
    * This property is for debugging only; it is not optimized for production use.
    * <p>
    * When true, renders each tile's content as a wireframe.
    * </p>
    */
  var debugWireframe: Boolean = js.native
  
  /**
    * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
    * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
    * <br /><br />
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * @example
    * tileset = tileset && tileset.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * Optimization option. Whether the tileset should refine based on a dynamic screen space error. Tiles that are further
    * away will be rendered with lower detail than closer tiles. This improves performance by rendering fewer
    * tiles and making less requests, but may result in a slight drop in visual quality for tiles in the distance.
    * The algorithm is biased towards "street views" where the camera is close to the ground plane of the tileset and looking
    * at the horizon. In addition results are more accurate for tightly fitting bounding volumes like box and region.
    */
  var dynamicScreenSpaceError: Boolean = js.native
  
  /**
    * A scalar that determines the density used to adjust the dynamic screen space error, similar to {@link Fog}. Increasing this
    * value has the effect of increasing the maximum screen space error for all tiles, but in a non-linear fashion.
    * The error starts at 0.0 and increases exponentially until a midpoint is reached, and then approaches 1.0 asymptotically.
    * This has the effect of keeping high detail in the closer tiles and lower detail in the further tiles, with all tiles
    * beyond a certain distance all roughly having an error of 1.0.
    * <p>
    * The dynamic error is in the range [0.0, 1.0) and is multiplied by <code>dynamicScreenSpaceErrorFactor</code> to produce the
    * final dynamic error. This dynamic error is then subtracted from the tile's actual screen space error.
    * </p>
    * <p>
    * Increasing <code>dynamicScreenSpaceErrorDensity</code> has the effect of moving the error midpoint closer to the camera.
    * It is analogous to moving fog closer to the camera.
    * </p>
    */
  var dynamicScreenSpaceErrorDensity: Double = js.native
  
  /**
    * A factor used to increase the screen space error of tiles for dynamic screen space error. As this value increases less tiles
    * are requested for rendering and tiles in the distance will have lower detail. If set to zero, the feature will be disabled.
    */
  var dynamicScreenSpaceErrorFactor: Double = js.native
  
  /**
    * A ratio of the tileset's height at which the density starts to falloff. If the camera is below this height the
    * full computed density is applied, otherwise the density falls off. This has the effect of higher density at
    * street level views.
    * <p>
    * Valid values are between 0.0 and 1.0.
    * </p>
    */
  var dynamicScreenSpaceErrorHeightFalloff: Double = js.native
  
  /**
    * Gets an ellipsoid describing the shape of the globe.
    */
  val ellipsoid: Ellipsoid = js.native
  
  /**
    * Function for examining vector lines as they are being streamed.
    */
  def examineVectorLinesFunction(params: Any*): Any = js.native
  
  /**
    * Gets the tileset's extensions object property.
    */
  val extensions: Any = js.native
  
  /**
    * Returns the <code>extras</code> property at the top-level of the tileset JSON, which contains application specific metadata.
    * Returns <code>undefined</code> if <code>extras</code> does not exist.
    */
  val extras: Any = js.native
  
  /**
    * Label of the feature ID set to use for picking and styling.
    * <p>
    * For EXT_mesh_features, this is the feature ID's label property, or
    * "featureId_N" (where N is the index in the featureIds array) when not
    * specified. EXT_feature_metadata did not have a label field, so such
    * feature ID sets are always labeled "featureId_N" where N is the index in
    * the list of all feature Ids, where feature ID attributes are listed before
    * feature ID textures.
    * </p>
    * <p>
    * If featureIdLabel is set to an integer N, it is converted to
    * the string "featureId_N" automatically. If both per-primitive and
    * per-instance feature IDs are present, the instance feature IDs take
    * priority.
    * </p>
    */
  var featureIdLabel: String = js.native
  
  /**
    * Optimization option. Used when {@link Cesium3DTileset#foveatedScreenSpaceError} is true to control the cone size that determines which tiles are deferred.
    * Tiles that are inside this cone are loaded immediately. Tiles outside the cone are potentially deferred based on how far outside the cone they are and {@link Cesium3DTileset#foveatedInterpolationCallback} and {@link Cesium3DTileset#foveatedMinimumScreenSpaceErrorRelaxation}.
    * Setting this to 0.0 means the cone will be the line formed by the camera position and its view direction. Setting this to 1.0 means the cone encompasses the entire field of view of the camera, essentially disabling the effect.
    */
  var foveatedConeSize: Double = js.native
  
  /**
    * Gets or sets a callback to control how much to raise the screen space error for tiles outside the foveated cone,
    * interpolating between {@link Cesium3DTileset#foveatedMinimumScreenSpaceErrorRelaxation} and {@link Cesium3DTileset#maximumScreenSpaceError}.
    */
  def foveatedInterpolationCallback(p: Double, q: Double, time: Double): Double = js.native
  /**
    * Gets or sets a callback to control how much to raise the screen space error for tiles outside the foveated cone,
    * interpolating between {@link Cesium3DTileset#foveatedMinimumScreenSpaceErrorRelaxation} and {@link Cesium3DTileset#maximumScreenSpaceError}.
    */
  @JSName("foveatedInterpolationCallback")
  var foveatedInterpolationCallback_Original: foveatedInterpolationCallback = js.native
  
  /**
    * Optimization option. Used when {@link Cesium3DTileset#foveatedScreenSpaceError} is true to control the starting screen space error relaxation for tiles outside the foveated cone.
    * The screen space error will be raised starting with this value up to {@link Cesium3DTileset#maximumScreenSpaceError} based on the provided {@link Cesium3DTileset#foveatedInterpolationCallback}.
    */
  var foveatedMinimumScreenSpaceErrorRelaxation: Double = js.native
  
  /**
    * Optimization option. Prioritize loading tiles in the center of the screen by temporarily raising the
    * screen space error for tiles around the edge of the screen. Screen space error returns to normal once all
    * the tiles in the center of the screen as determined by the {@link Cesium3DTileset#foveatedConeSize} are loaded.
    */
  var foveatedScreenSpaceError: Boolean = js.native
  
  /**
    * Optimization option. Used when {@link Cesium3DTileset#foveatedScreenSpaceError} is true to control
    * how long in seconds to wait after the camera stops moving before deferred tiles start loading in.
    * This time delay prevents requesting tiles around the edges of the screen when the camera is moving.
    * Setting this to 0.0 will immediately request all tiles in any given view.
    */
  var foveatedTimeDelay: Double = js.native
  
  /**
    * <code>true</code> if the tileset JSON file lists the extension in extensionsUsed; otherwise, <code>false</code>.
    * @param extensionName - The name of the extension to check.
    * @returns <code>true</code> if the tileset JSON file lists the extension in extensionsUsed; otherwise, <code>false</code>.
    */
  def hasExtension(extensionName: String): Boolean = js.native
  
  /**
    * The properties for managing image-based lighting on this tileset.
    */
  var imageBasedLighting: ImageBasedLighting = js.native
  
  /**
    * When true, only tiles that meet the maximum screen space error will ever be downloaded.
    * Skipping factors are ignored and just the desired tiles are loaded.
    * <p>
    * Only used when {@link Cesium3DTileset#skipLevelOfDetail} is <code>true</code>.
    * </p>
    */
  var immediatelyLoadDesiredLevelOfDetail: Boolean = js.native
  
  /**
    * The event fired to indicate that all tiles that meet the screen space error this frame are loaded. This event
    * is fired once when all tiles in the initial view are loaded.
    * <p>
    * This event is fired at the end of the frame after the scene is rendered.
    * </p>
    * @example
    * tileset.initialTilesLoaded.addEventListener(function() {
    *     console.log('Initial tiles are loaded');
    * });
    */
  var initialTilesLoaded: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Label of the instance feature ID set used for picking and styling.
    * <p>
    * If instanceFeatureIdLabel is set to an integer N, it is converted to
    * the string "instanceFeatureId_N" automatically.
    * If both per-primitive and per-instance feature IDs are present, the
    * instance feature IDs take priority.
    * </p>
    */
  var instanceFeatureIdLabel: String = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns <code>true</code> if this object was destroyed; otherwise, <code>false</code>.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * The light color when shading models. When <code>undefined</code> the scene's light color is used instead.
    * <p>
    * For example, disabling additional light sources by setting
    * <code>tileset.imageBasedLighting.imageBasedLightingFactor = new Cartesian2(0.0, 0.0)</code>
    * will make the tileset much darker. Here, increasing the intensity of the light source will make the tileset brighter.
    * </p>
    */
  var lightColor: Cartesian3 = js.native
  
  /**
    * The event fired to indicate progress of loading new tiles.  This event is fired when a new tile
    * is requested, when a requested tile is finished downloading, and when a downloaded tile has been
    * processed and is ready to render.
    * <p>
    * The number of pending tile requests, <code>numberOfPendingRequests</code>, and number of tiles
    * processing, <code>numberOfTilesProcessing</code> are passed to the event listener.
    * </p>
    * <p>
    * This event is fired at the end of the frame after the scene is rendered.
    * </p>
    * @example
    * tileset.loadProgress.addEventListener(function(numberOfPendingRequests, numberOfTilesProcessing) {
    *     if ((numberOfPendingRequests === 0) && (numberOfTilesProcessing === 0)) {
    *         console.log('Stopped loading');
    *         return;
    *     }
    *
    *     console.log(`Loading: requests: ${numberOfPendingRequests}, processing: ${numberOfTilesProcessing}`);
    * });
    */
  var loadProgress: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Determines whether siblings of visible tiles are always downloaded during traversal.
    * This may be useful for ensuring that tiles are already available when the viewer turns left/right.
    * <p>
    * Only used when {@link Cesium3DTileset#skipLevelOfDetail} is <code>true</code>.
    * </p>
    */
  var loadSiblings: Boolean = js.native
  
  /**
    * Marks the tileset's {@link Cesium3DTileset#style} as dirty, which forces all
    * features to re-evaluate the style in the next frame each is visible.
    */
  def makeStyleDirty(): Unit = js.native
  
  /**
    * The maximum amount of GPU memory (in MB) that may be used to cache tiles. This value is estimated from
    * geometry, textures, and batch table textures of loaded tiles. For point clouds, this value also
    * includes per-point metadata.
    * <p>
    * Tiles not in view are unloaded to enforce this.
    * </p>
    * <p>
    * If decreasing this value results in unloading tiles, the tiles are unloaded the next frame.
    * </p>
    * <p>
    * If tiles sized more than <code>maximumMemoryUsage</code> are needed
    * to meet the desired screen space error, determined by {@link Cesium3DTileset#maximumScreenSpaceError},
    * for the current view, then the memory usage of the tiles loaded will exceed
    * <code>maximumMemoryUsage</code>.  For example, if the maximum is 256 MB, but
    * 300 MB of tiles are needed to meet the screen space error, then 300 MB of tiles may be loaded.  When
    * these tiles go out of view, they will be unloaded.
    * </p>
    */
  var maximumMemoryUsage: Double = js.native
  
  /**
    * The maximum screen space error used to drive level of detail refinement.  This value helps determine when a tile
    * refines to its descendants, and therefore plays a major role in balancing performance with visual quality.
    * <p>
    * A tile's screen space error is roughly equivalent to the number of pixels wide that would be drawn if a sphere with a
    * radius equal to the tile's <b>geometric error</b> were rendered at the tile's position. If this value exceeds
    * <code>maximumScreenSpaceError</code> the tile refines to its descendants.
    * </p>
    * <p>
    * Depending on the tileset, <code>maximumScreenSpaceError</code> may need to be tweaked to achieve the right balance.
    * Higher values provide better performance but lower visual quality.
    * </p>
    */
  var maximumScreenSpaceError: Double = js.native
  
  /**
    * A 4x4 transformation matrix that transforms the entire tileset.
    * @example
    * // Adjust a tileset's height from the globe's surface.
    * const heightOffset = 20.0;
    * const boundingSphere = tileset.boundingSphere;
    * const cartographic = Cesium.Cartographic.fromCartesian(boundingSphere.center);
    * const surface = Cesium.Cartesian3.fromRadians(cartographic.longitude, cartographic.latitude, 0.0);
    * const offset = Cesium.Cartesian3.fromRadians(cartographic.longitude, cartographic.latitude, heightOffset);
    * const translation = Cesium.Cartesian3.subtract(offset, surface, new Cesium.Cartesian3());
    * tileset.modelMatrix = Cesium.Matrix4.fromTranslation(translation);
    */
  var modelMatrix: Matrix4 = js.native
  
  /**
    * The color to use when rendering outlines.
    */
  var outlineColor: Color = js.native
  
  /**
    * Options for controlling point size based on geometric error and eye dome lighting.
    */
  var pointCloudShading: PointCloudShading = js.native
  
  /**
    * Optimization option. Prefer loading of leaves first.
    */
  var preferLeaves: Boolean = js.native
  
  /**
    * Optimization option. Fetch tiles at the camera's flight destination while the camera is in flight.
    */
  var preloadFlightDestinations: Boolean = js.native
  
  /**
    * Preload tiles when <code>tileset.show</code> is <code>false</code>. Loads tiles as if the tileset is visible but does not render them.
    */
  var preloadWhenHidden: Boolean = js.native
  
  /**
    * Optimization option. If between (0.0, 0.5], tiles at or above the screen space error for the reduced screen resolution of <code>progressiveResolutionHeightFraction*screenHeight</code> will be prioritized first. This can help get a quick layer of tiles down while full resolution tiles continue to load.
    */
  var progressiveResolutionHeightFraction: Double = js.native
  
  /**
    * Gets the tileset's properties dictionary object, which contains metadata about per-feature properties.
    * <p>
    * See the {@link https://github.com/CesiumGS/3d-tiles/tree/main/specification#reference-properties|properties schema reference}
    * in the 3D Tiles spec for the full set of properties.
    * </p>
    * @example
    * console.log(`Maximum building height: ${tileset.properties.height.maximum}`);
    * console.log(`Minimum building height: ${tileset.properties.height.minimum}`);
    */
  val properties: Any = js.native
  
  /**
    * When <code>true</code>, the tileset's root tile is loaded and the tileset is ready to render.
    */
  val ready: Boolean = js.native
  
  /**
    * Gets the promise that will be resolved when the tileset's root tile is loaded and the tileset is ready to render.
    * <p>
    * This promise is resolved at the end of the frame before the first frame the tileset is rendered in.
    * </p>
    * @example
    * tileset.readyPromise.then(function(tileset) {
    *     // tile.properties is not defined until readyPromise resolves.
    *     const properties = tileset.properties;
    *     if (Cesium.defined(properties)) {
    *         for (const name in properties) {
    *             console.log(properties[name]);
    *         }
    *     }
    * });
    */
  val readyPromise: js.Promise[Cesium3DTileset] = js.native
  
  /**
    * The resource used to fetch the tileset JSON file
    */
  val resource: Resource = js.native
  
  /**
    * The root tile.
    */
  val root: Cesium3DTile = js.native
  
  /**
    * Determines whether the tileset casts or receives shadows from light sources.
    * <p>
    * Enabling shadows has a performance impact. A tileset that casts shadows must be rendered twice, once from the camera and again from the light's point of view.
    * </p>
    * <p>
    * Shadows are rendered only when {@link Viewer#shadows} is <code>true</code>.
    * </p>
    */
  var shadows: ShadowMode = js.native
  
  /**
    * Determines if the tileset will be shown.
    */
  var show: Boolean = js.native
  
  /**
    * Determines whether the credits of the tileset will be displayed on the screen
    */
  var showCreditsOnScreen: Boolean = js.native
  
  /**
    * Whether to display the outline for models using the
    * {@link https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Vendor/CESIUM_primitive_outline|CESIUM_primitive_outline} extension.
    * When true, outlines are displayed. When false, outlines are not displayed.
    */
  var showOutline: Boolean = js.native
  
  /**
    * Optimization option. Determines if level of detail skipping should be applied during the traversal.
    * <p>
    * The common strategy for replacement-refinement traversal is to store all levels of the tree in memory and require
    * all children to be loaded before the parent can refine. With this optimization levels of the tree can be skipped
    * entirely and children can be rendered alongside their parents. The tileset requires significantly less memory when
    * using this optimization.
    * </p>
    */
  var skipLevelOfDetail: Boolean = js.native
  
  /**
    * Constant defining the minimum number of levels to skip when loading tiles. When it is 0, no levels are skipped.
    * For example, if a tile is level 1, no tiles will be loaded unless they are at level greater than 2.
    * <p>
    * Only used when {@link Cesium3DTileset#skipLevelOfDetail} is <code>true</code>.
    * </p>
    */
  var skipLevels: Double = js.native
  
  /**
    * Multiplier defining the minimum screen space error to skip.
    * For example, if a tile has screen space error of 100, no tiles will be loaded unless they
    * are leaves or have a screen space error <code><= 100 / skipScreenSpaceErrorFactor</code>.
    * <p>
    * Only used when {@link Cesium3DTileset#skipLevelOfDetail} is <code>true</code>.
    * </p>
    */
  var skipScreenSpaceErrorFactor: Double = js.native
  
  /**
    * The {@link SplitDirection} to apply to this tileset.
    */
  var splitDirection: SplitDirection = js.native
  
  /**
    * The style, defined using the
    * {@link https://github.com/CesiumGS/3d-tiles/tree/main/specification/Styling|3D Tiles Styling language},
    * applied to each feature in the tileset.
    * <p>
    * Assign <code>undefined</code> to remove the style, which will restore the visual
    * appearance of the tileset to its default when no style was applied.
    * </p>
    * <p>
    * The style is applied to a tile before the {@link Cesium3DTileset#tileVisible}
    * event is raised, so code in <code>tileVisible</code> can manually set a feature's
    * properties (e.g. color and show) after the style is applied. When
    * a new style is assigned any manually set properties are overwritten.
    * </p>
    * <p>
    * Use an always "true" condition to specify the Color for all objects that are not
    * overridden by pre-existing conditions. Otherwise, the default color Cesium.Color.White
    * will be used. Similarly, use an always "true" condition to specify the show property
    * for all objects that are not overridden by pre-existing conditions. Otherwise, the
    * default show value true will be used.
    * </p>
    * @example
    * tileset.style = new Cesium.Cesium3DTileStyle({
    *    color : {
    *        conditions : [
    *            ['${Height} >= 100', 'color("purple", 0.5)'],
    *            ['${Height} >= 50', 'color("red")'],
    *            ['true', 'color("blue")']
    *        ]
    *    },
    *    show : '${Height} > 0',
    *    meta : {
    *        description : '"Building id ${id} has height ${Height}."'
    *    }
    * });
    */
  var style: js.UndefOr[Cesium3DTileStyle] = js.native
  
  /**
    * The event fired to indicate that a tile's content failed to load.
    * <p>
    * If there are no event listeners, error messages will be logged to the console.
    * </p>
    * <p>
    * The error object passed to the listener contains two properties:
    * <ul>
    * <li><code>url</code>: the url of the failed tile.</li>
    * <li><code>message</code>: the error message.</li>
    * </ul>
    * <p>
    * If multiple contents are present, this event is raised once per inner content with errors.
    * </p>
    * @example
    * tileset.tileFailed.addEventListener(function(error) {
    *     console.log(`An error occurred loading tile: ${error.url}`);
    *     console.log(`Error: ${error.message}`);
    * });
    */
  var tileFailed: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * The event fired to indicate that a tile's content was loaded.
    * <p>
    * The loaded {@link Cesium3DTile} is passed to the event listener.
    * </p>
    * <p>
    * This event is fired during the tileset traversal while the frame is being rendered
    * so that updates to the tile take effect in the same frame.  Do not create or modify
    * Cesium entities or primitives during the event listener.
    * </p>
    * @example
    * tileset.tileLoad.addEventListener(function(tile) {
    *     console.log('A tile was loaded.');
    * });
    */
  var tileLoad: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * The event fired to indicate that a tile's content was unloaded.
    * <p>
    * The unloaded {@link Cesium3DTile} is passed to the event listener.
    * </p>
    * <p>
    * This event is fired immediately before the tile's content is unloaded while the frame is being
    * rendered so that the event listener has access to the tile's content.  Do not create
    * or modify Cesium entities or primitives during the event listener.
    * </p>
    * @example
    * tileset.tileUnload.addEventListener(function(tile) {
    *     console.log('A tile was unloaded from the cache.');
    * });
    */
  var tileUnload: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * This event fires once for each visible tile in a frame.  This can be used to manually
    * style a tileset.
    * <p>
    * The visible {@link Cesium3DTile} is passed to the event listener.
    * </p>
    * <p>
    * This event is fired during the tileset traversal while the frame is being rendered
    * so that updates to the tile take effect in the same frame.  Do not create or modify
    * Cesium entities or primitives during the event listener.
    * </p>
    * @example
    * tileset.tileVisible.addEventListener(function(tile) {
    *     if (tile.content instanceof Cesium.Model3DTileContent) {
    *         console.log('A 3D model tile is visible.');
    *     }
    * });
    * @example
    * // Apply a red style and then manually set random colors for every other feature when the tile becomes visible.
    * tileset.style = new Cesium.Cesium3DTileStyle({
    *     color : 'color("red")'
    * });
    * tileset.tileVisible.addEventListener(function(tile) {
    *     const content = tile.content;
    *     const featuresLength = content.featuresLength;
    *     for (let i = 0; i < featuresLength; i+=2) {
    *         content.getFeature(i).color = Cesium.Color.fromRandom();
    *     }
    * });
    */
  var tileVisible: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * When <code>true</code>, all tiles that meet the screen space error this frame are loaded. The tileset is
    * completely loaded for this view.
    */
  val tilesLoaded: Boolean = js.native
  
  /**
    * Returns the time, in milliseconds, since the tileset was loaded and first updated.
    */
  val timeSinceLoad: Double = js.native
  
  /**
    * The total amount of GPU memory in bytes used by the tileset. This value is estimated from
    * geometry, texture, batch table textures, and binary metadata of loaded tiles.
    */
  val totalMemoryUsageInBytes: Double = js.native
  
  /**
    * Unloads all tiles that weren't selected the previous frame.  This can be used to
    * explicitly manage the tile cache and reduce the total number of tiles loaded below
    * {@link Cesium3DTileset#maximumMemoryUsage}.
    * <p>
    * Tile unloads occur at the next frame to keep all the WebGL delete calls
    * within the render loop.
    * </p>
    */
  def trimLoadedTiles(): Unit = js.native
  
  /**
    * Indicates that only the tileset's vector tiles should be used for classification.
    */
  var vectorClassificationOnly: Boolean = js.native
  
  /**
    * Whether vector tiles should keep decoded positions in memory.
    * This is used with {@link Cesium3DTileFeature.getPolylinePositions}.
    */
  var vectorKeepDecodedPositions: Boolean = js.native
}
/* static members */
object Cesium3DTileset {
  
  @JSImport("@cesium/engine", "Cesium3DTileset")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a {@link https://github.com/CesiumGS/3d-tiles/tree/main/specification|3D Tiles tileset},
    * used for streaming massive heterogeneous 3D geospatial datasets, from a Cesium ion asset ID.
    * @example
    * // Load a Cesium3DTileset with a Cesium ion asset ID of 124624234
    * try {
    *   const tileset = await Cesium.Cesium3DTileset.fromIonAssetId(124624234);
    *   scene.primitives.add(tileset);
    * } catch (error) {
    *   console.error(`Error creating tileset: ${error}`);
    * }
    * @param assetId - The Cesium ion asset id.
    * @param options - An object describing initialization options
    */
  inline def fromIonAssetId(assetId: Double, options: ConstructorOptions): js.Promise[Cesium3DTileset] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromIonAssetId")(assetId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Cesium3DTileset]]
  
  inline def fromUrl(url: String): js.Promise[Cesium3DTileset] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cesium3DTileset]]
  inline def fromUrl(url: String, options: ConstructorOptions): js.Promise[Cesium3DTileset] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Cesium3DTileset]]
  /**
    * Creates a {@link https://github.com/CesiumGS/3d-tiles/tree/main/specification|3D Tiles tileset},
    * used for streaming massive heterogeneous 3D geospatial datasets.
    * @example
    * try {
    *   const tileset = await Cesium.Cesium3DTileset.fromUrl(
    *      "http://localhost:8002/tilesets/Seattle/tileset.json"
    *   );
    *   scene.primitives.add(tileset);
    * } catch (error) {
    *   console.error(`Error creating tileset: ${error}`);
    * }
    * @example
    * // Common setting for the skipLevelOfDetail optimization
    * const tileset = await Cesium.Cesium3DTileset.fromUrl(
    *   "http://localhost:8002/tilesets/Seattle/tileset.json", {
    *      skipLevelOfDetail: true,
    *      baseScreenSpaceError: 1024,
    *      skipScreenSpaceErrorFactor: 16,
    *      skipLevels: 1,
    *      immediatelyLoadDesiredLevelOfDetail: false,
    *      loadSiblings: false,
    *      cullWithChildrenBounds: true
    * });
    * scene.primitives.add(tileset);
    * @example
    * // Common settings for the dynamicScreenSpaceError optimization
    * const tileset = await Cesium.Cesium3DTileset.fromUrl(
    *   "http://localhost:8002/tilesets/Seattle/tileset.json", {
    *      dynamicScreenSpaceError: true,
    *      dynamicScreenSpaceErrorDensity: 0.00278,
    *      dynamicScreenSpaceErrorFactor: 4.0,
    *      dynamicScreenSpaceErrorHeightFalloff: 0.25
    * });
    * scene.primitives.add(tileset);
    * @param url - The url to a tileset JSON file.
    * @param [options] - An object describing initialization options
    */
  inline def fromUrl(url: Resource): js.Promise[Cesium3DTileset] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cesium3DTileset]]
  inline def fromUrl(url: Resource, options: ConstructorOptions): js.Promise[Cesium3DTileset] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Cesium3DTileset]]
  
  inline def loadJson(tilesetUrl: String): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadJson")(tilesetUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  /**
    * Provides a hook to override the method used to request the tileset json
    * useful when fetching tilesets from remote servers
    * @param tilesetUrl - The url of the json file to be fetched
    * @returns A promise that resolves with the fetched json data
    */
  inline def loadJson(tilesetUrl: Resource): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadJson")(tilesetUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  /**
    * Initialization options for the Cesium3DTileset constructor
    * @property [.url] - The url to a tileset JSON file. Deprecated.
    * @property [show = true] - Determines if the tileset will be shown.
    * @property [modelMatrix = Matrix4.IDENTITY] - A 4x4 transformation matrix that transforms the tileset's root tile.
    * @property [modelUpAxis = Axis.Y] - Which axis is considered up when loading models for tile contents.
    * @property [modelForwardAxis = Axis.X] - Which axis is considered forward when loading models for tile contents.
    * @property [shadows = ShadowMode.ENABLED] - Determines whether the tileset casts or receives shadows from light sources.
    * @property [maximumScreenSpaceError = 16] - The maximum screen space error used to drive level of detail refinement.
    * @property [maximumMemoryUsage = 512] - The maximum amount of memory in MB that can be used by the tileset.
    * @property [cullWithChildrenBounds = true] - Optimization option. Whether to cull tiles using the union of their children bounding volumes.
    * @property [cullRequestsWhileMoving = true] - Optimization option. Don't request tiles that will likely be unused when they come back because of the camera's movement. This optimization only applies to stationary tilesets.
    * @property [cullRequestsWhileMovingMultiplier = 60.0] - Optimization option. Multiplier used in culling requests while moving. Larger is more aggressive culling, smaller less aggressive culling.
    * @property [preloadWhenHidden = false] - Preload tiles when <code>tileset.show</code> is <code>false</code>. Loads tiles as if the tileset is visible but does not render them.
    * @property [preloadFlightDestinations = true] - Optimization option. Preload tiles at the camera's flight destination while the camera is in flight.
    * @property [preferLeaves = false] - Optimization option. Prefer loading of leaves first.
    * @property [dynamicScreenSpaceError = false] - Optimization option. Reduce the screen space error for tiles that are further away from the camera.
    * @property [dynamicScreenSpaceErrorDensity = 0.00278] - Density used to adjust the dynamic screen space error, similar to fog density.
    * @property [dynamicScreenSpaceErrorFactor = 4.0] - A factor used to increase the computed dynamic screen space error.
    * @property [dynamicScreenSpaceErrorHeightFalloff = 0.25] - A ratio of the tileset's height at which the density starts to falloff.
    * @property [progressiveResolutionHeightFraction = 0.3] - Optimization option. If between (0.0, 0.5], tiles at or above the screen space error for the reduced screen resolution of <code>progressiveResolutionHeightFraction*screenHeight</code> will be prioritized first. This can help get a quick layer of tiles down while full resolution tiles continue to load.
    * @property [foveatedScreenSpaceError = true] - Optimization option. Prioritize loading tiles in the center of the screen by temporarily raising the screen space error for tiles around the edge of the screen. Screen space error returns to normal once all the tiles in the center of the screen as determined by the {@link Cesium3DTileset#foveatedConeSize} are loaded.
    * @property [foveatedConeSize = 0.1] - Optimization option. Used when {@link Cesium3DTileset#foveatedScreenSpaceError} is true to control the cone size that determines which tiles are deferred. Tiles that are inside this cone are loaded immediately. Tiles outside the cone are potentially deferred based on how far outside the cone they are and their screen space error. This is controlled by {@link Cesium3DTileset#foveatedInterpolationCallback} and {@link Cesium3DTileset#foveatedMinimumScreenSpaceErrorRelaxation}. Setting this to 0.0 means the cone will be the line formed by the camera position and its view direction. Setting this to 1.0 means the cone encompasses the entire field of view of the camera, disabling the effect.
    * @property [foveatedMinimumScreenSpaceErrorRelaxation = 0.0] - Optimization option. Used when {@link Cesium3DTileset#foveatedScreenSpaceError} is true to control the starting screen space error relaxation for tiles outside the foveated cone. The screen space error will be raised starting with tileset value up to {@link Cesium3DTileset#maximumScreenSpaceError} based on the provided {@link Cesium3DTileset#foveatedInterpolationCallback}.
    * @property [foveatedInterpolationCallback = Math.lerp] - Optimization option. Used when {@link Cesium3DTileset#foveatedScreenSpaceError} is true to control how much to raise the screen space error for tiles outside the foveated cone, interpolating between {@link Cesium3DTileset#foveatedMinimumScreenSpaceErrorRelaxation} and {@link Cesium3DTileset#maximumScreenSpaceError}
    * @property [foveatedTimeDelay = 0.2] - Optimization option. Used when {@link Cesium3DTileset#foveatedScreenSpaceError} is true to control how long in seconds to wait after the camera stops moving before deferred tiles start loading in. This time delay prevents requesting tiles around the edges of the screen when the camera is moving. Setting this to 0.0 will immediately request all tiles in any given view.
    * @property [skipLevelOfDetail = false] - Optimization option. Determines if level of detail skipping should be applied during the traversal.
    * @property [baseScreenSpaceError = 1024] - When <code>skipLevelOfDetail</code> is <code>true</code>, the screen space error that must be reached before skipping levels of detail.
    * @property [skipScreenSpaceErrorFactor = 16] - When <code>skipLevelOfDetail</code> is <code>true</code>, a multiplier defining the minimum screen space error to skip. Used in conjunction with <code>skipLevels</code> to determine which tiles to load.
    * @property [skipLevels = 1] - When <code>skipLevelOfDetail</code> is <code>true</code>, a constant defining the minimum number of levels to skip when loading tiles. When it is 0, no levels are skipped. Used in conjunction with <code>skipScreenSpaceErrorFactor</code> to determine which tiles to load.
    * @property [immediatelyLoadDesiredLevelOfDetail = false] - When <code>skipLevelOfDetail</code> is <code>true</code>, only tiles that meet the maximum screen space error will ever be downloaded. Skipping factors are ignored and just the desired tiles are loaded.
    * @property [loadSiblings = false] - When <code>skipLevelOfDetail</code> is <code>true</code>, determines whether siblings of visible tiles are always downloaded during traversal.
    * @property [clippingPlanes] - The {@link ClippingPlaneCollection} used to selectively disable rendering the tileset.
    * @property [classificationType] - Determines whether terrain, 3D Tiles or both will be classified by this tileset. See {@link Cesium3DTileset#classificationType} for details about restrictions and limitations.
    * @property [ellipsoid = Ellipsoid.WGS84] - The ellipsoid determining the size and shape of the globe.
    * @property [pointCloudShading] - Options for constructing a {@link PointCloudShading} object to control point attenuation based on geometric error and lighting.
    * @property [lightColor] - The light color when shading models. When <code>undefined</code> the scene's light color is used instead.
    * @property [imageBasedLighting] - The properties for managing image-based lighting for this tileset.
    * @property [backFaceCulling = true] - Whether to cull back-facing geometry. When true, back face culling is determined by the glTF material's doubleSided property; when false, back face culling is disabled.
    * @property [enableShowOutline = true] - Whether to enable outlines for models using the {@link https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Vendor/CESIUM_primitive_outline|CESIUM_primitive_outline} extension. This can be set to false to avoid the additional processing of geometry at load time. When false, the showOutlines and outlineColor options are ignored.
    * @property [showOutline = true] - Whether to display the outline for models using the {@link https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Vendor/CESIUM_primitive_outline|CESIUM_primitive_outline} extension. When true, outlines are displayed. When false, outlines are not displayed.
    * @property [outlineColor = Color.BLACK] - The color to use when rendering outlines.
    * @property [vectorClassificationOnly = false] - Indicates that only the tileset's vector tiles should be used for classification.
    * @property [vectorKeepDecodedPositions = false] - Whether vector tiles should keep decoded positions in memory. This is used with {@link Cesium3DTileFeature.getPolylinePositions}.
    * @property [featureIdLabel = "featureId_0"] - Label of the feature ID set to use for picking and styling. For EXT_mesh_features, this is the feature ID's label property, or "featureId_N" (where N is the index in the featureIds array) when not specified. EXT_feature_metadata did not have a label field, so such feature ID sets are always labeled "featureId_N" where N is the index in the list of all feature Ids, where feature ID attributes are listed before feature ID textures. If featureIdLabel is an integer N, it is converted to the string "featureId_N" automatically. If both per-primitive and per-instance feature IDs are present, the instance feature IDs take priority.
    * @property [instanceFeatureIdLabel = "instanceFeatureId_0"] - Label of the instance feature ID set used for picking and styling. If instanceFeatureIdLabel is set to an integer N, it is converted to the string "instanceFeatureId_N" automatically. If both per-primitive and per-instance feature IDs are present, the instance feature IDs take priority.
    * @property [showCreditsOnScreen = false] - Whether to display the credits of this tileset on screen.
    * @property [splitDirection = SplitDirection.NONE] - The {@link SplitDirection} split to apply to this tileset.
    * @property [projectTo2D = false] - Whether to accurately project the tileset to 2D. If this is true, the tileset will be projected accurately to 2D, but it will use more memory to do so. If this is false, the tileset will use less memory and will still render in 2D / CV mode, but its projected positions may be inaccurate. This cannot be set after the tileset has loaded.
    * @property [debugHeatmapTilePropertyName] - The tile variable to colorize as a heatmap. All rendered tiles will be colorized relative to each other's specified variable value.
    * @property [debugFreezeFrame = false] - For debugging only. Determines if only the tiles from last frame should be used for rendering.
    * @property [debugColorizeTiles = false] - For debugging only. When true, assigns a random color to each tile.
    * @property [enableDebugWireframe] - For debugging only. This must be true for debugWireframe to work in WebGL1. This cannot be set after the tileset has loaded.
    * @property [debugWireframe = false] - For debugging only. When true, render's each tile's content as a wireframe.
    * @property [debugShowBoundingVolume = false] - For debugging only. When true, renders the bounding volume for each tile.
    * @property [debugShowContentBoundingVolume = false] - For debugging only. When true, renders the bounding volume for each tile's content.
    * @property [debugShowViewerRequestVolume = false] - For debugging only. When true, renders the viewer request volume for each tile.
    * @property [debugShowGeometricError = false] - For debugging only. When true, draws labels to indicate the geometric error of each tile.
    * @property [debugShowRenderingStatistics = false] - For debugging only. When true, draws labels to indicate the number of commands, points, triangles and features for each tile.
    * @property [debugShowMemoryUsage = false] - For debugging only. When true, draws labels to indicate the texture and geometry memory in megabytes used by each tile.
    * @property [debugShowUrl = false] - For debugging only. When true, draws labels to indicate the url of each tile.
    */
  trait ConstructorOptions extends StObject {
    
    var backFaceCulling: js.UndefOr[Boolean] = js.undefined
    
    var baseScreenSpaceError: js.UndefOr[Double] = js.undefined
    
    var classificationType: js.UndefOr[ClassificationType] = js.undefined
    
    var clippingPlanes: js.UndefOr[ClippingPlaneCollection] = js.undefined
    
    var cullRequestsWhileMoving: js.UndefOr[Boolean] = js.undefined
    
    var cullRequestsWhileMovingMultiplier: js.UndefOr[Double] = js.undefined
    
    var cullWithChildrenBounds: js.UndefOr[Boolean] = js.undefined
    
    var debugColorizeTiles: js.UndefOr[Boolean] = js.undefined
    
    var debugFreezeFrame: js.UndefOr[Boolean] = js.undefined
    
    var debugHeatmapTilePropertyName: js.UndefOr[String] = js.undefined
    
    var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
    
    var debugShowContentBoundingVolume: js.UndefOr[Boolean] = js.undefined
    
    var debugShowGeometricError: js.UndefOr[Boolean] = js.undefined
    
    var debugShowMemoryUsage: js.UndefOr[Boolean] = js.undefined
    
    var debugShowRenderingStatistics: js.UndefOr[Boolean] = js.undefined
    
    var debugShowUrl: js.UndefOr[Boolean] = js.undefined
    
    var debugShowViewerRequestVolume: js.UndefOr[Boolean] = js.undefined
    
    var debugWireframe: js.UndefOr[Boolean] = js.undefined
    
    var dynamicScreenSpaceError: js.UndefOr[Boolean] = js.undefined
    
    var dynamicScreenSpaceErrorDensity: js.UndefOr[Double] = js.undefined
    
    var dynamicScreenSpaceErrorFactor: js.UndefOr[Double] = js.undefined
    
    var dynamicScreenSpaceErrorHeightFalloff: js.UndefOr[Double] = js.undefined
    
    var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
    
    var enableDebugWireframe: js.UndefOr[Boolean] = js.undefined
    
    var enableShowOutline: js.UndefOr[Boolean] = js.undefined
    
    var featureIdLabel: js.UndefOr[String | Double] = js.undefined
    
    var foveatedConeSize: js.UndefOr[Double] = js.undefined
    
    var foveatedInterpolationCallback: js.UndefOr[typings.cesiumEngine.mod.Cesium3DTileset.foveatedInterpolationCallback] = js.undefined
    
    var foveatedMinimumScreenSpaceErrorRelaxation: js.UndefOr[Double] = js.undefined
    
    var foveatedScreenSpaceError: js.UndefOr[Boolean] = js.undefined
    
    var foveatedTimeDelay: js.UndefOr[Double] = js.undefined
    
    var imageBasedLighting: js.UndefOr[ImageBasedLighting] = js.undefined
    
    var immediatelyLoadDesiredLevelOfDetail: js.UndefOr[Boolean] = js.undefined
    
    var instanceFeatureIdLabel: js.UndefOr[String | Double] = js.undefined
    
    var lightColor: js.UndefOr[Cartesian3] = js.undefined
    
    var loadSiblings: js.UndefOr[Boolean] = js.undefined
    
    var maximumMemoryUsage: js.UndefOr[Double] = js.undefined
    
    var maximumScreenSpaceError: js.UndefOr[Double] = js.undefined
    
    var modelForwardAxis: js.UndefOr[Axis] = js.undefined
    
    var modelMatrix: js.UndefOr[Matrix4] = js.undefined
    
    var modelUpAxis: js.UndefOr[Axis] = js.undefined
    
    var outlineColor: js.UndefOr[Color] = js.undefined
    
    var pointCloudShading: js.UndefOr[Any] = js.undefined
    
    var preferLeaves: js.UndefOr[Boolean] = js.undefined
    
    var preloadFlightDestinations: js.UndefOr[Boolean] = js.undefined
    
    var preloadWhenHidden: js.UndefOr[Boolean] = js.undefined
    
    var progressiveResolutionHeightFraction: js.UndefOr[Double] = js.undefined
    
    var projectTo2D: js.UndefOr[Boolean] = js.undefined
    
    var shadows: js.UndefOr[ShadowMode] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var showCreditsOnScreen: js.UndefOr[Boolean] = js.undefined
    
    var showOutline: js.UndefOr[Boolean] = js.undefined
    
    var skipLevelOfDetail: js.UndefOr[Boolean] = js.undefined
    
    var skipLevels: js.UndefOr[Double] = js.undefined
    
    var skipScreenSpaceErrorFactor: js.UndefOr[Double] = js.undefined
    
    var splitDirection: js.UndefOr[SplitDirection] = js.undefined
    
    var vectorClassificationOnly: js.UndefOr[Boolean] = js.undefined
    
    var vectorKeepDecodedPositions: js.UndefOr[Boolean] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setBackFaceCulling(value: Boolean): Self = StObject.set(x, "backFaceCulling", value.asInstanceOf[js.Any])
      
      inline def setBackFaceCullingUndefined: Self = StObject.set(x, "backFaceCulling", js.undefined)
      
      inline def setBaseScreenSpaceError(value: Double): Self = StObject.set(x, "baseScreenSpaceError", value.asInstanceOf[js.Any])
      
      inline def setBaseScreenSpaceErrorUndefined: Self = StObject.set(x, "baseScreenSpaceError", js.undefined)
      
      inline def setClassificationType(value: ClassificationType): Self = StObject.set(x, "classificationType", value.asInstanceOf[js.Any])
      
      inline def setClassificationTypeUndefined: Self = StObject.set(x, "classificationType", js.undefined)
      
      inline def setClippingPlanes(value: ClippingPlaneCollection): Self = StObject.set(x, "clippingPlanes", value.asInstanceOf[js.Any])
      
      inline def setClippingPlanesUndefined: Self = StObject.set(x, "clippingPlanes", js.undefined)
      
      inline def setCullRequestsWhileMoving(value: Boolean): Self = StObject.set(x, "cullRequestsWhileMoving", value.asInstanceOf[js.Any])
      
      inline def setCullRequestsWhileMovingMultiplier(value: Double): Self = StObject.set(x, "cullRequestsWhileMovingMultiplier", value.asInstanceOf[js.Any])
      
      inline def setCullRequestsWhileMovingMultiplierUndefined: Self = StObject.set(x, "cullRequestsWhileMovingMultiplier", js.undefined)
      
      inline def setCullRequestsWhileMovingUndefined: Self = StObject.set(x, "cullRequestsWhileMoving", js.undefined)
      
      inline def setCullWithChildrenBounds(value: Boolean): Self = StObject.set(x, "cullWithChildrenBounds", value.asInstanceOf[js.Any])
      
      inline def setCullWithChildrenBoundsUndefined: Self = StObject.set(x, "cullWithChildrenBounds", js.undefined)
      
      inline def setDebugColorizeTiles(value: Boolean): Self = StObject.set(x, "debugColorizeTiles", value.asInstanceOf[js.Any])
      
      inline def setDebugColorizeTilesUndefined: Self = StObject.set(x, "debugColorizeTiles", js.undefined)
      
      inline def setDebugFreezeFrame(value: Boolean): Self = StObject.set(x, "debugFreezeFrame", value.asInstanceOf[js.Any])
      
      inline def setDebugFreezeFrameUndefined: Self = StObject.set(x, "debugFreezeFrame", js.undefined)
      
      inline def setDebugHeatmapTilePropertyName(value: String): Self = StObject.set(x, "debugHeatmapTilePropertyName", value.asInstanceOf[js.Any])
      
      inline def setDebugHeatmapTilePropertyNameUndefined: Self = StObject.set(x, "debugHeatmapTilePropertyName", js.undefined)
      
      inline def setDebugShowBoundingVolume(value: Boolean): Self = StObject.set(x, "debugShowBoundingVolume", value.asInstanceOf[js.Any])
      
      inline def setDebugShowBoundingVolumeUndefined: Self = StObject.set(x, "debugShowBoundingVolume", js.undefined)
      
      inline def setDebugShowContentBoundingVolume(value: Boolean): Self = StObject.set(x, "debugShowContentBoundingVolume", value.asInstanceOf[js.Any])
      
      inline def setDebugShowContentBoundingVolumeUndefined: Self = StObject.set(x, "debugShowContentBoundingVolume", js.undefined)
      
      inline def setDebugShowGeometricError(value: Boolean): Self = StObject.set(x, "debugShowGeometricError", value.asInstanceOf[js.Any])
      
      inline def setDebugShowGeometricErrorUndefined: Self = StObject.set(x, "debugShowGeometricError", js.undefined)
      
      inline def setDebugShowMemoryUsage(value: Boolean): Self = StObject.set(x, "debugShowMemoryUsage", value.asInstanceOf[js.Any])
      
      inline def setDebugShowMemoryUsageUndefined: Self = StObject.set(x, "debugShowMemoryUsage", js.undefined)
      
      inline def setDebugShowRenderingStatistics(value: Boolean): Self = StObject.set(x, "debugShowRenderingStatistics", value.asInstanceOf[js.Any])
      
      inline def setDebugShowRenderingStatisticsUndefined: Self = StObject.set(x, "debugShowRenderingStatistics", js.undefined)
      
      inline def setDebugShowUrl(value: Boolean): Self = StObject.set(x, "debugShowUrl", value.asInstanceOf[js.Any])
      
      inline def setDebugShowUrlUndefined: Self = StObject.set(x, "debugShowUrl", js.undefined)
      
      inline def setDebugShowViewerRequestVolume(value: Boolean): Self = StObject.set(x, "debugShowViewerRequestVolume", value.asInstanceOf[js.Any])
      
      inline def setDebugShowViewerRequestVolumeUndefined: Self = StObject.set(x, "debugShowViewerRequestVolume", js.undefined)
      
      inline def setDebugWireframe(value: Boolean): Self = StObject.set(x, "debugWireframe", value.asInstanceOf[js.Any])
      
      inline def setDebugWireframeUndefined: Self = StObject.set(x, "debugWireframe", js.undefined)
      
      inline def setDynamicScreenSpaceError(value: Boolean): Self = StObject.set(x, "dynamicScreenSpaceError", value.asInstanceOf[js.Any])
      
      inline def setDynamicScreenSpaceErrorDensity(value: Double): Self = StObject.set(x, "dynamicScreenSpaceErrorDensity", value.asInstanceOf[js.Any])
      
      inline def setDynamicScreenSpaceErrorDensityUndefined: Self = StObject.set(x, "dynamicScreenSpaceErrorDensity", js.undefined)
      
      inline def setDynamicScreenSpaceErrorFactor(value: Double): Self = StObject.set(x, "dynamicScreenSpaceErrorFactor", value.asInstanceOf[js.Any])
      
      inline def setDynamicScreenSpaceErrorFactorUndefined: Self = StObject.set(x, "dynamicScreenSpaceErrorFactor", js.undefined)
      
      inline def setDynamicScreenSpaceErrorHeightFalloff(value: Double): Self = StObject.set(x, "dynamicScreenSpaceErrorHeightFalloff", value.asInstanceOf[js.Any])
      
      inline def setDynamicScreenSpaceErrorHeightFalloffUndefined: Self = StObject.set(x, "dynamicScreenSpaceErrorHeightFalloff", js.undefined)
      
      inline def setDynamicScreenSpaceErrorUndefined: Self = StObject.set(x, "dynamicScreenSpaceError", js.undefined)
      
      inline def setEllipsoid(value: Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
      
      inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
      
      inline def setEnableDebugWireframe(value: Boolean): Self = StObject.set(x, "enableDebugWireframe", value.asInstanceOf[js.Any])
      
      inline def setEnableDebugWireframeUndefined: Self = StObject.set(x, "enableDebugWireframe", js.undefined)
      
      inline def setEnableShowOutline(value: Boolean): Self = StObject.set(x, "enableShowOutline", value.asInstanceOf[js.Any])
      
      inline def setEnableShowOutlineUndefined: Self = StObject.set(x, "enableShowOutline", js.undefined)
      
      inline def setFeatureIdLabel(value: String | Double): Self = StObject.set(x, "featureIdLabel", value.asInstanceOf[js.Any])
      
      inline def setFeatureIdLabelUndefined: Self = StObject.set(x, "featureIdLabel", js.undefined)
      
      inline def setFoveatedConeSize(value: Double): Self = StObject.set(x, "foveatedConeSize", value.asInstanceOf[js.Any])
      
      inline def setFoveatedConeSizeUndefined: Self = StObject.set(x, "foveatedConeSize", js.undefined)
      
      inline def setFoveatedInterpolationCallback(value: (/* p */ Double, /* q */ Double, /* time */ Double) => Double): Self = StObject.set(x, "foveatedInterpolationCallback", js.Any.fromFunction3(value))
      
      inline def setFoveatedInterpolationCallbackUndefined: Self = StObject.set(x, "foveatedInterpolationCallback", js.undefined)
      
      inline def setFoveatedMinimumScreenSpaceErrorRelaxation(value: Double): Self = StObject.set(x, "foveatedMinimumScreenSpaceErrorRelaxation", value.asInstanceOf[js.Any])
      
      inline def setFoveatedMinimumScreenSpaceErrorRelaxationUndefined: Self = StObject.set(x, "foveatedMinimumScreenSpaceErrorRelaxation", js.undefined)
      
      inline def setFoveatedScreenSpaceError(value: Boolean): Self = StObject.set(x, "foveatedScreenSpaceError", value.asInstanceOf[js.Any])
      
      inline def setFoveatedScreenSpaceErrorUndefined: Self = StObject.set(x, "foveatedScreenSpaceError", js.undefined)
      
      inline def setFoveatedTimeDelay(value: Double): Self = StObject.set(x, "foveatedTimeDelay", value.asInstanceOf[js.Any])
      
      inline def setFoveatedTimeDelayUndefined: Self = StObject.set(x, "foveatedTimeDelay", js.undefined)
      
      inline def setImageBasedLighting(value: ImageBasedLighting): Self = StObject.set(x, "imageBasedLighting", value.asInstanceOf[js.Any])
      
      inline def setImageBasedLightingUndefined: Self = StObject.set(x, "imageBasedLighting", js.undefined)
      
      inline def setImmediatelyLoadDesiredLevelOfDetail(value: Boolean): Self = StObject.set(x, "immediatelyLoadDesiredLevelOfDetail", value.asInstanceOf[js.Any])
      
      inline def setImmediatelyLoadDesiredLevelOfDetailUndefined: Self = StObject.set(x, "immediatelyLoadDesiredLevelOfDetail", js.undefined)
      
      inline def setInstanceFeatureIdLabel(value: String | Double): Self = StObject.set(x, "instanceFeatureIdLabel", value.asInstanceOf[js.Any])
      
      inline def setInstanceFeatureIdLabelUndefined: Self = StObject.set(x, "instanceFeatureIdLabel", js.undefined)
      
      inline def setLightColor(value: Cartesian3): Self = StObject.set(x, "lightColor", value.asInstanceOf[js.Any])
      
      inline def setLightColorUndefined: Self = StObject.set(x, "lightColor", js.undefined)
      
      inline def setLoadSiblings(value: Boolean): Self = StObject.set(x, "loadSiblings", value.asInstanceOf[js.Any])
      
      inline def setLoadSiblingsUndefined: Self = StObject.set(x, "loadSiblings", js.undefined)
      
      inline def setMaximumMemoryUsage(value: Double): Self = StObject.set(x, "maximumMemoryUsage", value.asInstanceOf[js.Any])
      
      inline def setMaximumMemoryUsageUndefined: Self = StObject.set(x, "maximumMemoryUsage", js.undefined)
      
      inline def setMaximumScreenSpaceError(value: Double): Self = StObject.set(x, "maximumScreenSpaceError", value.asInstanceOf[js.Any])
      
      inline def setMaximumScreenSpaceErrorUndefined: Self = StObject.set(x, "maximumScreenSpaceError", js.undefined)
      
      inline def setModelForwardAxis(value: Axis): Self = StObject.set(x, "modelForwardAxis", value.asInstanceOf[js.Any])
      
      inline def setModelForwardAxisUndefined: Self = StObject.set(x, "modelForwardAxis", js.undefined)
      
      inline def setModelMatrix(value: Matrix4): Self = StObject.set(x, "modelMatrix", value.asInstanceOf[js.Any])
      
      inline def setModelMatrixUndefined: Self = StObject.set(x, "modelMatrix", js.undefined)
      
      inline def setModelUpAxis(value: Axis): Self = StObject.set(x, "modelUpAxis", value.asInstanceOf[js.Any])
      
      inline def setModelUpAxisUndefined: Self = StObject.set(x, "modelUpAxis", js.undefined)
      
      inline def setOutlineColor(value: Color): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
      
      inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
      
      inline def setPointCloudShading(value: Any): Self = StObject.set(x, "pointCloudShading", value.asInstanceOf[js.Any])
      
      inline def setPointCloudShadingUndefined: Self = StObject.set(x, "pointCloudShading", js.undefined)
      
      inline def setPreferLeaves(value: Boolean): Self = StObject.set(x, "preferLeaves", value.asInstanceOf[js.Any])
      
      inline def setPreferLeavesUndefined: Self = StObject.set(x, "preferLeaves", js.undefined)
      
      inline def setPreloadFlightDestinations(value: Boolean): Self = StObject.set(x, "preloadFlightDestinations", value.asInstanceOf[js.Any])
      
      inline def setPreloadFlightDestinationsUndefined: Self = StObject.set(x, "preloadFlightDestinations", js.undefined)
      
      inline def setPreloadWhenHidden(value: Boolean): Self = StObject.set(x, "preloadWhenHidden", value.asInstanceOf[js.Any])
      
      inline def setPreloadWhenHiddenUndefined: Self = StObject.set(x, "preloadWhenHidden", js.undefined)
      
      inline def setProgressiveResolutionHeightFraction(value: Double): Self = StObject.set(x, "progressiveResolutionHeightFraction", value.asInstanceOf[js.Any])
      
      inline def setProgressiveResolutionHeightFractionUndefined: Self = StObject.set(x, "progressiveResolutionHeightFraction", js.undefined)
      
      inline def setProjectTo2D(value: Boolean): Self = StObject.set(x, "projectTo2D", value.asInstanceOf[js.Any])
      
      inline def setProjectTo2DUndefined: Self = StObject.set(x, "projectTo2D", js.undefined)
      
      inline def setShadows(value: ShadowMode): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
      
      inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowCreditsOnScreen(value: Boolean): Self = StObject.set(x, "showCreditsOnScreen", value.asInstanceOf[js.Any])
      
      inline def setShowCreditsOnScreenUndefined: Self = StObject.set(x, "showCreditsOnScreen", js.undefined)
      
      inline def setShowOutline(value: Boolean): Self = StObject.set(x, "showOutline", value.asInstanceOf[js.Any])
      
      inline def setShowOutlineUndefined: Self = StObject.set(x, "showOutline", js.undefined)
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setSkipLevelOfDetail(value: Boolean): Self = StObject.set(x, "skipLevelOfDetail", value.asInstanceOf[js.Any])
      
      inline def setSkipLevelOfDetailUndefined: Self = StObject.set(x, "skipLevelOfDetail", js.undefined)
      
      inline def setSkipLevels(value: Double): Self = StObject.set(x, "skipLevels", value.asInstanceOf[js.Any])
      
      inline def setSkipLevelsUndefined: Self = StObject.set(x, "skipLevels", js.undefined)
      
      inline def setSkipScreenSpaceErrorFactor(value: Double): Self = StObject.set(x, "skipScreenSpaceErrorFactor", value.asInstanceOf[js.Any])
      
      inline def setSkipScreenSpaceErrorFactorUndefined: Self = StObject.set(x, "skipScreenSpaceErrorFactor", js.undefined)
      
      inline def setSplitDirection(value: SplitDirection): Self = StObject.set(x, "splitDirection", value.asInstanceOf[js.Any])
      
      inline def setSplitDirectionUndefined: Self = StObject.set(x, "splitDirection", js.undefined)
      
      inline def setVectorClassificationOnly(value: Boolean): Self = StObject.set(x, "vectorClassificationOnly", value.asInstanceOf[js.Any])
      
      inline def setVectorClassificationOnlyUndefined: Self = StObject.set(x, "vectorClassificationOnly", js.undefined)
      
      inline def setVectorKeepDecodedPositions(value: Boolean): Self = StObject.set(x, "vectorKeepDecodedPositions", value.asInstanceOf[js.Any])
      
      inline def setVectorKeepDecodedPositionsUndefined: Self = StObject.set(x, "vectorKeepDecodedPositions", js.undefined)
    }
  }
  
  /**
    * Optimization option. Used as a callback when {@link Cesium3DTileset#foveatedScreenSpaceError} is true to control how much to raise the screen space error for tiles outside the foveated cone,
    * interpolating between {@link Cesium3DTileset#foveatedMinimumScreenSpaceErrorRelaxation} and {@link Cesium3DTileset#maximumScreenSpaceError}.
    * @param p - The start value to interpolate.
    * @param q - The end value to interpolate.
    * @param time - The time of interpolation generally in the range <code>[0.0, 1.0]</code>.
    */
  type foveatedInterpolationCallback = js.Function3[/* p */ Double, /* q */ Double, /* time */ Double, Double]
}
