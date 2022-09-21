package typings.cesium.mod

import typings.cesium.anon.AspectRatio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "OrthographicFrustum")
@js.native
open class OrthographicFrustum () extends StObject {
  def this(options: AspectRatio) = this()
  
  /**
    * The aspect ratio of the frustum's width to it's height.
    */
  var aspectRatio: Double = js.native
  
  def clone(result: OrthographicFrustum): OrthographicFrustum = js.native
  
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
    * Compares the provided OrthographicFrustum componentwise and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [other] - The right hand side OrthographicFrustum.
    * @returns <code>true</code> if they are equal, <code>false</code> otherwise.
    */
  def equals(): Boolean = js.native
  def equals(other: OrthographicFrustum): Boolean = js.native
  
  /**
    * Compares the provided OrthographicFrustum componentwise and returns
    * <code>true</code> if they pass an absolute or relative tolerance test,
    * <code>false</code> otherwise.
    * @param other - The right hand side OrthographicFrustum.
    * @param relativeEpsilon - The relative epsilon tolerance to use for equality testing.
    * @param [absoluteEpsilon = relativeEpsilon] - The absolute epsilon tolerance to use for equality testing.
    * @returns <code>true</code> if this and other are within the provided epsilon, <code>false</code> otherwise.
    */
  def equalsEpsilon(other: OrthographicFrustum, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(other: OrthographicFrustum, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  
  /**
    * The distance of the far plane.
    */
  var far: Double = js.native
  
  /**
    * Returns the pixel's width and height in meters.
    * @example
    * // Example 1
    * // Get the width and height of a pixel.
    * const pixelSize = camera.frustum.getPixelDimensions(scene.drawingBufferWidth, scene.drawingBufferHeight, 0.0, scene.pixelRatio, new Cesium.Cartesian2());
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
    * The distance of the near plane.
    */
  var near: Double = js.native
  
  /**
    * Gets the orthographic projection matrix computed from the view frustum.
    */
  val projectionMatrix: Matrix4 = js.native
  
  /**
    * The horizontal width of the frustum in meters.
    */
  var width: Double = js.native
}
/* static members */
object OrthographicFrustum {
  
  @JSImport("cesium", "OrthographicFrustum")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Stores the provided instance into the provided array.
    * @param value - The value to pack.
    * @param array - The array to pack into.
    * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
    * @returns The array that was packed into
    */
  inline def pack(value: OrthographicFrustum, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: OrthographicFrustum, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /**
    * The number of elements used to pack the object into an array.
    */
  @JSImport("cesium", "OrthographicFrustum.packedLength")
  @js.native
  def packedLength: Double = js.native
  inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
  
  /**
    * Retrieves an instance from a packed array.
    * @param array - The packed array.
    * @param [startingIndex = 0] - The starting index of the element to be unpacked.
    * @param [result] - The object into which to store the result.
    * @returns The modified result parameter or a new OrthographicFrustum instance if one was not provided.
    */
  inline def unpack(array: js.Array[Double]): OrthographicFrustum = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[OrthographicFrustum]
  inline def unpack(array: js.Array[Double], startingIndex: Double): OrthographicFrustum = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[OrthographicFrustum]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: OrthographicFrustum): OrthographicFrustum = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[OrthographicFrustum]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: OrthographicFrustum): OrthographicFrustum = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[OrthographicFrustum]
}
