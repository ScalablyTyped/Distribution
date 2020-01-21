package typings.bizcharts

import typings.antvG2.mod.Styles.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOffsetY extends js.Object {
  var offsetY: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[text] = js.undefined
}

object AnonOffsetY {
  @scala.inline
  def apply(offsetY: Int | Double = null, style: text = null): AnonOffsetY = {
    val __obj = js.Dynamic.literal()
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOffsetY]
  }
}

