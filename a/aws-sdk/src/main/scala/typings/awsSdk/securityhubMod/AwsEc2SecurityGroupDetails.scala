package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2SecurityGroupDetails extends StObject {
  
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The inbound rules associated with the security group.
    */
  var IpPermissions: js.UndefOr[AwsEc2SecurityGroupIpPermissionList] = js.undefined
  
  /**
    * [VPC only] The outbound rules associated with the security group.
    */
  var IpPermissionsEgress: js.UndefOr[AwsEc2SecurityGroupIpPermissionList] = js.undefined
  
  /**
    * The AWS account ID of the owner of the security group.
    */
  var OwnerId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * [VPC only] The ID of the VPC for the security group.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2SecurityGroupDetails {
  
  @scala.inline
  def apply(): AwsEc2SecurityGroupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2SecurityGroupDetails]
  }
  
  @scala.inline
  implicit class AwsEc2SecurityGroupDetailsMutableBuilder[Self <: AwsEc2SecurityGroupDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupId(value: NonEmptyString): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    @scala.inline
    def setGroupName(value: NonEmptyString): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    @scala.inline
    def setIpPermissions(value: AwsEc2SecurityGroupIpPermissionList): Self = StObject.set(x, "IpPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpPermissionsEgress(value: AwsEc2SecurityGroupIpPermissionList): Self = StObject.set(x, "IpPermissionsEgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpPermissionsEgressUndefined: Self = StObject.set(x, "IpPermissionsEgress", js.undefined)
    
    @scala.inline
    def setIpPermissionsEgressVarargs(value: AwsEc2SecurityGroupIpPermission*): Self = StObject.set(x, "IpPermissionsEgress", js.Array(value :_*))
    
    @scala.inline
    def setIpPermissionsUndefined: Self = StObject.set(x, "IpPermissions", js.undefined)
    
    @scala.inline
    def setIpPermissionsVarargs(value: AwsEc2SecurityGroupIpPermission*): Self = StObject.set(x, "IpPermissions", js.Array(value :_*))
    
    @scala.inline
    def setOwnerId(value: NonEmptyString): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setVpcId(value: NonEmptyString): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
