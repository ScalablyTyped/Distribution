package typings
package cucumberLib.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var preferForRegexpMatch: js.UndefOr[scala.Boolean] = js.undefined
  var regexp: stdLib.RegExp
  var typeName: js.UndefOr[java.lang.String] = js.undefined
  var useForSnippets: js.UndefOr[scala.Boolean] = js.undefined
  def transformer(`this`: World, arg: java.lang.String*): js.Any
}

object Transform {
  @scala.inline
  def apply(
    regexp: stdLib.RegExp,
    transformer: js.Function2[World, /* repeated */ java.lang.String, js.Any],
    name: java.lang.String = null,
    preferForRegexpMatch: js.UndefOr[scala.Boolean] = js.undefined,
    typeName: java.lang.String = null,
    useForSnippets: js.UndefOr[scala.Boolean] = js.undefined
  ): Transform = {
    val __obj = js.Dynamic.literal(regexp = regexp, transformer = transformer)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(preferForRegexpMatch)) __obj.updateDynamic("preferForRegexpMatch")(preferForRegexpMatch)
    if (typeName != null) __obj.updateDynamic("typeName")(typeName)
    if (!js.isUndefined(useForSnippets)) __obj.updateDynamic("useForSnippets")(useForSnippets)
    __obj.asInstanceOf[Transform]
  }
}

