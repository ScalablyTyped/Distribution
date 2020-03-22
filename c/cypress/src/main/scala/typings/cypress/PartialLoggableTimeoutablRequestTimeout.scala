package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.Loggable & cypress.cypress.Cypress.Timeoutable & cypress.cypress.Cypress.TimeoutableXHR> */
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
    requestTimeout: Int | Double = null,
    responseTimeout: Int | Double = null,
    timeout: Int | Double = null
  ): PartialLoggableTimeoutablRequestTimeout = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (responseTimeout != null) __obj.updateDynamic("responseTimeout")(responseTimeout.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLoggableTimeoutablRequestTimeout]
  }
}

