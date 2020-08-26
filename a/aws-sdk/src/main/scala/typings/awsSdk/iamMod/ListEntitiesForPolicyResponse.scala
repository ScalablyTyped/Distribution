package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEntitiesForPolicyResponse extends js.Object {
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.native
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.native
  /**
    * A list of IAM groups that the policy is attached to.
    */
  var PolicyGroups: js.UndefOr[PolicyGroupListType] = js.native
  /**
    * A list of IAM roles that the policy is attached to.
    */
  var PolicyRoles: js.UndefOr[PolicyRoleListType] = js.native
  /**
    * A list of IAM users that the policy is attached to.
    */
  var PolicyUsers: js.UndefOr[PolicyUserListType] = js.native
}

object ListEntitiesForPolicyResponse {
  @scala.inline
  def apply(): ListEntitiesForPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEntitiesForPolicyResponse]
  }
  @scala.inline
  implicit class ListEntitiesForPolicyResponseOps[Self <: ListEntitiesForPolicyResponse] (val x: Self) extends AnyVal {
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
    def setIsTruncated(value: booleanType): Self = this.set("IsTruncated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTruncated: Self = this.set("IsTruncated", js.undefined)
    @scala.inline
    def setMarker(value: responseMarkerType): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setPolicyGroupsVarargs(value: PolicyGroup*): Self = this.set("PolicyGroups", js.Array(value :_*))
    @scala.inline
    def setPolicyGroups(value: PolicyGroupListType): Self = this.set("PolicyGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyGroups: Self = this.set("PolicyGroups", js.undefined)
    @scala.inline
    def setPolicyRolesVarargs(value: PolicyRole*): Self = this.set("PolicyRoles", js.Array(value :_*))
    @scala.inline
    def setPolicyRoles(value: PolicyRoleListType): Self = this.set("PolicyRoles", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyRoles: Self = this.set("PolicyRoles", js.undefined)
    @scala.inline
    def setPolicyUsersVarargs(value: PolicyUser*): Self = this.set("PolicyUsers", js.Array(value :_*))
    @scala.inline
    def setPolicyUsers(value: PolicyUserListType): Self = this.set("PolicyUsers", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyUsers: Self = this.set("PolicyUsers", js.undefined)
  }
  
}

