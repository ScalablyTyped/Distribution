package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEndpointsByPlatformApplicationResponse extends StObject {
  
  /**
    * Endpoints returned for ListEndpointsByPlatformApplication action.
    */
  var Endpoints: js.UndefOr[ListOfEndpoints] = js.undefined
  
  /**
    * NextToken string is returned when calling ListEndpointsByPlatformApplication action if additional records are available after the first page results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListEndpointsByPlatformApplicationResponse {
  
  @scala.inline
  def apply(): ListEndpointsByPlatformApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEndpointsByPlatformApplicationResponse]
  }
  
  @scala.inline
  implicit class ListEndpointsByPlatformApplicationResponseMutableBuilder[Self <: ListEndpointsByPlatformApplicationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoints(value: ListOfEndpoints): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
    @scala.inline
    def setEndpointsVarargs(value: Endpoint_ *): Self = StObject.set(x, "Endpoints", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
