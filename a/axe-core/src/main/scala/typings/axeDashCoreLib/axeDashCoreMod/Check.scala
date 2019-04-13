package typings
package axeDashCoreLib.axeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Check extends js.Object {
  var after: js.UndefOr[js.Function | java.lang.String] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var evaluate: js.Function | java.lang.String
  var id: java.lang.String
  var matches: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
}

object Check {
  @scala.inline
  def apply(
    evaluate: js.Function | java.lang.String,
    id: java.lang.String,
    after: js.Function | java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    matches: java.lang.String = null,
    options: js.Any = null
  ): Check = {
    val __obj = js.Dynamic.literal(evaluate = evaluate.asInstanceOf[js.Any], id = id)
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (matches != null) __obj.updateDynamic("matches")(matches)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Check]
  }
}

