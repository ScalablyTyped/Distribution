package typings.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Credentials extends StObject {
  
  /**
    * The Access Key portion of the credentials.
    */
  var AccessKeyId: js.UndefOr[AccessKeyString] = js.undefined
  
  /**
    * The date at which these credentials will expire.
    */
  var Expiration: js.UndefOr[DateType] = js.undefined
  
  /**
    * The Secret Access Key portion of the credentials
    */
  var SecretKey: js.UndefOr[SecretKeyString] = js.undefined
  
  /**
    * The Session Token portion of the credentials
    */
  var SessionToken: js.UndefOr[SessionTokenString] = js.undefined
}
object Credentials {
  
  inline def apply(): Credentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Credentials]
  }
  
  extension [Self <: Credentials](x: Self) {
    
    inline def setAccessKeyId(value: AccessKeyString): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyIdUndefined: Self = StObject.set(x, "AccessKeyId", js.undefined)
    
    inline def setExpiration(value: DateType): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
    
    inline def setSecretKey(value: SecretKeyString): Self = StObject.set(x, "SecretKey", value.asInstanceOf[js.Any])
    
    inline def setSecretKeyUndefined: Self = StObject.set(x, "SecretKey", js.undefined)
    
    inline def setSessionToken(value: SessionTokenString): Self = StObject.set(x, "SessionToken", value.asInstanceOf[js.Any])
    
    inline def setSessionTokenUndefined: Self = StObject.set(x, "SessionToken", js.undefined)
  }
}
