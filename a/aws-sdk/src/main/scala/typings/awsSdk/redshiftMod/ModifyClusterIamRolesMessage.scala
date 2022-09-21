package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyClusterIamRolesMessage extends StObject {
  
  /**
    * Zero or more IAM roles to associate with the cluster. The roles must be in their Amazon Resource Name (ARN) format. 
    */
  var AddIamRoles: js.UndefOr[IamRoleArnList] = js.undefined
  
  /**
    * The unique identifier of the cluster for which you want to associate or disassociate IAM roles.
    */
  var ClusterIdentifier: String
  
  /**
    * The Amazon Resource Name (ARN) for the IAM role that was set as default for the cluster when the cluster was last modified.
    */
  var DefaultIamRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * Zero or more IAM roles in ARN format to disassociate from the cluster. 
    */
  var RemoveIamRoles: js.UndefOr[IamRoleArnList] = js.undefined
}
object ModifyClusterIamRolesMessage {
  
  inline def apply(ClusterIdentifier: String): ModifyClusterIamRolesMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterIamRolesMessage]
  }
  
  extension [Self <: ModifyClusterIamRolesMessage](x: Self) {
    
    inline def setAddIamRoles(value: IamRoleArnList): Self = StObject.set(x, "AddIamRoles", value.asInstanceOf[js.Any])
    
    inline def setAddIamRolesUndefined: Self = StObject.set(x, "AddIamRoles", js.undefined)
    
    inline def setAddIamRolesVarargs(value: String*): Self = StObject.set(x, "AddIamRoles", js.Array(value*))
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDefaultIamRoleArn(value: String): Self = StObject.set(x, "DefaultIamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDefaultIamRoleArnUndefined: Self = StObject.set(x, "DefaultIamRoleArn", js.undefined)
    
    inline def setRemoveIamRoles(value: IamRoleArnList): Self = StObject.set(x, "RemoveIamRoles", value.asInstanceOf[js.Any])
    
    inline def setRemoveIamRolesUndefined: Self = StObject.set(x, "RemoveIamRoles", js.undefined)
    
    inline def setRemoveIamRolesVarargs(value: String*): Self = StObject.set(x, "RemoveIamRoles", js.Array(value*))
  }
}
