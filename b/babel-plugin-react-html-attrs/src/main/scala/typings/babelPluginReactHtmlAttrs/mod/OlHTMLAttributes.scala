package typings.babelPluginReactHtmlAttrs.mod

import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.A
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.I
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.`1`
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.a_
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.i_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlHTMLAttributes[T] extends HTMLAttributes[T] {
  var reversed: js.UndefOr[Boolean | String] = js.undefined
  var start: js.UndefOr[Double | String] = js.undefined
  var `type`: js.UndefOr[`1` | a_ | A | i_ | I] = js.undefined
}

object OlHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    reversed: Boolean | String = null,
    start: Double | String = null,
    `type`: `1` | a_ | A | i_ | I = null
  ): OlHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (reversed != null) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlHTMLAttributes[T]]
  }
}

