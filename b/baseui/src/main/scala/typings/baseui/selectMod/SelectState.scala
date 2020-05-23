package typings.baseui.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectState extends js.Object {
  var activeDescendant: String | Null
  var inputValue: String
  var isFocused: Boolean
  var isOpen: Boolean
  var isPseudoFocused: Boolean
}

object SelectState {
  @scala.inline
  def apply(
    inputValue: String,
    isFocused: Boolean,
    isOpen: Boolean,
    isPseudoFocused: Boolean,
    activeDescendant: String = null
  ): SelectState = {
    val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isPseudoFocused = isPseudoFocused.asInstanceOf[js.Any], activeDescendant = activeDescendant.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectState]
  }
}

