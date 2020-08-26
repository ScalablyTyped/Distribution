package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListComplianceSummariesResult extends js.Object {
  /**
    * A list of compliant and non-compliant summary counts based on compliance types. For example, this call returns State Manager associations, patches, or custom compliance types according to the filter criteria that you specified.
    */
  var ComplianceSummaryItems: js.UndefOr[ComplianceSummaryItemList] = js.native
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object ListComplianceSummariesResult {
  @scala.inline
  def apply(): ListComplianceSummariesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListComplianceSummariesResult]
  }
  @scala.inline
  implicit class ListComplianceSummariesResultOps[Self <: ListComplianceSummariesResult] (val x: Self) extends AnyVal {
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
    def setComplianceSummaryItemsVarargs(value: ComplianceSummaryItem*): Self = this.set("ComplianceSummaryItems", js.Array(value :_*))
    @scala.inline
    def setComplianceSummaryItems(value: ComplianceSummaryItemList): Self = this.set("ComplianceSummaryItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplianceSummaryItems: Self = this.set("ComplianceSummaryItems", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

