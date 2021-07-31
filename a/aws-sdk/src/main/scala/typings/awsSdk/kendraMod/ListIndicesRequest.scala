package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIndicesRequest extends StObject {
  
  /**
    * The maximum number of data sources to return.
    */
  var MaxResults: js.UndefOr[MaxResultsIntegerForListIndicesRequest] = js.undefined
  
  /**
    * If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a pagination token in the response. You can use this pagination token to retrieve the next set of indexes (DataSourceSummaryItems). 
    */
  var NextToken: js.UndefOr[typings.awsSdk.kendraMod.NextToken] = js.undefined
}
object ListIndicesRequest {
  
  @scala.inline
  def apply(): ListIndicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIndicesRequest]
  }
  
  @scala.inline
  implicit class ListIndicesRequestMutableBuilder[Self <: ListIndicesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResultsIntegerForListIndicesRequest): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
