package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTargetsRequest extends StObject {
  
  /**
    * The filters to use to return information by service or resource type. Valid filters include target type, target address, and target status.  A filter with the same name can appear more than once when used with OR statements. Filters with different names should be applied with AND statements. 
    */
  var Filters: js.UndefOr[ListTargetsFilters] = js.native
  
  /**
    * A non-negative integer used to limit the number of returned results. The maximum number of results that can be returned is 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.codestarnotificationsMod.MaxResults] = js.native
  
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.codestarnotificationsMod.NextToken] = js.native
}
object ListTargetsRequest {
  
  @scala.inline
  def apply(): ListTargetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTargetsRequest]
  }
  
  @scala.inline
  implicit class ListTargetsRequestMutableBuilder[Self <: ListTargetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: ListTargetsFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: ListTargetsFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
