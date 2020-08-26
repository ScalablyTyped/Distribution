package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachVpnGatewayResult extends js.Object {
  /**
    * Information about the attachment.
    */
  var VpcAttachment: js.UndefOr[typings.awsSdk.ec2Mod.VpcAttachment] = js.native
}

object AttachVpnGatewayResult {
  @scala.inline
  def apply(): AttachVpnGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachVpnGatewayResult]
  }
  @scala.inline
  implicit class AttachVpnGatewayResultOps[Self <: AttachVpnGatewayResult] (val x: Self) extends AnyVal {
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
    def setVpcAttachment(value: VpcAttachment): Self = this.set("VpcAttachment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcAttachment: Self = this.set("VpcAttachment", js.undefined)
  }
  
}

