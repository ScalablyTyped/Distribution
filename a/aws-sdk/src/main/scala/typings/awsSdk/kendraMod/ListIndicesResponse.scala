package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIndicesResponse extends js.Object {
  /**
    * An array of summary information for one or more indexes.
    */
  var IndexConfigurationSummaryItems: js.UndefOr[IndexConfigurationSummaryList] = js.native
  /**
    * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to retrieve the next set of indexes.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kendraMod.NextToken] = js.native
}

object ListIndicesResponse {
  @scala.inline
  def apply(): ListIndicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIndicesResponse]
  }
  @scala.inline
  implicit class ListIndicesResponseOps[Self <: ListIndicesResponse] (val x: Self) extends AnyVal {
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
    def setIndexConfigurationSummaryItemsVarargs(value: IndexConfigurationSummary*): Self = this.set("IndexConfigurationSummaryItems", js.Array(value :_*))
    @scala.inline
    def setIndexConfigurationSummaryItems(value: IndexConfigurationSummaryList): Self = this.set("IndexConfigurationSummaryItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexConfigurationSummaryItems: Self = this.set("IndexConfigurationSummaryItems", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

