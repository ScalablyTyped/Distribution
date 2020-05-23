package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Removebookmarkshortcut extends js.Object {
  var remove_bookmark_shortcut: js.UndefOr[Boolean] = js.undefined
  var remove_button: js.UndefOr[Boolean] = js.undefined
}

object Removebookmarkshortcut {
  @scala.inline
  def apply(
    remove_bookmark_shortcut: js.UndefOr[Boolean] = js.undefined,
    remove_button: js.UndefOr[Boolean] = js.undefined
  ): Removebookmarkshortcut = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(remove_bookmark_shortcut)) __obj.updateDynamic("remove_bookmark_shortcut")(remove_bookmark_shortcut.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remove_button)) __obj.updateDynamic("remove_button")(remove_button.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Removebookmarkshortcut]
  }
}

