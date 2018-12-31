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

