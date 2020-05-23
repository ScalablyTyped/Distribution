package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupByCustomField extends js.Object {
  var groupByCustomField: js.UndefOr[String] = js.undefined
  var settlementDate: String
}

object GroupByCustomField {
  @scala.inline
  def apply(settlementDate: String, groupByCustomField: String = null): GroupByCustomField = {
    val __obj = js.Dynamic.literal(settlementDate = settlementDate.asInstanceOf[js.Any])
    if (groupByCustomField != null) __obj.updateDynamic("groupByCustomField")(groupByCustomField.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupByCustomField]
  }
}

