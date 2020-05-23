package typings.cordovaPluginDeviceOrientation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompassOptions extends js.Object {
  var filter: js.UndefOr[Double] = js.undefined
  var frequency: js.UndefOr[Double] = js.undefined
}

object CompassOptions {
  @scala.inline
  def apply(filter: js.UndefOr[Double] = js.undefined, frequency: js.UndefOr[Double] = js.undefined): CompassOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frequency)) __obj.updateDynamic("frequency")(frequency.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassOptions]
  }
}

