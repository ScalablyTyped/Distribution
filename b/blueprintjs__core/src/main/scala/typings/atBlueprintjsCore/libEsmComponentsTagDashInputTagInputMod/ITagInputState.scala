package typings.atBlueprintjsCore.libEsmComponentsTagDashInputTagInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITagInputState extends js.Object {
  var activeIndex: Double
  var inputValue: String
  var isInputFocused: Boolean
  var prevInputValueProp: js.UndefOr[String] = js.undefined
}

object ITagInputState {
  @scala.inline
  def apply(
    activeIndex: Double,
    inputValue: String,
    isInputFocused: Boolean,
    prevInputValueProp: String = null
  ): ITagInputState = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex, inputValue = inputValue, isInputFocused = isInputFocused)
    if (prevInputValueProp != null) __obj.updateDynamic("prevInputValueProp")(prevInputValueProp)
    __obj.asInstanceOf[ITagInputState]
  }
}

