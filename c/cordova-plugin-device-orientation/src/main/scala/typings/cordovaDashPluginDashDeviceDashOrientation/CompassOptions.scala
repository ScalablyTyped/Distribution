package typings.cordovaDashPluginDashDeviceDashOrientation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompassOptions extends js.Object {
  var filter: js.UndefOr[Double] = js.undefined
  var frequency: js.UndefOr[Double] = js.undefined
}

object CompassOptions {
  @scala.inline
  def apply(filter: Int | Double = null, frequency: Int | Double = null): CompassOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassOptions]
  }
}

