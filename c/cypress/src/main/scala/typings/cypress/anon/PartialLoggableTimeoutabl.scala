package typings.cypress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.Cypress.Loggable & cypress.Cypress.Timeoutable> */
trait PartialLoggableTimeoutabl extends js.Object {
  var log: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object PartialLoggableTimeoutabl {
  @scala.inline
  def apply(log: js.UndefOr[Boolean] = js.undefined, timeout: js.UndefOr[Double] = js.undefined): PartialLoggableTimeoutabl = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLoggableTimeoutabl]
  }
}

