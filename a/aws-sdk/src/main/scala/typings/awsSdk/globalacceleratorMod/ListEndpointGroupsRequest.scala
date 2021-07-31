package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEndpointGroupsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: GenericString
  
  /**
    * The number of endpoint group objects that you want to return with this call. The default value is 10.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.globalacceleratorMod.MaxResults] = js.undefined
  
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object ListEndpointGroupsRequest {
  
  @scala.inline
  def apply(ListenerArn: GenericString): ListEndpointGroupsRequest = {
    val __obj = js.Dynamic.literal(ListenerArn = ListenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEndpointGroupsRequest]
  }
  
  @scala.inline
  implicit class ListEndpointGroupsRequestMutableBuilder[Self <: ListEndpointGroupsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListenerArn(value: GenericString): Self = StObject.set(x, "ListenerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
