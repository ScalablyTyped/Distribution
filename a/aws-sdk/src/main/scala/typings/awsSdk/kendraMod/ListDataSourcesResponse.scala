package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataSourcesResponse extends js.Object {
  /**
    * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to retrieve the next set of data sources. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.kendraMod.NextToken] = js.native
  /**
    * An array of summary information for one or more data sources.
    */
  var SummaryItems: js.UndefOr[DataSourceSummaryList] = js.native
}

object ListDataSourcesResponse {
  @scala.inline
  def apply(): ListDataSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataSourcesResponse]
  }
  @scala.inline
  implicit class ListDataSourcesResponseOps[Self <: ListDataSourcesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSummaryItemsVarargs(value: DataSourceSummary*): Self = this.set("SummaryItems", js.Array(value :_*))
    @scala.inline
    def setSummaryItems(value: DataSourceSummaryList): Self = this.set("SummaryItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryItems: Self = this.set("SummaryItems", js.undefined)
  }
  
}

