package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndpointGroupRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the endpoint group to describe.
    */
  var EndpointGroupArn: GenericString = js.native
}

object DescribeEndpointGroupRequest {
  @scala.inline
  def apply(EndpointGroupArn: GenericString): DescribeEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(EndpointGroupArn = EndpointGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointGroupRequest]
  }
  @scala.inline
  implicit class DescribeEndpointGroupRequestOps[Self <: DescribeEndpointGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndpointGroupArn(value: GenericString): Self = this.set("EndpointGroupArn", value.asInstanceOf[js.Any])
  }
  
}

