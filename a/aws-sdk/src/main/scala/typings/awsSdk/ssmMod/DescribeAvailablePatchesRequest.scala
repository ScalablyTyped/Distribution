package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAvailablePatchesRequest extends StObject {
  
  /**
    * Filters used to scope down the returned patches.
    */
  var Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined
  
  /**
    * The maximum number of patches to return (per page).
    */
  var MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
}
object DescribeAvailablePatchesRequest {
  
  inline def apply(): DescribeAvailablePatchesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAvailablePatchesRequest]
  }
  
  extension [Self <: DescribeAvailablePatchesRequest](x: Self) {
    
    inline def setFilters(value: PatchOrchestratorFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: PatchOrchestratorFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    inline def setMaxResults(value: PatchBaselineMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
