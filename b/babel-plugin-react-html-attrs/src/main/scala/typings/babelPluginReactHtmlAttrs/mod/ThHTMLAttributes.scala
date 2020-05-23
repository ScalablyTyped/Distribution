package typings.babelPluginReactHtmlAttrs.mod

import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.center
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.char
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.justify
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.left
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThHTMLAttributes[T] extends HTMLAttributes[T] {
  var abbr: js.UndefOr[String] = js.undefined
  var align: js.UndefOr[left | center | right | justify | char] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var colspan: js.UndefOr[Double | String] = js.undefined
  var headers: js.UndefOr[String] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
  var rowspan: js.UndefOr[Double | String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
}

object ThHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    abbr: String = null,
    align: left | center | right | justify | char = null,
    colSpan: js.UndefOr[Double] = js.undefined,
    colspan: Double | String = null,
    headers: String = null,
    rowSpan: js.UndefOr[Double] = js.undefined,
    rowspan: Double | String = null,
    scope: String = null
  ): ThHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (abbr != null) __obj.updateDynamic("abbr")(abbr.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(colSpan)) __obj.updateDynamic("colSpan")(colSpan.get.asInstanceOf[js.Any])
    if (colspan != null) __obj.updateDynamic("colspan")(colspan.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(rowSpan)) __obj.updateDynamic("rowSpan")(rowSpan.get.asInstanceOf[js.Any])
    if (rowspan != null) __obj.updateDynamic("rowspan")(rowspan.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThHTMLAttributes[T]]
  }
}

