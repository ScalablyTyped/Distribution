package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEndpointOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint.
    */
  var EndpointArn: typings.awsSdk.sagemakerMod.EndpointArn
}
object CreateEndpointOutput {
  
  inline def apply(EndpointArn: EndpointArn): CreateEndpointOutput = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndpointOutput]
  }
  
  extension [Self <: CreateEndpointOutput](x: Self) {
    
    inline def setEndpointArn(value: EndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
  }
}
