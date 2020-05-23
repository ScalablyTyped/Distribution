package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsSortCriteria extends js.Object {
  /**
    * The property to sort the results by.
    */
  var attributeName: js.UndefOr[ListJobsSortAttributeName] = js.native
  /**
    * The sort order to apply to the results, based on the value for the property specified by the attributeName property. Valid values are: ASC, sort the results in ascending order; and, DESC, sort the results in descending order.
    */
  var orderBy: js.UndefOr[OrderBy] = js.native
}

object ListJobsSortCriteria {
  @scala.inline
  def apply(attributeName: ListJobsSortAttributeName = null, orderBy: OrderBy = null): ListJobsSortCriteria = {
    val __obj = js.Dynamic.literal()
    if (attributeName != null) __obj.updateDynamic("attributeName")(attributeName.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsSortCriteria]
  }
}

