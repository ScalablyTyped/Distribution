package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExperimentsRequest extends StObject {
  
  /**
    * A filter that returns only experiments created after the specified time.
    */
  var CreatedAfter: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * A filter that returns only experiments created before the specified time.
    */
  var CreatedBefore: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The maximum number of experiments to return in the response. The default value is 10.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.undefined
  
  /**
    * If the previous call to ListExperiments didn't return the full set of experiments, the call returns a token for getting the next set of experiments.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
  
  /**
    * The property used to sort results. The default value is CreationTime.
    */
  var SortBy: js.UndefOr[SortExperimentsBy] = js.undefined
  
  /**
    * The sort order. The default value is Descending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.sagemakerMod.SortOrder] = js.undefined
}
object ListExperimentsRequest {
  
  inline def apply(): ListExperimentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExperimentsRequest]
  }
  
  extension [Self <: ListExperimentsRequest](x: Self) {
    
    inline def setCreatedAfter(value: Timestamp): Self = StObject.set(x, "CreatedAfter", value.asInstanceOf[js.Any])
    
    inline def setCreatedAfterUndefined: Self = StObject.set(x, "CreatedAfter", js.undefined)
    
    inline def setCreatedBefore(value: Timestamp): Self = StObject.set(x, "CreatedBefore", value.asInstanceOf[js.Any])
    
    inline def setCreatedBeforeUndefined: Self = StObject.set(x, "CreatedBefore", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: SortExperimentsBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
