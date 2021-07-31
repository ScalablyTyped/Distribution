package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataflowEndpointGroupsRequest extends StObject {
  
  /**
    * Maximum number of dataflow endpoint groups returned.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * Next token returned in the request of a previous ListDataflowEndpointGroups call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListDataflowEndpointGroupsRequest {
  
  @scala.inline
  def apply(): ListDataflowEndpointGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataflowEndpointGroupsRequest]
  }
  
  @scala.inline
  implicit class ListDataflowEndpointGroupsRequestMutableBuilder[Self <: ListDataflowEndpointGroupsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
