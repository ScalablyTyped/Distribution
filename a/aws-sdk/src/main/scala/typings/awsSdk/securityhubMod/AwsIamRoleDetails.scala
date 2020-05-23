package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsIamRoleDetails extends js.Object {
  /**
    * The trust policy that grants permission to assume the role.
    */
  var AssumeRolePolicyDocument: js.UndefOr[AwsIamRoleAssumeRolePolicyDocument] = js.native
  /**
    * The date and time, in ISO 8601 date-time format, when the role was created.
    */
  var CreateDate: js.UndefOr[NonEmptyString] = js.native
  /**
    * The maximum session duration (in seconds) that you want to set for the specified role.
    */
  var MaxSessionDuration: js.UndefOr[Integer] = js.native
  /**
    * The path to the role.
    */
  var Path: js.UndefOr[NonEmptyString] = js.native
  /**
    * The stable and unique string identifying the role.
    */
  var RoleId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The friendly name that identifies the role.
    */
  var RoleName: js.UndefOr[NonEmptyString] = js.native
}

object AwsIamRoleDetails {
  @scala.inline
  def apply(
    AssumeRolePolicyDocument: AwsIamRoleAssumeRolePolicyDocument = null,
    CreateDate: NonEmptyString = null,
    MaxSessionDuration: js.UndefOr[Integer] = js.undefined,
    Path: NonEmptyString = null,
    RoleId: NonEmptyString = null,
    RoleName: NonEmptyString = null
  ): AwsIamRoleDetails = {
    val __obj = js.Dynamic.literal()
    if (AssumeRolePolicyDocument != null) __obj.updateDynamic("AssumeRolePolicyDocument")(AssumeRolePolicyDocument.asInstanceOf[js.Any])
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxSessionDuration)) __obj.updateDynamic("MaxSessionDuration")(MaxSessionDuration.get.asInstanceOf[js.Any])
    if (Path != null) __obj.updateDynamic("Path")(Path.asInstanceOf[js.Any])
    if (RoleId != null) __obj.updateDynamic("RoleId")(RoleId.asInstanceOf[js.Any])
    if (RoleName != null) __obj.updateDynamic("RoleName")(RoleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsIamRoleDetails]
  }
}

