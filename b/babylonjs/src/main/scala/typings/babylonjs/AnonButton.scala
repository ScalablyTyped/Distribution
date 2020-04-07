package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButton extends js.Object {
  /**
    * Index of button
    */
  var button: js.UndefOr[Double] = js.undefined
  /**
    * If available, index of x-axis
    */
  var xAxis: js.UndefOr[Double] = js.undefined
  /**
    * If available, index of y-axis
    */
  var yAxis: js.UndefOr[Double] = js.undefined
}

object AnonButton {
  @scala.inline
  def apply(button: Int | Double = null, xAxis: Int | Double = null, yAxis: Int | Double = null): AnonButton = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonButton]
  }
}

