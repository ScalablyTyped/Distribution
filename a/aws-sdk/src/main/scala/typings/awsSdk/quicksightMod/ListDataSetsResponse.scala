package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataSetsResponse extends StObject {
  
  /**
    * The list of dataset summaries.
    */
  var DataSetSummaries: js.UndefOr[DataSetSummaryList] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object ListDataSetsResponse {
  
  @scala.inline
  def apply(): ListDataSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataSetsResponse]
  }
  
  @scala.inline
  implicit class ListDataSetsResponseMutableBuilder[Self <: ListDataSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSetSummaries(value: DataSetSummaryList): Self = StObject.set(x, "DataSetSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetSummariesUndefined: Self = StObject.set(x, "DataSetSummaries", js.undefined)
    
    @scala.inline
    def setDataSetSummariesVarargs(value: DataSetSummary*): Self = StObject.set(x, "DataSetSummaries", js.Array(value :_*))
    
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
