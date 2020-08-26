package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHostedZoneResponse extends js.Object {
  /**
    * A complex type that lists the Amazon Route 53 name servers for the specified hosted zone.
    */
  var DelegationSet: js.UndefOr[typings.awsSdk.route53Mod.DelegationSet] = js.native
  /**
    * A complex type that contains general information about the specified hosted zone.
    */
  var HostedZone: typings.awsSdk.route53Mod.HostedZone = js.native
  /**
    * A complex type that contains information about the VPCs that are associated with the specified hosted zone.
    */
  var VPCs: js.UndefOr[typings.awsSdk.route53Mod.VPCs] = js.native
}

object GetHostedZoneResponse {
  @scala.inline
  def apply(HostedZone: HostedZone): GetHostedZoneResponse = {
    val __obj = js.Dynamic.literal(HostedZone = HostedZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostedZoneResponse]
  }
  @scala.inline
  implicit class GetHostedZoneResponseOps[Self <: GetHostedZoneResponse] (val x: Self) extends AnyVal {
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
    def setHostedZone(value: HostedZone): Self = this.set("HostedZone", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelegationSet(value: DelegationSet): Self = this.set("DelegationSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelegationSet: Self = this.set("DelegationSet", js.undefined)
    @scala.inline
    def setVPCsVarargs(value: VPC*): Self = this.set("VPCs", js.Array(value :_*))
    @scala.inline
    def setVPCs(value: VPCs): Self = this.set("VPCs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVPCs: Self = this.set("VPCs", js.undefined)
  }
  
}

