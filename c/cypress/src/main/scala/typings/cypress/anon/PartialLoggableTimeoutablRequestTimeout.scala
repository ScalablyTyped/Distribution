package typings.cypress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.Cypress.Loggable & cypress.Cypress.Timeoutable & cypress.Cypress.TimeoutableXHR> */
trait PartialLoggableTimeoutablRequestTimeout extends js.Object {
  var log: js.UndefOr[Boolean] = js.undefined
  var requestTimeout: js.UndefOr[Double] = js.undefined
  var responseTimeout: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object PartialLoggableTimeoutablRequestTimeout {
  @scala.inline
  def apply(
    log: js.UndefOr[Boolean] = js.undefined,
    requestTimeout: js.UndefOr[Double] = js.undefined,
    responseTimeout: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): PartialLoggableTimeoutablRequestTimeout = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestTimeout)) __obj.updateDynamic("requestTimeout")(requestTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(responseTimeout)) __obj.updateDynamic("responseTimeout")(responseTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLoggableTimeoutablRequestTimeout]
  }
}

