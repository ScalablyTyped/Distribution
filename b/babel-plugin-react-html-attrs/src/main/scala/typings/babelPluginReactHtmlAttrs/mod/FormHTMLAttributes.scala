package typings.babelPluginReactHtmlAttrs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormHTMLAttributes[T] extends HTMLAttributes[T] {
  var `accept-charset`: js.UndefOr[String] = js.undefined
  var acceptCharset: js.UndefOr[String] = js.undefined
  var action: js.UndefOr[String] = js.undefined
  var autoComplete: js.UndefOr[String] = js.undefined
  var autocomplete: js.UndefOr[String] = js.undefined
  var encType: js.UndefOr[String] = js.undefined
  var enctype: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var noValidate: js.UndefOr[Boolean] = js.undefined
  var novalidate: js.UndefOr[Boolean | String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
}

object FormHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    `accept-charset`: String = null,
    acceptCharset: String = null,
    action: String = null,
    autoComplete: String = null,
    autocomplete: String = null,
    encType: String = null,
    enctype: String = null,
    method: String = null,
    name: String = null,
    noValidate: js.UndefOr[Boolean] = js.undefined,
    novalidate: Boolean | String = null,
    target: String = null
  ): FormHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (`accept-charset` != null) __obj.updateDynamic("accept-charset")(`accept-charset`.asInstanceOf[js.Any])
    if (acceptCharset != null) __obj.updateDynamic("acceptCharset")(acceptCharset.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    if (encType != null) __obj.updateDynamic("encType")(encType.asInstanceOf[js.Any])
    if (enctype != null) __obj.updateDynamic("enctype")(enctype.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(noValidate)) __obj.updateDynamic("noValidate")(noValidate.get.asInstanceOf[js.Any])
    if (novalidate != null) __obj.updateDynamic("novalidate")(novalidate.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormHTMLAttributes[T]]
  }
}

