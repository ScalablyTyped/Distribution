package typings.bloem.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Initialcapacity extends js.Object {
  var initial_capacity: js.UndefOr[Double] = js.undefined
  var ratio: js.UndefOr[Double] = js.undefined
  var scaling: js.UndefOr[Double] = js.undefined
}

object Initialcapacity {
  @scala.inline
  def apply(
    initial_capacity: js.UndefOr[Double] = js.undefined,
    ratio: js.UndefOr[Double] = js.undefined,
    scaling: js.UndefOr[Double] = js.undefined
  ): Initialcapacity = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(initial_capacity)) __obj.updateDynamic("initial_capacity")(initial_capacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ratio)) __obj.updateDynamic("ratio")(ratio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaling)) __obj.updateDynamic("scaling")(scaling.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Initialcapacity]
  }
}

