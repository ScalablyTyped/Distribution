package typings
package baseuiLib.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectState extends js.Object {
  var inputValue: java.lang.String
  var isFocused: scala.Boolean
  var isOpen: scala.Boolean
  var isPseudoFocused: scala.Boolean
}

object SelectState {
  @scala.inline
  def apply(
    inputValue: java.lang.String,
    isFocused: scala.Boolean,
    isOpen: scala.Boolean,
    isPseudoFocused: scala.Boolean
  ): SelectState = {
    val __obj = js.Dynamic.literal(inputValue = inputValue, isFocused = isFocused, isOpen = isOpen, isPseudoFocused = isPseudoFocused)
  
    __obj.asInstanceOf[SelectState]
  }
}

