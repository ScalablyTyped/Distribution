package typings.cesium.mod

import typings.cesium.anon.Far
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PerspectiveFrustum")
@js.native
open class PerspectiveFrustum () extends StObject {
  def this(options: Far) = this()
  
  /**
    * The aspect ratio of the frustum's width to it's height.
    */
  var aspectRatio: Double = js.native
  
  def clone(result: PerspectiveFrustum): PerspectiveFrustum = js.native
  
  /**
    * Creates a culling volume for this frustum.
    * @example
    * // Check if a bounding volume intersects the frustum.
    * const cullingVolume = frustum.computeCullingVolume(cameraPosition, cameraDirection, cameraUp);
    * const intersect = cullingVolume.computeVisibility(boundingVolume);
    * @param position - The eye position.
    * @param direction - The view direction.
    * @param up - The up direction.
    * @returns A culling volume at the given position and orientation.
    */
  def computeCullingVolume(position: Cartesian3, direction: Cartesian3, up: Cartesian3): CullingVolume = js.native
  
  /**
    * Compares the provided PerspectiveFrustum componentwise and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [other] - The right hand side PerspectiveFrustum.
    * @returns <code>true</code> if they are equal, <code>false</code> otherwise.
    */
  def equals(): Boolean = js.native
  def equals(other: PerspectiveFrustum): Boolean = js.native
  
  /**
    * Compares the provided PerspectiveFrustum componentwise and returns
    * <code>true</code> if they pass an absolute or relative tolerance test,
    * <code>false</code> otherwise.
    * @param other - The right hand side PerspectiveFrustum.
    * @param relativeEpsilon - The relative epsilon tolerance to use for equality testing.
    * @param [absoluteEpsilon = relativeEpsilon] - The absolute epsilon tolerance to use for equality testing.
    * @returns <code>true</code> if this and other are within the provided epsilon, <code>false</code> otherwise.
    */
  def equalsEpsilon(other: PerspectiveFrustum, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(other: PerspectiveFrustum, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  
  /**
    * The distance of the far plane.
    */
  var far: Double = js.native
  
  /**
    * The angle of the field of view (FOV), in radians.  This angle will be used
    * as the horizontal FOV if the width is greater than the height, otherwise
    * it will be the vertical FOV.
    */
  var fov: Double = js.native
  
  /**
    * Gets the angle of the vertical field of view, in radians.
    */
  val fovy: Double = js.native
  
  /**
    * Returns the pixel's width and height in meters.
    * @example
    * // Example 1
    * // Get the width and height of a pixel.
    * const pixelSize = camera.frustum.getPixelDimensions(scene.drawingBufferWidth, scene.drawingBufferHeight, 1.0, scene.pixelRatio, new Cesium.Cartesian2());
    * @example
    * // Example 2
    * // Get the width and height of a pixel if the near plane was set to 'distance'.
    * // For example, get the size of a pixel of an image on a billboard.
    * const position = camera.position;
    * const direction = camera.direction;
    * const toCenter = Cesium.Cartesian3.subtract(primitive.boundingVolume.center, position, new Cesium.Cartesian3());      // vector from camera to a primitive
    * const toCenterProj = Cesium.Cartesian3.multiplyByScalar(direction, Cesium.Cartesian3.dot(direction, toCenter), new Cesium.Cartesian3()); // project vector onto camera direction vector
    * const distance = Cesium.Cartesian3.magnitude(toCenterProj);
    * const pixelSize = camera.frustum.getPixelDimensions(scene.drawingBufferWidth, scene.drawingBufferHeight, distance, scene.pixelRatio, new Cesium.Cartesian2());
    * @param drawingBufferWidth - The width of the drawing buffer.
    * @param drawingBufferHeight - The height of the drawing buffer.
    * @param distance - The distance to the near plane in meters.
    * @param pixelRatio - The scaling factor from pixel space to coordinate space.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter or a new instance of {@link Cartesian2} with the pixel's width and height in the x and y properties, respectively.
    */
  def getPixelDimensions(
    drawingBufferWidth: Double,
    drawingBufferHeight: Double,
    distance: Double,
    pixelRatio: Double,
    result: Cartesian2
  ): Cartesian2 = js.native
  
  /**
    * The perspective projection matrix computed from the view frustum with an infinite far plane.
    */
  val infiniteProjectionMatrix: Matrix4 = js.native
  
  /**
    * The distance of the near plane.
    */
  var near: Double = js.native
  
  /**
    * Gets the perspective projection matrix computed from the view frustum.
    */
  val projectionMatrix: Matrix4 = js.native
  
  /**
    * Offsets the frustum in the x direction.
    */
  var xOffset: Double = js.native
  
  /**
    * Offsets the frustum in the y direction.
    */
  var yOffset: Double = js.native
}
/* static members */
object PerspectiveFrustum {
  
  @JSImport("cesium", "PerspectiveFrustum")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Stores the provided instance into the provided array.
    * @param value - The value to pack.
    * @param array - The array to pack into.
    * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
    * @returns The array that was packed into
    */
  inline def pack(value: PerspectiveFrustum, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: PerspectiveFrustum, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /**
    * The number of elements used to pack the object into an array.
    */
  @JSImport("cesium", "PerspectiveFrustum.packedLength")
  @js.native
  def packedLength: Double = js.native
  inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
  
  /**
    * Retrieves an instance from a packed array.
    * @param array - The packed array.
    * @param [startingIndex = 0] - The starting index of the element to be unpacked.
    * @param [result] - The object into which to store the result.
    * @returns The modified result parameter or a new PerspectiveFrustum instance if one was not provided.
    */
  inline def unpack(array: js.Array[Double]): PerspectiveFrustum = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[PerspectiveFrustum]
  inline def unpack(array: js.Array[Double], startingIndex: Double): PerspectiveFrustum = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[PerspectiveFrustum]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: PerspectiveFrustum): PerspectiveFrustum = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[PerspectiveFrustum]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: PerspectiveFrustum): PerspectiveFrustum = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[PerspectiveFrustum]
}
