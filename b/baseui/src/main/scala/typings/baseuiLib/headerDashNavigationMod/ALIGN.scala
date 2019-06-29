package typings
package baseuiLib.headerDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ALIGN extends js.Object {
  var center: baseuiLib.baseuiLibStrings.center
  var left: baseuiLib.baseuiLibStrings.`flex-start`
  var right: baseuiLib.baseuiLibStrings.`flex-end`
}

object ALIGN {
  @scala.inline
  def apply(
    center: baseuiLib.baseuiLibStrings.center,
    left: baseuiLib.baseuiLibStrings.`flex-start`,
    right: baseuiLib.baseuiLibStrings.`flex-end`
  ): ALIGN = {
    val __obj = js.Dynamic.literal(center = center, left = left, right = right)
  
    __obj.asInstanceOf[ALIGN]
  }
}

