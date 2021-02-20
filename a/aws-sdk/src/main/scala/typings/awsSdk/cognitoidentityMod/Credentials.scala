package typings.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Credentials extends StObject {
  
  /**
    * The Access Key portion of the credentials.
    */
  var AccessKeyId: js.UndefOr[AccessKeyString] = js.native
  
  /**
    * The date at which these credentials will expire.
    */
  var Expiration: js.UndefOr[DateType] = js.native
  
  /**
    * The Secret Access Key portion of the credentials
    */
  var SecretKey: js.UndefOr[SecretKeyString] = js.native
  
  /**
    * The Session Token portion of the credentials
    */
  var SessionToken: js.UndefOr[SessionTokenString] = js.native
}
object Credentials {
  
  @scala.inline
  def apply(): Credentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Credentials]
  }
  
  @scala.inline
  implicit class CredentialsMutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessKeyId(value: AccessKeyString): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyIdUndefined: Self = StObject.set(x, "AccessKeyId", js.undefined)
    
    @scala.inline
    def setExpiration(value: DateType): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
    
    @scala.inline
    def setSecretKey(value: SecretKeyString): Self = StObject.set(x, "SecretKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretKeyUndefined: Self = StObject.set(x, "SecretKey", js.undefined)
    
    @scala.inline
    def setSessionToken(value: SessionTokenString): Self = StObject.set(x, "SessionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionTokenUndefined: Self = StObject.set(x, "SessionToken", js.undefined)
  }
}
