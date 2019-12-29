package typings.bizcharts

import typings.atAntvG2.atAntvG2Mod.Styles.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OffsetY extends js.Object {
  var offsetY: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[text] = js.undefined
}

object Anon_OffsetY {
  @scala.inline
  def apply(offsetY: Int | Double = null, style: text = null): Anon_OffsetY = {
    val __obj = js.Dynamic.literal()
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OffsetY]
  }
}

