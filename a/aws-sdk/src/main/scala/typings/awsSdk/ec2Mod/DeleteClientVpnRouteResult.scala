package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClientVpnRouteResult extends js.Object {
  /**
    * The current state of the route.
    */
  var Status: js.UndefOr[ClientVpnRouteStatus] = js.native
}

object DeleteClientVpnRouteResult {
  @scala.inline
  def apply(): DeleteClientVpnRouteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteClientVpnRouteResult]
  }
  @scala.inline
  implicit class DeleteClientVpnRouteResultOps[Self <: DeleteClientVpnRouteResult] (val x: Self) extends AnyVal {
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
    def setStatus(value: ClientVpnRouteStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

