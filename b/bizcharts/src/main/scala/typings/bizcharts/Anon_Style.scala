package typings.bizcharts

import typings.atAntvG2.atAntvG2Mod.Styles.background
import typings.atAntvG2.atAntvG2Mod.Styles.line
import typings.bizcharts.bizchartsMod.CrosshairsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Style extends js.Object {
  var style: js.UndefOr[background | line] = js.undefined
  var `type`: js.UndefOr[CrosshairsType] = js.undefined
}

object Anon_Style {
  @scala.inline
  def apply(style: background | line = null, `type`: CrosshairsType = null): Anon_Style = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Style]
  }
}

