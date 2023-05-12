package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.Bottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "OrthographicOffCenterFrustum")
@js.native
open class OrthographicOffCenterFrustum () extends StObject {
  def this(options: Bottom) = this()
  
  /**
    * The bottom clipping plane.
    */
  var bottom: Double = js.native
  
  def clone(result: OrthographicOffCenterFrustum): OrthographicOffCenterFrustum = js.native
  
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
    * Compares the provided OrthographicOffCenterFrustum componentwise and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [other] - The right hand side OrthographicOffCenterFrustum.
    * @returns <code>true</code> if they are equal, <code>false</code> otherwise.
    */
  def equals(): Boolean = js.native
  def equals(other: OrthographicOffCenterFrustum): Boolean = js.native
  
  /**
    * Compares the provided OrthographicOffCenterFrustum componentwise and returns
    * <code>true</code> if they pass an absolute or relative tolerance test,
    * <code>false</code> otherwise.
    * @param other - The right hand side OrthographicOffCenterFrustum.
    * @param relativeEpsilon - The relative epsilon tolerance to use for equality testing.
    * @param [absoluteEpsilon = relativeEpsilon] - The absolute epsilon tolerance to use for equality testing.
    * @returns <code>true</code> if this and other are within the provided epsilon, <code>false</code> otherwise.
    */
  def equalsEpsilon(other: OrthographicOffCenterFrustum, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(other: OrthographicOffCenterFrustum, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  
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
    * The left clipping plane.
    */
  var left: Double = js.native
  
  /**
    * The distance of the near plane.
    */
  var near: Double = js.native
  
  /**
    * Gets the orthographic projection matrix computed from the view frustum.
    */
  val projectionMatrix: Matrix4 = js.native
  
  /**
    * The right clipping plane.
    */
  var right: Double = js.native
  
  /**
    * The top clipping plane.
    */
  var top: Double = js.native
}
