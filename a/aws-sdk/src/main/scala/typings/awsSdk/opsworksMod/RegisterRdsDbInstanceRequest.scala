package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterRdsDbInstanceRequest extends StObject {
  
  /**
    * The database password.
    */
  var DbPassword: String
  
  /**
    * The database's master user name.
    */
  var DbUser: String
  
  /**
    * The Amazon RDS instance's ARN.
    */
  var RdsDbInstanceArn: String
  
  /**
    * The stack ID.
    */
  var StackId: String
}
object RegisterRdsDbInstanceRequest {
  
  inline def apply(DbPassword: String, DbUser: String, RdsDbInstanceArn: String, StackId: String): RegisterRdsDbInstanceRequest = {
    val __obj = js.Dynamic.literal(DbPassword = DbPassword.asInstanceOf[js.Any], DbUser = DbUser.asInstanceOf[js.Any], RdsDbInstanceArn = RdsDbInstanceArn.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterRdsDbInstanceRequest]
  }
  
  extension [Self <: RegisterRdsDbInstanceRequest](x: Self) {
    
    inline def setDbPassword(value: String): Self = StObject.set(x, "DbPassword", value.asInstanceOf[js.Any])
    
    inline def setDbUser(value: String): Self = StObject.set(x, "DbUser", value.asInstanceOf[js.Any])
    
    inline def setRdsDbInstanceArn(value: String): Self = StObject.set(x, "RdsDbInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
  }
}
