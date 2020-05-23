package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Far extends js.Object {
  var aspectRatio: Double
  var far: js.UndefOr[Double] = js.undefined
  var fov: Double
  var near: js.UndefOr[Double] = js.undefined
  var xOffset: js.UndefOr[Double] = js.undefined
  var yOffset: js.UndefOr[Double] = js.undefined
}

object Far {
  @scala.inline
  def apply(
    aspectRatio: Double,
    fov: Double,
    far: js.UndefOr[Double] = js.undefined,
    near: js.UndefOr[Double] = js.undefined,
    xOffset: js.UndefOr[Double] = js.undefined,
    yOffset: js.UndefOr[Double] = js.undefined
  ): Far = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], fov = fov.asInstanceOf[js.Any])
    if (!js.isUndefined(far)) __obj.updateDynamic("far")(far.get.asInstanceOf[js.Any])
    if (!js.isUndefined(near)) __obj.updateDynamic("near")(near.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xOffset)) __obj.updateDynamic("xOffset")(xOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yOffset)) __obj.updateDynamic("yOffset")(yOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Far]
  }
}

