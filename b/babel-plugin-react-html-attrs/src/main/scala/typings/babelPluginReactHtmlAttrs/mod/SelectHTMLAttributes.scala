package typings.babelPluginReactHtmlAttrs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectHTMLAttributes[T] extends HTMLAttributes[T] {
  var autoComplete: js.UndefOr[String] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var autocomplete: js.UndefOr[String] = js.undefined
  var autofocus: js.UndefOr[Boolean | String] = js.undefined
  var disabled: js.UndefOr[Boolean | String] = js.undefined
  var form: js.UndefOr[String] = js.undefined
  var multiple: js.UndefOr[Boolean | String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  @JSName("onChange")
  var onChange_SelectHTMLAttributes: js.UndefOr[ChangeEventHandler[T]] = js.undefined
  var required: js.UndefOr[Boolean | String] = js.undefined
  var size: js.UndefOr[Double | String] = js.undefined
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
}

object SelectHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    autoComplete: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autocomplete: String = null,
    autofocus: Boolean | String = null,
    disabled: Boolean | String = null,
    form: String = null,
    multiple: Boolean | String = null,
    name: String = null,
    onChange: ChangeEvent[T] => Unit = null,
    required: Boolean | String = null,
    size: Double | String = null,
    value: String | js.Array[String] | Double = null
  ): SelectHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    if (autofocus != null) __obj.updateDynamic("autofocus")(autofocus.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (multiple != null) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectHTMLAttributes[T]]
  }
}

