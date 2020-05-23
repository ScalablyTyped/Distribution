package typings.babelPluginReactHtmlAttrs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextareaHTMLAttributes[T] extends HTMLAttributes[T] {
  var autoComplete: js.UndefOr[String] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var autocomplete: js.UndefOr[String] = js.undefined
  var autofocus: js.UndefOr[Boolean | String] = js.undefined
  var cols: js.UndefOr[Double | String] = js.undefined
  var dirName: js.UndefOr[String] = js.undefined
  var dirname: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean | String] = js.undefined
  var form: js.UndefOr[String] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var maxlength: js.UndefOr[Double | String] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var minlength: js.UndefOr[Double | String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  @JSName("onChange")
  var onChange_TextareaHTMLAttributes: js.UndefOr[ChangeEventHandler[T]] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var readonly: js.UndefOr[Boolean | String] = js.undefined
  var required: js.UndefOr[Boolean | String] = js.undefined
  var rows: js.UndefOr[Double | String] = js.undefined
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
  var wrap: js.UndefOr[String] = js.undefined
}

object TextareaHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    autoComplete: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autocomplete: String = null,
    autofocus: Boolean | String = null,
    cols: Double | String = null,
    dirName: String = null,
    dirname: String = null,
    disabled: Boolean | String = null,
    form: String = null,
    maxLength: js.UndefOr[Double] = js.undefined,
    maxlength: Double | String = null,
    minLength: js.UndefOr[Double] = js.undefined,
    minlength: Double | String = null,
    name: String = null,
    onChange: ChangeEvent[T] => Unit = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    readonly: Boolean | String = null,
    required: Boolean | String = null,
    rows: Double | String = null,
    value: String | js.Array[String] | Double = null,
    wrap: String = null
  ): TextareaHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    if (autofocus != null) __obj.updateDynamic("autofocus")(autofocus.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (dirName != null) __obj.updateDynamic("dirName")(dirName.asInstanceOf[js.Any])
    if (dirname != null) __obj.updateDynamic("dirname")(dirname.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength.asInstanceOf[js.Any])
    if (!js.isUndefined(minLength)) __obj.updateDynamic("minLength")(minLength.get.asInstanceOf[js.Any])
    if (minlength != null) __obj.updateDynamic("minlength")(minlength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (readonly != null) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextareaHTMLAttributes[T]]
  }
}

