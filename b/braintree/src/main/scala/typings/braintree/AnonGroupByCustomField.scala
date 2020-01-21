package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroupByCustomField extends js.Object {
  var groupByCustomField: js.UndefOr[String] = js.undefined
  var settlementDate: String
}

object AnonGroupByCustomField {
  @scala.inline
  def apply(settlementDate: String, groupByCustomField: String = null): AnonGroupByCustomField = {
    val __obj = js.Dynamic.literal(settlementDate = settlementDate.asInstanceOf[js.Any])
    if (groupByCustomField != null) __obj.updateDynamic("groupByCustomField")(groupByCustomField.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroupByCustomField]
  }
}

