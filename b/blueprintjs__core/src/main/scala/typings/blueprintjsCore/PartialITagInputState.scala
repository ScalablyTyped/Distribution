package typings.blueprintjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/tag-input/tagInput.ITagInputState> */
trait PartialITagInputState extends js.Object {
  var activeIndex: js.UndefOr[Double] = js.undefined
  var inputValue: js.UndefOr[String] = js.undefined
  var isInputFocused: js.UndefOr[Boolean] = js.undefined
  var prevInputValueProp: js.UndefOr[String] = js.undefined
}

object PartialITagInputState {
  @scala.inline
  def apply(
    activeIndex: Int | Double = null,
    inputValue: String = null,
    isInputFocused: js.UndefOr[Boolean] = js.undefined,
    prevInputValueProp: String = null
  ): PartialITagInputState = {
    val __obj = js.Dynamic.literal()
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (!js.isUndefined(isInputFocused)) __obj.updateDynamic("isInputFocused")(isInputFocused.asInstanceOf[js.Any])
    if (prevInputValueProp != null) __obj.updateDynamic("prevInputValueProp")(prevInputValueProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialITagInputState]
  }
}

