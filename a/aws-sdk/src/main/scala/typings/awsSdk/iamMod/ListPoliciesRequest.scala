package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPoliciesRequest extends js.Object {
  /**
    * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
    */
  var Marker: js.UndefOr[markerType] = js.native
  /**
    * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
    */
  var MaxItems: js.UndefOr[maxItemsType] = js.native
  /**
    * A flag to filter the results to only the attached policies. When OnlyAttached is true, the returned list contains only the policies that are attached to an IAM user, group, or role. When OnlyAttached is false, or when the parameter is not included, all policies are returned.
    */
  var OnlyAttached: js.UndefOr[booleanType] = js.native
  /**
    * The path prefix for filtering the results. This parameter is optional. If it is not included, it defaults to a slash (/), listing all policies. This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
    */
  var PathPrefix: js.UndefOr[policyPathType] = js.native
  /**
    * The policy usage method to use for filtering the results. To list only permissions policies, set PolicyUsageFilter to PermissionsPolicy. To list only the policies used to set permissions boundaries, set the value to PermissionsBoundary. This parameter is optional. If it is not included, all policies are returned. 
    */
  var PolicyUsageFilter: js.UndefOr[PolicyUsageType] = js.native
  /**
    * The scope to use for filtering the results. To list only AWS managed policies, set Scope to AWS. To list only the customer managed policies in your AWS account, set Scope to Local. This parameter is optional. If it is not included, or if it is set to All, all policies are returned.
    */
  var Scope: js.UndefOr[policyScopeType] = js.native
}

object ListPoliciesRequest {
  @scala.inline
  def apply(
    Marker: markerType = null,
    MaxItems: js.UndefOr[maxItemsType] = js.undefined,
    OnlyAttached: js.UndefOr[booleanType] = js.undefined,
    PathPrefix: policyPathType = null,
    PolicyUsageFilter: PolicyUsageType = null,
    Scope: policyScopeType = null
  ): ListPoliciesRequest = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxItems)) __obj.updateDynamic("MaxItems")(MaxItems.get.asInstanceOf[js.Any])
    if (!js.isUndefined(OnlyAttached)) __obj.updateDynamic("OnlyAttached")(OnlyAttached.get.asInstanceOf[js.Any])
    if (PathPrefix != null) __obj.updateDynamic("PathPrefix")(PathPrefix.asInstanceOf[js.Any])
    if (PolicyUsageFilter != null) __obj.updateDynamic("PolicyUsageFilter")(PolicyUsageFilter.asInstanceOf[js.Any])
    if (Scope != null) __obj.updateDynamic("Scope")(Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPoliciesRequest]
  }
}

