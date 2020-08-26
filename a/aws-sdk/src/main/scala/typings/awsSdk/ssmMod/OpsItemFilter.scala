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
  @scala.inline
  implicit class OpsItemFilterOps[Self <: OpsItemFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: OpsItemFilterKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperator(value: OpsItemFilterOperator): Self = this.set("Operator", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: OpsItemFilterValue*): Self = this.set("Values", js.Array(value :_*))
    @scala.inline
    def setValues(value: OpsItemFilterValues): Self = this.set("Values", value.asInstanceOf[js.Any])
  }
  
}

