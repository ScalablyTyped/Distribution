package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataflowEndpointGroupsResponse extends StObject {
  
  /**
    * A list of dataflow endpoint groups.
    */
  var dataflowEndpointGroupList: js.UndefOr[DataflowEndpointGroupList] = js.undefined
  
  /**
    * Next token returned in the response of a previous ListDataflowEndpointGroups call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListDataflowEndpointGroupsResponse {
  
  @scala.inline
  def apply(): ListDataflowEndpointGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataflowEndpointGroupsResponse]
  }
  
  @scala.inline
  implicit class ListDataflowEndpointGroupsResponseMutableBuilder[Self <: ListDataflowEndpointGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataflowEndpointGroupList(value: DataflowEndpointGroupList): Self = StObject.set(x, "dataflowEndpointGroupList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataflowEndpointGroupListUndefined: Self = StObject.set(x, "dataflowEndpointGroupList", js.undefined)
    
    @scala.inline
    def setDataflowEndpointGroupListVarargs(value: DataflowEndpointListItem*): Self = StObject.set(x, "dataflowEndpointGroupList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
