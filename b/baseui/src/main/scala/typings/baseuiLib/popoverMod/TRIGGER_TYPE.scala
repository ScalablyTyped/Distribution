package typings
package baseuiLib.popoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TRIGGER_TYPE extends js.Object {
  var click: baseuiLib.baseuiLibStrings.click
  var hover: baseuiLib.baseuiLibStrings.hover
}

object TRIGGER_TYPE {
  @scala.inline
  def apply(click: baseuiLib.baseuiLibStrings.click, hover: baseuiLib.baseuiLibStrings.hover): TRIGGER_TYPE = {
    val __obj = js.Dynamic.literal(click = click, hover = hover)
  
    __obj.asInstanceOf[TRIGGER_TYPE]
  }
}

