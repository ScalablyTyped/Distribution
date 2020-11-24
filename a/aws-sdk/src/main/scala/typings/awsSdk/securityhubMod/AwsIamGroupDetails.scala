package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsIamGroupDetails extends js.Object {
  
  /**
    * A list of the managed policies that are attached to the IAM group.
    */
  var AttachedManagedPolicies: js.UndefOr[AwsIamAttachedManagedPolicyList] = js.native
  
  /**
    * Indicates when the IAM group was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreateDate: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The identifier of the IAM group.
    */
  var GroupId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the IAM group.
    */
  var GroupName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The list of inline policies that are embedded in the group.
    */
  var GroupPolicyList: js.UndefOr[AwsIamGroupPolicyList] = js.native
  
  /**
    * The path to the group.
    */
  var Path: js.UndefOr[NonEmptyString] = js.native
}
object AwsIamGroupDetails {
  
  @scala.inline
  def apply(): AwsIamGroupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamGroupDetails]
  }
  
  @scala.inline
  implicit class AwsIamGroupDetailsOps[Self <: AwsIamGroupDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttachedManagedPoliciesVarargs(value: AwsIamAttachedManagedPolicy*): Self = this.set("AttachedManagedPolicies", js.Array(value :_*))
    
    @scala.inline
    def setAttachedManagedPolicies(value: AwsIamAttachedManagedPolicyList): Self = this.set("AttachedManagedPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachedManagedPolicies: Self = this.set("AttachedManagedPolicies", js.undefined)
    
    @scala.inline
    def setCreateDate(value: NonEmptyString): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    
    @scala.inline
    def setGroupId(value: NonEmptyString): Self = this.set("GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("GroupId", js.undefined)
    
    @scala.inline
    def setGroupName(value: NonEmptyString): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
    
    @scala.inline
    def setGroupPolicyListVarargs(value: AwsIamGroupPolicy*): Self = this.set("GroupPolicyList", js.Array(value :_*))
    
    @scala.inline
    def setGroupPolicyList(value: AwsIamGroupPolicyList): Self = this.set("GroupPolicyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupPolicyList: Self = this.set("GroupPolicyList", js.undefined)
    
    @scala.inline
    def setPath(value: NonEmptyString): Self = this.set("Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("Path", js.undefined)
  }
}
