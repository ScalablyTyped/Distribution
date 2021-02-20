package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateManagedInstanceRoleRequest extends StObject {
  
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
  implicit class UpdateManagedInstanceRoleRequestMutableBuilder[Self <: UpdateManagedInstanceRoleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIamRole(value: IamRole): Self = StObject.set(x, "IamRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: ManagedInstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
