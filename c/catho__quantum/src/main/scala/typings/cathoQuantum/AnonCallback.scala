package typings.cathoQuantum

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback[T] extends js.Object {
  var callback: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object AnonCallback {
  @scala.inline
  def apply[T](callback: MouseEvent[T, NativeMouseEvent] => Unit = null, title: String = null): AnonCallback[T] = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCallback[T]]
  }
}

