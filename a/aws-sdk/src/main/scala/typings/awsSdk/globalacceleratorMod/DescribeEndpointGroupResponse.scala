package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndpointGroupResponse extends js.Object {
  /**
    * The description of an endpoint group.
    */
  var EndpointGroup: js.UndefOr[typings.awsSdk.globalacceleratorMod.EndpointGroup] = js.native
}

object DescribeEndpointGroupResponse {
  @scala.inline
  def apply(EndpointGroup: EndpointGroup = null): DescribeEndpointGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (EndpointGroup != null) __obj.updateDynamic("EndpointGroup")(EndpointGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointGroupResponse]
  }
}

