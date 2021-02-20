package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemporaryCredential extends StObject {
  
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
  implicit class TemporaryCredentialMutableBuilder[Self <: TemporaryCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
    
    @scala.inline
    def setValidForInMinutes(value: Integer): Self = StObject.set(x, "ValidForInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidForInMinutesUndefined: Self = StObject.set(x, "ValidForInMinutes", js.undefined)
  }
}
