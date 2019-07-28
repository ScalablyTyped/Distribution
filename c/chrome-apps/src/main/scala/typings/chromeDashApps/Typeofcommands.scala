package typings.chromeDashApps

import typings.chromeDashApps.chromeNs.commandsNs.Command
import typings.chromeDashApps.chromeNs.commandsNs.CommandEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcommands extends js.Object {
  /** Fired when a registered command is activated using a keyboard shortcut. */
  val onCommand: CommandEvent
  /**
    * Returns all the registered commands for this app and their shortcut (if active).
    * @param callback Called to return the registered commands.
    */
  def getAll(callback: js.Function1[/* commands */ js.Array[Command], Unit]): Unit
}

object Typeofcommands {
  @scala.inline
  def apply(getAll: js.Function1[/* commands */ js.Array[Command], Unit] => Unit, onCommand: CommandEvent): Typeofcommands = {
    val __obj = js.Dynamic.literal(getAll = js.Any.fromFunction1(getAll), onCommand = onCommand)
  
    __obj.asInstanceOf[Typeofcommands]
  }
}

