package typings.awsSdk.redshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEndpointAccessResponse extends StObject {
  
  /**
    * The returned VPC endpoints.
    */
  var endpoints: EndpointAccessList
  
  /**
    * When nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListEndpointAccessResponse {
  
  inline def apply(endpoints: EndpointAccessList): ListEndpointAccessResponse = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEndpointAccessResponse]
  }
  
  extension [Self <: ListEndpointAccessResponse](x: Self) {
    
    inline def setEndpoints(value: EndpointAccessList): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsVarargs(value: EndpointAccess*): Self = StObject.set(x, "endpoints", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
