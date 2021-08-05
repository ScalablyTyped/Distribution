package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEndpointRequest extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the endpoint being described.
    */
  var EndpointArn: ComprehendEndpointArn
}
object DescribeEndpointRequest {
  
  inline def apply(EndpointArn: ComprehendEndpointArn): DescribeEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointRequest]
  }
  
  extension [Self <: DescribeEndpointRequest](x: Self) {
    
    inline def setEndpointArn(value: ComprehendEndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
  }
}
