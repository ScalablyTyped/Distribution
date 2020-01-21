package typings.bluebird

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancellation extends js.Object {
  /** Enable cancellation */
  var cancellation: js.UndefOr[Boolean] = js.undefined
  /** Enable long stack traces */
  var longStackTraces: js.UndefOr[Boolean] = js.undefined
  /** Enable monitoring */
  var monitoring: js.UndefOr[Boolean] = js.undefined
  /** Enable warnings */
  var warnings: js.UndefOr[Boolean | AnonWForgottenReturn] = js.undefined
}

object AnonCancellation {
  @scala.inline
  def apply(
    cancellation: js.UndefOr[Boolean] = js.undefined,
    longStackTraces: js.UndefOr[Boolean] = js.undefined,
    monitoring: js.UndefOr[Boolean] = js.undefined,
    warnings: Boolean | AnonWForgottenReturn = null
  ): AnonCancellation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancellation)) __obj.updateDynamic("cancellation")(cancellation.asInstanceOf[js.Any])
    if (!js.isUndefined(longStackTraces)) __obj.updateDynamic("longStackTraces")(longStackTraces.asInstanceOf[js.Any])
    if (!js.isUndefined(monitoring)) __obj.updateDynamic("monitoring")(monitoring.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancellation]
  }
}

