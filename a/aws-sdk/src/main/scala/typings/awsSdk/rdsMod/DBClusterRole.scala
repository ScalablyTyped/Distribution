package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBClusterRole extends StObject {
  
  /**
    * The name of the feature associated with the AWS Identity and Access Management (IAM) role. For the list of supported feature names, see DBEngineVersion. 
    */
  var FeatureName: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that is associated with the DB cluster.
    */
  var RoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * Describes the state of association between the IAM role and the DB cluster. The Status property returns one of the following values:    ACTIVE - the IAM role ARN is associated with the DB cluster and can be used to access other AWS services on your behalf.    PENDING - the IAM role ARN is being associated with the DB cluster.    INVALID - the IAM role ARN is associated with the DB cluster, but the DB cluster is unable to assume the IAM role in order to access other AWS services on your behalf.  
    */
  var Status: js.UndefOr[String] = js.undefined
}
object DBClusterRole {
  
  inline def apply(): DBClusterRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterRole]
  }
  
  extension [Self <: DBClusterRole](x: Self) {
    
    inline def setFeatureName(value: String): Self = StObject.set(x, "FeatureName", value.asInstanceOf[js.Any])
    
    inline def setFeatureNameUndefined: Self = StObject.set(x, "FeatureName", js.undefined)
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
