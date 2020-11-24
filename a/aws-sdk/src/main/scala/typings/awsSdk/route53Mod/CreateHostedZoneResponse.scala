package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateHostedZoneResponse extends js.Object {
  
  /**
    * A complex type that contains information about the CreateHostedZone request.
    */
  var ChangeInfo: typings.awsSdk.route53Mod.ChangeInfo = js.native
  
  /**
    * A complex type that describes the name servers for this hosted zone.
    */
  var DelegationSet: typings.awsSdk.route53Mod.DelegationSet = js.native
  
  /**
    * A complex type that contains general information about the hosted zone.
    */
  var HostedZone: typings.awsSdk.route53Mod.HostedZone = js.native
  
  /**
    * The unique URL representing the new hosted zone.
    */
  var Location: ResourceURI = js.native
  
  /**
    * A complex type that contains information about an Amazon VPC that you associated with this hosted zone.
    */
  var VPC: js.UndefOr[typings.awsSdk.route53Mod.VPC] = js.native
}
object CreateHostedZoneResponse {
  
  @scala.inline
  def apply(
    ChangeInfo: ChangeInfo,
    DelegationSet: DelegationSet,
    HostedZone: HostedZone,
    Location: ResourceURI
  ): CreateHostedZoneResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo.asInstanceOf[js.Any], DelegationSet = DelegationSet.asInstanceOf[js.Any], HostedZone = HostedZone.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHostedZoneResponse]
  }
  
  @scala.inline
  implicit class CreateHostedZoneResponseOps[Self <: CreateHostedZoneResponse] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setDelegationSet(value: DelegationSet): Self = this.set("DelegationSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedZone(value: HostedZone): Self = this.set("HostedZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: ResourceURI): Self = this.set("Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVPC(value: VPC): Self = this.set("VPC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVPC: Self = this.set("VPC", js.undefined)
  }
}
