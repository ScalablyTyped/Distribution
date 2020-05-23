package typings.bizcharts.anon

import typings.antvG2.mod.Styles.background
import typings.antvG2.mod.Styles.line
import typings.bizcharts.mod.CrosshairsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends js.Object {
  var style: js.UndefOr[background | line] = js.undefined
  var `type`: js.UndefOr[CrosshairsType] = js.undefined
}

object Style {
  @scala.inline
  def apply(style: background | line = null, `type`: CrosshairsType = null): Style = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
}

