package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachStaticIpRequest extends js.Object {
  /**
    * The instance name to which you want to attach the static IP address.
    */
  var instanceName: ResourceName = js.native
  /**
    * The name of the static IP.
    */
  var staticIpName: ResourceName = js.native
}

object AttachStaticIpRequest {
  @scala.inline
  def apply(instanceName: ResourceName, staticIpName: ResourceName): AttachStaticIpRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any], staticIpName = staticIpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachStaticIpRequest]
  }
  @scala.inline
  implicit class AttachStaticIpRequestOps[Self <: AttachStaticIpRequest] (val x: Self) extends AnyVal {
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
    def setInstanceName(value: ResourceName): Self = this.set("instanceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setStaticIpName(value: ResourceName): Self = this.set("staticIpName", value.asInstanceOf[js.Any])
  }
  
}

