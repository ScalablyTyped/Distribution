package typings
package bloemLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Initialcapacity extends js.Object {
  var initial_capacity: js.UndefOr[scala.Double] = js.undefined
  var ratio: js.UndefOr[scala.Double] = js.undefined
  var scaling: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Initialcapacity {
  @scala.inline
  def apply(
    initial_capacity: scala.Int | scala.Double = null,
    ratio: scala.Int | scala.Double = null,
    scaling: scala.Int | scala.Double = null
  ): Anon_Initialcapacity = {
    val __obj = js.Dynamic.literal()
    if (initial_capacity != null) __obj.updateDynamic("initial_capacity")(initial_capacity.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (scaling != null) __obj.updateDynamic("scaling")(scaling.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Initialcapacity]
  }
}

