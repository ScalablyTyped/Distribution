package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharePrincipal extends js.Object {
  /**
    * The ID of the recipient.
    */
  var Id: IdType = js.native
  /**
    * The role of the recipient.
    */
  var Role: RoleType = js.native
  /**
    * The type of the recipient.
    */
  var Type: PrincipalType = js.native
}

object SharePrincipal {
  @scala.inline
  def apply(Id: IdType, Role: RoleType, Type: PrincipalType): SharePrincipal = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharePrincipal]
  }
  @scala.inline
  implicit class SharePrincipalOps[Self <: SharePrincipal] (val x: Self) extends AnyVal {
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
    def setId(value: IdType): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole(value: RoleType): Self = this.set("Role", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: PrincipalType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}

