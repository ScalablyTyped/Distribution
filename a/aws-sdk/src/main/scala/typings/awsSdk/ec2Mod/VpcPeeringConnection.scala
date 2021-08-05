package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcPeeringConnection extends StObject {
  
  /**
    * Information about the accepter VPC. CIDR block information is only returned when describing an active VPC peering connection.
    */
  var AccepterVpcInfo: js.UndefOr[VpcPeeringConnectionVpcInfo] = js.undefined
  
  /**
    * The time that an unaccepted VPC peering connection will expire.
    */
  var ExpirationTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * Information about the requester VPC. CIDR block information is only returned when describing an active VPC peering connection.
    */
  var RequesterVpcInfo: js.UndefOr[VpcPeeringConnectionVpcInfo] = js.undefined
  
  /**
    * The status of the VPC peering connection.
    */
  var Status: js.UndefOr[VpcPeeringConnectionStateReason] = js.undefined
  
  /**
    * Any tags assigned to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the VPC peering connection.
    */
  var VpcPeeringConnectionId: js.UndefOr[String] = js.undefined
}
object VpcPeeringConnection {
  
  inline def apply(): VpcPeeringConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcPeeringConnection]
  }
  
  extension [Self <: VpcPeeringConnection](x: Self) {
    
    inline def setAccepterVpcInfo(value: VpcPeeringConnectionVpcInfo): Self = StObject.set(x, "AccepterVpcInfo", value.asInstanceOf[js.Any])
    
    inline def setAccepterVpcInfoUndefined: Self = StObject.set(x, "AccepterVpcInfo", js.undefined)
    
    inline def setExpirationTime(value: DateTime): Self = StObject.set(x, "ExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "ExpirationTime", js.undefined)
    
    inline def setRequesterVpcInfo(value: VpcPeeringConnectionVpcInfo): Self = StObject.set(x, "RequesterVpcInfo", value.asInstanceOf[js.Any])
    
    inline def setRequesterVpcInfoUndefined: Self = StObject.set(x, "RequesterVpcInfo", js.undefined)
    
    inline def setStatus(value: VpcPeeringConnectionStateReason): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setVpcPeeringConnectionId(value: String): Self = StObject.set(x, "VpcPeeringConnectionId", value.asInstanceOf[js.Any])
    
    inline def setVpcPeeringConnectionIdUndefined: Self = StObject.set(x, "VpcPeeringConnectionId", js.undefined)
  }
}
