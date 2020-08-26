package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceProfile extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) specifying the instance profile. For more information about ARNs and how to use them in policies, see IAM Identifiers in the IAM User Guide. 
    */
  var Arn: arnType = js.native
  /**
    * The date when the instance profile was created.
    */
  var CreateDate: dateType = js.native
  /**
    *  The stable and unique string identifying the instance profile. For more information about IDs, see IAM Identifiers in the IAM User Guide. 
    */
  var InstanceProfileId: idType = js.native
  /**
    * The name identifying the instance profile.
    */
  var InstanceProfileName: instanceProfileNameType = js.native
  /**
    *  The path to the instance profile. For more information about paths, see IAM Identifiers in the IAM User Guide. 
    */
  var Path: pathType = js.native
  /**
    * The role associated with the instance profile.
    */
  var Roles: roleListType = js.native
}

object InstanceProfile {
  @scala.inline
  def apply(
    Arn: arnType,
    CreateDate: dateType,
    InstanceProfileId: idType,
    InstanceProfileName: instanceProfileNameType,
    Path: pathType,
    Roles: roleListType
  ): InstanceProfile = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreateDate = CreateDate.asInstanceOf[js.Any], InstanceProfileId = InstanceProfileId.asInstanceOf[js.Any], InstanceProfileName = InstanceProfileName.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Roles = Roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceProfile]
  }
  @scala.inline
  implicit class InstanceProfileOps[Self <: InstanceProfile] (val x: Self) extends AnyVal {
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
    def setCreateDate(value: dateType): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceProfileId(value: idType): Self = this.set("InstanceProfileId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceProfileName(value: instanceProfileNameType): Self = this.set("InstanceProfileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: pathType): Self = this.set("Path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRolesVarargs(value: Role*): Self = this.set("Roles", js.Array(value :_*))
    @scala.inline
    def setRoles(value: roleListType): Self = this.set("Roles", value.asInstanceOf[js.Any])
  }
  
}

