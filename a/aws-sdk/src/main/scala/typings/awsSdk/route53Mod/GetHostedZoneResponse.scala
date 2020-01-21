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
  def apply(HostedZone: HostedZone, DelegationSet: DelegationSet = null, VPCs: VPCs = null): GetHostedZoneResponse = {
    val __obj = js.Dynamic.literal(HostedZone = HostedZone.asInstanceOf[js.Any])
    if (DelegationSet != null) __obj.updateDynamic("DelegationSet")(DelegationSet.asInstanceOf[js.Any])
    if (VPCs != null) __obj.updateDynamic("VPCs")(VPCs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostedZoneResponse]
  }
}

