package typings.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Check extends js.Object {
  var after: js.UndefOr[js.Function | String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var evaluate: js.Function | String
  var id: String
  var matches: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
}

object Check {
  @scala.inline
  def apply(
    evaluate: js.Function | String,
    id: String,
    after: js.Function | String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    matches: String = null,
    options: js.Any = null
  ): Check = {
    val __obj = js.Dynamic.literal(evaluate = evaluate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (matches != null) __obj.updateDynamic("matches")(matches.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Check]
  }
}

