package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdjustPitch extends js.Object {
  var adjustPitch: js.UndefOr[scala.Double] = js.undefined
  var adjustRoll: js.UndefOr[scala.Double] = js.undefined
  var adjustYaw: js.UndefOr[scala.Double] = js.undefined
  var maxPitch: js.UndefOr[scala.Double] = js.undefined
  var maxYaw: js.UndefOr[scala.Double] = js.undefined
  var minPitch: js.UndefOr[scala.Double] = js.undefined
  var minYaw: js.UndefOr[scala.Double] = js.undefined
  var pitchAxis: js.UndefOr[babylonjsLib.BABYLONNs.Vector3] = js.undefined
  var slerpAmount: js.UndefOr[scala.Double] = js.undefined
  var upAxis: js.UndefOr[babylonjsLib.BABYLONNs.Vector3] = js.undefined
  var upAxisSpace: js.UndefOr[babylonjsLib.BABYLONNs.Space] = js.undefined
  var yawAxis: js.UndefOr[babylonjsLib.BABYLONNs.Vector3] = js.undefined
}

object Anon_AdjustPitch {
  @scala.inline
  def apply(
    adjustPitch: scala.Int | scala.Double = null,
    adjustRoll: scala.Int | scala.Double = null,
    adjustYaw: scala.Int | scala.Double = null,
    maxPitch: scala.Int | scala.Double = null,
    maxYaw: scala.Int | scala.Double = null,
    minPitch: scala.Int | scala.Double = null,
    minYaw: scala.Int | scala.Double = null,
    pitchAxis: babylonjsLib.BABYLONNs.Vector3 = null,
    slerpAmount: scala.Int | scala.Double = null,
    upAxis: babylonjsLib.BABYLONNs.Vector3 = null,
    upAxisSpace: babylonjsLib.BABYLONNs.Space = null,
    yawAxis: babylonjsLib.BABYLONNs.Vector3 = null
  ): Anon_AdjustPitch = {
    val __obj = js.Dynamic.literal()
    if (adjustPitch != null) __obj.updateDynamic("adjustPitch")(adjustPitch.asInstanceOf[js.Any])
    if (adjustRoll != null) __obj.updateDynamic("adjustRoll")(adjustRoll.asInstanceOf[js.Any])
    if (adjustYaw != null) __obj.updateDynamic("adjustYaw")(adjustYaw.asInstanceOf[js.Any])
    if (maxPitch != null) __obj.updateDynamic("maxPitch")(maxPitch.asInstanceOf[js.Any])
    if (maxYaw != null) __obj.updateDynamic("maxYaw")(maxYaw.asInstanceOf[js.Any])
    if (minPitch != null) __obj.updateDynamic("minPitch")(minPitch.asInstanceOf[js.Any])
    if (minYaw != null) __obj.updateDynamic("minYaw")(minYaw.asInstanceOf[js.Any])
    if (pitchAxis != null) __obj.updateDynamic("pitchAxis")(pitchAxis)
    if (slerpAmount != null) __obj.updateDynamic("slerpAmount")(slerpAmount.asInstanceOf[js.Any])
    if (upAxis != null) __obj.updateDynamic("upAxis")(upAxis)
    if (upAxisSpace != null) __obj.updateDynamic("upAxisSpace")(upAxisSpace)
    if (yawAxis != null) __obj.updateDynamic("yawAxis")(yawAxis)
    __obj.asInstanceOf[Anon_AdjustPitch]
  }
}

