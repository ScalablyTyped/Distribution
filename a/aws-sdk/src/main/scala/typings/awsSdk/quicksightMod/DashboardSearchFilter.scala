package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashboardSearchFilter extends js.Object {
  /**
    * The name of the value that you want to use as a filter, for example, "Name": "QUICKSIGHT_USER". 
    */
  var Name: js.UndefOr[DashboardFilterAttribute] = js.native
  /**
    * The comparison operator that you want to use as a filter, for example, "Operator": "StringEquals".
    */
  var Operator: FilterOperator = js.native
  /**
    * The value of the named item, in this case QUICKSIGHT_USER, that you want to use as a filter, for example, "Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1". 
    */
  var Value: js.UndefOr[String] = js.native
}

object DashboardSearchFilter {
  @scala.inline
  def apply(Operator: FilterOperator, Name: DashboardFilterAttribute = null, Value: String = null): DashboardSearchFilter = {
    val __obj = js.Dynamic.literal(Operator = Operator.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardSearchFilter]
  }
}

