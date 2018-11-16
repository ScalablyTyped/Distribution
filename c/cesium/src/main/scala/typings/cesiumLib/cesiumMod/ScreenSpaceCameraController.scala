package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ScreenSpaceCameraController")
@js.native
class ScreenSpaceCameraController protected ()
  extends cesiumLib.cesiumMod.CesiumNs.ScreenSpaceCameraController {
  def this(scene: cesiumLib.cesiumMod.CesiumNs.Scene) = this()
  /* CompleteClass */
  override var bounceAnimationTime: scala.Double = js.native
  /* CompleteClass */
  override var enableCollisionDetection: scala.Boolean = js.native
  /* CompleteClass */
  override var enableInputs: scala.Boolean = js.native
  /* CompleteClass */
  override var enableLook: scala.Boolean = js.native
  /* CompleteClass */
  override var enableRotate: scala.Boolean = js.native
  /* CompleteClass */
  override var enableTilt: scala.Boolean = js.native
  /* CompleteClass */
  override var enableTranslate: scala.Boolean = js.native
  /* CompleteClass */
  override var enableZoom: scala.Boolean = js.native
  /* CompleteClass */
  override var inertiaSpin: scala.Double = js.native
  /* CompleteClass */
  override var inertiaTranslate: scala.Double = js.native
  /* CompleteClass */
  override var inertiaZoom: scala.Double = js.native
  /* CompleteClass */
  override var lookEventTypes: cesiumLib.cesiumMod.CesiumNs.CameraEventType | js.Array[_] = js.native
  /* CompleteClass */
  override var maximumMovementRatio: scala.Double = js.native
  /* CompleteClass */
  override var maximumZoomDistance: scala.Double = js.native
  /* CompleteClass */
  override var minimumCollisionTerrainHeight: scala.Double = js.native
  /* CompleteClass */
  override var minimumPickingTerrainHeight: scala.Double = js.native
  /* CompleteClass */
  override var minimumTrackBallHeight: scala.Double = js.native
  /* CompleteClass */
  override var minimumZoomDistance: scala.Double = js.native
  /* CompleteClass */
  override var rotateEventTypes: cesiumLib.cesiumMod.CesiumNs.CameraEventType | js.Array[_] = js.native
  /* CompleteClass */
  override var tiltEventTypes: cesiumLib.cesiumMod.CesiumNs.CameraEventType | js.Array[_] = js.native
  /* CompleteClass */
  override var translateEventTypes: cesiumLib.cesiumMod.CesiumNs.CameraEventType | js.Array[_] = js.native
  /* CompleteClass */
  override var zoomEventTypes: cesiumLib.cesiumMod.CesiumNs.CameraEventType | js.Array[_] = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
}

