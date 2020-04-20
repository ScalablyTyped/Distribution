package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDismiss extends js.Object {
  def dismiss(): Unit
}

object AnonDismiss {
  @scala.inline
  def apply(dismiss: () => Unit): AnonDismiss = {
    val __obj = js.Dynamic.literal(dismiss = js.Any.fromFunction0(dismiss))
    __obj.asInstanceOf[AnonDismiss]
  }
}

