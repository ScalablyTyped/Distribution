package typings.cypress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.Cypress.Timeoutable> */
trait PartialTimeoutable extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
}

object PartialTimeoutable {
  @scala.inline
  def apply(timeout: js.UndefOr[Double] = js.undefined): PartialTimeoutable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTimeoutable]
  }
}

