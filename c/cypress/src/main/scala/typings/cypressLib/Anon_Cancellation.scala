package typings
package cypressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancellation extends js.Object {
  /** Enable cancellation */
  var cancellation: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable long stack traces */
  var longStackTraces: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable monitoring */
  var monitoring: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable warnings */
  var warnings: js.UndefOr[scala.Boolean | Anon_WForgottenReturn] = js.undefined
}

object Anon_Cancellation {
  @scala.inline
  def apply(
    cancellation: js.UndefOr[scala.Boolean] = js.undefined,
    longStackTraces: js.UndefOr[scala.Boolean] = js.undefined,
    monitoring: js.UndefOr[scala.Boolean] = js.undefined,
    warnings: scala.Boolean | Anon_WForgottenReturn = null
  ): Anon_Cancellation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancellation)) __obj.updateDynamic("cancellation")(cancellation)
    if (!js.isUndefined(longStackTraces)) __obj.updateDynamic("longStackTraces")(longStackTraces)
    if (!js.isUndefined(monitoring)) __obj.updateDynamic("monitoring")(monitoring)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cancellation]
  }
}

