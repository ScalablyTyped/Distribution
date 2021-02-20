package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEndpointGroupsResponse extends StObject {
  
  /**
    * The list of the endpoint groups associated with a listener.
    */
  var EndpointGroups: js.UndefOr[typings.awsSdk.globalacceleratorMod.EndpointGroups] = js.native
  
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}
object ListEndpointGroupsResponse {
  
  @scala.inline
  def apply(): ListEndpointGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEndpointGroupsResponse]
  }
  
  @scala.inline
  implicit class ListEndpointGroupsResponseMutableBuilder[Self <: ListEndpointGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointGroups(value: EndpointGroups): Self = StObject.set(x, "EndpointGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointGroupsUndefined: Self = StObject.set(x, "EndpointGroups", js.undefined)
    
    @scala.inline
    def setEndpointGroupsVarargs(value: EndpointGroup*): Self = StObject.set(x, "EndpointGroups", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
