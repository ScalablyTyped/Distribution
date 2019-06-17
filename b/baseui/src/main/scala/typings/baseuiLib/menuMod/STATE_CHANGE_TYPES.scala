package typings
package baseuiLib.menuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait STATE_CHANGE_TYPES extends js.Object {
  var click: baseuiLib.baseuiLibStrings.click
  var focus: baseuiLib.baseuiLibStrings.focus
  var mouseEnter: baseuiLib.baseuiLibStrings.mouseEnter
  var moveDown: baseuiLib.baseuiLibStrings.moveDown
  var moveUp: baseuiLib.baseuiLibStrings.moveUp
  var reset: baseuiLib.baseuiLibStrings.reset
}

object STATE_CHANGE_TYPES {
  @scala.inline
  def apply(
    click: baseuiLib.baseuiLibStrings.click,
    focus: baseuiLib.baseuiLibStrings.focus,
    mouseEnter: baseuiLib.baseuiLibStrings.mouseEnter,
    moveDown: baseuiLib.baseuiLibStrings.moveDown,
    moveUp: baseuiLib.baseuiLibStrings.moveUp,
    reset: baseuiLib.baseuiLibStrings.reset
  ): STATE_CHANGE_TYPES = {
    val __obj = js.Dynamic.literal(click = click, focus = focus, mouseEnter = mouseEnter, moveDown = moveDown, moveUp = moveUp, reset = reset)
  
    __obj.asInstanceOf[STATE_CHANGE_TYPES]
  }
}

