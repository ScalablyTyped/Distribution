package typings.atBlueprintjsSelect.libEsmComponentsSelectSuggestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuggestState[T] extends js.Object {
  var isOpen: Boolean
  var selectedItem: T | Null
}

object ISuggestState {
  @scala.inline
  def apply[T](isOpen: Boolean, selectedItem: T = null): ISuggestState[T] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestState[T]]
  }
}

