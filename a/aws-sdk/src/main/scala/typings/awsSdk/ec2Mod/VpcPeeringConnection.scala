package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcPeeringConnection extends StObject {
  
  /**
    * Information about the accepter VPC. CIDR block information is only returned when describing an active VPC peering connection.
    */
  var AccepterVpcInfo: js.UndefOr[VpcPeeringConnectionVpcInfo] = js.native
  
  /**
    * The time that an unaccepted VPC peering connection will expire.
    */
  var ExpirationTime: js.UndefOr[DateTime] = js.native
  
  /**
    * Information about the requester VPC. CIDR block information is only returned when describing an active VPC peering connection.
    */
  var RequesterVpcInfo: js.UndefOr[VpcPeeringConnectionVpcInfo] = js.native
  
  /**
    * The status of the VPC peering connection.
    */
  var Status: js.UndefOr[VpcPeeringConnectionStateReason] = js.native
  
  /**
    * Any tags assigned to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The ID of the VPC peering connection.
    */
  var VpcPeeringConnectionId: js.UndefOr[String] = js.native
}
object VpcPeeringConnection {
  
  @scala.inline
  def apply(): VpcPeeringConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcPeeringConnection]
  }
  
  @scala.inline
  implicit class VpcPeeringConnectionMutableBuilder[Self <: VpcPeeringConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccepterVpcInfo(value: VpcPeeringConnectionVpcInfo): Self = StObject.set(x, "AccepterVpcInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccepterVpcInfoUndefined: Self = StObject.set(x, "AccepterVpcInfo", js.undefined)
    
    @scala.inline
    def setExpirationTime(value: DateTime): Self = StObject.set(x, "ExpirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTimeUndefined: Self = StObject.set(x, "ExpirationTime", js.undefined)
    
    @scala.inline
    def setRequesterVpcInfo(value: VpcPeeringConnectionVpcInfo): Self = StObject.set(x, "RequesterVpcInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterVpcInfoUndefined: Self = StObject.set(x, "RequesterVpcInfo", js.undefined)
    
    @scala.inline
    def setStatus(value: VpcPeeringConnectionStateReason): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setVpcPeeringConnectionId(value: String): Self = StObject.set(x, "VpcPeeringConnectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcPeeringConnectionIdUndefined: Self = StObject.set(x, "VpcPeeringConnectionId", js.undefined)
  }
}
