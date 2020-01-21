package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteServiceLinkedRoleRequest extends js.Object {
  /**
    * The name of the service-linked role to be deleted.
    */
  var RoleName: roleNameType = js.native
}

object DeleteServiceLinkedRoleRequest {
  @scala.inline
  def apply(RoleName: roleNameType): DeleteServiceLinkedRoleRequest = {
    val __obj = js.Dynamic.literal(RoleName = RoleName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteServiceLinkedRoleRequest]
  }
}

