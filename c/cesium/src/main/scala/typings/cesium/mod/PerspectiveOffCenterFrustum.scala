package typings.cesium.mod

import typings.cesium.anon.Bottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PerspectiveOffCenterFrustum")
@js.native
open class PerspectiveOffCenterFrustum () extends StObject {
  def this(options: Bottom) = this()
  
  /**
    * Defines the bottom clipping plane.
    */
  var bottom: Double = js.native
  
  def clone(result: PerspectiveOffCenterFrustum): PerspectiveOffCenterFrustum = js.native
  
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
    * Compares the provided PerspectiveOffCenterFrustum componentwise and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [other] - The right hand side PerspectiveOffCenterFrustum.
    * @returns <code>true</code> if they are equal, <code>false</code> otherwise.
    */
  def equals(): Boolean = js.native
  def equals(other: PerspectiveOffCenterFrustum): Boolean = js.native
  
  /**
    * Compares the provided PerspectiveOffCenterFrustum componentwise and returns
    * <code>true</code> if they pass an absolute or relative tolerance test,
    * <code>false</code> otherwise.
    * @param other - The right hand side PerspectiveOffCenterFrustum.
    * @param relativeEpsilon - The relative epsilon tolerance to use for equality testing.
    * @param [absoluteEpsilon = relativeEpsilon] - The absolute epsilon tolerance to use for equality testing.
    * @returns <code>true</code> if this and other are within the provided epsilon, <code>false</code> otherwise.
    */
  def equalsEpsilon(other: PerspectiveOffCenterFrustum, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(other: PerspectiveOffCenterFrustum, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  
  /**
    * The distance of the far plane.
    */
  var far: Double = js.native
  
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
    * Gets the perspective projection matrix computed from the view frustum with an infinite far plane.
    */
  val infiniteProjectionMatrix: Matrix4 = js.native
  
  /**
    * Defines the left clipping plane.
    */
  var left: Double = js.native
  
  /**
    * The distance of the near plane.
    */
  var near: Double = js.native
  
  /**
    * Gets the perspective projection matrix computed from the view frustum.
    */
  val projectionMatrix: Matrix4 = js.native
  
  /**
    * Defines the right clipping plane.
    */
  var right: Double = js.native
  
  /**
    * Defines the top clipping plane.
    */
  var top: Double = js.native
}
