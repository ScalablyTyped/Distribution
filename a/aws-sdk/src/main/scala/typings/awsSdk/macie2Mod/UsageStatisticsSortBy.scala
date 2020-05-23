package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageStatisticsSortBy extends js.Object {
  /**
    * The field to sort the results by.
    */
  var key: js.UndefOr[UsageStatisticsSortKey] = js.native
  /**
    * The sort order to apply to the results, based on the value for the field specified by the key property. Valid values are: ASC, sort the results in ascending order; and, DESC, sort the results in descending order.
    */
  var orderBy: js.UndefOr[OrderBy] = js.native
}

object UsageStatisticsSortBy {
  @scala.inline
  def apply(key: UsageStatisticsSortKey = null, orderBy: OrderBy = null): UsageStatisticsSortBy = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageStatisticsSortBy]
  }
}

