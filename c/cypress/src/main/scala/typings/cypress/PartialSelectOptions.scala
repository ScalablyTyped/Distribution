package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.SelectOptions> */
trait PartialSelectOptions extends js.Object {
  var force: js.UndefOr[Boolean] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var log: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object PartialSelectOptions {
  @scala.inline
  def apply(
    force: js.UndefOr[Boolean] = js.undefined,
    interval: Int | Double = null,
    log: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): PartialSelectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSelectOptions]
  }
}

