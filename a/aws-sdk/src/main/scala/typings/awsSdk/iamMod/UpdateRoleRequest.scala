package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRoleRequest extends js.Object {
  /**
    * The new description that you want to apply to the specified role.
    */
  var Description: js.UndefOr[roleDescriptionType] = js.native
  /**
    * The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours. Anyone who assumes the role from the AWS CLI or API can use the DurationSeconds API parameter or the duration-seconds CLI parameter to request a longer session. The MaxSessionDuration setting determines the maximum duration that can be requested using the DurationSeconds parameter. If users don't specify a value for the DurationSeconds parameter, their security credentials are valid for one hour by default. This applies when you use the AssumeRole* API operations or the assume-role* CLI operations but does not apply when you use those operations to create a console URL. For more information, see Using IAM Roles in the IAM User Guide.
    */
  var MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType] = js.native
  /**
    * The name of the role that you want to modify.
    */
  var RoleName: roleNameType = js.native
}

object UpdateRoleRequest {
  @scala.inline
  def apply(RoleName: roleNameType): UpdateRoleRequest = {
    val __obj = js.Dynamic.literal(RoleName = RoleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoleRequest]
  }
  @scala.inline
  implicit class UpdateRoleRequestOps[Self <: UpdateRoleRequest] (val x: Self) extends AnyVal {
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
    def setRoleName(value: roleNameType): Self = this.set("RoleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: roleDescriptionType): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setMaxSessionDuration(value: roleMaxSessionDurationType): Self = this.set("MaxSessionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSessionDuration: Self = this.set("MaxSessionDuration", js.undefined)
  }
  
}

