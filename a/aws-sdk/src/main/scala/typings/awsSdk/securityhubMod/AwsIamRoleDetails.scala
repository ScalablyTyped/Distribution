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
  def apply(): AwsIamRoleDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamRoleDetails]
  }
  @scala.inline
  implicit class AwsIamRoleDetailsOps[Self <: AwsIamRoleDetails] (val x: Self) extends AnyVal {
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
    def setAssumeRolePolicyDocument(value: AwsIamRoleAssumeRolePolicyDocument): Self = this.set("AssumeRolePolicyDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssumeRolePolicyDocument: Self = this.set("AssumeRolePolicyDocument", js.undefined)
    @scala.inline
    def setCreateDate(value: NonEmptyString): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    @scala.inline
    def setMaxSessionDuration(value: Integer): Self = this.set("MaxSessionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSessionDuration: Self = this.set("MaxSessionDuration", js.undefined)
    @scala.inline
    def setPath(value: NonEmptyString): Self = this.set("Path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("Path", js.undefined)
    @scala.inline
    def setRoleId(value: NonEmptyString): Self = this.set("RoleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleId: Self = this.set("RoleId", js.undefined)
    @scala.inline
    def setRoleName(value: NonEmptyString): Self = this.set("RoleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleName: Self = this.set("RoleName", js.undefined)
  }
  
}

