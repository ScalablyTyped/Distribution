package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateVPCFromHostedZoneResponse extends js.Object {
  /**
    * A complex type that describes the changes made to the specified private hosted zone.
    */
  var ChangeInfo: typings.awsSdk.route53Mod.ChangeInfo = js.native
}

object DisassociateVPCFromHostedZoneResponse {
  @scala.inline
  def apply(ChangeInfo: ChangeInfo): DisassociateVPCFromHostedZoneResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateVPCFromHostedZoneResponse]
  }
  @scala.inline
  implicit class DisassociateVPCFromHostedZoneResponseOps[Self <: DisassociateVPCFromHostedZoneResponse] (val x: Self) extends AnyVal {
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
    def setChangeInfo(value: ChangeInfo): Self = this.set("ChangeInfo", value.asInstanceOf[js.Any])
  }
  
}

