package typings.awsSdk.finspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCredentials extends StObject {
  
  /**
    *  The unique identifier for the security credentials.
    */
  var accessKeyId: js.UndefOr[AccessKeyId] = js.undefined
  
  /**
    *  The Epoch time when the current credentials expire.
    */
  var expiration: js.UndefOr[TimestampEpoch] = js.undefined
  
  /**
    *  The secret access key that can be used to sign requests.
    */
  var secretAccessKey: js.UndefOr[SecretAccessKey] = js.undefined
  
  /**
    *  The token that users must pass to use the credentials.
    */
  var sessionToken: js.UndefOr[SessionToken] = js.undefined
}
object AwsCredentials {
  
  inline def apply(): AwsCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCredentials]
  }
  
  extension [Self <: AwsCredentials](x: Self) {
    
    inline def setAccessKeyId(value: AccessKeyId): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
    
    inline def setExpiration(value: TimestampEpoch): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    inline def setSecretAccessKey(value: SecretAccessKey): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
    
    inline def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
    
    inline def setSessionToken(value: SessionToken): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
  }
}
