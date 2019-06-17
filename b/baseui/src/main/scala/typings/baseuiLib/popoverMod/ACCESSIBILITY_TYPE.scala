package typings
package baseuiLib.popoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ACCESSIBILITY_TYPE extends js.Object {
  var menu: baseuiLib.baseuiLibStrings.menu
  var none: baseuiLib.baseuiLibStrings.none
  var tooltip: baseuiLib.baseuiLibStrings.tooltip
}

object ACCESSIBILITY_TYPE {
  @scala.inline
  def apply(
    menu: baseuiLib.baseuiLibStrings.menu,
    none: baseuiLib.baseuiLibStrings.none,
    tooltip: baseuiLib.baseuiLibStrings.tooltip
  ): ACCESSIBILITY_TYPE = {
    val __obj = js.Dynamic.literal(menu = menu, none = none, tooltip = tooltip)
  
    __obj.asInstanceOf[ACCESSIBILITY_TYPE]
  }
}

