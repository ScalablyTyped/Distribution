package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateManagedInstanceRoleRequest extends StObject {
  
  /**
    * The IAM role you want to assign or change.
    */
  var IamRole: typings.awsSdk.ssmMod.IamRole
  
  /**
    * The ID of the managed node where you want to update the role.
    */
  var InstanceId: ManagedInstanceId
}
object UpdateManagedInstanceRoleRequest {
  
  inline def apply(IamRole: IamRole, InstanceId: ManagedInstanceId): UpdateManagedInstanceRoleRequest = {
    val __obj = js.Dynamic.literal(IamRole = IamRole.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateManagedInstanceRoleRequest]
  }
  
  extension [Self <: UpdateManagedInstanceRoleRequest](x: Self) {
    
    inline def setIamRole(value: IamRole): Self = StObject.set(x, "IamRole", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: ManagedInstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
