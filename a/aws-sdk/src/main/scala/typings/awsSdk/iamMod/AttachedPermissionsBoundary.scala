package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachedPermissionsBoundary extends js.Object {
  /**
    *  The ARN of the policy used to set the permissions boundary for the user or role.
    */
  var PermissionsBoundaryArn: js.UndefOr[arnType] = js.native
  /**
    *  The permissions boundary usage type that indicates what type of IAM resource is used as the permissions boundary for an entity. This data type can only have a value of Policy.
    */
  var PermissionsBoundaryType: js.UndefOr[PermissionsBoundaryAttachmentType] = js.native
}

object AttachedPermissionsBoundary {
  @scala.inline
  def apply(): AttachedPermissionsBoundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachedPermissionsBoundary]
  }
  @scala.inline
  implicit class AttachedPermissionsBoundaryOps[Self <: AttachedPermissionsBoundary] (val x: Self) extends AnyVal {
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
    def setPermissionsBoundaryArn(value: arnType): Self = this.set("PermissionsBoundaryArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissionsBoundaryArn: Self = this.set("PermissionsBoundaryArn", js.undefined)
    @scala.inline
    def setPermissionsBoundaryType(value: PermissionsBoundaryAttachmentType): Self = this.set("PermissionsBoundaryType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissionsBoundaryType: Self = this.set("PermissionsBoundaryType", js.undefined)
  }
  
}

