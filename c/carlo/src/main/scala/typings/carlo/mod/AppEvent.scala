package typings.carlo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.carlo.carloStrings.exit
  - typings.carlo.carloStrings.window
*/
trait AppEvent extends js.Object

object AppEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exit: typings.carlo.carloStrings.exit = this.cast("exit")
  @scala.inline
  def window: typings.carlo.carloStrings.window = this.cast("window")
}

