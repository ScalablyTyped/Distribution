package typings.ckeditorCkeditor5Core.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Destroy extends js.Object {
  def destroy(): Unit | Null | js.Promise[_]
}

object Destroy {
  @scala.inline
  def apply(destroy: () => Unit | Null | js.Promise[_]): Destroy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[Destroy]
  }
}

