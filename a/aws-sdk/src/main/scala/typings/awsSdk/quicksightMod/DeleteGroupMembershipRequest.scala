package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGroupMembershipRequest extends StObject {
  
  /**
    * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
  
  /**
    * The name of the group that you want to delete the user from.
    */
  var GroupName: typings.awsSdk.quicksightMod.GroupName
  
  /**
    * The name of the user that you want to delete from the group membership.
    */
  var MemberName: GroupMemberName
  
  /**
    * The namespace. Currently, you should set this to default.
    */
  var Namespace: typings.awsSdk.quicksightMod.Namespace
}
object DeleteGroupMembershipRequest {
  
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    GroupName: GroupName,
    MemberName: GroupMemberName,
    Namespace: Namespace
  ): DeleteGroupMembershipRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], GroupName = GroupName.asInstanceOf[js.Any], MemberName = MemberName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGroupMembershipRequest]
  }
  
  @scala.inline
  implicit class DeleteGroupMembershipRequestMutableBuilder[Self <: DeleteGroupMembershipRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberName(value: GroupMemberName): Self = StObject.set(x, "MemberName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
  }
}
