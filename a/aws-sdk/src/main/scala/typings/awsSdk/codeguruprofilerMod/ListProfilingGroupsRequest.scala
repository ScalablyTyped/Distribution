package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProfilingGroupsRequest extends StObject {
  
  /**
    * A Boolean value indicating whether to include a description. If true, then a list of  ProfilingGroupDescription  objects that contain detailed information about profiling groups is returned. If false, then a list of profiling group names is returned.
    */
  var includeDescription: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of profiling groups results returned by ListProfilingGroups in paginated output. When this parameter is used, ListProfilingGroups only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListProfilingGroups request with the returned nextToken value. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The nextToken value returned from a previous paginated ListProfilingGroups request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.   This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListProfilingGroupsRequest {
  
  @scala.inline
  def apply(): ListProfilingGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProfilingGroupsRequest]
  }
  
  @scala.inline
  implicit class ListProfilingGroupsRequestMutableBuilder[Self <: ListProfilingGroupsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeDescription(value: Boolean): Self = StObject.set(x, "includeDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDescriptionUndefined: Self = StObject.set(x, "includeDescription", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
