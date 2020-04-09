package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddFlowVpcInterfacesResponse extends js.Object {
  /**
    * The ARN of the flow that these VPC interfaces were added to.
    */
  var FlowArn: js.UndefOr[string] = js.native
  /**
    * The details of the newly added VPC interfaces.
    */
  var VpcInterfaces: js.UndefOr[listOfVpcInterface] = js.native
}

object AddFlowVpcInterfacesResponse {
  @scala.inline
  def apply(FlowArn: string = null, VpcInterfaces: listOfVpcInterface = null): AddFlowVpcInterfacesResponse = {
    val __obj = js.Dynamic.literal()
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn.asInstanceOf[js.Any])
    if (VpcInterfaces != null) __obj.updateDynamic("VpcInterfaces")(VpcInterfaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddFlowVpcInterfacesResponse]
  }
}

