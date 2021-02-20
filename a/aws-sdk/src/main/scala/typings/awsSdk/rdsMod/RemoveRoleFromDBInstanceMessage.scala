package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveRoleFromDBInstanceMessage extends StObject {
  
  /**
    * The name of the DB instance to disassociate the IAM role from.
    */
  var DBInstanceIdentifier: String = js.native
  
  /**
    * The name of the feature for the DB instance that the IAM role is to be disassociated from. For the list of supported feature names, see DBEngineVersion. 
    */
  var FeatureName: String = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role to disassociate from the DB instance, for example arn:aws:iam::123456789012:role/AccessRole.
    */
  var RoleArn: String = js.native
}
object RemoveRoleFromDBInstanceMessage {
  
  @scala.inline
  def apply(DBInstanceIdentifier: String, FeatureName: String, RoleArn: String): RemoveRoleFromDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any], FeatureName = FeatureName.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveRoleFromDBInstanceMessage]
  }
  
  @scala.inline
  implicit class RemoveRoleFromDBInstanceMessageMutableBuilder[Self <: RemoveRoleFromDBInstanceMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureName(value: String): Self = StObject.set(x, "FeatureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
