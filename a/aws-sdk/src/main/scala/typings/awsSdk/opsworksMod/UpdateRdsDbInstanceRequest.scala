package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRdsDbInstanceRequest extends StObject {
  
  /**
    * The database password.
    */
  var DbPassword: js.UndefOr[String] = js.undefined
  
  /**
    * The master user name.
    */
  var DbUser: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon RDS instance's ARN.
    */
  var RdsDbInstanceArn: String
}
object UpdateRdsDbInstanceRequest {
  
  @scala.inline
  def apply(RdsDbInstanceArn: String): UpdateRdsDbInstanceRequest = {
    val __obj = js.Dynamic.literal(RdsDbInstanceArn = RdsDbInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRdsDbInstanceRequest]
  }
  
  @scala.inline
  implicit class UpdateRdsDbInstanceRequestMutableBuilder[Self <: UpdateRdsDbInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDbPassword(value: String): Self = StObject.set(x, "DbPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbPasswordUndefined: Self = StObject.set(x, "DbPassword", js.undefined)
    
    @scala.inline
    def setDbUser(value: String): Self = StObject.set(x, "DbUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbUserUndefined: Self = StObject.set(x, "DbUser", js.undefined)
    
    @scala.inline
    def setRdsDbInstanceArn(value: String): Self = StObject.set(x, "RdsDbInstanceArn", value.asInstanceOf[js.Any])
  }
}
