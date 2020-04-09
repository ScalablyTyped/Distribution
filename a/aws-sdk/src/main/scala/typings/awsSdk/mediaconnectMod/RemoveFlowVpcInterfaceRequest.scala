package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveFlowVpcInterfaceRequest extends js.Object {
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
}

