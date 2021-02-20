package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePatchBaselinesRequest extends StObject {
  
  /**
    * Each element in the array is a structure containing:  Key: (string, "NAME_PREFIX" or "OWNER") Value: (array of strings, exactly 1 entry, between 1 and 255 characters)
    */
  var Filters: js.UndefOr[PatchOrchestratorFilterList] = js.native
  
  /**
    * The maximum number of patch baselines to return (per page).
    */
  var MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.native
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}
object DescribePatchBaselinesRequest {
  
  @scala.inline
  def apply(): DescribePatchBaselinesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePatchBaselinesRequest]
  }
  
  @scala.inline
  implicit class DescribePatchBaselinesRequestMutableBuilder[Self <: DescribePatchBaselinesRequest] (val x: Self) extends AnyVal {
    
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
