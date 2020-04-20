package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddFlowVpcInterfacesRequest extends js.Object {
  /**
    * The flow that you want to mutate.
    */
  var FlowArn: string = js.native
  /**
    * A list of VPC interfaces that you want to add.
    */
  var VpcInterfaces: listOfVpcInterfaceRequest = js.native
}

object AddFlowVpcInterfacesRequest {
  @scala.inline
  def apply(FlowArn: string, VpcInterfaces: listOfVpcInterfaceRequest): AddFlowVpcInterfacesRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], VpcInterfaces = VpcInterfaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddFlowVpcInterfacesRequest]
  }
}

