package typings.cypress

import typings.jquery.JQuery_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.Loggable & cypress.cypress.Cypress.Timeoutable & cypress.cypress.Cypress.Withinable> */
trait PartialLoggableTimeoutablTimeout extends js.Object {
  var log: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var withinSubject: js.UndefOr[JQuery_[HTMLElement] | HTMLElement] = js.undefined
}

object PartialLoggableTimeoutablTimeout {
  @scala.inline
  def apply(
    log: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    withinSubject: JQuery_[HTMLElement] | HTMLElement = null
  ): PartialLoggableTimeoutablTimeout = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (withinSubject != null) __obj.updateDynamic("withinSubject")(withinSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLoggableTimeoutablTimeout]
  }
}

