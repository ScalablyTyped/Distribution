package typings.atBlueprintjsCore.libEsmComponentsTagDashInputTagInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITagInputState extends js.Object {
  var activeIndex: Double
  var inputValue: String
  var isInputFocused: Boolean
}

object ITagInputState {
  @scala.inline
  def apply(activeIndex: Double, inputValue: String, isInputFocused: Boolean): ITagInputState = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex, inputValue = inputValue, isInputFocused = isInputFocused)
  
    __obj.asInstanceOf[ITagInputState]
  }
}

