package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEndpointResponse extends StObject {
  
  /**
    * EndpointArn returned from CreateEndpoint action.
    */
  var EndpointArn: js.UndefOr[String] = js.undefined
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
    def setEndpointArn(value: String): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointArnUndefined: Self = StObject.set(x, "EndpointArn", js.undefined)
  }
}
