package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationFilter extends js.Object {
  /**
    * The operator that you want to use to determine whether an operation matches the specified value. Valid values for condition include:    EQ: When you specify EQ for the condition, you can specify only one value. EQ is supported for NAMESPACE_ID, SERVICE_ID, STATUS, and TYPE. EQ is the default condition and can be omitted.    IN: When you specify IN for the condition, you can specify a list of one or more values. IN is supported for STATUS and TYPE. An operation must match one of the specified values to be returned in the response.    BETWEEN: Specify a start date and an end date in Unix date/time format and Coordinated Universal Time (UTC). The start date must be the first value. BETWEEN is supported for UPDATE_DATE.   
    */
  var Condition: js.UndefOr[FilterCondition] = js.native
  /**
    * Specify the operations that you want to get:    NAMESPACE_ID: Gets operations related to specified namespaces.    SERVICE_ID: Gets operations related to specified services.    STATUS: Gets operations based on the status of the operations: SUBMITTED, PENDING, SUCCEED, or FAIL.    TYPE: Gets specified types of operation.    UPDATE_DATE: Gets operations that changed status during a specified date/time range.   
    */
  var Name: OperationFilterName = js.native
  /**
    * Specify values that are applicable to the value that you specify for Name:     NAMESPACE_ID: Specify one namespace ID.    SERVICE_ID: Specify one service ID.    STATUS: Specify one or more statuses: SUBMITTED, PENDING, SUCCEED, or FAIL.    TYPE: Specify one or more of the following types: CREATE_NAMESPACE, DELETE_NAMESPACE, UPDATE_SERVICE, REGISTER_INSTANCE, or DEREGISTER_INSTANCE.    UPDATE_DATE: Specify a start date and an end date in Unix date/time format and Coordinated Universal Time (UTC). The start date must be the first value.  
    */
  var Values: FilterValues = js.native
}

object OperationFilter {
  @scala.inline
  def apply(Name: OperationFilterName, Values: FilterValues): OperationFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationFilter]
  }
  @scala.inline
  implicit class OperationFilterOps[Self <: OperationFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: OperationFilterName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: FilterValue*): Self = this.set("Values", js.Array(value :_*))
    @scala.inline
    def setValues(value: FilterValues): Self = this.set("Values", value.asInstanceOf[js.Any])
    @scala.inline
    def setCondition(value: FilterCondition): Self = this.set("Condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("Condition", js.undefined)
  }
  
}

