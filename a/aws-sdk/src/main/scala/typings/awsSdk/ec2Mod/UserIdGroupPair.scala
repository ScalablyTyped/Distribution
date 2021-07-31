package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserIdGroupPair extends StObject {
  
  /**
    * A description for the security group rule that references this user ID group pair. Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=;{}!$*
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the security group. In a request, use this parameter for a security group in EC2-Classic or a default VPC only. For a security group in a nondefault VPC, use the security group ID.  For a referenced security group in another VPC, this value is not returned if the referenced security group is deleted.
    */
  var GroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The status of a VPC peering connection, if applicable.
    */
  var PeeringStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of an AWS account. For a referenced security group in another VPC, the account ID of the referenced security group is returned in the response. If the referenced security group is deleted, this value is not returned. [EC2-Classic] Required when adding or removing rules that reference a security group in another AWS account.
    */
  var UserId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the VPC for the referenced security group, if applicable.
    */
  var VpcId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the VPC peering connection, if applicable.
    */
  var VpcPeeringConnectionId: js.UndefOr[String] = js.undefined
}
object UserIdGroupPair {
  
  @scala.inline
  def apply(): UserIdGroupPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserIdGroupPair]
  }
  
  @scala.inline
  implicit class UserIdGroupPairMutableBuilder[Self <: UserIdGroupPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setGroupId(value: String): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    @scala.inline
    def setGroupName(value: String): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    @scala.inline
    def setPeeringStatus(value: String): Self = StObject.set(x, "PeeringStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeeringStatusUndefined: Self = StObject.set(x, "PeeringStatus", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
    
    @scala.inline
    def setVpcPeeringConnectionId(value: String): Self = StObject.set(x, "VpcPeeringConnectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcPeeringConnectionIdUndefined: Self = StObject.set(x, "VpcPeeringConnectionId", js.undefined)
  }
}
