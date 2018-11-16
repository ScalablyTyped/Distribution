package typings
package chromeDashAppsLib.chromeNs.commandsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.commands")
@js.native
object commandsNsMembers extends js.Object {
  /** Fired when a registered command is activated using a keyboard shortcut. */
  val onCommand: CommandEvent = js.native
  /**
           * Returns all the registered commands for this app and their shortcut (if active).
           * @param callback Called to return the registered commands.
           */
  def getAll(callback: js.Function1[/* commands */ js.Array[Command], scala.Unit]): scala.Unit = js.native
}

