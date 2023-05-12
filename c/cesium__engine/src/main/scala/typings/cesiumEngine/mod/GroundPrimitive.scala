package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.AllowPicking
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "GroundPrimitive")
@js.native
open class GroundPrimitive () extends StObject {
  def this(options: AllowPicking) = this()
  
  /**
    * When <code>true</code>, each geometry instance will only be pickable with {@link Scene#pick}.  When <code>false</code>, GPU memory is saved.
    */
  val allowPicking: Boolean = js.native
  
  /**
    * The {@link Appearance} used to shade this primitive. Each geometry
    * instance is shaded with the same appearance.  Some appearances, like
    * {@link PerInstanceColorAppearance} allow giving each instance unique
    * properties.
    */
  var appearance: Appearance = js.native
  
  /**
    * Determines if the geometry instances will be created and batched on a web worker.
    */
  val asynchronous: Boolean = js.native
  
  /**
    * Determines whether terrain, 3D Tiles or both will be classified.
    */
  var classificationType: ClassificationType = js.native
  
  /**
    * When <code>true</code>, geometry vertices are compressed, which will save memory.
    */
  val compressVertices: Boolean = js.native
  
  /**
    * This property is for debugging only; it is not for production use nor is it optimized.
    * <p>
    * Draws the bounding sphere for each draw command in the primitive.
    * </p>
    */
  var debugShowBoundingVolume: Boolean = js.native
  
  /**
    * This property is for debugging only; it is not for production use nor is it optimized.
    * <p>
    * Draws the shadow volume for each geometry in the primitive.
    * </p>
    */
  var debugShowShadowVolume: Boolean = js.native
  
  /**
    * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
    * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
    * <p>
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * </p>
    * @example
    * e = e && e.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * The geometry instances rendered with this primitive.  This may
    * be <code>undefined</code> if <code>options.releaseGeometryInstances</code>
    * is <code>true</code> when the primitive is constructed.
    * <p>
    * Changing this property after the primitive is rendered has no effect.
    * </p>
    */
  val geometryInstances: js.Array[Any] | GeometryInstance = js.native
  
  /**
    * Returns the modifiable per-instance attributes for a {@link GeometryInstance}.
    * @example
    * const attributes = primitive.getGeometryInstanceAttributes('an id');
    * attributes.color = Cesium.ColorGeometryInstanceAttribute.toValue(Cesium.Color.AQUA);
    * attributes.show = Cesium.ShowGeometryInstanceAttribute.toValue(true);
    * @param id - The id of the {@link GeometryInstance}.
    * @returns The typed array in the attribute's format or undefined if the is no instance with id.
    */
  def getGeometryInstanceAttributes(id: Any): Any = js.native
  
  /**
    * Determines if geometry vertex attributes are interleaved, which can slightly improve rendering performance.
    */
  val interleave: Boolean = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <p>
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * </p>
    * @returns <code>true</code> if this object was destroyed; otherwise, <code>false</code>.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Determines if the primitive is complete and ready to render.  If this property is
    * true, the primitive will be rendered the next time that {@link GroundPrimitive#update}
    * is called.
    */
  val ready: Boolean = js.native
  
  /**
    * Gets a promise that resolves when the primitive is ready to render.
    */
  val readyPromise: js.Promise[GroundPrimitive] = js.native
  
  /**
    * When <code>true</code>, the primitive does not keep a reference to the input <code>geometryInstances</code> to save memory.
    */
  val releaseGeometryInstances: Boolean = js.native
  
  /**
    * Determines if the primitive will be shown.  This affects all geometry
    * instances in the primitive.
    */
  var show: Boolean = js.native
  
  /**
    * Called when {@link Viewer} or {@link CesiumWidget} render the scene to
    * get the draw commands needed to render this primitive.
    * <p>
    * Do not call this function directly.  This is documented just to
    * list the exceptions that may be propagated when the scene is rendered:
    * </p>
    */
  def update(): Unit = js.native
  
  /**
    * When <code>true</code>, geometry vertices are optimized for the pre and post-vertex-shader caches.
    */
  val vertexCacheOptimize: Boolean = js.native
}
/* static members */
object GroundPrimitive {
  
  @JSImport("@cesium/engine", "GroundPrimitive")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Initializes the minimum and maximum terrain heights. This only needs to be called if you are creating the
    * GroundPrimitive synchronously.
    * @returns A promise that will resolve once the terrain heights have been loaded.
    */
  inline def initializeTerrainHeights(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeTerrainHeights")().asInstanceOf[js.Promise[Unit]]
  
  /**
    * Determines if GroundPrimitive rendering is supported.
    * @param scene - The scene.
    * @returns <code>true</code> if GroundPrimitives are supported; otherwise, returns <code>false</code>
    */
  inline def isSupported(scene: Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Checks if the given Scene supports materials on GroundPrimitives.
    * Materials on GroundPrimitives require support for the WEBGL_depth_texture extension.
    * @param scene - The current scene.
    * @returns Whether or not the current scene supports materials on GroundPrimitives.
    */
  inline def supportsMaterials(scene: Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsMaterials")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
