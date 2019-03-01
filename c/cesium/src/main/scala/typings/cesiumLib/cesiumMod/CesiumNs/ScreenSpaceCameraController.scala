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
    destroy: js.Function0[scala.Unit],
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
    isDestroyed: js.Function0[scala.Boolean],
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bounceAnimationTime")(bounceAnimationTime)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("enableCollisionDetection")(enableCollisionDetection)
    __obj.updateDynamic("enableInputs")(enableInputs)
    __obj.updateDynamic("enableLook")(enableLook)
    __obj.updateDynamic("enableRotate")(enableRotate)
    __obj.updateDynamic("enableTilt")(enableTilt)
    __obj.updateDynamic("enableTranslate")(enableTranslate)
    __obj.updateDynamic("enableZoom")(enableZoom)
    __obj.updateDynamic("inertiaSpin")(inertiaSpin)
    __obj.updateDynamic("inertiaTranslate")(inertiaTranslate)
    __obj.updateDynamic("inertiaZoom")(inertiaZoom)
    __obj.updateDynamic("isDestroyed")(isDestroyed)
    __obj.updateDynamic("lookEventTypes")(lookEventTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("maximumMovementRatio")(maximumMovementRatio)
    __obj.updateDynamic("maximumZoomDistance")(maximumZoomDistance)
    __obj.updateDynamic("minimumCollisionTerrainHeight")(minimumCollisionTerrainHeight)
    __obj.updateDynamic("minimumPickingTerrainHeight")(minimumPickingTerrainHeight)
    __obj.updateDynamic("minimumTrackBallHeight")(minimumTrackBallHeight)
    __obj.updateDynamic("minimumZoomDistance")(minimumZoomDistance)
    __obj.updateDynamic("rotateEventTypes")(rotateEventTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("tiltEventTypes")(tiltEventTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("translateEventTypes")(translateEventTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("zoomEventTypes")(zoomEventTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenSpaceCameraController]
  }
}

