package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAuthConfig extends js.Object {
  
  /**
    * The type of authentication that the proxy uses for connections from the proxy to the underlying database.
    */
  var AuthScheme: js.UndefOr[typings.awsSdk.rdsMod.AuthScheme] = js.native
  
  /**
    * A user-specified description about the authentication used by a proxy to log in as a specific database user.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * Whether to require or disallow AWS Identity and Access Management (IAM) authentication for connections to the proxy.
    */
  var IAMAuth: js.UndefOr[IAMAuthMode] = js.native
  
  /**
    * The Amazon Resource Name (ARN) representing the secret that the proxy uses to authenticate to the RDS DB instance or Aurora DB cluster. These secrets are stored within Amazon Secrets Manager.
    */
  var SecretArn: js.UndefOr[String] = js.native
  
  /**
    * The name of the database user to which the proxy connects.
    */
  var UserName: js.UndefOr[String] = js.native
}
object UserAuthConfig {
  
  @scala.inline
  def apply(): UserAuthConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAuthConfig]
  }
  
  @scala.inline
  implicit class UserAuthConfigOps[Self <: UserAuthConfig] (val x: Self) extends AnyVal {
    
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
    def setAuthScheme(value: AuthScheme): Self = this.set("AuthScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthScheme: Self = this.set("AuthScheme", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setIAMAuth(value: IAMAuthMode): Self = this.set("IAMAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIAMAuth: Self = this.set("IAMAuth", js.undefined)
    
    @scala.inline
    def setSecretArn(value: String): Self = this.set("SecretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretArn: Self = this.set("SecretArn", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = this.set("UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("UserName", js.undefined)
  }
}
