package typings
package braintreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroupByCustomField extends js.Object {
  var groupByCustomField: js.UndefOr[java.lang.String] = js.undefined
  var settlementDate: java.lang.String
}

object Anon_GroupByCustomField {
  @scala.inline
  def apply(settlementDate: java.lang.String, groupByCustomField: java.lang.String = null): Anon_GroupByCustomField = {
    val __obj = js.Dynamic.literal(settlementDate = settlementDate)
    if (groupByCustomField != null) __obj.updateDynamic("groupByCustomField")(groupByCustomField)
    __obj.asInstanceOf[Anon_GroupByCustomField]
  }
}

