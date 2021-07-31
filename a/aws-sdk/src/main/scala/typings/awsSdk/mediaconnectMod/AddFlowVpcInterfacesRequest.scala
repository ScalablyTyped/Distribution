package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddFlowVpcInterfacesRequest extends StObject {
  
  /**
    * The flow that you want to mutate.
    */
  var FlowArn: string
  
  /**
    * A list of VPC interfaces that you want to add.
    */
  var VpcInterfaces: listOfVpcInterfaceRequest
}
object AddFlowVpcInterfacesRequest {
  
  @scala.inline
  def apply(FlowArn: string, VpcInterfaces: listOfVpcInterfaceRequest): AddFlowVpcInterfacesRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], VpcInterfaces = VpcInterfaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddFlowVpcInterfacesRequest]
  }
  
  @scala.inline
  implicit class AddFlowVpcInterfacesRequestMutableBuilder[Self <: AddFlowVpcInterfacesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcInterfaces(value: listOfVpcInterfaceRequest): Self = StObject.set(x, "VpcInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcInterfacesVarargs(value: VpcInterfaceRequest*): Self = StObject.set(x, "VpcInterfaces", js.Array(value :_*))
  }
}
