package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelComplete extends js.Object {
  var cancel: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.CameraNs.FlightCancelledCallback] = js.undefined
  var complete: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.CameraNs.FlightCompleteCallback] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easingFunction: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.EasingFunction] = js.undefined
  var endTransform: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Matrix4] = js.undefined
  var flyOverLongitude: js.UndefOr[scala.Double] = js.undefined
  var flyOverLongitudeWeight: js.UndefOr[scala.Double] = js.undefined
  var maximumHeight: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.HeadingPitchRange] = js.undefined
  var pitchAdjustHeight: js.UndefOr[scala.Double] = js.undefined
}

object Anon_CancelComplete {
  @scala.inline
  def apply(
    cancel: cesiumLib.cesiumMod.CesiumNs.CameraNs.FlightCancelledCallback = null,
    complete: cesiumLib.cesiumMod.CesiumNs.CameraNs.FlightCompleteCallback = null,
    duration: scala.Int | scala.Double = null,
    easingFunction: cesiumLib.cesiumMod.CesiumNs.EasingFunction = null,
    endTransform: cesiumLib.cesiumMod.CesiumNs.Matrix4 = null,
    flyOverLongitude: scala.Int | scala.Double = null,
    flyOverLongitudeWeight: scala.Int | scala.Double = null,
    maximumHeight: scala.Int | scala.Double = null,
    offset: cesiumLib.cesiumMod.CesiumNs.HeadingPitchRange = null,
    pitchAdjustHeight: scala.Int | scala.Double = null
  ): Anon_CancelComplete = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easingFunction != null) __obj.updateDynamic("easingFunction")(easingFunction)
    if (endTransform != null) __obj.updateDynamic("endTransform")(endTransform)
    if (flyOverLongitude != null) __obj.updateDynamic("flyOverLongitude")(flyOverLongitude.asInstanceOf[js.Any])
    if (flyOverLongitudeWeight != null) __obj.updateDynamic("flyOverLongitudeWeight")(flyOverLongitudeWeight.asInstanceOf[js.Any])
    if (maximumHeight != null) __obj.updateDynamic("maximumHeight")(maximumHeight.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (pitchAdjustHeight != null) __obj.updateDynamic("pitchAdjustHeight")(pitchAdjustHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CancelComplete]
  }
}

