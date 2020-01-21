package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateServiceLinkedRoleResponse extends js.Object {
  /**
    * A Role object that contains details about the newly created role.
    */
  var Role: js.UndefOr[typings.awsSdk.iamMod.Role] = js.native
}

object CreateServiceLinkedRoleResponse {
  @scala.inline
  def apply(Role: Role = null): CreateServiceLinkedRoleResponse = {
    val __obj = js.Dynamic.literal()
    if (Role != null) __obj.updateDynamic("Role")(Role.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceLinkedRoleResponse]
  }
}

