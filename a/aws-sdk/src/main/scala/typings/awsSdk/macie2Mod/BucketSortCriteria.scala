package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketSortCriteria extends js.Object {
  /**
    * The name of the attribute to sort the results by. This value can be the name of any property that Amazon Macie defines as bucket metadata, such as bucketName, accountId, or lastUpdated.
    */
  var attributeName: js.UndefOr[string] = js.native
  /**
    * The sort order to apply to the results, based on the value for the property specified by the attributeName property. Valid values are: ASC, sort the results in ascending order; and, DESC, sort the results in descending order.
    */
  var orderBy: js.UndefOr[OrderBy] = js.native
}

object BucketSortCriteria {
  @scala.inline
  def apply(): BucketSortCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketSortCriteria]
  }
  @scala.inline
  implicit class BucketSortCriteriaOps[Self <: BucketSortCriteria] (val x: Self) extends AnyVal {
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
    def setAttributeName(value: string): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeName: Self = this.set("attributeName", js.undefined)
    @scala.inline
    def setOrderBy(value: OrderBy): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
  }
  
}

