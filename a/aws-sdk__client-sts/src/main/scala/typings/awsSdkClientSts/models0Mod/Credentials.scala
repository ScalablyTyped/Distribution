package typings.awsSdkClientSts.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Credentials extends StObject {
  
  /**
    * <p>The access key ID that identifies the temporary security credentials.</p>
    */
  var AccessKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The date on which the current credentials expire.</p>
    */
  var Expiration: js.UndefOr[js.Date] = js.undefined
  
  /**
    * <p>The secret access key that can be used to sign requests.</p>
    */
  var SecretAccessKey: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The token that users must pass to the service API to use the temporary
    *          credentials.</p>
    */
  var SessionToken: js.UndefOr[String] = js.undefined
}
object Credentials {
  
  inline def apply(): Credentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Credentials]
  }
  
  extension [Self <: Credentials](x: Self) {
    
    inline def setAccessKeyId(value: String): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyIdUndefined: Self = StObject.set(x, "AccessKeyId", js.undefined)
    
    inline def setExpiration(value: js.Date): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
    
    inline def setSecretAccessKey(value: String): Self = StObject.set(x, "SecretAccessKey", value.asInstanceOf[js.Any])
    
    inline def setSecretAccessKeyUndefined: Self = StObject.set(x, "SecretAccessKey", js.undefined)
    
    inline def setSessionToken(value: String): Self = StObject.set(x, "SessionToken", value.asInstanceOf[js.Any])
    
    inline def setSessionTokenUndefined: Self = StObject.set(x, "SessionToken", js.undefined)
  }
}
