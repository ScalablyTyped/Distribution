package typings.cypress.anon

import typings.cypress.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.Cypress.Loggable & cypress.Cypress.Timeoutable & cypress.Cypress.Withinable> */
trait PartialLoggableTimeoutablTimeout extends js.Object {
  var log: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var withinSubject: js.UndefOr[JQuery[HTMLElement] | HTMLElement] = js.undefined
}

object PartialLoggableTimeoutablTimeout {
  @scala.inline
  def apply(
    log: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    withinSubject: JQuery[HTMLElement] | HTMLElement = null
  ): PartialLoggableTimeoutablTimeout = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (withinSubject != null) __obj.updateDynamic("withinSubject")(withinSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLoggableTimeoutablTimeout]
  }
}

