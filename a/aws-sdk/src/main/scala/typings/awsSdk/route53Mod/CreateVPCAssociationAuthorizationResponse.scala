package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVPCAssociationAuthorizationResponse extends js.Object {
  
  /**
    * The ID of the hosted zone that you authorized associating a VPC with.
    */
  var HostedZoneId: ResourceId = js.native
  
  /**
    * The VPC that you authorized associating with a hosted zone.
    */
  var VPC: typings.awsSdk.route53Mod.VPC = js.native
}
object CreateVPCAssociationAuthorizationResponse {
  
  @scala.inline
  def apply(HostedZoneId: ResourceId, VPC: VPC): CreateVPCAssociationAuthorizationResponse = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], VPC = VPC.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVPCAssociationAuthorizationResponse]
  }
  
  @scala.inline
  implicit class CreateVPCAssociationAuthorizationResponseOps[Self <: CreateVPCAssociationAuthorizationResponse] (val x: Self) extends AnyVal {
    
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
    def setHostedZoneId(value: ResourceId): Self = this.set("HostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVPC(value: VPC): Self = this.set("VPC", value.asInstanceOf[js.Any])
  }
}
