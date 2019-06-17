package typings
package baseuiLib.tagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagOverrides extends js.Object {
  var Action: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var ActionIcon: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Root: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Text: js.UndefOr[baseuiLib.Override[_]] = js.undefined
}

object TagOverrides {
  @scala.inline
  def apply(
    Action: baseuiLib.Override[_] = null,
    ActionIcon: baseuiLib.Override[_] = null,
    Root: baseuiLib.Override[_] = null,
    Text: baseuiLib.Override[_] = null
  ): TagOverrides = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (ActionIcon != null) __obj.updateDynamic("ActionIcon")(ActionIcon.asInstanceOf[js.Any])
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    if (Text != null) __obj.updateDynamic("Text")(Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagOverrides]
  }
}

