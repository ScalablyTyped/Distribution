package typings.babelPluginReactHtmlAttrs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IframeHTMLAttributes[T] extends HTMLAttributes[T] {
  var allow: js.UndefOr[String] = js.undefined
  var allowFullScreen: js.UndefOr[Boolean] = js.undefined
  var allowTransparency: js.UndefOr[Boolean] = js.undefined
  var allowfullscreen: js.UndefOr[Boolean | String] = js.undefined
  var allowtransparency: js.UndefOr[Boolean | String] = js.undefined
  var frameBorder: js.UndefOr[Double | String] = js.undefined
  var frameborder: js.UndefOr[Double | String] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var marginHeight: js.UndefOr[Double] = js.undefined
  var marginWidth: js.UndefOr[Double] = js.undefined
  var marginheight: js.UndefOr[Double | String] = js.undefined
  var marginwidth: js.UndefOr[Double | String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var referrerPolicy: js.UndefOr[String] = js.undefined
  var referrerpolicy: js.UndefOr[String] = js.undefined
  var sandbox: js.UndefOr[String] = js.undefined
  var scrolling: js.UndefOr[String] = js.undefined
  var seamless: js.UndefOr[Boolean | String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var srcDoc: js.UndefOr[String] = js.undefined
  var srcdoc: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object IframeHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    allow: String = null,
    allowFullScreen: js.UndefOr[Boolean] = js.undefined,
    allowTransparency: js.UndefOr[Boolean] = js.undefined,
    allowfullscreen: Boolean | String = null,
    allowtransparency: Boolean | String = null,
    frameBorder: Double | String = null,
    frameborder: Double | String = null,
    height: Double | String = null,
    marginHeight: js.UndefOr[Double] = js.undefined,
    marginWidth: js.UndefOr[Double] = js.undefined,
    marginheight: Double | String = null,
    marginwidth: Double | String = null,
    name: String = null,
    referrerPolicy: String = null,
    referrerpolicy: String = null,
    sandbox: String = null,
    scrolling: String = null,
    seamless: Boolean | String = null,
    src: String = null,
    srcDoc: String = null,
    srcdoc: String = null,
    width: Double | String = null
  ): IframeHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (allow != null) __obj.updateDynamic("allow")(allow.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFullScreen)) __obj.updateDynamic("allowFullScreen")(allowFullScreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTransparency)) __obj.updateDynamic("allowTransparency")(allowTransparency.get.asInstanceOf[js.Any])
    if (allowfullscreen != null) __obj.updateDynamic("allowfullscreen")(allowfullscreen.asInstanceOf[js.Any])
    if (allowtransparency != null) __obj.updateDynamic("allowtransparency")(allowtransparency.asInstanceOf[js.Any])
    if (frameBorder != null) __obj.updateDynamic("frameBorder")(frameBorder.asInstanceOf[js.Any])
    if (frameborder != null) __obj.updateDynamic("frameborder")(frameborder.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(marginHeight)) __obj.updateDynamic("marginHeight")(marginHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginWidth)) __obj.updateDynamic("marginWidth")(marginWidth.get.asInstanceOf[js.Any])
    if (marginheight != null) __obj.updateDynamic("marginheight")(marginheight.asInstanceOf[js.Any])
    if (marginwidth != null) __obj.updateDynamic("marginwidth")(marginwidth.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy.asInstanceOf[js.Any])
    if (referrerpolicy != null) __obj.updateDynamic("referrerpolicy")(referrerpolicy.asInstanceOf[js.Any])
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox.asInstanceOf[js.Any])
    if (scrolling != null) __obj.updateDynamic("scrolling")(scrolling.asInstanceOf[js.Any])
    if (seamless != null) __obj.updateDynamic("seamless")(seamless.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (srcDoc != null) __obj.updateDynamic("srcDoc")(srcDoc.asInstanceOf[js.Any])
    if (srcdoc != null) __obj.updateDynamic("srcdoc")(srcdoc.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IframeHTMLAttributes[T]]
  }
}

