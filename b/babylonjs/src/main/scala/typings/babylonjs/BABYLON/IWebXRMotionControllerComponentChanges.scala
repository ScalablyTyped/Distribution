package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebXRMotionControllerComponentChanges extends js.Object {
  /**
    * will be populated with previous and current values if axes changed
    */
  var axes: js.UndefOr[IWebXRMotionControllerComponentChangesValues[IWebXRMotionControllerAxesValue]] = js.undefined
  /**
    * will be populated with previous and current values if pressed changed
    */
  var pressed: js.UndefOr[IWebXRMotionControllerComponentChangesValues[Boolean]] = js.undefined
  /**
    * will be populated with previous and current values if touched changed
    */
  var touched: js.UndefOr[IWebXRMotionControllerComponentChangesValues[Boolean]] = js.undefined
  /**
    * will be populated with previous and current values if value changed
    */
  var value: js.UndefOr[IWebXRMotionControllerComponentChangesValues[Double]] = js.undefined
}

object IWebXRMotionControllerComponentChanges {
  @scala.inline
  def apply(
    axes: IWebXRMotionControllerComponentChangesValues[IWebXRMotionControllerAxesValue] = null,
    pressed: IWebXRMotionControllerComponentChangesValues[Boolean] = null,
    touched: IWebXRMotionControllerComponentChangesValues[Boolean] = null,
    value: IWebXRMotionControllerComponentChangesValues[Double] = null
  ): IWebXRMotionControllerComponentChanges = {
    val __obj = js.Dynamic.literal()
    if (axes != null) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (pressed != null) __obj.updateDynamic("pressed")(pressed.asInstanceOf[js.Any])
    if (touched != null) __obj.updateDynamic("touched")(touched.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRMotionControllerComponentChanges]
  }
}

