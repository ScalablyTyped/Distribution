package typings.babelPluginReactHtmlAttrs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputHTMLAttributes[T] extends HTMLAttributes[T] {
  var accept: js.UndefOr[String] = js.undefined
  var alt: js.UndefOr[String] = js.undefined
  var autoComplete: js.UndefOr[String] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var autocomplete: js.UndefOr[String] = js.undefined
  var autofocus: js.UndefOr[Boolean | String] = js.undefined
  var capture: js.UndefOr[Boolean | String] = js.undefined
   // https://www.w3.org/TR/html-media-capture/#the-capture-attribute
  var checked: js.UndefOr[Boolean | String] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var crossorigin: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean | String] = js.undefined
  var form: js.UndefOr[String] = js.undefined
  var formAction: js.UndefOr[String] = js.undefined
  var formEncType: js.UndefOr[String] = js.undefined
  var formMethod: js.UndefOr[String] = js.undefined
  var formNoValidate: js.UndefOr[Boolean] = js.undefined
  var formTarget: js.UndefOr[String] = js.undefined
  var formaction: js.UndefOr[String] = js.undefined
  var formenctype: js.UndefOr[String] = js.undefined
  var formmethod: js.UndefOr[String] = js.undefined
  var formnovalidate: js.UndefOr[Boolean | String] = js.undefined
  var formtarget: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var list: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[Double | String] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var maxlength: js.UndefOr[Double | String] = js.undefined
  var min: js.UndefOr[Double | String] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var minlength: js.UndefOr[Double | String] = js.undefined
  var multiple: js.UndefOr[Boolean | String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  @JSName("onChange")
  var onChange_InputHTMLAttributes: js.UndefOr[ChangeEventHandler[T]] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var readonly: js.UndefOr[Boolean | String] = js.undefined
  var required: js.UndefOr[Boolean | String] = js.undefined
  var size: js.UndefOr[Double | String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var step: js.UndefOr[Double | String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object InputHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    accept: String = null,
    alt: String = null,
    autoComplete: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autocomplete: String = null,
    autofocus: Boolean | String = null,
    capture: Boolean | String = null,
    checked: Boolean | String = null,
    crossOrigin: String = null,
    crossorigin: String = null,
    disabled: Boolean | String = null,
    form: String = null,
    formAction: String = null,
    formEncType: String = null,
    formMethod: String = null,
    formNoValidate: js.UndefOr[Boolean] = js.undefined,
    formTarget: String = null,
    formaction: String = null,
    formenctype: String = null,
    formmethod: String = null,
    formnovalidate: Boolean | String = null,
    formtarget: String = null,
    height: Double | String = null,
    list: String = null,
    max: Double | String = null,
    maxLength: js.UndefOr[Double] = js.undefined,
    maxlength: Double | String = null,
    min: Double | String = null,
    minLength: js.UndefOr[Double] = js.undefined,
    minlength: Double | String = null,
    multiple: Boolean | String = null,
    name: String = null,
    onChange: ChangeEvent[T] => Unit = null,
    pattern: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    readonly: Boolean | String = null,
    required: Boolean | String = null,
    size: Double | String = null,
    src: String = null,
    step: Double | String = null,
    `type`: String = null,
    value: String | js.Array[String] | Double = null,
    width: Double | String = null
  ): InputHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    if (autofocus != null) __obj.updateDynamic("autofocus")(autofocus.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (checked != null) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (crossorigin != null) __obj.updateDynamic("crossorigin")(crossorigin.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formAction != null) __obj.updateDynamic("formAction")(formAction.asInstanceOf[js.Any])
    if (formEncType != null) __obj.updateDynamic("formEncType")(formEncType.asInstanceOf[js.Any])
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate.get.asInstanceOf[js.Any])
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget.asInstanceOf[js.Any])
    if (formaction != null) __obj.updateDynamic("formaction")(formaction.asInstanceOf[js.Any])
    if (formenctype != null) __obj.updateDynamic("formenctype")(formenctype.asInstanceOf[js.Any])
    if (formmethod != null) __obj.updateDynamic("formmethod")(formmethod.asInstanceOf[js.Any])
    if (formnovalidate != null) __obj.updateDynamic("formnovalidate")(formnovalidate.asInstanceOf[js.Any])
    if (formtarget != null) __obj.updateDynamic("formtarget")(formtarget.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(minLength)) __obj.updateDynamic("minLength")(minLength.get.asInstanceOf[js.Any])
    if (minlength != null) __obj.updateDynamic("minlength")(minlength.asInstanceOf[js.Any])
    if (multiple != null) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (readonly != null) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputHTMLAttributes[T]]
  }
}

