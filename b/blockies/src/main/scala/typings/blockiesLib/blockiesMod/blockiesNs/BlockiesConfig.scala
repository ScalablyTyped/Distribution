package typings
package blockiesLib.blockiesMod.blockiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockiesConfig extends js.Object {
  var bgcolor: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var scale: js.UndefOr[scala.Double] = js.undefined
  var seed: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var spotcolor: js.UndefOr[java.lang.String] = js.undefined
}

object BlockiesConfig {
  @scala.inline
  def apply(
    bgcolor: java.lang.String = null,
    color: java.lang.String = null,
    scale: scala.Int | scala.Double = null,
    seed: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    spotcolor: java.lang.String = null
  ): BlockiesConfig = {
    val __obj = js.Dynamic.literal()
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor)
    if (color != null) __obj.updateDynamic("color")(color)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (spotcolor != null) __obj.updateDynamic("spotcolor")(spotcolor)
    __obj.asInstanceOf[BlockiesConfig]
  }
}

