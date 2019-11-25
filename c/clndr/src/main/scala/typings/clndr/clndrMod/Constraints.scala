package typings.clndr.clndrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraints extends js.Object {
  var endDate: js.UndefOr[String] = js.undefined
  var startDate: js.UndefOr[String] = js.undefined
}

object Constraints {
  @scala.inline
  def apply(endDate: String = null, startDate: String = null): Constraints = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constraints]
  }
}

