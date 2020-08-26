package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceAccessDetailsRequest extends js.Object {
  /**
    * The name of the instance to access.
    */
  var instanceName: ResourceName = js.native
  /**
    * The protocol to use to connect to your instance. Defaults to ssh.
    */
  var protocol: js.UndefOr[InstanceAccessProtocol] = js.native
}

object GetInstanceAccessDetailsRequest {
  @scala.inline
  def apply(instanceName: ResourceName): GetInstanceAccessDetailsRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceAccessDetailsRequest]
  }
  @scala.inline
  implicit class GetInstanceAccessDetailsRequestOps[Self <: GetInstanceAccessDetailsRequest] (val x: Self) extends AnyVal {
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
    def setProtocol(value: InstanceAccessProtocol): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
  }
  
}

