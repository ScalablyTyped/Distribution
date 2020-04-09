package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePackagesFilter extends js.Object {
  /**
    * Any field from PackageDetails.
    */
  var Name: js.UndefOr[DescribePackagesFilterName] = js.native
  /**
    * A list of values for the specified field.
    */
  var Value: js.UndefOr[DescribePackagesFilterValues] = js.native
}

object DescribePackagesFilter {
  @scala.inline
  def apply(Name: DescribePackagesFilterName = null, Value: DescribePackagesFilterValues = null): DescribePackagesFilter = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePackagesFilter]
  }
}

