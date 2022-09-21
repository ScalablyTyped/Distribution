package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVPCAssociationAuthorizationRequest extends StObject {
  
  /**
    * When removing authorization to associate a VPC that was created by one Amazon Web Services account with a hosted zone that was created with a different Amazon Web Services account, the ID of the hosted zone.
    */
  var HostedZoneId: ResourceId
  
  /**
    * When removing authorization to associate a VPC that was created by one Amazon Web Services account with a hosted zone that was created with a different Amazon Web Services account, a complex type that includes the ID and region of the VPC.
    */
  var VPC: typings.awsSdk.route53Mod.VPC
}
object DeleteVPCAssociationAuthorizationRequest {
  
  inline def apply(HostedZoneId: ResourceId, VPC: VPC): DeleteVPCAssociationAuthorizationRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], VPC = VPC.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVPCAssociationAuthorizationRequest]
  }
  
  extension [Self <: DeleteVPCAssociationAuthorizationRequest](x: Self) {
    
    inline def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setVPC(value: VPC): Self = StObject.set(x, "VPC", value.asInstanceOf[js.Any])
  }
}
