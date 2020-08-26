package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteServiceLinkedRoleResponse extends js.Object {
  /**
    * The deletion task identifier that you can use to check the status of the deletion. This identifier is returned in the format task/aws-service-role/&lt;service-principal-name&gt;/&lt;role-name&gt;/&lt;task-uuid&gt;.
    */
  var DeletionTaskId: DeletionTaskIdType = js.native
}

object DeleteServiceLinkedRoleResponse {
  @scala.inline
  def apply(DeletionTaskId: DeletionTaskIdType): DeleteServiceLinkedRoleResponse = {
    val __obj = js.Dynamic.literal(DeletionTaskId = DeletionTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServiceLinkedRoleResponse]
  }
  @scala.inline
  implicit class DeleteServiceLinkedRoleResponseOps[Self <: DeleteServiceLinkedRoleResponse] (val x: Self) extends AnyVal {
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
    def setDeletionTaskId(value: DeletionTaskIdType): Self = this.set("DeletionTaskId", value.asInstanceOf[js.Any])
  }
  
}

