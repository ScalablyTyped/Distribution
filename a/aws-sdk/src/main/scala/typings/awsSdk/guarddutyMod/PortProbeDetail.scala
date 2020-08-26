package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortProbeDetail extends js.Object {
  /**
    * The local IP information of the connection.
    */
  var LocalIpDetails: js.UndefOr[typings.awsSdk.guarddutyMod.LocalIpDetails] = js.native
  /**
    * The local port information of the connection.
    */
  var LocalPortDetails: js.UndefOr[typings.awsSdk.guarddutyMod.LocalPortDetails] = js.native
  /**
    * The remote IP information of the connection.
    */
  var RemoteIpDetails: js.UndefOr[typings.awsSdk.guarddutyMod.RemoteIpDetails] = js.native
}

object PortProbeDetail {
  @scala.inline
  def apply(): PortProbeDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortProbeDetail]
  }
  @scala.inline
  implicit class PortProbeDetailOps[Self <: PortProbeDetail] (val x: Self) extends AnyVal {
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
    def setLocalIpDetails(value: LocalIpDetails): Self = this.set("LocalIpDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalIpDetails: Self = this.set("LocalIpDetails", js.undefined)
    @scala.inline
    def setLocalPortDetails(value: LocalPortDetails): Self = this.set("LocalPortDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalPortDetails: Self = this.set("LocalPortDetails", js.undefined)
    @scala.inline
    def setRemoteIpDetails(value: RemoteIpDetails): Self = this.set("RemoteIpDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteIpDetails: Self = this.set("RemoteIpDetails", js.undefined)
  }
  
}

