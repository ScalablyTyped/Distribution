package typings.cesium

import typings.cesium.mod.Camera.FlightCancelledCallback
import typings.cesium.mod.Camera.FlightCompleteCallback
import typings.cesium.mod.EasingFunction
import typings.cesium.mod.HeadingPitchRange
import typings.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComplete extends js.Object {
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

object AnonComplete {
  @scala.inline
  def apply(
    cancel: () => Unit = null,
    complete: () => Unit = null,
    duration: Int | Double = null,
    easingFunction: EasingFunction = null,
    endTransform: Matrix4 = null,
    flyOverLongitude: Int | Double = null,
    flyOverLongitudeWeight: Int | Double = null,
    maximumHeight: Int | Double = null,
    offset: HeadingPitchRange = null,
    pitchAdjustHeight: Int | Double = null
  ): AnonComplete = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easingFunction != null) __obj.updateDynamic("easingFunction")(easingFunction.asInstanceOf[js.Any])
    if (endTransform != null) __obj.updateDynamic("endTransform")(endTransform.asInstanceOf[js.Any])
    if (flyOverLongitude != null) __obj.updateDynamic("flyOverLongitude")(flyOverLongitude.asInstanceOf[js.Any])
    if (flyOverLongitudeWeight != null) __obj.updateDynamic("flyOverLongitudeWeight")(flyOverLongitudeWeight.asInstanceOf[js.Any])
    if (maximumHeight != null) __obj.updateDynamic("maximumHeight")(maximumHeight.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (pitchAdjustHeight != null) __obj.updateDynamic("pitchAdjustHeight")(pitchAdjustHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComplete]
  }
}

