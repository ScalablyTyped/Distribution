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
    height: Int | Double = null,
    labeloffest: Int | Double = null,
    lablepos: l | c | r = null,
    minlen: Int | Double = null,
    weight: Int | Double = null,
    width: Int | Double = null
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

