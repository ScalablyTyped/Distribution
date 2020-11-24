package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListContributorInsightsOutput extends js.Object {
  
  /**
    * A list of ContributorInsightsSummary.
    */
  var ContributorInsightsSummaries: js.UndefOr[typings.awsSdk.dynamodbMod.ContributorInsightsSummaries] = js.native
  
  /**
    * A token to go to the next page if there is one.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.native
}
object ListContributorInsightsOutput {
  
  @scala.inline
  def apply(): ListContributorInsightsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContributorInsightsOutput]
  }
  
  @scala.inline
  implicit class ListContributorInsightsOutputOps[Self <: ListContributorInsightsOutput] (val x: Self) extends AnyVal {
    
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
    def setContributorInsightsSummariesVarargs(value: ContributorInsightsSummary*): Self = this.set("ContributorInsightsSummaries", js.Array(value :_*))
    
    @scala.inline
    def setContributorInsightsSummaries(value: ContributorInsightsSummaries): Self = this.set("ContributorInsightsSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContributorInsightsSummaries: Self = this.set("ContributorInsightsSummaries", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextTokenString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
