package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEndpointResponse extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the endpoint being created.
    */
  var EndpointArn: js.UndefOr[ComprehendEndpointArn] = js.undefined
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
    def setEndpointArn(value: ComprehendEndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointArnUndefined: Self = StObject.set(x, "EndpointArn", js.undefined)
  }
}
