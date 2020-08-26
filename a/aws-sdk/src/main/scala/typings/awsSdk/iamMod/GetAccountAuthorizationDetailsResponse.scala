package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccountAuthorizationDetailsResponse extends js.Object {
  /**
    * A list containing information about IAM groups.
    */
  var GroupDetailList: js.UndefOr[groupDetailListType] = js.native
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.native
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.native
  /**
    * A list containing information about managed policies.
    */
  var Policies: js.UndefOr[ManagedPolicyDetailListType] = js.native
  /**
    * A list containing information about IAM roles.
    */
  var RoleDetailList: js.UndefOr[roleDetailListType] = js.native
  /**
    * A list containing information about IAM users.
    */
  var UserDetailList: js.UndefOr[userDetailListType] = js.native
}

object GetAccountAuthorizationDetailsResponse {
  @scala.inline
  def apply(): GetAccountAuthorizationDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountAuthorizationDetailsResponse]
  }
  @scala.inline
  implicit class GetAccountAuthorizationDetailsResponseOps[Self <: GetAccountAuthorizationDetailsResponse] (val x: Self) extends AnyVal {
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
    def setGroupDetailListVarargs(value: GroupDetail*): Self = this.set("GroupDetailList", js.Array(value :_*))
    @scala.inline
    def setGroupDetailList(value: groupDetailListType): Self = this.set("GroupDetailList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupDetailList: Self = this.set("GroupDetailList", js.undefined)
    @scala.inline
    def setIsTruncated(value: booleanType): Self = this.set("IsTruncated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTruncated: Self = this.set("IsTruncated", js.undefined)
    @scala.inline
    def setMarker(value: responseMarkerType): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setPoliciesVarargs(value: ManagedPolicyDetail*): Self = this.set("Policies", js.Array(value :_*))
    @scala.inline
    def setPolicies(value: ManagedPolicyDetailListType): Self = this.set("Policies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicies: Self = this.set("Policies", js.undefined)
    @scala.inline
    def setRoleDetailListVarargs(value: RoleDetail*): Self = this.set("RoleDetailList", js.Array(value :_*))
    @scala.inline
    def setRoleDetailList(value: roleDetailListType): Self = this.set("RoleDetailList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleDetailList: Self = this.set("RoleDetailList", js.undefined)
    @scala.inline
    def setUserDetailListVarargs(value: UserDetail*): Self = this.set("UserDetailList", js.Array(value :_*))
    @scala.inline
    def setUserDetailList(value: userDetailListType): Self = this.set("UserDetailList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserDetailList: Self = this.set("UserDetailList", js.undefined)
  }
  
}

