package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEndpointResponse extends StObject {
  
  /**
    * The endpoint that was created.
    */
  var Endpoint: js.UndefOr[typings.awsSdk.dmsMod.Endpoint] = js.undefined
}
object CreateEndpointResponse {
  
  @scala.inline
  def apply(): CreateEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEndpointResponse]
  }
  
  @scala.inline
  implicit class CreateEndpointResponseMutableBuilder[Self <: CreateEndpointResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: Endpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
  }
}
