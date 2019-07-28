package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroupByCustomField extends js.Object {
  var groupByCustomField: js.UndefOr[String] = js.undefined
  var settlementDate: String
}

object Anon_GroupByCustomField {
  @scala.inline
  def apply(settlementDate: String, groupByCustomField: String = null): Anon_GroupByCustomField = {
    val __obj = js.Dynamic.literal(settlementDate = settlementDate)
    if (groupByCustomField != null) __obj.updateDynamic("groupByCustomField")(groupByCustomField)
    __obj.asInstanceOf[Anon_GroupByCustomField]
  }
}

