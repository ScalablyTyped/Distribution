package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  var cancel: js.UndefOr[cesiumLib.cesiumMod.CameraNs.FlightCancelledCallback] = js.undefined
  var complete: js.UndefOr[cesiumLib.cesiumMod.CameraNs.FlightCompleteCallback] = js.undefined
  var convert: js.UndefOr[scala.Boolean] = js.undefined
  var destination: cesiumLib.cesiumMod.Cartesian3 | cesiumLib.cesiumMod.Rectangle
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easingFunction: js.UndefOr[cesiumLib.cesiumMod.EasingFunction] = js.undefined
  var endTransform: js.UndefOr[cesiumLib.cesiumMod.Matrix4] = js.undefined
  var flyOverLongitude: js.UndefOr[scala.Double] = js.undefined
  var flyOverLongitudeWeight: js.UndefOr[scala.Double] = js.undefined
  var maximumHeight: js.UndefOr[scala.Double] = js.undefined
  var orientation: js.UndefOr[Anon_Direction | Anon_Heading] = js.undefined
  var pitchAdjustHeight: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Cancel {
  @scala.inline
  def apply(
    destination: cesiumLib.cesiumMod.Cartesian3 | cesiumLib.cesiumMod.Rectangle,
    cancel: cesiumLib.cesiumMod.CameraNs.FlightCancelledCallback = null,
    complete: cesiumLib.cesiumMod.CameraNs.FlightCompleteCallback = null,
    convert: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    easingFunction: cesiumLib.cesiumMod.EasingFunction = null,
    endTransform: cesiumLib.cesiumMod.Matrix4 = null,
    flyOverLongitude: scala.Int | scala.Double = null,
    flyOverLongitudeWeight: scala.Int | scala.Double = null,
    maximumHeight: scala.Int | scala.Double = null,
    orientation: Anon_Direction | Anon_Heading = null,
    pitchAdjustHeight: scala.Int | scala.Double = null
  ): Anon_Cancel = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (!js.isUndefined(convert)) __obj.updateDynamic("convert")(convert)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easingFunction != null) __obj.updateDynamic("easingFunction")(easingFunction)
    if (endTransform != null) __obj.updateDynamic("endTransform")(endTransform)
    if (flyOverLongitude != null) __obj.updateDynamic("flyOverLongitude")(flyOverLongitude.asInstanceOf[js.Any])
    if (flyOverLongitudeWeight != null) __obj.updateDynamic("flyOverLongitudeWeight")(flyOverLongitudeWeight.asInstanceOf[js.Any])
    if (maximumHeight != null) __obj.updateDynamic("maximumHeight")(maximumHeight.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (pitchAdjustHeight != null) __obj.updateDynamic("pitchAdjustHeight")(pitchAdjustHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cancel]
  }
}

