package typings.bootbox

import typings.bootbox.anon.Group
import typings.bootbox.bootboxStrings.`extra-large`
import typings.bootbox.bootboxStrings.checkbox
import typings.bootbox.bootboxStrings.date
import typings.bootbox.bootboxStrings.email
import typings.bootbox.bootboxStrings.large
import typings.bootbox.bootboxStrings.lg
import typings.bootbox.bootboxStrings.number
import typings.bootbox.bootboxStrings.password
import typings.bootbox.bootboxStrings.radio
import typings.bootbox.bootboxStrings.range
import typings.bootbox.bootboxStrings.select
import typings.bootbox.bootboxStrings.sm
import typings.bootbox.bootboxStrings.small
import typings.bootbox.bootboxStrings.text
import typings.bootbox.bootboxStrings.textarea
import typings.bootbox.bootboxStrings.time
import typings.bootbox.bootboxStrings.xl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Bootbox options available for prompt modals */
trait BootboxPromptOptions extends BootboxBaseOptions[String] {
  @JSName("buttons")
  var buttons_BootboxPromptOptions: js.UndefOr[BootboxConfirmPromptButtonMap] = js.undefined
  var inputOptions: js.UndefOr[js.Array[Group]] = js.undefined
  var inputType: js.UndefOr[
    text | textarea | email | select | checkbox | date | time | number | password | radio | range
  ] = js.undefined
  @JSName("title")
  var title_BootboxPromptOptions: String
  var value: js.UndefOr[String] = js.undefined
  @JSName("callback")
  def callback_MBootboxPromptOptions(result: String): js.Any
}

object BootboxPromptOptions {
  @scala.inline
  def apply(
    callback: String => js.Any,
    title: String,
    animate: js.UndefOr[Boolean] = js.undefined,
    backdrop: js.UndefOr[Boolean] = js.undefined,
    buttons: BootboxConfirmPromptButtonMap = null,
    className: String = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    inputOptions: js.Array[Group] = null,
    inputType: text | textarea | email | select | checkbox | date | time | number | password | radio | range = null,
    locale: String = null,
    onEscape: js.Function0[_] | Boolean = null,
    scrollable: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    size: small | sm | large | lg | `extra-large` | xl = null,
    value: String = null
  ): BootboxPromptOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(backdrop)) __obj.updateDynamic("backdrop")(backdrop.get.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.get.asInstanceOf[js.Any])
    if (inputOptions != null) __obj.updateDynamic("inputOptions")(inputOptions.asInstanceOf[js.Any])
    if (inputType != null) __obj.updateDynamic("inputType")(inputType.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (onEscape != null) __obj.updateDynamic("onEscape")(onEscape.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxPromptOptions]
  }
}

