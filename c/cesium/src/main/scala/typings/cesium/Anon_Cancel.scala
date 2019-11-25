package typings.cesium

import typings.cesium.cesiumMod.Camera.FlightCancelledCallback
import typings.cesium.cesiumMod.Camera.FlightCompleteCallback
import typings.cesium.cesiumMod.Cartesian3
import typings.cesium.cesiumMod.EasingFunction
import typings.cesium.cesiumMod.Matrix4
import typings.cesium.cesiumMod.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  var cancel: js.UndefOr[FlightCancelledCallback] = js.undefined
  var complete: js.UndefOr[FlightCompleteCallback] = js.undefined
  var convert: js.UndefOr[Boolean] = js.undefined
  var destination: Cartesian3 | Rectangle
  var duration: js.UndefOr[Double] = js.undefined
  var easingFunction: js.UndefOr[EasingFunction] = js.undefined
  var endTransform: js.UndefOr[Matrix4] = js.undefined
  var flyOverLongitude: js.UndefOr[Double] = js.undefined
  var flyOverLongitudeWeight: js.UndefOr[Double] = js.undefined
  var maximumHeight: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[Anon_Direction | Anon_Heading] = js.undefined
  var pitchAdjustHeight: js.UndefOr[Double] = js.undefined
}

object Anon_Cancel {
  @scala.inline
  def apply(
    destination: Cartesian3 | Rectangle,
    cancel: () => Unit = null,
    complete: () => Unit = null,
    convert: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    easingFunction: EasingFunction = null,
    endTransform: Matrix4 = null,
    flyOverLongitude: Int | Double = null,
    flyOverLongitudeWeight: Int | Double = null,
    maximumHeight: Int | Double = null,
    orientation: Anon_Direction | Anon_Heading = null,
    pitchAdjustHeight: Int | Double = null
  ): Anon_Cancel = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (!js.isUndefined(convert)) __obj.updateDynamic("convert")(convert.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easingFunction != null) __obj.updateDynamic("easingFunction")(easingFunction.asInstanceOf[js.Any])
    if (endTransform != null) __obj.updateDynamic("endTransform")(endTransform.asInstanceOf[js.Any])
    if (flyOverLongitude != null) __obj.updateDynamic("flyOverLongitude")(flyOverLongitude.asInstanceOf[js.Any])
    if (flyOverLongitudeWeight != null) __obj.updateDynamic("flyOverLongitudeWeight")(flyOverLongitudeWeight.asInstanceOf[js.Any])
    if (maximumHeight != null) __obj.updateDynamic("maximumHeight")(maximumHeight.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (pitchAdjustHeight != null) __obj.updateDynamic("pitchAdjustHeight")(pitchAdjustHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cancel]
  }
}

