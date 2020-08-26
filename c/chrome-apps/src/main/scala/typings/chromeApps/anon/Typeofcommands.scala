package typings.chromeApps.anon

import typings.chromeApps.chrome.commands.Command
import typings.chromeApps.chrome.commands.CommandEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcommands extends js.Object {
  /** Fired when a registered command is activated using a keyboard shortcut. */
  val onCommand: CommandEvent = js.native
  /**
    * Returns all the registered commands for this app and their shortcut (if active).
    * @param callback Called to return the registered commands.
    */
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

