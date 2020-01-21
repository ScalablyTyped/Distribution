package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  /**
    * Name of the filter. Filter names are case-sensitive.
    */
  var Name: js.UndefOr[FilterName] = js.native
  /**
    * Filter values. Filter values are case-sensitive.
    */
  var Values: js.UndefOr[FilterValues] = js.native
}

object Filter {
  @scala.inline
  def apply(Name: FilterName = null, Values: FilterValues = null): Filter = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

