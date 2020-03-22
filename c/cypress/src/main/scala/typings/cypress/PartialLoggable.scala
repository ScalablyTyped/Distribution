package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.Loggable> */
trait PartialLoggable extends js.Object {
  var log: js.UndefOr[Boolean] = js.undefined
}

object PartialLoggable {
  @scala.inline
  def apply(log: js.UndefOr[Boolean] = js.undefined): PartialLoggable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLoggable]
  }
}

