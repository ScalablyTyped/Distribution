package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDevEndpointsResponse extends StObject {
  
  /**
    * A list of DevEndpoint definitions.
    */
  var DevEndpoints: js.UndefOr[DevEndpointList] = js.undefined
  
  /**
    * A continuation token, if not all DevEndpoint definitions have yet been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object GetDevEndpointsResponse {
  
  @scala.inline
  def apply(): GetDevEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDevEndpointsResponse]
  }
  
  @scala.inline
  implicit class GetDevEndpointsResponseMutableBuilder[Self <: GetDevEndpointsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevEndpoints(value: DevEndpointList): Self = StObject.set(x, "DevEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevEndpointsUndefined: Self = StObject.set(x, "DevEndpoints", js.undefined)
    
    @scala.inline
    def setDevEndpointsVarargs(value: DevEndpoint*): Self = StObject.set(x, "DevEndpoints", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
