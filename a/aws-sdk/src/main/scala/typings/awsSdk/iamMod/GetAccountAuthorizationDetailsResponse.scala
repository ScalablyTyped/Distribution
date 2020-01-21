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
  def apply(
    GroupDetailList: groupDetailListType = null,
    IsTruncated: js.UndefOr[Boolean] = js.undefined,
    Marker: responseMarkerType = null,
    Policies: ManagedPolicyDetailListType = null,
    RoleDetailList: roleDetailListType = null,
    UserDetailList: userDetailListType = null
  ): GetAccountAuthorizationDetailsResponse = {
    val __obj = js.Dynamic.literal()
    if (GroupDetailList != null) __obj.updateDynamic("GroupDetailList")(GroupDetailList.asInstanceOf[js.Any])
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (Policies != null) __obj.updateDynamic("Policies")(Policies.asInstanceOf[js.Any])
    if (RoleDetailList != null) __obj.updateDynamic("RoleDetailList")(RoleDetailList.asInstanceOf[js.Any])
    if (UserDetailList != null) __obj.updateDynamic("UserDetailList")(UserDetailList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccountAuthorizationDetailsResponse]
  }
}

