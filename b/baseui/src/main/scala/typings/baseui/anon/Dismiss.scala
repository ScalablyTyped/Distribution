package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dismiss extends js.Object {
  def dismiss(): Unit
}

object Dismiss {
  @scala.inline
  def apply(dismiss: () => Unit): Dismiss = {
    val __obj = js.Dynamic.literal(dismiss = js.Any.fromFunction0(dismiss))
    __obj.asInstanceOf[Dismiss]
  }
}

