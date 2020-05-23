package typings.babelPluginReactHtmlAttrs.mod

import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings._empty
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.`no-referrer`
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.`unsafe-url`
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.`use-credentials`
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.anonymous
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.async
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.auto
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.eager
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.origin
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImgHTMLAttributes[T] extends HTMLAttributes[T] {
  var alt: js.UndefOr[String] = js.undefined
  var crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.undefined
  var crossorigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.undefined
  var decoding: js.UndefOr[async | auto | sync] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var loading: js.UndefOr[
    eager | typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.`lazy`
  ] = js.undefined
  var referrerPolicy: js.UndefOr[`no-referrer` | origin | `unsafe-url`] = js.undefined
  var referrerpolicy: js.UndefOr[`no-referrer` | origin | `unsafe-url`] = js.undefined
  var sizes: js.UndefOr[String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var srcSet: js.UndefOr[String] = js.undefined
  var srcset: js.UndefOr[String] = js.undefined
  var useMap: js.UndefOr[String] = js.undefined
  var usemap: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object ImgHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    alt: String = null,
    crossOrigin: anonymous | `use-credentials` | _empty = null,
    crossorigin: anonymous | `use-credentials` | _empty = null,
    decoding: async | auto | sync = null,
    height: Double | String = null,
    loading: eager | typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.`lazy` = null,
    referrerPolicy: `no-referrer` | origin | `unsafe-url` = null,
    referrerpolicy: `no-referrer` | origin | `unsafe-url` = null,
    sizes: String = null,
    src: String = null,
    srcSet: String = null,
    srcset: String = null,
    useMap: String = null,
    usemap: String = null,
    width: Double | String = null
  ): ImgHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (crossorigin != null) __obj.updateDynamic("crossorigin")(crossorigin.asInstanceOf[js.Any])
    if (decoding != null) __obj.updateDynamic("decoding")(decoding.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy.asInstanceOf[js.Any])
    if (referrerpolicy != null) __obj.updateDynamic("referrerpolicy")(referrerpolicy.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet.asInstanceOf[js.Any])
    if (srcset != null) __obj.updateDynamic("srcset")(srcset.asInstanceOf[js.Any])
    if (useMap != null) __obj.updateDynamic("useMap")(useMap.asInstanceOf[js.Any])
    if (usemap != null) __obj.updateDynamic("usemap")(usemap.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImgHTMLAttributes[T]]
  }
}

