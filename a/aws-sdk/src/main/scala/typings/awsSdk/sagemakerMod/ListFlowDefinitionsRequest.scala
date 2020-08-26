package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFlowDefinitionsRequest extends js.Object {
  /**
    * A filter that returns only flow definitions with a creation time greater than or equal to the specified timestamp.
    */
  var CreationTimeAfter: js.UndefOr[Timestamp] = js.native
  /**
    * A filter that returns only flow definitions that were created before the specified timestamp.
    */
  var CreationTimeBefore: js.UndefOr[Timestamp] = js.native
  /**
    * The total number of items to return. If the total number of available items is more than the value specified in MaxResults, then a NextToken will be provided in the output that you can use to resume pagination.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.native
  /**
    * A token to resume pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * An optional value that specifies whether you want the results sorted in Ascending or Descending order.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.sagemakerMod.SortOrder] = js.native
}

object ListFlowDefinitionsRequest {
  @scala.inline
  def apply(): ListFlowDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFlowDefinitionsRequest]
  }
  @scala.inline
  implicit class ListFlowDefinitionsRequestOps[Self <: ListFlowDefinitionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreationTimeAfter(value: Timestamp): Self = this.set("CreationTimeAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimeAfter: Self = this.set("CreationTimeAfter", js.undefined)
    @scala.inline
    def setCreationTimeBefore(value: Timestamp): Self = this.set("CreationTimeBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimeBefore: Self = this.set("CreationTimeBefore", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSortOrder(value: SortOrder): Self = this.set("SortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("SortOrder", js.undefined)
  }
  
}

