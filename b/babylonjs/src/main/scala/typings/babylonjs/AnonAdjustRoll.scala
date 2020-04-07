package typings.babylonjs

import typings.babylonjs.BABYLON.Space
import typings.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdjustRoll extends js.Object {
  var adjustPitch: js.UndefOr[Double] = js.undefined
  var adjustRoll: js.UndefOr[Double] = js.undefined
  var adjustYaw: js.UndefOr[Double] = js.undefined
  var maxPitch: js.UndefOr[Double] = js.undefined
  var maxYaw: js.UndefOr[Double] = js.undefined
  var minPitch: js.UndefOr[Double] = js.undefined
  var minYaw: js.UndefOr[Double] = js.undefined
  var pitchAxis: js.UndefOr[Vector3] = js.undefined
  var slerpAmount: js.UndefOr[Double] = js.undefined
  var upAxis: js.UndefOr[Vector3] = js.undefined
  var upAxisSpace: js.UndefOr[Space] = js.undefined
  var yawAxis: js.UndefOr[Vector3] = js.undefined
}

object AnonAdjustRoll {
  @scala.inline
  def apply(
    adjustPitch: Int | Double = null,
    adjustRoll: Int | Double = null,
    adjustYaw: Int | Double = null,
    maxPitch: Int | Double = null,
    maxYaw: Int | Double = null,
    minPitch: Int | Double = null,
    minYaw: Int | Double = null,
    pitchAxis: Vector3 = null,
    slerpAmount: Int | Double = null,
    upAxis: Vector3 = null,
    upAxisSpace: Space = null,
    yawAxis: Vector3 = null
  ): AnonAdjustRoll = {
    val __obj = js.Dynamic.literal()
    if (adjustPitch != null) __obj.updateDynamic("adjustPitch")(adjustPitch.asInstanceOf[js.Any])
    if (adjustRoll != null) __obj.updateDynamic("adjustRoll")(adjustRoll.asInstanceOf[js.Any])
    if (adjustYaw != null) __obj.updateDynamic("adjustYaw")(adjustYaw.asInstanceOf[js.Any])
    if (maxPitch != null) __obj.updateDynamic("maxPitch")(maxPitch.asInstanceOf[js.Any])
    if (maxYaw != null) __obj.updateDynamic("maxYaw")(maxYaw.asInstanceOf[js.Any])
    if (minPitch != null) __obj.updateDynamic("minPitch")(minPitch.asInstanceOf[js.Any])
    if (minYaw != null) __obj.updateDynamic("minYaw")(minYaw.asInstanceOf[js.Any])
    if (pitchAxis != null) __obj.updateDynamic("pitchAxis")(pitchAxis.asInstanceOf[js.Any])
    if (slerpAmount != null) __obj.updateDynamic("slerpAmount")(slerpAmount.asInstanceOf[js.Any])
    if (upAxis != null) __obj.updateDynamic("upAxis")(upAxis.asInstanceOf[js.Any])
    if (upAxisSpace != null) __obj.updateDynamic("upAxisSpace")(upAxisSpace.asInstanceOf[js.Any])
    if (yawAxis != null) __obj.updateDynamic("yawAxis")(yawAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdjustRoll]
  }
}

