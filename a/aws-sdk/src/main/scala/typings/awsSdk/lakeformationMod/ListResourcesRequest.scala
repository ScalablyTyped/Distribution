package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourcesRequest extends js.Object {
  /**
    * Any applicable row-level and/or column-level filtering conditions for the resources.
    */
  var FilterConditionList: js.UndefOr[typings.awsSdk.lakeformationMod.FilterConditionList] = js.native
  /**
    * The maximum number of resource results.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  /**
    * A continuation token, if this is not the first call to retrieve these resources.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object ListResourcesRequest {
  @scala.inline
  def apply(): ListResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourcesRequest]
  }
  @scala.inline
  implicit class ListResourcesRequestOps[Self <: ListResourcesRequest] (val x: Self) extends AnyVal {
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
    def setFilterConditionListVarargs(value: FilterCondition*): Self = this.set("FilterConditionList", js.Array(value :_*))
    @scala.inline
    def setFilterConditionList(value: FilterConditionList): Self = this.set("FilterConditionList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterConditionList: Self = this.set("FilterConditionList", js.undefined)
    @scala.inline
    def setMaxResults(value: PageSize): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

