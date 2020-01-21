package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRoleResponse extends js.Object {
  /**
    * A structure containing details about the new role.
    */
  var Role: typings.awsSdk.iamMod.Role = js.native
}

object CreateRoleResponse {
  @scala.inline
  def apply(Role: Role): CreateRoleResponse = {
    val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateRoleResponse]
  }
}

