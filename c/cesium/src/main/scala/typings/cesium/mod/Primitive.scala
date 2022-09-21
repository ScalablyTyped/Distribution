package typings.cesium.mod

import typings.cesium.anon.CompressVertices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Primitive")
@js.native
open class Primitive () extends StObject {
  def this(options: CompressVertices) = this()
  
  /**
    * When <code>true</code>, each geometry instance will only be pickable with {@link Scene#pick}.  When <code>false</code>, GPU memory is saved.         *
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
    * When <code>true</code>, geometry vertices are compressed, which will save memory.
    */
  val compressVertices: Boolean = js.native
  
  /**
    * When <code>true</code>, the renderer frustum culls and horizon culls the primitive's commands
    * based on their bounding volume.  Set this to <code>false</code> for a small performance gain
    * if you are manually culling the primitive.
    */
  var cull: Boolean = js.native
  
  /**
    * This property is for debugging only; it is not for production use nor is it optimized.
    * <p>
    * Draws the bounding sphere for each draw command in the primitive.
    * </p>
    */
  var debugShowBoundingVolume: Boolean = js.native
  
  /**
    * The {@link Appearance} used to shade this primitive when it fails the depth test. Each geometry
    * instance is shaded with the same appearance.  Some appearances, like
    * {@link PerInstanceColorAppearance} allow giving each instance unique
    * properties.
    *
    * <p>
    * When using an appearance that requires a color attribute, like PerInstanceColorAppearance,
    * add a depthFailColor per-instance attribute instead.
    * </p>
    *
    * <p>
    * Requires the EXT_frag_depth WebGL extension to render properly. If the extension is not supported,
    * there may be artifacts.
    * </p>
    */
  var depthFailAppearance: Appearance = js.native
  
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
  val geometryInstances: js.Array[GeometryInstance] | GeometryInstance = js.native
  
  /**
    * Returns the modifiable per-instance attributes for a {@link GeometryInstance}.
    * @example
    * const attributes = primitive.getGeometryInstanceAttributes('an id');
    * attributes.color = Cesium.ColorGeometryInstanceAttribute.toValue(Cesium.Color.AQUA);
    * attributes.show = Cesium.ShowGeometryInstanceAttribute.toValue(true);
    * attributes.distanceDisplayCondition = Cesium.DistanceDisplayConditionGeometryInstanceAttribute.toValue(100.0, 10000.0);
    * attributes.offset = Cesium.OffsetGeometryInstanceAttribute.toValue(Cartesian3.IDENTITY);
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
    * The 4x4 transformation matrix that transforms the primitive (all geometry instances) from model to world coordinates.
    * When this is the identity matrix, the primitive is drawn in world coordinates, i.e., Earth's WGS84 coordinates.
    * Local reference frames can be used by providing a different transformation matrix, like that returned
    * by {@link Transforms.eastNorthUpToFixedFrame}.
    *
    * <p>
    * This property is only supported in 3D mode.
    * </p>
    * @example
    * const origin = Cesium.Cartesian3.fromDegrees(-95.0, 40.0, 200000.0);
    * p.modelMatrix = Cesium.Transforms.eastNorthUpToFixedFrame(origin);
    */
  var modelMatrix: Matrix4 = js.native
  
  /**
    * Determines if the primitive is complete and ready to render.  If this property is
    * true, the primitive will be rendered the next time that {@link Primitive#update}
    * is called.
    */
  val ready: Boolean = js.native
  
  /**
    * Gets a promise that resolves when the primitive is ready to render.
    */
  val readyPromise: js.Promise[Primitive] = js.native
  
  /**
    * When <code>true</code>, the primitive does not keep a reference to the input <code>geometryInstances</code> to save memory.
    */
  val releaseGeometryInstances: Boolean = js.native
  
  /**
    * Determines whether this primitive casts or receives shadows from light sources.
    */
  var shadows: ShadowMode = js.native
  
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
