package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemovebookmarkshortcut extends js.Object {
  var remove_bookmark_shortcut: js.UndefOr[Boolean] = js.undefined
  var remove_button: js.UndefOr[Boolean] = js.undefined
}

object AnonRemovebookmarkshortcut {
  @scala.inline
  def apply(
    remove_bookmark_shortcut: js.UndefOr[Boolean] = js.undefined,
    remove_button: js.UndefOr[Boolean] = js.undefined
  ): AnonRemovebookmarkshortcut = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(remove_bookmark_shortcut)) __obj.updateDynamic("remove_bookmark_shortcut")(remove_bookmark_shortcut.asInstanceOf[js.Any])
    if (!js.isUndefined(remove_button)) __obj.updateDynamic("remove_button")(remove_button.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRemovebookmarkshortcut]
  }
}

