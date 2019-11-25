package typings.chromeDashApps.chrome.commands

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  /** The command description  */
  var description: js.UndefOr[String] = js.undefined
  /** The name of the command  */
  var name: js.UndefOr[String] = js.undefined
  /** The shortcut active for this command, or blank if not active.  */
  var shortcut: js.UndefOr[String] = js.undefined
}

object Command {
  @scala.inline
  def apply(description: String = null, name: String = null, shortcut: String = null): Command = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (shortcut != null) __obj.updateDynamic("shortcut")(shortcut.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
}

