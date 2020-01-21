package typings.bizcharts

import typings.antvG2.mod.Styles.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOffsetX extends js.Object {
  var offsetX: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[text] = js.undefined
}

object AnonOffsetX {
  @scala.inline
  def apply(offsetX: Int | Double = null, style: text = null): AnonOffsetX = {
    val __obj = js.Dynamic.literal()
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOffsetX]
  }
}

