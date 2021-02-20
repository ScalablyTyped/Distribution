package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteServiceLinkedRoleResponse extends StObject {
  
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
  implicit class DeleteServiceLinkedRoleResponseMutableBuilder[Self <: DeleteServiceLinkedRoleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletionTaskId(value: DeletionTaskIdType): Self = StObject.set(x, "DeletionTaskId", value.asInstanceOf[js.Any])
  }
}
