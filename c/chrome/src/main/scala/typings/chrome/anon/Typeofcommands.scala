package typings.chrome.anon

import typings.chrome.chrome.commands.Command
import typings.chrome.chrome.commands.CommandEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcommands extends js.Object {
  var onCommand: CommandEvent = js.native
  def getAll(callback: js.Function1[/* commands */ js.Array[Command], Unit]): Unit = js.native
}

object Typeofcommands {
  @scala.inline
  def apply(getAll: js.Function1[/* commands */ js.Array[Command], Unit] => Unit, onCommand: CommandEvent): Typeofcommands = {
    val __obj = js.Dynamic.literal(getAll = js.Any.fromFunction1(getAll), onCommand = onCommand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofcommands]
  }
  @scala.inline
  implicit class TypeofcommandsOps[Self <: Typeofcommands] (val x: Self) extends AnyVal {
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
    def setGetAll(value: js.Function1[/* commands */ js.Array[Command], Unit] => Unit): Self = this.set("getAll", js.Any.fromFunction1(value))
    @scala.inline
    def setOnCommand(value: CommandEvent): Self = this.set("onCommand", value.asInstanceOf[js.Any])
  }
  
}

