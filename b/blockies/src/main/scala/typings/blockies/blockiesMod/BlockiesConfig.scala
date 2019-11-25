package typings.blockies.blockiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockiesConfig extends js.Object {
  var bgcolor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var seed: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var spotcolor: js.UndefOr[String] = js.undefined
}

object BlockiesConfig {
  @scala.inline
  def apply(
    bgcolor: String = null,
    color: String = null,
    scale: Int | Double = null,
    seed: String = null,
    size: Int | Double = null,
    spotcolor: String = null
  ): BlockiesConfig = {
    val __obj = js.Dynamic.literal()
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (spotcolor != null) __obj.updateDynamic("spotcolor")(spotcolor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockiesConfig]
  }
}

