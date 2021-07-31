package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBClusterRole extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that is associated with the DB cluster.
    */
  var RoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * Describes the state of association between the IAM role and the cluster. The Status property returns one of the following values:    ACTIVE - The IAM role ARN is associated with the cluster and can be used to access other AWS services on your behalf.    PENDING - The IAM role ARN is being associated with the DB cluster.    INVALID - The IAM role ARN is associated with the cluster, but the cluster cannot assume the IAM role to access other AWS services on your behalf.  
    */
  var Status: js.UndefOr[String] = js.undefined
}
object DBClusterRole {
  
  @scala.inline
  def apply(): DBClusterRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterRole]
  }
  
  @scala.inline
  implicit class DBClusterRoleMutableBuilder[Self <: DBClusterRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
