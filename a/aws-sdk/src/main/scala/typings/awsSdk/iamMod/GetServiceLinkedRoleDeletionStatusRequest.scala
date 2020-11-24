package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetServiceLinkedRoleDeletionStatusRequest extends js.Object {
  
  /**
    * The deletion task identifier. This identifier is returned by the DeleteServiceLinkedRole operation in the format task/aws-service-role/&lt;service-principal-name&gt;/&lt;role-name&gt;/&lt;task-uuid&gt;.
    */
  var DeletionTaskId: DeletionTaskIdType = js.native
}
object GetServiceLinkedRoleDeletionStatusRequest {
  
  @scala.inline
  def apply(DeletionTaskId: DeletionTaskIdType): GetServiceLinkedRoleDeletionStatusRequest = {
    val __obj = js.Dynamic.literal(DeletionTaskId = DeletionTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceLinkedRoleDeletionStatusRequest]
  }
  
  @scala.inline
  implicit class GetServiceLinkedRoleDeletionStatusRequestOps[Self <: GetServiceLinkedRoleDeletionStatusRequest] (val x: Self) extends AnyVal {
    
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
