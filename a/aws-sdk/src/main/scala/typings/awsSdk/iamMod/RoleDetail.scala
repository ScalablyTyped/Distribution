package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleDetail extends js.Object {
  var Arn: js.UndefOr[arnType] = js.native
  /**
    * The trust policy that grants permission to assume the role.
    */
  var AssumeRolePolicyDocument: js.UndefOr[policyDocumentType] = js.native
  /**
    * A list of managed policies attached to the role. These policies are the role's access (permissions) policies.
    */
  var AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType] = js.native
  /**
    * The date and time, in ISO 8601 date-time format, when the role was created.
    */
  var CreateDate: js.UndefOr[dateType] = js.native
  /**
    * A list of instance profiles that contain this role.
    */
  var InstanceProfileList: js.UndefOr[instanceProfileListType] = js.native
  /**
    * The path to the role. For more information about paths, see IAM Identifiers in the IAM User Guide.
    */
  var Path: js.UndefOr[pathType] = js.native
  /**
    * The ARN of the policy used to set the permissions boundary for the role. For more information about permissions boundaries, see Permissions Boundaries for IAM Identities  in the IAM User Guide.
    */
  var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.native
  /**
    * The stable and unique string identifying the role. For more information about IDs, see IAM Identifiers in the IAM User Guide.
    */
  var RoleId: js.UndefOr[idType] = js.native
  /**
    * Contains information about the last time that an IAM role was used. This includes the date and time and the Region in which the role was last used. Activity is only reported for the trailing 400 days. This period can be shorter if your Region began supporting these features within the last year. The role might have been used more than 400 days ago. For more information, see Regions Where Data Is Tracked in the IAM User Guide.
    */
  var RoleLastUsed: js.UndefOr[typings.awsSdk.iamMod.RoleLastUsed] = js.native
  /**
    * The friendly name that identifies the role.
    */
  var RoleName: js.UndefOr[roleNameType] = js.native
  /**
    * A list of inline policies embedded in the role. These policies are the role's access (permissions) policies.
    */
  var RolePolicyList: js.UndefOr[policyDetailListType] = js.native
  /**
    * A list of tags that are attached to the specified role. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
    */
  var Tags: js.UndefOr[tagListType] = js.native
}

object RoleDetail {
  @scala.inline
  def apply(
    Arn: arnType = null,
    AssumeRolePolicyDocument: policyDocumentType = null,
    AttachedManagedPolicies: attachedPoliciesListType = null,
    CreateDate: dateType = null,
    InstanceProfileList: instanceProfileListType = null,
    Path: pathType = null,
    PermissionsBoundary: AttachedPermissionsBoundary = null,
    RoleId: idType = null,
    RoleLastUsed: RoleLastUsed = null,
    RoleName: roleNameType = null,
    RolePolicyList: policyDetailListType = null,
    Tags: tagListType = null
  ): RoleDetail = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (AssumeRolePolicyDocument != null) __obj.updateDynamic("AssumeRolePolicyDocument")(AssumeRolePolicyDocument.asInstanceOf[js.Any])
    if (AttachedManagedPolicies != null) __obj.updateDynamic("AttachedManagedPolicies")(AttachedManagedPolicies.asInstanceOf[js.Any])
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate.asInstanceOf[js.Any])
    if (InstanceProfileList != null) __obj.updateDynamic("InstanceProfileList")(InstanceProfileList.asInstanceOf[js.Any])
    if (Path != null) __obj.updateDynamic("Path")(Path.asInstanceOf[js.Any])
    if (PermissionsBoundary != null) __obj.updateDynamic("PermissionsBoundary")(PermissionsBoundary.asInstanceOf[js.Any])
    if (RoleId != null) __obj.updateDynamic("RoleId")(RoleId.asInstanceOf[js.Any])
    if (RoleLastUsed != null) __obj.updateDynamic("RoleLastUsed")(RoleLastUsed.asInstanceOf[js.Any])
    if (RoleName != null) __obj.updateDynamic("RoleName")(RoleName.asInstanceOf[js.Any])
    if (RolePolicyList != null) __obj.updateDynamic("RolePolicyList")(RolePolicyList.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleDetail]
  }
}

