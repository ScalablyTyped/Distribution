package typings.bootstrapDashNotify

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyReturn extends js.Object {
  @JSName("$ele")
  var $ele: JQuery[HTMLElement]
  def close(): Unit
  def update(command: String, update: js.Any): Unit
}

object NotifyReturn {
  @scala.inline
  def apply($ele: JQuery[HTMLElement], close: () => Unit, update: (String, js.Any) => Unit): NotifyReturn = {
    val __obj = js.Dynamic.literal($ele = $ele, close = js.Any.fromFunction0(close), update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[NotifyReturn]
  }
}

