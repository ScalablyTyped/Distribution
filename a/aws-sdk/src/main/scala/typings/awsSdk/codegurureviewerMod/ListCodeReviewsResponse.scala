package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCodeReviewsResponse extends js.Object {
  
  /**
    *  A list of code reviews that meet the criteria of the request. 
    */
  var CodeReviewSummaries: js.UndefOr[typings.awsSdk.codegurureviewerMod.CodeReviewSummaries] = js.native
  
  /**
    *  Pagination token. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.codegurureviewerMod.NextToken] = js.native
}
object ListCodeReviewsResponse {
  
  @scala.inline
  def apply(): ListCodeReviewsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCodeReviewsResponse]
  }
  
  @scala.inline
  implicit class ListCodeReviewsResponseOps[Self <: ListCodeReviewsResponse] (val x: Self) extends AnyVal {
    
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
    def setCodeReviewSummariesVarargs(value: CodeReviewSummary*): Self = this.set("CodeReviewSummaries", js.Array(value :_*))
    
    @scala.inline
    def setCodeReviewSummaries(value: CodeReviewSummaries): Self = this.set("CodeReviewSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeReviewSummaries: Self = this.set("CodeReviewSummaries", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
