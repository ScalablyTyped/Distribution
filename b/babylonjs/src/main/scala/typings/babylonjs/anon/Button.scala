package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
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

object Button {
  @scala.inline
  def apply(
    button: js.UndefOr[Double] = js.undefined,
    xAxis: js.UndefOr[Double] = js.undefined,
    yAxis: js.UndefOr[Double] = js.undefined
  ): Button = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(button)) __obj.updateDynamic("button")(button.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xAxis)) __obj.updateDynamic("xAxis")(xAxis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxis)) __obj.updateDynamic("yAxis")(yAxis.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
}

