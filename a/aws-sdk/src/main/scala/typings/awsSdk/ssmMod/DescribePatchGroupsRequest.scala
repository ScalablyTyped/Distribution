package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePatchGroupsRequest extends StObject {
  
  /**
    * One or more filters. Use a filter to return a more specific list of results. For DescribePatchGroups,valid filter keys include the following:    NAME_PREFIX: The name of the patch group. Wildcards (*) are accepted.    OPERATING_SYSTEM: The supported operating system type to return results for. For valid operating system values, see GetDefaultPatchBaselineRequest$OperatingSystem in CreatePatchBaseline. Examples:    --filters Key=NAME_PREFIX,Values=MyPatchGroup*     --filters Key=OPERATING_SYSTEM,Values=AMAZON_LINUX_2     
    */
  var Filters: js.UndefOr[PatchOrchestratorFilterList] = js.native
  
  /**
    * The maximum number of patch groups to return (per page).
    */
  var MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.native
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}
object DescribePatchGroupsRequest {
  
  @scala.inline
  def apply(): DescribePatchGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePatchGroupsRequest]
  }
  
  @scala.inline
  implicit class DescribePatchGroupsRequestMutableBuilder[Self <: DescribePatchGroupsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: PatchOrchestratorFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: PatchOrchestratorFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: PatchBaselineMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
