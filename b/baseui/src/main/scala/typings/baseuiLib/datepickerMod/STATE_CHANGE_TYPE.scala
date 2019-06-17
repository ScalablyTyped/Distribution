package typings
package baseuiLib.datepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait STATE_CHANGE_TYPE extends js.Object {
  var change: baseuiLib.baseuiLibStrings.change
  var mouseLeave: baseuiLib.baseuiLibStrings.mouseLeave
  var mouseOver: baseuiLib.baseuiLibStrings.mouseOver
  var moveDown: baseuiLib.baseuiLibStrings.moveDown
  var moveLeft: baseuiLib.baseuiLibStrings.moveLeft
  var moveRight: baseuiLib.baseuiLibStrings.moveRight
  var moveUp: baseuiLib.baseuiLibStrings.moveUp
}

object STATE_CHANGE_TYPE {
  @scala.inline
  def apply(
    change: baseuiLib.baseuiLibStrings.change,
    mouseLeave: baseuiLib.baseuiLibStrings.mouseLeave,
    mouseOver: baseuiLib.baseuiLibStrings.mouseOver,
    moveDown: baseuiLib.baseuiLibStrings.moveDown,
    moveLeft: baseuiLib.baseuiLibStrings.moveLeft,
    moveRight: baseuiLib.baseuiLibStrings.moveRight,
    moveUp: baseuiLib.baseuiLibStrings.moveUp
  ): STATE_CHANGE_TYPE = {
    val __obj = js.Dynamic.literal(change = change, mouseLeave = mouseLeave, mouseOver = mouseOver, moveDown = moveDown, moveLeft = moveLeft, moveRight = moveRight, moveUp = moveUp)
  
    __obj.asInstanceOf[STATE_CHANGE_TYPE]
  }
}

