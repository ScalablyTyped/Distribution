package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExecuteOptions extends js.Object {
  /**
  			 * Whether to allow stdin requests.
  			 * The default is `true`.
  			 */
  var allow_stdin: js.UndefOr[Boolean] = js.undefined
  /**
  			 * Whether to execute the code as quietly as possible.
  			 * The default is `false`.
  			 */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
  			 * Whether to the abort execution queue on an error.
  			 * The default is `false`.
  			 */
  var stop_on_error: js.UndefOr[Boolean] = js.undefined
  /**
  			 * Whether to store history of the execution.
  			 * The default `true` if silent is False.
  			 * It is forced to  `false ` if silent is `true`.
  			 */
  var store_history: js.UndefOr[Boolean] = js.undefined
  /**
  			 * A mapping of names to expressions to be evaluated in the
  			 * kernel's interactive namespace.
  			 */
  var user_expressions: js.UndefOr[js.Object] = js.undefined
}

object IExecuteOptions {
  @scala.inline
  def apply(
    allow_stdin: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    stop_on_error: js.UndefOr[Boolean] = js.undefined,
    store_history: js.UndefOr[Boolean] = js.undefined,
    user_expressions: js.Object = null
  ): IExecuteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_stdin)) __obj.updateDynamic("allow_stdin")(allow_stdin.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (!js.isUndefined(stop_on_error)) __obj.updateDynamic("stop_on_error")(stop_on_error.asInstanceOf[js.Any])
    if (!js.isUndefined(store_history)) __obj.updateDynamic("store_history")(store_history.asInstanceOf[js.Any])
    if (user_expressions != null) __obj.updateDynamic("user_expressions")(user_expressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteOptions]
  }
}

