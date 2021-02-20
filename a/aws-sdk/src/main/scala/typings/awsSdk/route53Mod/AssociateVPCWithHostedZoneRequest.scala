package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateVPCWithHostedZoneRequest extends StObject {
  
  /**
    *  Optional: A comment about the association request.
    */
  var Comment: js.UndefOr[AssociateVPCComment] = js.native
  
  /**
    * The ID of the private hosted zone that you want to associate an Amazon VPC with. Note that you can't associate a VPC with a hosted zone that doesn't have an existing VPC association.
    */
  var HostedZoneId: ResourceId = js.native
  
  /**
    * A complex type that contains information about the VPC that you want to associate with a private hosted zone.
    */
  var VPC: typings.awsSdk.route53Mod.VPC = js.native
}
object AssociateVPCWithHostedZoneRequest {
  
  @scala.inline
  def apply(HostedZoneId: ResourceId, VPC: VPC): AssociateVPCWithHostedZoneRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], VPC = VPC.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateVPCWithHostedZoneRequest]
  }
  
  @scala.inline
  implicit class AssociateVPCWithHostedZoneRequestMutableBuilder[Self <: AssociateVPCWithHostedZoneRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: AssociateVPCComment): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    @scala.inline
    def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVPC(value: VPC): Self = StObject.set(x, "VPC", value.asInstanceOf[js.Any])
  }
}
