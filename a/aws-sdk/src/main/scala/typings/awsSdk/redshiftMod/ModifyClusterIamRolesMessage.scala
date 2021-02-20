package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyClusterIamRolesMessage extends StObject {
  
  /**
    * Zero or more IAM roles to associate with the cluster. The roles must be in their Amazon Resource Name (ARN) format. You can associate up to 10 IAM roles with a single cluster in a single request.
    */
  var AddIamRoles: js.UndefOr[IamRoleArnList] = js.native
  
  /**
    * The unique identifier of the cluster for which you want to associate or disassociate IAM roles.
    */
  var ClusterIdentifier: String = js.native
  
  /**
    * Zero or more IAM roles in ARN format to disassociate from the cluster. You can disassociate up to 10 IAM roles from a single cluster in a single request.
    */
  var RemoveIamRoles: js.UndefOr[IamRoleArnList] = js.native
}
object ModifyClusterIamRolesMessage {
  
  @scala.inline
  def apply(ClusterIdentifier: String): ModifyClusterIamRolesMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterIamRolesMessage]
  }
  
  @scala.inline
  implicit class ModifyClusterIamRolesMessageMutableBuilder[Self <: ModifyClusterIamRolesMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddIamRoles(value: IamRoleArnList): Self = StObject.set(x, "AddIamRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddIamRolesUndefined: Self = StObject.set(x, "AddIamRoles", js.undefined)
    
    @scala.inline
    def setAddIamRolesVarargs(value: String*): Self = StObject.set(x, "AddIamRoles", js.Array(value :_*))
    
    @scala.inline
    def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveIamRoles(value: IamRoleArnList): Self = StObject.set(x, "RemoveIamRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveIamRolesUndefined: Self = StObject.set(x, "RemoveIamRoles", js.undefined)
    
    @scala.inline
    def setRemoveIamRolesVarargs(value: String*): Self = StObject.set(x, "RemoveIamRoles", js.Array(value :_*))
  }
}
