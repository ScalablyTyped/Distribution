package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackInstanceFilter extends js.Object {
  /**
    * The type of filter to apply.
    */
  var Name: js.UndefOr[StackInstanceFilterName] = js.native
  /**
    * The status to filter by.
    */
  var Values: js.UndefOr[StackInstanceFilterValues] = js.native
}

object StackInstanceFilter {
  @scala.inline
  def apply(Name: StackInstanceFilterName = null, Values: StackInstanceFilterValues = null): StackInstanceFilter = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackInstanceFilter]
  }
}

