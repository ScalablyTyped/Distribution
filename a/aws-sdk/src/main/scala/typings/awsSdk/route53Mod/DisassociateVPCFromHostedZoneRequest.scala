package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateVPCFromHostedZoneRequest extends js.Object {
  
  /**
    *  Optional: A comment about the disassociation request.
    */
  var Comment: js.UndefOr[DisassociateVPCComment] = js.native
  
  /**
    * The ID of the private hosted zone that you want to disassociate a VPC from.
    */
  var HostedZoneId: ResourceId = js.native
  
  /**
    * A complex type that contains information about the VPC that you're disassociating from the specified hosted zone.
    */
  var VPC: typings.awsSdk.route53Mod.VPC = js.native
}
object DisassociateVPCFromHostedZoneRequest {
  
  @scala.inline
  def apply(HostedZoneId: ResourceId, VPC: VPC): DisassociateVPCFromHostedZoneRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], VPC = VPC.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateVPCFromHostedZoneRequest]
  }
  
  @scala.inline
  implicit class DisassociateVPCFromHostedZoneRequestOps[Self <: DisassociateVPCFromHostedZoneRequest] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setComment(value: DisassociateVPCComment): Self = this.set("Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("Comment", js.undefined)
  }
}
