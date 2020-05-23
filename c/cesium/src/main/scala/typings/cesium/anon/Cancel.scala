package typings.cesium.anon

import typings.cesium.mod.Camera.FlightCancelledCallback
import typings.cesium.mod.Camera.FlightCompleteCallback
import typings.cesium.mod.Cartesian3
import typings.cesium.mod.EasingFunction
import typings.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancel extends js.Object {
  var cancel: js.UndefOr[FlightCancelledCallback] = js.undefined
  var complete: js.UndefOr[FlightCompleteCallback] = js.undefined
  var convert: js.UndefOr[Boolean] = js.undefined
  var destination: Cartesian3 | typings.cesium.mod.Rectangle
  var duration: js.UndefOr[Double] = js.undefined
  var easingFunction: js.UndefOr[EasingFunction] = js.undefined
  var endTransform: js.UndefOr[Matrix4] = js.undefined
  var flyOverLongitude: js.UndefOr[Double] = js.undefined
  var flyOverLongitudeWeight: js.UndefOr[Double] = js.undefined
  var maximumHeight: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[Direction | Heading] = js.undefined
  var pitchAdjustHeight: js.UndefOr[Double] = js.undefined
}

object Cancel {
  @scala.inline
  def apply(
    destination: Cartesian3 | typings.cesium.mod.Rectangle,
    cancel: () => Unit = null,
    complete: () => Unit = null,
    convert: js.UndefOr[Boolean] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    easingFunction: EasingFunction = null,
    endTransform: Matrix4 = null,
    flyOverLongitude: js.UndefOr[Double] = js.undefined,
    flyOverLongitudeWeight: js.UndefOr[Double] = js.undefined,
    maximumHeight: js.UndefOr[Double] = js.undefined,
    orientation: Direction | Heading = null,
    pitchAdjustHeight: js.UndefOr[Double] = js.undefined
  ): Cancel = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (!js.isUndefined(convert)) __obj.updateDynamic("convert")(convert.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easingFunction != null) __obj.updateDynamic("easingFunction")(easingFunction.asInstanceOf[js.Any])
    if (endTransform != null) __obj.updateDynamic("endTransform")(endTransform.asInstanceOf[js.Any])
    if (!js.isUndefined(flyOverLongitude)) __obj.updateDynamic("flyOverLongitude")(flyOverLongitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flyOverLongitudeWeight)) __obj.updateDynamic("flyOverLongitudeWeight")(flyOverLongitudeWeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumHeight)) __obj.updateDynamic("maximumHeight")(maximumHeight.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(pitchAdjustHeight)) __obj.updateDynamic("pitchAdjustHeight")(pitchAdjustHeight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
}

