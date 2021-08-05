package typings.awsSdkTypes

import typings.awsSdkTypes.utilMod.Provider
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object credentialsMod {
  
  type CredentialProvider = Provider[Credentials]
  
  trait Credentials extends StObject {
    
    /**
      * AWS access key ID
      */
    val accessKeyId: String
    
    /**
      * A {Date} when these credentials will no longer be accepted.
      */
    val expiration: js.UndefOr[Date] = js.undefined
    
    /**
      * AWS secret access key
      */
    val secretAccessKey: String
    
    /**
      * A security or session token to use with these credentials. Usually
      * present for temporary credentials.
      */
    val sessionToken: js.UndefOr[String] = js.undefined
  }
  object Credentials {
    
    inline def apply(accessKeyId: String, secretAccessKey: String): Credentials = {
      val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    extension [Self <: Credentials](x: Self) {
      
      inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      inline def setExpiration(value: Date): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
      
      inline def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
      
      inline def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
      
      inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
    }
  }
}
