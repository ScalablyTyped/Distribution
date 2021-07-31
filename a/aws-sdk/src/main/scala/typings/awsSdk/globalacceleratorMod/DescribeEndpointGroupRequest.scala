package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEndpointGroupRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint group to describe.
    */
  var EndpointGroupArn: GenericString
}
object DescribeEndpointGroupRequest {
  
  @scala.inline
  def apply(EndpointGroupArn: GenericString): DescribeEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(EndpointGroupArn = EndpointGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointGroupRequest]
  }
  
  @scala.inline
  implicit class DescribeEndpointGroupRequestMutableBuilder[Self <: DescribeEndpointGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointGroupArn(value: GenericString): Self = StObject.set(x, "EndpointGroupArn", value.asInstanceOf[js.Any])
  }
}
