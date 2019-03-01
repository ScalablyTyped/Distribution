package typings
package dagreLib.dagreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeConfig extends js.Object {
  var height: js.UndefOr[scala.Double] = js.undefined
  var labeloffest: js.UndefOr[scala.Double] = js.undefined
  var lablepos: js.UndefOr[
    dagreLib.dagreLibStrings.l | dagreLib.dagreLibStrings.c | dagreLib.dagreLibStrings.r
  ] = js.undefined
  var minlen: js.UndefOr[scala.Double] = js.undefined
  var weight: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object EdgeConfig {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    labeloffest: scala.Int | scala.Double = null,
    lablepos: dagreLib.dagreLibStrings.l | dagreLib.dagreLibStrings.c | dagreLib.dagreLibStrings.r = null,
    minlen: scala.Int | scala.Double = null,
    weight: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): EdgeConfig = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (labeloffest != null) __obj.updateDynamic("labeloffest")(labeloffest.asInstanceOf[js.Any])
    if (lablepos != null) __obj.updateDynamic("lablepos")(lablepos.asInstanceOf[js.Any])
    if (minlen != null) __obj.updateDynamic("minlen")(minlen.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeConfig]
  }
}

