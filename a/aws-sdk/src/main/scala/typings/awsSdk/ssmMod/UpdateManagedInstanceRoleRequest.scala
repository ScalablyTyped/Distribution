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
  @scala.inline
  implicit class UpdateManagedInstanceRoleRequestOps[Self <: UpdateManagedInstanceRoleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIamRole(value: IamRole): Self = this.set("IamRole", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceId(value: ManagedInstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
  }
  
}

