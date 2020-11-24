package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterRdsDbInstanceRequest extends js.Object {
  
  /**
    * The database password.
    */
  var DbPassword: String = js.native
  
  /**
    * The database's master user name.
    */
  var DbUser: String = js.native
  
  /**
    * The Amazon RDS instance's ARN.
    */
  var RdsDbInstanceArn: String = js.native
  
  /**
    * The stack ID.
    */
  var StackId: String = js.native
}
object RegisterRdsDbInstanceRequest {
  
  @scala.inline
  def apply(DbPassword: String, DbUser: String, RdsDbInstanceArn: String, StackId: String): RegisterRdsDbInstanceRequest = {
    val __obj = js.Dynamic.literal(DbPassword = DbPassword.asInstanceOf[js.Any], DbUser = DbUser.asInstanceOf[js.Any], RdsDbInstanceArn = RdsDbInstanceArn.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterRdsDbInstanceRequest]
  }
  
  @scala.inline
  implicit class RegisterRdsDbInstanceRequestOps[Self <: RegisterRdsDbInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDbPassword(value: String): Self = this.set("DbPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbUser(value: String): Self = this.set("DbUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdsDbInstanceArn(value: String): Self = this.set("RdsDbInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
  }
}
