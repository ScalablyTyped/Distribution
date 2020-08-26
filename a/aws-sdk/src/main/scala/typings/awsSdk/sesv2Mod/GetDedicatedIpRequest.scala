package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDedicatedIpRequest extends js.Object {
  /**
    * The IP address that you want to obtain more information about. The value you specify has to be a dedicated IP address that's assocaited with your AWS account.
    */
  var Ip: typings.awsSdk.sesv2Mod.Ip = js.native
}

object GetDedicatedIpRequest {
  @scala.inline
  def apply(Ip: Ip): GetDedicatedIpRequest = {
    val __obj = js.Dynamic.literal(Ip = Ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDedicatedIpRequest]
  }
  @scala.inline
  implicit class GetDedicatedIpRequestOps[Self <: GetDedicatedIpRequest] (val x: Self) extends AnyVal {
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
    def setIp(value: Ip): Self = this.set("Ip", value.asInstanceOf[js.Any])
  }
  
}

