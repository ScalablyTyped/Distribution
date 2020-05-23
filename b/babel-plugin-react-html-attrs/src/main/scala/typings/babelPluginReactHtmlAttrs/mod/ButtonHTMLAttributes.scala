package typings.babelPluginReactHtmlAttrs.mod

import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.button
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.reset
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonHTMLAttributes[T] extends HTMLAttributes[T] {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var autofocus: js.UndefOr[Boolean | String] = js.undefined
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
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[submit | reset | button] = js.undefined
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
}

object ButtonHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autofocus: Boolean | String = null,
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
    name: String = null,
    `type`: submit | reset | button = null,
    value: String | js.Array[String] | Double = null
  ): ButtonHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (autofocus != null) __obj.updateDynamic("autofocus")(autofocus.asInstanceOf[js.Any])
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
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonHTMLAttributes[T]]
  }
}

