package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PerspectiveOffCenterFrustum")
@js.native
class PerspectiveOffCenterFrustum ()
  extends cesiumLib.cesiumMod.CesiumNs.PerspectiveOffCenterFrustum {
  def this(options: cesiumLib.Anon_Bottom) = this()
  /* CompleteClass */
  override var far: scala.Double = js.native
  /* CompleteClass */
  override var near: scala.Double = js.native
  /* CompleteClass */
  override val projectionMatrix: cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  /* CompleteClass */
  override def computeCullingVolume(
    position: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    direction: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    up: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.CullingVolume = js.native
  /* CompleteClass */
  override def getPixelDimensions(
    drawingBufferWidth: scala.Double,
    drawingBufferHeight: scala.Double,
    distance: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian2
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
}

