package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveFlowVpcInterfaceRequest extends StObject {
  
  /**
    * The flow that you want to remove a VPC interface from.
    */
  var FlowArn: string = js.native
  
  /**
    * The name of the VPC interface that you want to remove.
    */
  var VpcInterfaceName: string = js.native
}
object RemoveFlowVpcInterfaceRequest {
  
  @scala.inline
  def apply(FlowArn: string, VpcInterfaceName: string): RemoveFlowVpcInterfaceRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], VpcInterfaceName = VpcInterfaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveFlowVpcInterfaceRequest]
  }
  
  @scala.inline
  implicit class RemoveFlowVpcInterfaceRequestMutableBuilder[Self <: RemoveFlowVpcInterfaceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcInterfaceName(value: string): Self = StObject.set(x, "VpcInterfaceName", value.asInstanceOf[js.Any])
  }
}
