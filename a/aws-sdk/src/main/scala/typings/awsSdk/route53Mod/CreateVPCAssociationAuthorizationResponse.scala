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
  
  @scala.inline
  def apply(HostedZoneId: ResourceId, VPC: VPC): CreateVPCAssociationAuthorizationResponse = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], VPC = VPC.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVPCAssociationAuthorizationResponse]
  }
  
  @scala.inline
  implicit class CreateVPCAssociationAuthorizationResponseMutableBuilder[Self <: CreateVPCAssociationAuthorizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVPC(value: VPC): Self = StObject.set(x, "VPC", value.asInstanceOf[js.Any])
  }
}
