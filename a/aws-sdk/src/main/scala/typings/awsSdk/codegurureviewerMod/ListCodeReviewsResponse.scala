package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCodeReviewsResponse extends StObject {
  
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
  implicit class ListCodeReviewsResponseMutableBuilder[Self <: ListCodeReviewsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeReviewSummaries(value: CodeReviewSummaries): Self = StObject.set(x, "CodeReviewSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeReviewSummariesUndefined: Self = StObject.set(x, "CodeReviewSummaries", js.undefined)
    
    @scala.inline
    def setCodeReviewSummariesVarargs(value: CodeReviewSummary*): Self = StObject.set(x, "CodeReviewSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
