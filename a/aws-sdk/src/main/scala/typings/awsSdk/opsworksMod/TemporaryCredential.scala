package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemporaryCredential extends js.Object {
  
  /**
    * The instance's AWS OpsWorks Stacks ID.
    */
  var InstanceId: js.UndefOr[String] = js.native
  
  /**
    * The password.
    */
  var Password: js.UndefOr[String] = js.native
  
  /**
    * The user name.
    */
  var Username: js.UndefOr[String] = js.native
  
  /**
    * The length of time (in minutes) that the grant is valid. When the grant expires, at the end of this period, the user will no longer be able to use the credentials to log in. If they are logged in at the time, they will be automatically logged out.
    */
  var ValidForInMinutes: js.UndefOr[Integer] = js.native
}
object TemporaryCredential {
  
  @scala.inline
  def apply(): TemporaryCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemporaryCredential]
  }
  
  @scala.inline
  implicit class TemporaryCredentialOps[Self <: TemporaryCredential] (val x: Self) extends AnyVal {
    
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
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("Password", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
    
    @scala.inline
    def setValidForInMinutes(value: Integer): Self = this.set("ValidForInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidForInMinutes: Self = this.set("ValidForInMinutes", js.undefined)
  }
}
