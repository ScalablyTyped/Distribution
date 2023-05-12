package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateManagedInstanceRoleRequest extends StObject {
  
  /**
    * The name of the Identity and Access Management (IAM) role that you want to assign to the managed node. This IAM role must provide AssumeRole permissions for the Amazon Web Services Systems Manager service principal ssm.amazonaws.com. For more information, see Create an IAM service role for a hybrid environment in the Amazon Web Services Systems Manager User Guide.  You can't specify an IAM service-linked role for this parameter. You must create a unique role. 
    */
  var IamRole: typings.awsSdk2Types.clientsSsmMod.IamRole
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateManagedInstanceRoleRequest] (val x: Self) extends AnyVal {
    
    inline def setIamRole(value: IamRole): Self = StObject.set(x, "IamRole", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: ManagedInstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
