package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDestinationVpc extends js.Object {
  /**
    * The availability zone of the Input destination.
    */
  var AvailabilityZone: js.UndefOr[string] = js.native
  /**
    * The network interface ID of the Input destination in the VPC.
    */
  var NetworkInterfaceId: js.UndefOr[string] = js.native
}

object InputDestinationVpc {
  @scala.inline
  def apply(): InputDestinationVpc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputDestinationVpc]
  }
  @scala.inline
  implicit class InputDestinationVpcOps[Self <: InputDestinationVpc] (val x: Self) extends AnyVal {
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
    def setAvailabilityZone(value: string): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    @scala.inline
    def setNetworkInterfaceId(value: string): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("NetworkInterfaceId", js.undefined)
  }
  
}

