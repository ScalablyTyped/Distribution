package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchAnalysesResponse extends StObject {
  
  /**
    * Metadata describing the analyses that you searched for.
    */
  var AnalysisSummaryList: js.UndefOr[typings.awsSdk.quicksightMod.AnalysisSummaryList] = js.native
  
  /**
    * A pagination token that can be used in a subsequent request. 
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}
object SearchAnalysesResponse {
  
  @scala.inline
  def apply(): SearchAnalysesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAnalysesResponse]
  }
  
  @scala.inline
  implicit class SearchAnalysesResponseMutableBuilder[Self <: SearchAnalysesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisSummaryList(value: AnalysisSummaryList): Self = StObject.set(x, "AnalysisSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisSummaryListUndefined: Self = StObject.set(x, "AnalysisSummaryList", js.undefined)
    
    @scala.inline
    def setAnalysisSummaryListVarargs(value: AnalysisSummary*): Self = StObject.set(x, "AnalysisSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
