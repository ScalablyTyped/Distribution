package typings
package atBlueprintjsCoreLib.libEsmComponentsEditableDashTextEditableTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditableTextState extends js.Object {
  /** Pixel height of the input, measured from span size */
  var inputHeight: js.UndefOr[scala.Double] = js.undefined
  /** Pixel width of the input, measured from span size */
  var inputWidth: js.UndefOr[scala.Double] = js.undefined
  /** Whether the value is currently being edited */
  var isEditing: js.UndefOr[scala.Boolean] = js.undefined
  /** The last confirmed value */
  var lastValue: js.UndefOr[java.lang.String] = js.undefined
  /** The controlled input value, may be different from prop during editing */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object IEditableTextState {
  @scala.inline
  def apply(
    inputHeight: scala.Int | scala.Double = null,
    inputWidth: scala.Int | scala.Double = null,
    isEditing: js.UndefOr[scala.Boolean] = js.undefined,
    lastValue: java.lang.String = null,
    value: java.lang.String = null
  ): IEditableTextState = {
    val __obj = js.Dynamic.literal()
    if (inputHeight != null) __obj.updateDynamic("inputHeight")(inputHeight.asInstanceOf[js.Any])
    if (inputWidth != null) __obj.updateDynamic("inputWidth")(inputWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(isEditing)) __obj.updateDynamic("isEditing")(isEditing)
    if (lastValue != null) __obj.updateDynamic("lastValue")(lastValue)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IEditableTextState]
  }
}

