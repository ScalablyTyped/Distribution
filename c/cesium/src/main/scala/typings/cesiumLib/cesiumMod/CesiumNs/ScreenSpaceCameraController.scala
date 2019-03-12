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

object ScreenSpaceCameraController {
  @scala.inline
  def apply(
    bounceAnimationTime: scala.Double,
    destroy: () => scala.Unit,
    enableCollisionDetection: scala.Boolean,
    enableInputs: scala.Boolean,
    enableLook: scala.Boolean,
    enableRotate: scala.Boolean,
    enableTilt: scala.Boolean,
    enableTranslate: scala.Boolean,
    enableZoom: scala.Boolean,
    inertiaSpin: scala.Double,
    inertiaTranslate: scala.Double,
    inertiaZoom: scala.Double,
    isDestroyed: () => scala.Boolean,
    lookEventTypes: CameraEventType | js.Array[_],
    maximumMovementRatio: scala.Double,
    maximumZoomDistance: scala.Double,
    minimumCollisionTerrainHeight: scala.Double,
    minimumPickingTerrainHeight: scala.Double,
    minimumTrackBallHeight: scala.Double,
    minimumZoomDistance: scala.Double,
    rotateEventTypes: CameraEventType | js.Array[_],
    tiltEventTypes: CameraEventType | js.Array[_],
    translateEventTypes: CameraEventType | js.Array[_],
    zoomEventTypes: CameraEventType | js.Array[_]
  ): ScreenSpaceCameraController = {
    val __obj = js.Dynamic.literal(bounceAnimationTime = bounceAnimationTime, destroy = js.Any.fromFunction0(destroy), enableCollisionDetection = enableCollisionDetection, enableInputs = enableInputs, enableLook = enableLook, enableRotate = enableRotate, enableTilt = enableTilt, enableTranslate = enableTranslate, enableZoom = enableZoom, inertiaSpin = inertiaSpin, inertiaTranslate = inertiaTranslate, inertiaZoom = inertiaZoom, isDestroyed = js.Any.fromFunction0(isDestroyed), lookEventTypes = lookEventTypes.asInstanceOf[js.Any], maximumMovementRatio = maximumMovementRatio, maximumZoomDistance = maximumZoomDistance, minimumCollisionTerrainHeight = minimumCollisionTerrainHeight, minimumPickingTerrainHeight = minimumPickingTerrainHeight, minimumTrackBallHeight = minimumTrackBallHeight, minimumZoomDistance = minimumZoomDistance, rotateEventTypes = rotateEventTypes.asInstanceOf[js.Any], tiltEventTypes = tiltEventTypes.asInstanceOf[js.Any], translateEventTypes = translateEventTypes.asInstanceOf[js.Any], zoomEventTypes = zoomEventTypes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScreenSpaceCameraController]
  }
}

