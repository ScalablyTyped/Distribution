package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVPCAssociationAuthorizationRequest extends StObject {
  
  /**
    * The ID of the private hosted zone that you want to authorize associating a VPC with.
    */
  var HostedZoneId: ResourceId
  
  /**
    * A complex type that contains the VPC ID and region for the VPC that you want to authorize associating with your hosted zone.
    */
  var VPC: typings.awsSdk.route53Mod.VPC
}
object CreateVPCAssociationAuthorizationRequest {
  
  inline def apply(HostedZoneId: ResourceId, VPC: VPC): CreateVPCAssociationAuthorizationRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], VPC = VPC.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVPCAssociationAuthorizationRequest]
  }
  
  extension [Self <: CreateVPCAssociationAuthorizationRequest](x: Self) {
    
    inline def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setVPC(value: VPC): Self = StObject.set(x, "VPC", value.asInstanceOf[js.Any])
  }
}
