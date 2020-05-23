package typings.babelPluginReactHtmlAttrs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptHTMLAttributes[T] extends HTMLAttributes[T] {
  var async: js.UndefOr[Boolean | String] = js.undefined
  var charSet: js.UndefOr[String] = js.undefined
  var charset: js.UndefOr[String] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var crossorigin: js.UndefOr[String] = js.undefined
  var defer: js.UndefOr[Boolean | String] = js.undefined
  var integrity: js.UndefOr[String] = js.undefined
  var noModule: js.UndefOr[Boolean] = js.undefined
  var nomodule: js.UndefOr[Boolean | String] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ScriptHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    async: Boolean | String = null,
    charSet: String = null,
    charset: String = null,
    crossOrigin: String = null,
    crossorigin: String = null,
    defer: Boolean | String = null,
    integrity: String = null,
    noModule: js.UndefOr[Boolean] = js.undefined,
    nomodule: Boolean | String = null,
    nonce: String = null,
    src: String = null,
    `type`: String = null
  ): ScriptHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (async != null) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (charSet != null) __obj.updateDynamic("charSet")(charSet.asInstanceOf[js.Any])
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (crossorigin != null) __obj.updateDynamic("crossorigin")(crossorigin.asInstanceOf[js.Any])
    if (defer != null) __obj.updateDynamic("defer")(defer.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (!js.isUndefined(noModule)) __obj.updateDynamic("noModule")(noModule.get.asInstanceOf[js.Any])
    if (nomodule != null) __obj.updateDynamic("nomodule")(nomodule.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptHTMLAttributes[T]]
  }
}

