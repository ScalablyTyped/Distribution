package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LockServiceLinkedRoleRequest extends js.Object {
  var RoleArn: stringMin1Max1600 = js.native
  var Timeout: integerMin1Max29000 = js.native
}

object LockServiceLinkedRoleRequest {
  @scala.inline
  def apply(RoleArn: stringMin1Max1600, Timeout: integerMin1Max29000): LockServiceLinkedRoleRequest = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], Timeout = Timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockServiceLinkedRoleRequest]
  }
}

