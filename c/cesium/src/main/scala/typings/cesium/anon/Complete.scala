package typings.cesium.anon

import typings.cesium.mod.Camera.FlightCancelledCallback
import typings.cesium.mod.Camera.FlightCompleteCallback
import typings.cesium.mod.EasingFunction
import typings.cesium.mod.HeadingPitchRange
import typings.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Complete extends js.Object {
  var cancel: js.UndefOr[FlightCancelledCallback] = js.undefined
  var complete: js.UndefOr[FlightCompleteCallback] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easingFunction: js.UndefOr[EasingFunction] = js.undefined
  var endTransform: js.UndefOr[Matrix4] = js.undefined
  var flyOverLongitude: js.UndefOr[Double] = js.undefined
  var flyOverLongitudeWeight: js.UndefOr[Double] = js.undefined
  var maximumHeight: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[HeadingPitchRange] = js.undefined
  var pitchAdjustHeight: js.UndefOr[Double] = js.undefined
}

object Complete {
  @scala.inline
  def apply(
    cancel: () => Unit = null,
    complete: () => Unit = null,
    duration: js.UndefOr[Double] = js.undefined,
    easingFunction: EasingFunction = null,
    endTransform: Matrix4 = null,
    flyOverLongitude: js.UndefOr[Double] = js.undefined,
    flyOverLongitudeWeight: js.UndefOr[Double] = js.undefined,
    maximumHeight: js.UndefOr[Double] = js.undefined,
    offset: HeadingPitchRange = null,
    pitchAdjustHeight: js.UndefOr[Double] = js.undefined
  ): Complete = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easingFunction != null) __obj.updateDynamic("easingFunction")(easingFunction.asInstanceOf[js.Any])
    if (endTransform != null) __obj.updateDynamic("endTransform")(endTransform.asInstanceOf[js.Any])
    if (!js.isUndefined(flyOverLongitude)) __obj.updateDynamic("flyOverLongitude")(flyOverLongitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flyOverLongitudeWeight)) __obj.updateDynamic("flyOverLongitudeWeight")(flyOverLongitudeWeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumHeight)) __obj.updateDynamic("maximumHeight")(maximumHeight.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(pitchAdjustHeight)) __obj.updateDynamic("pitchAdjustHeight")(pitchAdjustHeight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Complete]
  }
}

