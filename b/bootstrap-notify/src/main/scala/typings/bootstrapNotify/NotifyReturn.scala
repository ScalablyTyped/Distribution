package typings.bootstrapNotify

import typings.jquery.JQuery_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyReturn extends js.Object {
  @JSName("$ele")
  var $ele: JQuery_[HTMLElement]
  def close(): Unit
  def update(command: String, update: js.Any): Unit
}

object NotifyReturn {
  @scala.inline
  def apply($ele: JQuery_[HTMLElement], close: () => Unit, update: (String, js.Any) => Unit): NotifyReturn = {
    val __obj = js.Dynamic.literal($ele = $ele.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[NotifyReturn]
  }
}

