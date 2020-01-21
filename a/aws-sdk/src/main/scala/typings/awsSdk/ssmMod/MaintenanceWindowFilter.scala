package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowFilter extends js.Object {
  /**
    * The name of the filter.
    */
  var Key: js.UndefOr[MaintenanceWindowFilterKey] = js.native
  /**
    * The filter values.
    */
  var Values: js.UndefOr[MaintenanceWindowFilterValues] = js.native
}

object MaintenanceWindowFilter {
  @scala.inline
  def apply(Key: MaintenanceWindowFilterKey = null, Values: MaintenanceWindowFilterValues = null): MaintenanceWindowFilter = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowFilter]
  }
}

