package typings.dagre.mod

import typings.dagre.dagreStrings.c
import typings.dagre.dagreStrings.l
import typings.dagre.dagreStrings.r
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeConfig extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var labeloffest: js.UndefOr[Double] = js.undefined
  var lablepos: js.UndefOr[l | c | r] = js.undefined
  var minlen: js.UndefOr[Double] = js.undefined
  var weight: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object EdgeConfig {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    labeloffest: js.UndefOr[Double] = js.undefined,
    lablepos: l | c | r = null,
    minlen: js.UndefOr[Double] = js.undefined,
    weight: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): EdgeConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labeloffest)) __obj.updateDynamic("labeloffest")(labeloffest.get.asInstanceOf[js.Any])
    if (lablepos != null) __obj.updateDynamic("lablepos")(lablepos.asInstanceOf[js.Any])
    if (!js.isUndefined(minlen)) __obj.updateDynamic("minlen")(minlen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeConfig]
  }
}

