package typings.awsSdkTypes

import typings.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCredentialsMod {
  
  trait AwsCredentialIdentity extends StObject {
    
    /**
      * A {Date} when the identity or credential will no longer be accepted.
      */
    val expiration: js.UndefOr[js.Date] = js.undefined
  }
  object AwsCredentialIdentity {
    
    inline def apply(): AwsCredentialIdentity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AwsCredentialIdentity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AwsCredentialIdentity] (val x: Self) extends AnyVal {
      
      inline def setExpiration(value: js.Date): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    }
  }
  
  type CredentialProvider = Provider[Credentials]
  
  trait Credentials
    extends StObject
       with AwsCredentialIdentity {
    
    /**
      * AWS access key ID
      */
    val accessKeyId: String
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
      
      inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      inline def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
      
      inline def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
      
      inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
    }
  }
}
