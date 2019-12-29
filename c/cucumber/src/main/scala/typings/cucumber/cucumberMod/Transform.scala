package typings.cucumber.cucumberMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var preferForRegexpMatch: js.UndefOr[Boolean] = js.undefined
  var regexp: RegExp
  var typeName: js.UndefOr[String] = js.undefined
  var useForSnippets: js.UndefOr[Boolean] = js.undefined
  def transformer(arg: String*): js.Any
}

object Transform {
  @scala.inline
  def apply(
    regexp: RegExp,
    transformer: /* repeated */ String => js.Any,
    name: String = null,
    preferForRegexpMatch: js.UndefOr[Boolean] = js.undefined,
    typeName: String = null,
    useForSnippets: js.UndefOr[Boolean] = js.undefined
  ): Transform = {
    val __obj = js.Dynamic.literal(regexp = regexp.asInstanceOf[js.Any], transformer = js.Any.fromFunction1(transformer))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(preferForRegexpMatch)) __obj.updateDynamic("preferForRegexpMatch")(preferForRegexpMatch.asInstanceOf[js.Any])
    if (typeName != null) __obj.updateDynamic("typeName")(typeName.asInstanceOf[js.Any])
    if (!js.isUndefined(useForSnippets)) __obj.updateDynamic("useForSnippets")(useForSnippets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
}

