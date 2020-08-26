package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClientVpnEndpointResult extends js.Object {
  /**
    * The current state of the Client VPN endpoint.
    */
  var Status: js.UndefOr[ClientVpnEndpointStatus] = js.native
}

object DeleteClientVpnEndpointResult {
  @scala.inline
  def apply(): DeleteClientVpnEndpointResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteClientVpnEndpointResult]
  }
  @scala.inline
  implicit class DeleteClientVpnEndpointResultOps[Self <: DeleteClientVpnEndpointResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStatus(value: ClientVpnEndpointStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

