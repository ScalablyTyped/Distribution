package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFaqsRequest extends js.Object {
  /**
    * The index that contains the FAQ lists.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId = js.native
  /**
    * The maximum number of FAQs to return in the response. If there are fewer results in the list, this response contains only the actual results.
    */
  var MaxResults: js.UndefOr[MaxResultsIntegerForListFaqsRequest] = js.native
  /**
    * If the result of the previous request to ListFaqs was truncated, include the NextToken to fetch the next set of FAQs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kendraMod.NextToken] = js.native
}

object ListFaqsRequest {
  @scala.inline
  def apply(IndexId: IndexId): ListFaqsRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFaqsRequest]
  }
  @scala.inline
  implicit class ListFaqsRequestOps[Self <: ListFaqsRequest] (val x: Self) extends AnyVal {
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
    def setIndexId(value: IndexId): Self = this.set("IndexId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResultsIntegerForListFaqsRequest): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

