package typings.ckeditorCkeditor5Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDestroy extends js.Object {
  def destroy(): Unit | Null | js.Promise[_]
}

object AnonDestroy {
  @scala.inline
  def apply(destroy: () => Unit | Null | js.Promise[_]): AnonDestroy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
  
    __obj.asInstanceOf[AnonDestroy]
  }
}

