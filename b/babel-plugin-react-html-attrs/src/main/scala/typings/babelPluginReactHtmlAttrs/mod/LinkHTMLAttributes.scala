package typings.babelPluginReactHtmlAttrs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkHTMLAttributes[T] extends HTMLAttributes[T] {
  var as: js.UndefOr[String] = js.undefined
  var charSet: js.UndefOr[String] = js.undefined
  var charset: js.UndefOr[String] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var crossorigin: js.UndefOr[String] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var hrefLang: js.UndefOr[String] = js.undefined
  var hreflang: js.UndefOr[String] = js.undefined
  var integrity: js.UndefOr[String] = js.undefined
  var media: js.UndefOr[String] = js.undefined
  var rel: js.UndefOr[String] = js.undefined
  var sizes: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object LinkHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    as: String = null,
    charSet: String = null,
    charset: String = null,
    crossOrigin: String = null,
    crossorigin: String = null,
    href: String = null,
    hrefLang: String = null,
    hreflang: String = null,
    integrity: String = null,
    media: String = null,
    rel: String = null,
    sizes: String = null,
    `type`: String = null
  ): LinkHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (charSet != null) __obj.updateDynamic("charSet")(charSet.asInstanceOf[js.Any])
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (crossorigin != null) __obj.updateDynamic("crossorigin")(crossorigin.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (hrefLang != null) __obj.updateDynamic("hrefLang")(hrefLang.asInstanceOf[js.Any])
    if (hreflang != null) __obj.updateDynamic("hreflang")(hreflang.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkHTMLAttributes[T]]
  }
}

