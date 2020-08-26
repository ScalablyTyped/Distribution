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
  def apply(): UsageStatisticsSortBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageStatisticsSortBy]
  }
  @scala.inline
  implicit class UsageStatisticsSortByOps[Self <: UsageStatisticsSortBy] (val x: Self) extends AnyVal {
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
    def setKey(value: UsageStatisticsSortKey): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setOrderBy(value: OrderBy): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
  }
  
}

