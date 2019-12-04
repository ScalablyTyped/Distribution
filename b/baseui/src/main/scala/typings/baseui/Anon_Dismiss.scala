package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dismiss extends js.Object {
  def dismiss(): Unit
}

object Anon_Dismiss {
  @scala.inline
  def apply(dismiss: () => Unit): Anon_Dismiss = {
    val __obj = js.Dynamic.literal(dismiss = js.Any.fromFunction0(dismiss))
  
    __obj.asInstanceOf[Anon_Dismiss]
  }
}

