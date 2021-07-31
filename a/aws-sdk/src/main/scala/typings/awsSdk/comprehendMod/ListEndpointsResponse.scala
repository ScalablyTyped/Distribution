package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEndpointsResponse extends StObject {
  
  /**
    * Displays a list of endpoint properties being retrieved by the service in response to the request.
    */
  var EndpointPropertiesList: js.UndefOr[typings.awsSdk.comprehendMod.EndpointPropertiesList] = js.undefined
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListEndpointsResponse {
  
  @scala.inline
  def apply(): ListEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEndpointsResponse]
  }
  
  @scala.inline
  implicit class ListEndpointsResponseMutableBuilder[Self <: ListEndpointsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointPropertiesList(value: EndpointPropertiesList): Self = StObject.set(x, "EndpointPropertiesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointPropertiesListUndefined: Self = StObject.set(x, "EndpointPropertiesList", js.undefined)
    
    @scala.inline
    def setEndpointPropertiesListVarargs(value: EndpointProperties*): Self = StObject.set(x, "EndpointPropertiesList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
