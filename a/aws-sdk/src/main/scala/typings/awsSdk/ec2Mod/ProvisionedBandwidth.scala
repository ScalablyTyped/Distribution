package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedBandwidth extends js.Object {
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var ProvisionTime: js.UndefOr[DateTime] = js.native
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var Provisioned: js.UndefOr[String] = js.native
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var RequestTime: js.UndefOr[DateTime] = js.native
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var Requested: js.UndefOr[String] = js.native
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var Status: js.UndefOr[String] = js.native
}

object ProvisionedBandwidth {
  @scala.inline
  def apply(): ProvisionedBandwidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedBandwidth]
  }
  @scala.inline
  implicit class ProvisionedBandwidthOps[Self <: ProvisionedBandwidth] (val x: Self) extends AnyVal {
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
    def setProvisionTime(value: DateTime): Self = this.set("ProvisionTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionTime: Self = this.set("ProvisionTime", js.undefined)
    @scala.inline
    def setProvisioned(value: String): Self = this.set("Provisioned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisioned: Self = this.set("Provisioned", js.undefined)
    @scala.inline
    def setRequestTime(value: DateTime): Self = this.set("RequestTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestTime: Self = this.set("RequestTime", js.undefined)
    @scala.inline
    def setRequested(value: String): Self = this.set("Requested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequested: Self = this.set("Requested", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

