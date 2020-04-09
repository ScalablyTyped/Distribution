package typings.bootstrapFilestyle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilestyleOptions extends js.Object {
  var badge: js.UndefOr[Boolean] = js.undefined
  var buttonBefore: js.UndefOr[Boolean] = js.undefined
  var buttonName: js.UndefOr[String] = js.undefined
  var buttonText: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[Boolean] = js.undefined
  var iconName: js.UndefOr[String] = js.undefined
  var input: js.UndefOr[Boolean] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object FilestyleOptions {
  @scala.inline
  def apply(
    badge: js.UndefOr[Boolean] = js.undefined,
    buttonBefore: js.UndefOr[Boolean] = js.undefined,
    buttonName: String = null,
    buttonText: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: js.UndefOr[Boolean] = js.undefined,
    iconName: String = null,
    input: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    size: String = null
  ): FilestyleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(badge)) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonBefore)) __obj.updateDynamic("buttonBefore")(buttonBefore.asInstanceOf[js.Any])
    if (buttonName != null) __obj.updateDynamic("buttonName")(buttonName.asInstanceOf[js.Any])
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconName != null) __obj.updateDynamic("iconName")(iconName.asInstanceOf[js.Any])
    if (!js.isUndefined(input)) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilestyleOptions]
  }
}

