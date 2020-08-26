package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllocateStaticIpRequest extends js.Object {
  /**
    * The name of the static IP address.
    */
  var staticIpName: ResourceName = js.native
}

object AllocateStaticIpRequest {
  @scala.inline
  def apply(staticIpName: ResourceName): AllocateStaticIpRequest = {
    val __obj = js.Dynamic.literal(staticIpName = staticIpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocateStaticIpRequest]
  }
  @scala.inline
  implicit class AllocateStaticIpRequestOps[Self <: AllocateStaticIpRequest] (val x: Self) extends AnyVal {
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
    def setStaticIpName(value: ResourceName): Self = this.set("staticIpName", value.asInstanceOf[js.Any])
  }
  
}

