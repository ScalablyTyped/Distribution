package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExecuteRequest extends IExecuteOptions {
  var code: String | js.Array[String]
}

object IExecuteRequest {
  @scala.inline
  def apply(
    code: String | js.Array[String],
    allow_stdin: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    stop_on_error: js.UndefOr[Boolean] = js.undefined,
    store_history: js.UndefOr[Boolean] = js.undefined,
    user_expressions: js.Object = null
  ): IExecuteRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_stdin)) __obj.updateDynamic("allow_stdin")(allow_stdin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stop_on_error)) __obj.updateDynamic("stop_on_error")(stop_on_error.get.asInstanceOf[js.Any])
    if (!js.isUndefined(store_history)) __obj.updateDynamic("store_history")(store_history.get.asInstanceOf[js.Any])
    if (user_expressions != null) __obj.updateDynamic("user_expressions")(user_expressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteRequest]
  }
}

