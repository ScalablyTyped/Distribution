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
  
  @scala.inline
  def apply(EndpointArn: ComprehendEndpointArn): DescribeEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointRequest]
  }
  
  @scala.inline
  implicit class DescribeEndpointRequestMutableBuilder[Self <: DescribeEndpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointArn(value: ComprehendEndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
  }
}
