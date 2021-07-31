package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddRoleToDBClusterMessage extends StObject {
  
  /**
    * The name of the DB cluster to associate the IAM role with.
    */
  var DBClusterIdentifier: String
  
  /**
    * The name of the feature for the DB cluster that the IAM role is to be associated with. For the list of supported feature names, see DBEngineVersion.
    */
  var FeatureName: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role to associate with the Aurora DB cluster, for example arn:aws:iam::123456789012:role/AuroraAccessRole.
    */
  var RoleArn: String
}
object AddRoleToDBClusterMessage {
  
  @scala.inline
  def apply(DBClusterIdentifier: String, RoleArn: String): AddRoleToDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddRoleToDBClusterMessage]
  }
  
  @scala.inline
  implicit class AddRoleToDBClusterMessageMutableBuilder[Self <: AddRoleToDBClusterMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureName(value: String): Self = StObject.set(x, "FeatureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureNameUndefined: Self = StObject.set(x, "FeatureName", js.undefined)
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
