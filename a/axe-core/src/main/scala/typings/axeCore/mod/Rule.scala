package typings.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  var all: js.UndefOr[js.Array[String]] = js.undefined
  var any: js.UndefOr[js.Array[String]] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var excludeHidden: js.UndefOr[Boolean] = js.undefined
  var id: String
  var matches: js.UndefOr[String] = js.undefined
  var none: js.UndefOr[js.Array[String]] = js.undefined
  var pageLevel: js.UndefOr[Boolean] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object Rule {
  @scala.inline
  def apply(
    id: String,
    all: js.Array[String] = null,
    any: js.Array[String] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    excludeHidden: js.UndefOr[Boolean] = js.undefined,
    matches: String = null,
    none: js.Array[String] = null,
    pageLevel: js.UndefOr[Boolean] = js.undefined,
    selector: String = null,
    tags: js.Array[String] = null
  ): Rule = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (all != null) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (any != null) __obj.updateDynamic("any")(any.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeHidden)) __obj.updateDynamic("excludeHidden")(excludeHidden.asInstanceOf[js.Any])
    if (matches != null) __obj.updateDynamic("matches")(matches.asInstanceOf[js.Any])
    if (none != null) __obj.updateDynamic("none")(none.asInstanceOf[js.Any])
    if (!js.isUndefined(pageLevel)) __obj.updateDynamic("pageLevel")(pageLevel.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
}

