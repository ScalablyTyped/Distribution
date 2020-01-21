package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpsItemFilter extends js.Object {
  /**
    * The name of the filter.
    */
  var Key: OpsItemFilterKey = js.native
  /**
    * The operator used by the filter call.
    */
  var Operator: OpsItemFilterOperator = js.native
  /**
    * The filter value.
    */
  var Values: OpsItemFilterValues = js.native
}

object OpsItemFilter {
  @scala.inline
  def apply(Key: OpsItemFilterKey, Operator: OpsItemFilterOperator, Values: OpsItemFilterValues): OpsItemFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpsItemFilter]
  }
}

