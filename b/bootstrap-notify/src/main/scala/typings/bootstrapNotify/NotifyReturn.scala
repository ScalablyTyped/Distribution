package typings.bootstrapNotify

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyReturn extends js.Object {
  @JSName("$ele")
  var $ele: JQuery[HTMLElement] = js.native
  def close(): Unit = js.native
  def update(command: String, update: js.Any): Unit = js.native
}

object NotifyReturn {
  @scala.inline
  def apply($ele: JQuery[HTMLElement], close: () => Unit, update: (String, js.Any) => Unit): NotifyReturn = {
    val __obj = js.Dynamic.literal($ele = $ele.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[NotifyReturn]
  }
  @scala.inline
  implicit class NotifyReturnOps[Self <: NotifyReturn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$ele(value: JQuery[HTMLElement]): Self = this.set("$ele", value.asInstanceOf[js.Any])
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdate(value: (String, js.Any) => Unit): Self = this.set("update", js.Any.fromFunction2(value))
  }
  
}

