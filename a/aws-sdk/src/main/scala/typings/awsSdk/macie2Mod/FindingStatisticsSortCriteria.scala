package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindingStatisticsSortCriteria extends js.Object {
  /**
    * The grouping to sort the results by. Valid values are: count, sort the results by the number of findings in each group of results; and, groupKey, sort the results by the name of each group of results.
    */
  var attributeName: js.UndefOr[FindingStatisticsSortAttributeName] = js.native
  /**
    * The sort order to apply to the results, based on the value for the property specified by the attributeName property. Valid values are: ASC, sort the results in ascending order; and, DESC, sort the results in descending order.
    */
  var orderBy: js.UndefOr[OrderBy] = js.native
}

object FindingStatisticsSortCriteria {
  @scala.inline
  def apply(attributeName: FindingStatisticsSortAttributeName = null, orderBy: OrderBy = null): FindingStatisticsSortCriteria = {
    val __obj = js.Dynamic.literal()
    if (attributeName != null) __obj.updateDynamic("attributeName")(attributeName.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindingStatisticsSortCriteria]
  }
}

