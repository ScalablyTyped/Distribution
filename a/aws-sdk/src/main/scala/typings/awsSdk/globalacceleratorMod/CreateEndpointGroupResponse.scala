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
  def apply(): CreateEndpointGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEndpointGroupResponse]
  }
  @scala.inline
  implicit class CreateEndpointGroupResponseOps[Self <: CreateEndpointGroupResponse] (val x: Self) extends AnyVal {
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
    def setEndpointGroup(value: EndpointGroup): Self = this.set("EndpointGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointGroup: Self = this.set("EndpointGroup", js.undefined)
  }
  
}

