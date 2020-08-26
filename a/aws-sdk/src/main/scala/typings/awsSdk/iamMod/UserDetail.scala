package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserDetail extends js.Object {
  var Arn: js.UndefOr[arnType] = js.native
  /**
    * A list of the managed policies attached to the user.
    */
  var AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType] = js.native
  /**
    * The date and time, in ISO 8601 date-time format, when the user was created.
    */
  var CreateDate: js.UndefOr[dateType] = js.native
  /**
    * A list of IAM groups that the user is in.
    */
  var GroupList: js.UndefOr[groupNameListType] = js.native
  /**
    * The path to the user. For more information about paths, see IAM Identifiers in the IAM User Guide.
    */
  var Path: js.UndefOr[pathType] = js.native
  /**
    * The ARN of the policy used to set the permissions boundary for the user. For more information about permissions boundaries, see Permissions Boundaries for IAM Identities  in the IAM User Guide.
    */
  var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.native
  /**
    * A list of tags that are associated with the specified user. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
    */
  var Tags: js.UndefOr[tagListType] = js.native
  /**
    * The stable and unique string identifying the user. For more information about IDs, see IAM Identifiers in the IAM User Guide.
    */
  var UserId: js.UndefOr[idType] = js.native
  /**
    * The friendly name identifying the user.
    */
  var UserName: js.UndefOr[userNameType] = js.native
  /**
    * A list of the inline policies embedded in the user.
    */
  var UserPolicyList: js.UndefOr[policyDetailListType] = js.native
}

object UserDetail {
  @scala.inline
  def apply(): UserDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDetail]
  }
  @scala.inline
  implicit class UserDetailOps[Self <: UserDetail] (val x: Self) extends AnyVal {
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
    def setArn(value: arnType): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setAttachedManagedPoliciesVarargs(value: AttachedPolicy*): Self = this.set("AttachedManagedPolicies", js.Array(value :_*))
    @scala.inline
    def setAttachedManagedPolicies(value: attachedPoliciesListType): Self = this.set("AttachedManagedPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachedManagedPolicies: Self = this.set("AttachedManagedPolicies", js.undefined)
    @scala.inline
    def setCreateDate(value: dateType): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    @scala.inline
    def setGroupListVarargs(value: groupNameType*): Self = this.set("GroupList", js.Array(value :_*))
    @scala.inline
    def setGroupList(value: groupNameListType): Self = this.set("GroupList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupList: Self = this.set("GroupList", js.undefined)
    @scala.inline
    def setPath(value: pathType): Self = this.set("Path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("Path", js.undefined)
    @scala.inline
    def setPermissionsBoundary(value: AttachedPermissionsBoundary): Self = this.set("PermissionsBoundary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissionsBoundary: Self = this.set("PermissionsBoundary", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: tagListType): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setUserId(value: idType): Self = this.set("UserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("UserId", js.undefined)
    @scala.inline
    def setUserName(value: userNameType): Self = this.set("UserName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserName: Self = this.set("UserName", js.undefined)
    @scala.inline
    def setUserPolicyListVarargs(value: PolicyDetail*): Self = this.set("UserPolicyList", js.Array(value :_*))
    @scala.inline
    def setUserPolicyList(value: policyDetailListType): Self = this.set("UserPolicyList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPolicyList: Self = this.set("UserPolicyList", js.undefined)
  }
  
}

