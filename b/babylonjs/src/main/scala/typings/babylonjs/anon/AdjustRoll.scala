package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Space
import typings.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdjustRoll extends js.Object {
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

object AdjustRoll {
  @scala.inline
  def apply(
    adjustPitch: js.UndefOr[Double] = js.undefined,
    adjustRoll: js.UndefOr[Double] = js.undefined,
    adjustYaw: js.UndefOr[Double] = js.undefined,
    maxPitch: js.UndefOr[Double] = js.undefined,
    maxYaw: js.UndefOr[Double] = js.undefined,
    minPitch: js.UndefOr[Double] = js.undefined,
    minYaw: js.UndefOr[Double] = js.undefined,
    pitchAxis: Vector3 = null,
    slerpAmount: js.UndefOr[Double] = js.undefined,
    upAxis: Vector3 = null,
    upAxisSpace: Space = null,
    yawAxis: Vector3 = null
  ): AdjustRoll = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustPitch)) __obj.updateDynamic("adjustPitch")(adjustPitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(adjustRoll)) __obj.updateDynamic("adjustRoll")(adjustRoll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(adjustYaw)) __obj.updateDynamic("adjustYaw")(adjustYaw.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPitch)) __obj.updateDynamic("maxPitch")(maxPitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxYaw)) __obj.updateDynamic("maxYaw")(maxYaw.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minPitch)) __obj.updateDynamic("minPitch")(minPitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minYaw)) __obj.updateDynamic("minYaw")(minYaw.get.asInstanceOf[js.Any])
    if (pitchAxis != null) __obj.updateDynamic("pitchAxis")(pitchAxis.asInstanceOf[js.Any])
    if (!js.isUndefined(slerpAmount)) __obj.updateDynamic("slerpAmount")(slerpAmount.get.asInstanceOf[js.Any])
    if (upAxis != null) __obj.updateDynamic("upAxis")(upAxis.asInstanceOf[js.Any])
    if (upAxisSpace != null) __obj.updateDynamic("upAxisSpace")(upAxisSpace.asInstanceOf[js.Any])
    if (yawAxis != null) __obj.updateDynamic("yawAxis")(yawAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdjustRoll]
  }
}

