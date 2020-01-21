package typings.bloem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInitialcapacity extends js.Object {
  var initial_capacity: js.UndefOr[Double] = js.undefined
  var ratio: js.UndefOr[Double] = js.undefined
  var scaling: js.UndefOr[Double] = js.undefined
}

object AnonInitialcapacity {
  @scala.inline
  def apply(initial_capacity: Int | Double = null, ratio: Int | Double = null, scaling: Int | Double = null): AnonInitialcapacity = {
    val __obj = js.Dynamic.literal()
    if (initial_capacity != null) __obj.updateDynamic("initial_capacity")(initial_capacity.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (scaling != null) __obj.updateDynamic("scaling")(scaling.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInitialcapacity]
  }
}

