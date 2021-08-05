package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePatchGroupsRequest extends StObject {
  
  /**
    * One or more filters. Use a filter to return a more specific list of results. For DescribePatchGroups,valid filter keys include the following:    NAME_PREFIX: The name of the patch group. Wildcards (*) are accepted.    OPERATING_SYSTEM: The supported operating system type to return results for. For valid operating system values, see GetDefaultPatchBaselineRequest$OperatingSystem in CreatePatchBaseline. Examples:    --filters Key=NAME_PREFIX,Values=MyPatchGroup*     --filters Key=OPERATING_SYSTEM,Values=AMAZON_LINUX_2     
    */
  var Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined
  
  /**
    * The maximum number of patch groups to return (per page).
    */
  var MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
}
object DescribePatchGroupsRequest {
  
  inline def apply(): DescribePatchGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePatchGroupsRequest]
  }
  
  extension [Self <: DescribePatchGroupsRequest](x: Self) {
    
    inline def setFilters(value: PatchOrchestratorFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: PatchOrchestratorFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    inline def setMaxResults(value: PatchBaselineMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
