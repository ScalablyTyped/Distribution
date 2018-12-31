package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenSpaceCameraController extends js.Object {
  var bounceAnimationTime: scala.Double
  var enableCollisionDetection: scala.Boolean
  var enableInputs: scala.Boolean
  var enableLook: scala.Boolean
  var enableRotate: scala.Boolean
  var enableTilt: scala.Boolean
  var enableTranslate: scala.Boolean
  var enableZoom: scala.Boolean
  var inertiaSpin: scala.Double
  var inertiaTranslate: scala.Double
  var inertiaZoom: scala.Double
  var lookEventTypes: CameraEventType | js.Array[_]
  var maximumMovementRatio: scala.Double
  var maximumZoomDistance: scala.Double
  var minimumCollisionTerrainHeight: scala.Double
  var minimumPickingTerrainHeight: scala.Double
  var minimumTrackBallHeight: scala.Double
  var minimumZoomDistance: scala.Double
  var rotateEventTypes: CameraEventType | js.Array[_]
  var tiltEventTypes: CameraEventType | js.Array[_]
  var translateEventTypes: CameraEventType | js.Array[_]
  var zoomEventTypes: CameraEventType | js.Array[_]
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
}

