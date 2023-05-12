package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Globe")
@js.native
open class Globe () extends StObject {
  def this(ellipsoid: Ellipsoid) = this()
  
  /**
    * The brightness shift to apply to the atmosphere. Defaults to 0.0 (no shift).
    * A brightness shift of -1.0 is complete darkness, which will let space show through.
    */
  var atmosphereBrightnessShift: Double = js.native
  
  /**
    * The hue shift to apply to the atmosphere. Defaults to 0.0 (no shift).
    * A hue shift of 1.0 indicates a complete rotation of the hues available.
    */
  var atmosphereHueShift: Double = js.native
  
  /**
    * The intensity of the light that is used for computing the ground atmosphere color.
    */
  var atmosphereLightIntensity: Double = js.native
  
  /**
    * The anisotropy of the medium to consider for Mie scattering.
    * <p>
    * Valid values are between -1.0 and 1.0.
    * </p>
    */
  var atmosphereMieAnisotropy: Double = js.native
  
  /**
    * The Mie scattering coefficient used in the atmospheric scattering equations for the ground atmosphere.
    */
  var atmosphereMieCoefficient: Cartesian3 = js.native
  
  /**
    * The Mie scale height used in the atmospheric scattering equations for the ground atmosphere, in meters.
    */
  var atmosphereMieScaleHeight: Double = js.native
  
  /**
    * The Rayleigh scattering coefficient used in the atmospheric scattering equations for the ground atmosphere.
    */
  var atmosphereRayleighCoefficient: Cartesian3 = js.native
  
  /**
    * The Rayleigh scale height used in the atmospheric scattering equations for the ground atmosphere, in meters.
    */
  var atmosphereRayleighScaleHeight: Double = js.native
  
  /**
    * The saturation shift to apply to the atmosphere. Defaults to 0.0 (no shift).
    * A saturation shift of -1.0 is monochrome.
    */
  var atmosphereSaturationShift: Double = js.native
  
  /**
    * Whether to cull back-facing terrain. Back faces are not culled when the camera is underground or translucency is enabled.
    */
  var backFaceCulling: Boolean = js.native
  
  /**
    * Gets or sets the color of the globe when no imagery is available.
    */
  var baseColor: Color = js.native
  
  /**
    * A property specifying a {@link Rectangle} used to limit globe rendering to a cartographic area.
    * Defaults to the maximum extent of cartographic coordinates.
    */
  var cartographicLimitRectangle: Rectangle = js.native
  
  /**
    * A property specifying a {@link ClippingPlaneCollection} used to selectively disable rendering on the outside of each plane.
    */
  var clippingPlanes: ClippingPlaneCollection = js.native
  
  /**
    * True if primitives such as billboards, polylines, labels, etc. should be depth-tested
    * against the terrain surface, or false if such primitives should always be drawn on top
    * of terrain unless they're on the opposite side of the globe.  The disadvantage of depth
    * testing primitives against terrain is that slight numerical noise or terrain level-of-detail
    * switched can sometimes make a primitive that should be on the surface disappear underneath it.
    */
  var depthTestAgainstTerrain: Boolean = js.native
  
  /**
    * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
    * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
    * <br /><br />
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * @example
    * globe = globe && globe.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * Enable dynamic lighting effects on atmosphere and fog. This only takes effect
    * when <code>enableLighting</code> is <code>true</code>.
    */
  var dynamicAtmosphereLighting: Boolean = js.native
  
  /**
    * Whether dynamic atmosphere lighting uses the sun direction instead of the scene's
    * light direction. This only takes effect when <code>enableLighting</code> and
    * <code>dynamicAtmosphereLighting</code> are <code>true</code>.
    */
  var dynamicAtmosphereLightingFromSun: Boolean = js.native
  
  /**
    * Gets an ellipsoid describing the shape of this globe.
    */
  var ellipsoid: Ellipsoid = js.native
  
  /**
    * Enable lighting the globe with the scene's light source.
    */
  var enableLighting: Boolean = js.native
  
  /**
    * The color to use to highlight terrain fill tiles. If undefined, fill tiles are not
    * highlighted at all. The alpha value is used to alpha blend with the tile's
    * actual color. Because terrain fill tiles do not represent the actual terrain surface,
    * it may be useful in some applications to indicate visually that they are not to be trusted.
    */
  var fillHighlightColor: Color = js.native
  
  /**
    * Get the height of the surface at a given cartographic.
    * @param cartographic - The cartographic for which to find the height.
    * @returns The height of the cartographic or undefined if it could not be found.
    */
  def getHeight(cartographic: Cartographic): js.UndefOr[Double] = js.native
  
  /**
    * Gets the collection of image layers that will be rendered on this globe.
    */
  var imageryLayers: ImageryLayerCollection = js.native
  
  /**
    * Gets an event that's raised when an imagery layer is added, shown, hidden, moved, or removed.
    */
  val imageryLayersUpdatedEvent: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns True if this object was destroyed; otherwise, false.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * A multiplier to adjust terrain lambert lighting.
    * This number is multiplied by the result of <code>czm_getLambertDiffuse</code> in GlobeFS.glsl.
    * This only takes effect when <code>enableLighting</code> is <code>true</code>.
    */
  var lambertDiffuseMultiplier: Double = js.native
  
  /**
    * The distance where lighting resumes. This only takes effect
    * when <code>enableLighting</code> or <code>showGroundAtmosphere</code> is <code>true</code>.
    */
  var lightingFadeInDistance: Double = js.native
  
  /**
    * The distance where everything becomes lit. This only takes effect
    * when <code>enableLighting</code> or <code>showGroundAtmosphere</code> is <code>true</code>.
    */
  var lightingFadeOutDistance: Double = js.native
  
  /**
    * Gets or sets the number of loading descendant tiles that is considered "too many".
    * If a tile has too many loading descendants, that tile will be loaded and rendered before any of
    * its descendants are loaded and rendered. This means more feedback for the user that something
    * is happening at the cost of a longer overall load time. Setting this to 0 will cause each
    * tile level to be loaded successively, significantly increasing load time. Setting it to a large
    * number (e.g. 1000) will minimize the number of tiles that are loaded but tend to make
    * detail appear all at once after a long wait.
    */
  var loadingDescendantLimit: Double = js.native
  
  /**
    * Gets or sets the material appearance of the Globe.  This can be one of several built-in {@link Material} objects or a custom material, scripted with
    * {@link https://github.com/CesiumGS/cesium/wiki/Fabric|Fabric}.
    */
  var material: js.UndefOr[Material] = js.native
  
  /**
    * The maximum screen-space error used to drive level-of-detail refinement.  Higher
    * values will provide better performance but lower visual quality.
    */
  var maximumScreenSpaceError: Double = js.native
  
  /**
    * The distance where the darkness of night from the ground atmosphere fades in to an unlit ground atmosphere.
    * This only takes effect when <code>showGroundAtmosphere</code>, <code>enableLighting</code>, and
    * <code>dynamicAtmosphereLighting</code> are <code>true</code>.
    */
  var nightFadeInDistance: Double = js.native
  
  /**
    * The distance where the darkness of night from the ground atmosphere fades out to a lit ground atmosphere.
    * This only takes effect when <code>showGroundAtmosphere</code>, <code>enableLighting</code>, and
    * <code>dynamicAtmosphereLighting</code> are <code>true</code>.
    */
  var nightFadeOutDistance: Double = js.native
  
  /**
    * The normal map to use for rendering waves in the ocean.  Setting this property will
    * only have an effect if the configured terrain provider includes a water mask.
    */
  var oceanNormalMapUrl: String = js.native
  
  /**
    * Find an intersection between a ray and the globe surface that was rendered. The ray must be given in world coordinates.
    * @example
    * // find intersection of ray through a pixel and the globe
    * const ray = viewer.camera.getPickRay(windowCoordinates);
    * const intersection = globe.pick(ray, scene);
    * @param ray - The ray to test for intersection.
    * @param scene - The scene.
    * @param [result] - The object onto which to store the result.
    * @returns The intersection or <code>undefined</code> if none was found.
    */
  def pick(ray: Ray, scene: Scene): js.UndefOr[Cartesian3] = js.native
  def pick(ray: Ray, scene: Scene, result: Cartesian3): js.UndefOr[Cartesian3] = js.native
  
  /**
    * Gets or sets a value indicating whether the ancestors of rendered tiles should be preloaded.
    * Setting this to true optimizes the zoom-out experience and provides more detail in
    * newly-exposed areas when panning. The down side is that it requires loading more tiles.
    */
  var preloadAncestors: Boolean = js.native
  
  /**
    * Gets or sets a value indicating whether the siblings of rendered tiles should be preloaded.
    * Setting this to true causes tiles with the same parent as a rendered tile to be loaded, even
    * if they are culled. Setting this to true may provide a better panning experience at the
    * cost of loading more tiles.
    */
  var preloadSiblings: Boolean = js.native
  
  /**
    * Determines whether the globe casts or receives shadows from light sources. Setting the globe
    * to cast shadows may impact performance since the terrain is rendered again from the light's perspective.
    * Currently only terrain that is in view casts shadows. By default the globe does not cast shadows.
    */
  var shadows: ShadowMode = js.native
  
  /**
    * Determines if the globe will be shown.
    */
  var show: Boolean = js.native
  
  /**
    * Enable the ground atmosphere, which is drawn over the globe when viewed from a distance between <code>lightingFadeInDistance</code> and <code>lightingFadeOutDistance</code>.
    */
  var showGroundAtmosphere: Boolean = js.native
  
  /**
    * Whether to show terrain skirts. Terrain skirts are geometry extending downwards from a tile's edges used to hide seams between neighboring tiles.
    * Skirts are always hidden when the camera is underground or translucency is enabled.
    */
  var showSkirts: Boolean = js.native
  
  /**
    * True if an animated wave effect should be shown in areas of the globe
    * covered by water; otherwise, false.  This property is ignored if the
    * <code>terrainProvider</code> does not provide a water mask.
    */
  var showWaterEffect: Boolean = js.native
  
  /**
    * A scalar used to exaggerate the terrain. Defaults to <code>1.0</code> (no exaggeration).
    * A value of <code>2.0</code> scales the terrain by 2x.
    * A value of <code>0.0</code> makes the terrain completely flat.
    * Note that terrain exaggeration will not modify any other primitive as they are positioned relative to the ellipsoid.
    */
  var terrainExaggeration: Double = js.native
  
  /**
    * The height from which terrain is exaggerated. Defaults to <code>0.0</code> (scaled relative to ellipsoid surface).
    * Terrain that is above this height will scale upwards and terrain that is below this height will scale downwards.
    * Note that terrain exaggeration will not modify any other primitive as they are positioned relative to the ellipsoid.
    * If {@link Globe#terrainExaggeration} is <code>1.0</code> this value will have no effect.
    */
  var terrainExaggerationRelativeHeight: Double = js.native
  
  /**
    * The terrain provider providing surface geometry for this globe.
    */
  var terrainProvider: TerrainProvider = js.native
  
  /**
    * Gets an event that's raised when the terrain provider is changed
    */
  val terrainProviderChanged: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * The size of the terrain tile cache, expressed as a number of tiles.  Any additional
    * tiles beyond this number will be freed, as long as they aren't needed for rendering
    * this frame.  A larger number will consume more memory but will show detail faster
    * when, for example, zooming out and then back in.
    */
  var tileCacheSize: Double = js.native
  
  /**
    * Gets an event that's raised when the length of the tile load queue has changed since the last render frame.  When the load queue is empty,
    * all terrain and imagery for the current view have been loaded.  The event passes the new length of the tile load queue.
    */
  var tileLoadProgressEvent: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Returns <code>true</code> when the tile load queue is empty, <code>false</code> otherwise.  When the load queue is empty,
    * all terrain and imagery for the current view have been loaded.
    */
  val tilesLoaded: Boolean = js.native
  
  /**
    * Properties for controlling globe translucency.
    */
  var translucency: GlobeTranslucency = js.native
  
  /**
    * The color to render the back side of the globe when the camera is underground or the globe is translucent,
    * blended with the globe color based on the camera's distance.
    * <br /><br />
    * To disable underground coloring, set <code>undergroundColor</code> to <code>undefined</code>.
    */
  var undergroundColor: Color = js.native
  
  /**
    * Gets or sets the near and far distance for blending {@link Globe#undergroundColor} with the globe color.
    * The alpha will interpolate between the {@link NearFarScalar#nearValue} and
    * {@link NearFarScalar#farValue} while the camera distance falls within the lower and upper bounds
    * of the specified {@link NearFarScalar#near} and {@link NearFarScalar#far}.
    * Outside of these ranges the alpha remains clamped to the nearest bound. If undefined,
    * the underground color will not be blended with the globe color.
    * <br /> <br />
    * When the camera is above the ellipsoid the distance is computed from the nearest
    * point on the ellipsoid instead of the camera's position.
    */
  var undergroundColorAlphaByDistance: NearFarScalar = js.native
  
  /**
    * Determines the darkness of the vertex shadow.
    * This only takes effect when <code>enableLighting</code> is <code>true</code>.
    */
  var vertexShadowDarkness: Double = js.native
}
