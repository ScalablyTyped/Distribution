package typings.chromeApps.chrome.commands

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.commands.getAll")
@js.native
object getAll extends js.Object {
  /**
    * Returns all the registered commands for this app and their shortcut (if active).
    * @param callback Called to return the registered commands.
    */
  def apply(callback: js.Function1[/* commands */ js.Array[Command], Unit]): Unit = js.native
}

