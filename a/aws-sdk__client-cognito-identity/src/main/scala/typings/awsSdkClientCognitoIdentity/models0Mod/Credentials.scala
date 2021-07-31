package typings.awsSdkClientCognitoIdentity.models0Mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Credentials extends StObject {
  
  /**
    * <p>The Access Key portion of the credentials.</p>
    */
  var AccessKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The date at which these credentials will expire.</p>
    */
  var Expiration: js.UndefOr[Date] = js.undefined
  
  /**
    * <p>The Secret Access Key portion of the credentials</p>
    */
  var SecretKey: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The Session Token portion of the credentials</p>
    */
  var SessionToken: js.UndefOr[String] = js.undefined
}
object Credentials {
  
  @scala.inline
  def apply(): Credentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Credentials]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "Credentials")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def filterSensitiveLog(obj: Credentials): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  implicit class CredentialsMutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessKeyId(value: String): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyIdUndefined: Self = StObject.set(x, "AccessKeyId", js.undefined)
    
    @scala.inline
    def setExpiration(value: Date): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
    
    @scala.inline
    def setSecretKey(value: String): Self = StObject.set(x, "SecretKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretKeyUndefined: Self = StObject.set(x, "SecretKey", js.undefined)
    
    @scala.inline
    def setSessionToken(value: String): Self = StObject.set(x, "SessionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionTokenUndefined: Self = StObject.set(x, "SessionToken", js.undefined)
  }
}
