package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFaqsResponse extends js.Object {
  /**
    * information about the FAQs associated with the specified index.
    */
  var FaqSummaryItems: js.UndefOr[typings.awsSdk.kendraMod.FaqSummaryItems] = js.native
  /**
    * The ListFaqs operation returns a page of FAQs at a time. The maximum size of the page is set by the MaxResults parameter. If there are more jobs in the list than the page size, Amazon Kendra returns the NextPage token. Include the token in the next request to the ListFaqs operation to return the next page of FAQs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kendraMod.NextToken] = js.native
}

object ListFaqsResponse {
  @scala.inline
  def apply(): ListFaqsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFaqsResponse]
  }
  @scala.inline
  implicit class ListFaqsResponseOps[Self <: ListFaqsResponse] (val x: Self) extends AnyVal {
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
    def setFaqSummaryItemsVarargs(value: FaqSummary*): Self = this.set("FaqSummaryItems", js.Array(value :_*))
    @scala.inline
    def setFaqSummaryItems(value: FaqSummaryItems): Self = this.set("FaqSummaryItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaqSummaryItems: Self = this.set("FaqSummaryItems", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

