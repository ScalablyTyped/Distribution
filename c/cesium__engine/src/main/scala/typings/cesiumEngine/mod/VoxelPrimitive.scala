package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "VoxelPrimitive")
@js.native
open class VoxelPrimitive () extends StObject {
  def this(options: typings.cesiumEngine.anon.CustomShader) = this()
  
  /**
    * Gets the bounding sphere.
    */
  val boundingSphere: BoundingSphere = js.native
  
  /**
    * The {@link ClippingPlaneCollection} used to selectively disable rendering the primitive.
    */
  var clippingPlanes: ClippingPlaneCollection = js.native
  
  /**
    * Gets or sets the custom shader. If undefined, {@link VoxelPrimitive.DefaultCustomShader} is set.
    */
  var customShader: CustomShader = js.native
  
  /**
    * Gets an event that is raised whenever a custom shader is compiled.
    */
  val customShaderCompilationEvent: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets or sets whether or not to render debug visualizations.
    */
  var debugDraw: Boolean = js.native
  
  /**
    * Gets or sets whether or not to test against depth when rendering.
    */
  var depthTest: Boolean = js.native
  
  /**
    * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
    * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
    * <br /><br />
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * @example
    * voxelPrimitive = voxelPrimitive && voxelPrimitive.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets the voxel dimensions.
    */
  val dimensions: Cartesian3 = js.native
  
  /**
    * Gets or sets whether or not the primitive should update when the view changes.
    */
  var disableUpdate: Boolean = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns <code>true</code> if this object was destroyed; otherwise, <code>false</code>.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets or sets whether or not to jitter the view ray during the raymarch.
    * This reduces stair-step artifacts but introduces noise.
    */
  var jitter: Boolean = js.native
  
  /**
    * Gets or sets the maximum bounds in the shape's local coordinate system.
    * Voxel data is stretched or squashed to fit the bounds.
    */
  var maxBounds: Cartesian3 = js.native
  
  /**
    * Gets or sets the maximum clipping location in the shape's local coordinate system.
    * Any voxel content outside the range is clipped.
    */
  var maxClippingBounds: Cartesian3 = js.native
  
  /**
    * Gets the maximum value per channel of the voxel data.
    */
  val maximumValues: js.Array[js.Array[Double]] = js.native
  
  /**
    * Gets or sets the minimum bounds in the shape's local coordinate system.
    * Voxel data is stretched or squashed to fit the bounds.
    */
  var minBounds: Cartesian3 = js.native
  
  /**
    * Gets or sets the minimum clipping location in the shape's local coordinate system.
    * Any voxel content outside the range is clipped.
    */
  var minClippingBounds: Cartesian3 = js.native
  
  /**
    * Gets the minimum value per channel of the voxel data.
    */
  val minimumValues: js.Array[js.Array[Double]] = js.native
  
  /**
    * Gets the model matrix.
    */
  val modelMatrix: Matrix4 = js.native
  
  /**
    * Gets or sets the nearest sampling.
    */
  var nearestSampling: Boolean = js.native
  
  /**
    * Gets the oriented bounding box.
    */
  val orientedBoundingBox: OrientedBoundingBox = js.native
  
  /**
    * Gets the {@link VoxelProvider} associated with this primitive.
    */
  val provider: VoxelProvider = js.native
  
  /**
    * Gets a value indicating whether or not the primitive is ready for use.
    */
  val ready: Boolean = js.native
  
  /**
    * Gets the promise that will be resolved when the primitive is ready for use.
    */
  val readyPromise: js.Promise[VoxelPrimitive] = js.native
  
  /**
    * Gets or sets the screen space error in pixels. If the screen space size
    * of a voxel is greater than the screen space error, the tile is subdivided.
    * Lower screen space error corresponds with higher detail rendering, but could
    * result in worse performance and higher memory consumption.
    */
  var screenSpaceError: Double = js.native
  
  /**
    * Gets the shape type.
    */
  val shape: VoxelShapeType = js.native
  
  /**
    * Gets or sets whether or not this primitive should be displayed.
    */
  var show: Boolean = js.native
  
  /**
    * Gets or sets the step size multiplier used during raymarching.
    * The lower the value, the higher the rendering quality, but
    * also the worse the performance.
    */
  var stepSize: Double = js.native
}
