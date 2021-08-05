package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateVPCFromHostedZoneRequest extends StObject {
  
  /**
    *  Optional: A comment about the disassociation request.
    */
  var Comment: js.UndefOr[DisassociateVPCComment] = js.undefined
  
  /**
    * The ID of the private hosted zone that you want to disassociate a VPC from.
    */
  var HostedZoneId: ResourceId
  
  /**
    * A complex type that contains information about the VPC that you're disassociating from the specified hosted zone.
    */
  var VPC: typings.awsSdk.route53Mod.VPC
}
object DisassociateVPCFromHostedZoneRequest {
  
  inline def apply(HostedZoneId: ResourceId, VPC: VPC): DisassociateVPCFromHostedZoneRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], VPC = VPC.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateVPCFromHostedZoneRequest]
  }
  
  extension [Self <: DisassociateVPCFromHostedZoneRequest](x: Self) {
    
    inline def setComment(value: DisassociateVPCComment): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setVPC(value: VPC): Self = StObject.set(x, "VPC", value.asInstanceOf[js.Any])
  }
}
