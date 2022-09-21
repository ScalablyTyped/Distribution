package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBClusterRole extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAMrole that is associated with the DB cluster.
    */
  var RoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * Describes the state of association between the IAMrole and the cluster. The Status property returns one of the following values:    ACTIVE - The IAMrole ARN is associated with the cluster and can be used to access other Amazon Web Services services on your behalf.    PENDING - The IAMrole ARN is being associated with the cluster.    INVALID - The IAMrole ARN is associated with the cluster, but the cluster cannot assume the IAMrole to access other Amazon Web Services services on your behalf.  
    */
  var Status: js.UndefOr[String] = js.undefined
}
object DBClusterRole {
  
  inline def apply(): DBClusterRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterRole]
  }
  
  extension [Self <: DBClusterRole](x: Self) {
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
