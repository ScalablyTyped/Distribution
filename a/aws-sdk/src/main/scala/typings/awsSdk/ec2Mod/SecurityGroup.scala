package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGroup extends StObject {
  
  /**
    * A description of the security group.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The inbound rules associated with the security group.
    */
  var IpPermissions: js.UndefOr[IpPermissionList] = js.undefined
  
  /**
    * [VPC only] The outbound rules associated with the security group.
    */
  var IpPermissionsEgress: js.UndefOr[IpPermissionList] = js.undefined
  
  /**
    * The AWS account ID of the owner of the security group.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Any tags assigned to the security group.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * [VPC only] The ID of the VPC for the security group.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object SecurityGroup {
  
  @scala.inline
  def apply(): SecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroup]
  }
  
  @scala.inline
  implicit class SecurityGroupMutableBuilder[Self <: SecurityGroup] (val x: Self) extends AnyVal {
    
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
    def setIpPermissions(value: IpPermissionList): Self = StObject.set(x, "IpPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpPermissionsEgress(value: IpPermissionList): Self = StObject.set(x, "IpPermissionsEgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpPermissionsEgressUndefined: Self = StObject.set(x, "IpPermissionsEgress", js.undefined)
    
    @scala.inline
    def setIpPermissionsEgressVarargs(value: IpPermission*): Self = StObject.set(x, "IpPermissionsEgress", js.Array(value :_*))
    
    @scala.inline
    def setIpPermissionsUndefined: Self = StObject.set(x, "IpPermissions", js.undefined)
    
    @scala.inline
    def setIpPermissionsVarargs(value: IpPermission*): Self = StObject.set(x, "IpPermissions", js.Array(value :_*))
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
