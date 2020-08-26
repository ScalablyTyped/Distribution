package typings.blessed.mod.Widgets.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListbarCommand extends js.Object {
  var key: String = js.native
  def callback(): Unit = js.native
}

object ListbarCommand {
  @scala.inline
  def apply(callback: () => Unit, key: String): ListbarCommand = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListbarCommand]
  }
  @scala.inline
  implicit class ListbarCommandOps[Self <: ListbarCommand] (val x: Self) extends AnyVal {
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
    def setCallback(value: () => Unit): Self = this.set("callback", js.Any.fromFunction0(value))
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
  }
  
}

