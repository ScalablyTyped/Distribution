package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVPCAssociationAuthorizationResponse extends StObject {
  
  /**
    * The ID of the hosted zone that you authorized associating a VPC with.
    */
  var HostedZoneId: ResourceId
  
  /**
    * The VPC that you authorized associating with a hosted zone.
    */
  var VPC: typings.awsSdk.route53Mod.VPC
}
object CreateVPCAssociationAuthorizationResponse {
  
  inline def apply(HostedZoneId: ResourceId, VPC: VPC): CreateVPCAssociationAuthorizationResponse = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], VPC = VPC.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVPCAssociationAuthorizationResponse]
  }
  
  extension [Self <: CreateVPCAssociationAuthorizationResponse](x: Self) {
    
    inline def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setVPC(value: VPC): Self = StObject.set(x, "VPC", value.asInstanceOf[js.Any])
  }
}
