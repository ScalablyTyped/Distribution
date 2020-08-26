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
  def apply(): FindingStatisticsSortCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingStatisticsSortCriteria]
  }
  @scala.inline
  implicit class FindingStatisticsSortCriteriaOps[Self <: FindingStatisticsSortCriteria] (val x: Self) extends AnyVal {
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
    def setAttributeName(value: FindingStatisticsSortAttributeName): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeName: Self = this.set("attributeName", js.undefined)
    @scala.inline
    def setOrderBy(value: OrderBy): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
  }
  
}

