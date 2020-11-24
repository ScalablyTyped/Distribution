package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRdsDbInstanceRequest extends js.Object {
  
  /**
    * The database password.
    */
  var DbPassword: js.UndefOr[String] = js.native
  
  /**
    * The master user name.
    */
  var DbUser: js.UndefOr[String] = js.native
  
  /**
    * The Amazon RDS instance's ARN.
    */
  var RdsDbInstanceArn: String = js.native
}
object UpdateRdsDbInstanceRequest {
  
  @scala.inline
  def apply(RdsDbInstanceArn: String): UpdateRdsDbInstanceRequest = {
    val __obj = js.Dynamic.literal(RdsDbInstanceArn = RdsDbInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRdsDbInstanceRequest]
  }
  
  @scala.inline
  implicit class UpdateRdsDbInstanceRequestOps[Self <: UpdateRdsDbInstanceRequest] (val x: Self) extends AnyVal {
    
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
    def setRdsDbInstanceArn(value: String): Self = this.set("RdsDbInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbPassword(value: String): Self = this.set("DbPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbPassword: Self = this.set("DbPassword", js.undefined)
    
    @scala.inline
    def setDbUser(value: String): Self = this.set("DbUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbUser: Self = this.set("DbUser", js.undefined)
  }
}
