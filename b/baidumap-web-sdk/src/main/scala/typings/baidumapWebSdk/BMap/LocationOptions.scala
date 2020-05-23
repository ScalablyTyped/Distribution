package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationOptions extends js.Object {
  var numPois: js.UndefOr[Double] = js.undefined
  var poiRadius: js.UndefOr[Double] = js.undefined
}

object LocationOptions {
  @scala.inline
  def apply(numPois: js.UndefOr[Double] = js.undefined, poiRadius: js.UndefOr[Double] = js.undefined): LocationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(numPois)) __obj.updateDynamic("numPois")(numPois.get.asInstanceOf[js.Any])
    if (!js.isUndefined(poiRadius)) __obj.updateDynamic("poiRadius")(poiRadius.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationOptions]
  }
}

