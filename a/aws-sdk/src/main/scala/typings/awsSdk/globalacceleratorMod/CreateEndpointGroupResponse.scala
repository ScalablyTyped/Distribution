package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEndpointGroupResponse extends js.Object {
  /**
    * The information about the endpoint group that was created.
    */
  var EndpointGroup: js.UndefOr[typings.awsSdk.globalacceleratorMod.EndpointGroup] = js.native
}

object CreateEndpointGroupResponse {
  @scala.inline
  def apply(EndpointGroup: EndpointGroup = null): CreateEndpointGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (EndpointGroup != null) __obj.updateDynamic("EndpointGroup")(EndpointGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndpointGroupResponse]
  }
}

