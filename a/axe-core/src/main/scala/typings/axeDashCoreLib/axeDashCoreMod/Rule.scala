package typings
package axeDashCoreLib.axeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  var all: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var any: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var excludeHidden: js.UndefOr[scala.Boolean] = js.undefined
  var id: java.lang.String
  var matches: js.UndefOr[java.lang.String] = js.undefined
  var none: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var pageLevel: js.UndefOr[scala.Boolean] = js.undefined
  var selector: js.UndefOr[java.lang.String] = js.undefined
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Rule {
  @scala.inline
  def apply(
    id: java.lang.String,
    all: js.Array[java.lang.String] = null,
    any: js.Array[java.lang.String] = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    excludeHidden: js.UndefOr[scala.Boolean] = js.undefined,
    matches: java.lang.String = null,
    none: js.Array[java.lang.String] = null,
    pageLevel: js.UndefOr[scala.Boolean] = js.undefined,
    selector: java.lang.String = null,
    tags: js.Array[java.lang.String] = null
  ): Rule = {
    val __obj = js.Dynamic.literal(id = id)
    if (all != null) __obj.updateDynamic("all")(all)
    if (any != null) __obj.updateDynamic("any")(any)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(excludeHidden)) __obj.updateDynamic("excludeHidden")(excludeHidden)
    if (matches != null) __obj.updateDynamic("matches")(matches)
    if (none != null) __obj.updateDynamic("none")(none)
    if (!js.isUndefined(pageLevel)) __obj.updateDynamic("pageLevel")(pageLevel)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Rule]
  }
}

