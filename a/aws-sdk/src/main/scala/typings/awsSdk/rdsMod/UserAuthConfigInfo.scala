package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAuthConfigInfo extends StObject {
  
  /**
    * The type of authentication that the proxy uses for connections from the proxy to the underlying database.
    */
  var AuthScheme: js.UndefOr[typings.awsSdk.rdsMod.AuthScheme] = js.undefined
  
  /**
    * A user-specified description about the authentication used by a proxy to log in as a specific database user.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to require or disallow AWS Identity and Access Management (IAM) authentication for connections to the proxy.
    */
  var IAMAuth: js.UndefOr[IAMAuthMode] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) representing the secret that the proxy uses to authenticate to the RDS DB instance or Aurora DB cluster. These secrets are stored within Amazon Secrets Manager.
    */
  var SecretArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the database user to which the proxy connects.
    */
  var UserName: js.UndefOr[String] = js.undefined
}
object UserAuthConfigInfo {
  
  @scala.inline
  def apply(): UserAuthConfigInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAuthConfigInfo]
  }
  
  @scala.inline
  implicit class UserAuthConfigInfoMutableBuilder[Self <: UserAuthConfigInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthScheme(value: AuthScheme): Self = StObject.set(x, "AuthScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthSchemeUndefined: Self = StObject.set(x, "AuthScheme", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setIAMAuth(value: IAMAuthMode): Self = StObject.set(x, "IAMAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIAMAuthUndefined: Self = StObject.set(x, "IAMAuth", js.undefined)
    
    @scala.inline
    def setSecretArn(value: String): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretArnUndefined: Self = StObject.set(x, "SecretArn", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
