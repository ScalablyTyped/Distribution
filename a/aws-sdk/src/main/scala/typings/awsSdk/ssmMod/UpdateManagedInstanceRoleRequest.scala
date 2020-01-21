package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateManagedInstanceRoleRequest extends js.Object {
  /**
    * The IAM role you want to assign or change.
    */
  var IamRole: typings.awsSdk.ssmMod.IamRole = js.native
  /**
    * The ID of the managed instance where you want to update the role.
    */
  var InstanceId: ManagedInstanceId = js.native
}

object UpdateManagedInstanceRoleRequest {
  @scala.inline
  def apply(IamRole: IamRole, InstanceId: ManagedInstanceId): UpdateManagedInstanceRoleRequest = {
    val __obj = js.Dynamic.literal(IamRole = IamRole.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateManagedInstanceRoleRequest]
  }
}

