package typings.blueprintjsCore.editableTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditableTextState extends js.Object {
  /** Pixel height of the input, measured from span size */
  var inputHeight: js.UndefOr[Double] = js.undefined
  /** Pixel width of the input, measured from span size */
  var inputWidth: js.UndefOr[Double] = js.undefined
  /** Whether the value is currently being edited */
  var isEditing: js.UndefOr[Boolean] = js.undefined
  /** The last confirmed value */
  var lastValue: js.UndefOr[String] = js.undefined
  /** The controlled input value, may be different from prop during editing */
  var value: js.UndefOr[String] = js.undefined
}

object IEditableTextState {
  @scala.inline
  def apply(
    inputHeight: js.UndefOr[Double] = js.undefined,
    inputWidth: js.UndefOr[Double] = js.undefined,
    isEditing: js.UndefOr[Boolean] = js.undefined,
    lastValue: String = null,
    value: String = null
  ): IEditableTextState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inputHeight)) __obj.updateDynamic("inputHeight")(inputHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inputWidth)) __obj.updateDynamic("inputWidth")(inputWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isEditing)) __obj.updateDynamic("isEditing")(isEditing.get.asInstanceOf[js.Any])
    if (lastValue != null) __obj.updateDynamic("lastValue")(lastValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditableTextState]
  }
}

