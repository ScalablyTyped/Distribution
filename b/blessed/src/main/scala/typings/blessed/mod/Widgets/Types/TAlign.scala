package typings.blessed.mod.Widgets.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.blessed.blessedStrings.left
  - typings.blessed.blessedStrings.center
  - typings.blessed.blessedStrings.right
*/
trait TAlign extends js.Object

object TAlign {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.blessed.blessedStrings.center = this.cast("center")
  @scala.inline
  def left: typings.blessed.blessedStrings.left = this.cast("left")
  @scala.inline
  def right: typings.blessed.blessedStrings.right = this.cast("right")
}

