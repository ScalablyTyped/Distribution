package typings
package backgridLib.backgridMod.BackgridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  def cancel(): scala.Boolean
  def moveDown(): scala.Boolean
  def moveLeft(): scala.Boolean
  def moveRight(): scala.Boolean
  def moveUp(): scala.Boolean
  def passThru(): scala.Boolean
  def save(): scala.Boolean
}

object Command {
  @scala.inline
  def apply(
    cancel: js.Function0[scala.Boolean],
    moveDown: js.Function0[scala.Boolean],
    moveLeft: js.Function0[scala.Boolean],
    moveRight: js.Function0[scala.Boolean],
    moveUp: js.Function0[scala.Boolean],
    passThru: js.Function0[scala.Boolean],
    save: js.Function0[scala.Boolean]
  ): Command = {
    val __obj = js.Dynamic.literal(cancel = cancel, moveDown = moveDown, moveLeft = moveLeft, moveRight = moveRight, moveUp = moveUp, passThru = passThru, save = save)
  
    __obj.asInstanceOf[Command]
  }
}

