package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.Loggable & cypress.cypress.Cypress.Timeoutable> */
trait PartialLoggableTimeoutabl extends js.Object {
  var log: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object PartialLoggableTimeoutabl {
  @scala.inline
  def apply(log: js.UndefOr[Boolean] = js.undefined, timeout: Int | Double = null): PartialLoggableTimeoutabl = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLoggableTimeoutabl]
  }
}

