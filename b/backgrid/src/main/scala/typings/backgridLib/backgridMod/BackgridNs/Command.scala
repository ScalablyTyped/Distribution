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
    cancel: () => scala.Boolean,
    moveDown: () => scala.Boolean,
    moveLeft: () => scala.Boolean,
    moveRight: () => scala.Boolean,
    moveUp: () => scala.Boolean,
    passThru: () => scala.Boolean,
    save: () => scala.Boolean
  ): Command = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), moveDown = js.Any.fromFunction0(moveDown), moveLeft = js.Any.fromFunction0(moveLeft), moveRight = js.Any.fromFunction0(moveRight), moveUp = js.Any.fromFunction0(moveUp), passThru = js.Any.fromFunction0(passThru), save = js.Any.fromFunction0(save))
  
    __obj.asInstanceOf[Command]
  }
}

