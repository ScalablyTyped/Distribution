package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcPeeringConnection extends js.Object {
  
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
  implicit class VpcPeeringConnectionOps[Self <: VpcPeeringConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccepterVpcInfo(value: VpcPeeringConnectionVpcInfo): Self = this.set("AccepterVpcInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccepterVpcInfo: Self = this.set("AccepterVpcInfo", js.undefined)
    
    @scala.inline
    def setExpirationTime(value: DateTime): Self = this.set("ExpirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationTime: Self = this.set("ExpirationTime", js.undefined)
    
    @scala.inline
    def setRequesterVpcInfo(value: VpcPeeringConnectionVpcInfo): Self = this.set("RequesterVpcInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequesterVpcInfo: Self = this.set("RequesterVpcInfo", js.undefined)
    
    @scala.inline
    def setStatus(value: VpcPeeringConnectionStateReason): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setVpcPeeringConnectionId(value: String): Self = this.set("VpcPeeringConnectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcPeeringConnectionId: Self = this.set("VpcPeeringConnectionId", js.undefined)
  }
}
