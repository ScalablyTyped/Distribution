package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ScreenSpaceCameraController")
@js.native
class ScreenSpaceCameraController protected () extends js.Object {
  def this(scene: Scene) = this()
  var bounceAnimationTime: scala.Double = js.native
  var enableCollisionDetection: scala.Boolean = js.native
  var enableInputs: scala.Boolean = js.native
  var enableLook: scala.Boolean = js.native
  var enableRotate: scala.Boolean = js.native
  var enableTilt: scala.Boolean = js.native
  var enableTranslate: scala.Boolean = js.native
  var enableZoom: scala.Boolean = js.native
  var inertiaSpin: scala.Double = js.native
  var inertiaTranslate: scala.Double = js.native
  var inertiaZoom: scala.Double = js.native
  var lookEventTypes: CameraEventType | js.Array[_] = js.native
  var maximumMovementRatio: scala.Double = js.native
  var maximumZoomDistance: scala.Double = js.native
  var minimumCollisionTerrainHeight: scala.Double = js.native
  var minimumPickingTerrainHeight: scala.Double = js.native
  var minimumTrackBallHeight: scala.Double = js.native
  var minimumZoomDistance: scala.Double = js.native
  var rotateEventTypes: CameraEventType | js.Array[_] = js.native
  var tiltEventTypes: CameraEventType | js.Array[_] = js.native
  var translateEventTypes: CameraEventType | js.Array[_] = js.native
  var zoomEventTypes: CameraEventType | js.Array[_] = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
}

