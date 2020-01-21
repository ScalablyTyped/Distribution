package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryFilter extends js.Object {
  /**
    * Condition of the filter.
    */
  var Condition: InventoryFilterCondition = js.native
  /**
    * Name of the filter.
    */
  var Name: String = js.native
  /**
    * Value of the filter.
    */
  var Value: js.UndefOr[String] = js.native
}

object InventoryFilter {
  @scala.inline
  def apply(Condition: InventoryFilterCondition, Name: String, Value: String = null): InventoryFilter = {
    val __obj = js.Dynamic.literal(Condition = Condition.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryFilter]
  }
}

