package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.Timeoutable> */
trait PartialTimeoutable extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
}

object PartialTimeoutable {
  @scala.inline
  def apply(timeout: Int | Double = null): PartialTimeoutable = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTimeoutable]
  }
}

