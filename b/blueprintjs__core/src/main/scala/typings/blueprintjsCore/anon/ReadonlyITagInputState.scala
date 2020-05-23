package typings.blueprintjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@blueprintjs/core.@blueprintjs/core/lib/esm/components/tag-input/tagInput.ITagInputState> */
trait ReadonlyITagInputState extends js.Object {
  val activeIndex: Double
  val inputValue: String
  val isInputFocused: Boolean
  val prevInputValueProp: js.UndefOr[String] = js.undefined
}

object ReadonlyITagInputState {
  @scala.inline
  def apply(
    activeIndex: Double,
    inputValue: String,
    isInputFocused: Boolean,
    prevInputValueProp: String = null
  ): ReadonlyITagInputState = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], isInputFocused = isInputFocused.asInstanceOf[js.Any])
    if (prevInputValueProp != null) __obj.updateDynamic("prevInputValueProp")(prevInputValueProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyITagInputState]
  }
}

