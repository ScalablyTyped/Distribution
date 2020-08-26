package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMLTransformsRequest extends js.Object {
  /**
    * The filter transformation criteria.
    */
  var Filter: js.UndefOr[TransformFilterCriteria] = js.native
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  /**
    * A paginated token to offset the results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The sorting criteria.
    */
  var Sort: js.UndefOr[TransformSortCriteria] = js.native
}

object GetMLTransformsRequest {
  @scala.inline
  def apply(): GetMLTransformsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMLTransformsRequest]
  }
  @scala.inline
  implicit class GetMLTransformsRequestOps[Self <: GetMLTransformsRequest] (val x: Self) extends AnyVal {
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
    def setFilter(value: TransformFilterCriteria): Self = this.set("Filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
    @scala.inline
    def setMaxResults(value: PageSize): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSort(value: TransformSortCriteria): Self = this.set("Sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("Sort", js.undefined)
  }
  
}

