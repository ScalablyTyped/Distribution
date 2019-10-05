package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationOptions extends js.Object {
  var numPois: js.UndefOr[Double] = js.undefined
  var poiRadius: js.UndefOr[Double] = js.undefined
}

object LocationOptions {
  @scala.inline
  def apply(numPois: Int | Double = null, poiRadius: Int | Double = null): LocationOptions = {
    val __obj = js.Dynamic.literal()
    if (numPois != null) __obj.updateDynamic("numPois")(numPois.asInstanceOf[js.Any])
    if (poiRadius != null) __obj.updateDynamic("poiRadius")(poiRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationOptions]
  }
}

