package typings.awsSdkTypes

import typings.awsSdkTypes.distTypesIdentityIdentityMod.Identity
import typings.awsSdkTypes.distTypesIdentityIdentityMod.IdentityProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesIdentityAwsCredentialIdentityMod {
  
  trait AwsCredentialIdentity
    extends StObject
       with Identity {
    
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
  object AwsCredentialIdentity {
    
    inline def apply(accessKeyId: String, secretAccessKey: String): AwsCredentialIdentity = {
      val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[AwsCredentialIdentity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AwsCredentialIdentity] (val x: Self) extends AnyVal {
      
      inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      inline def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
      
      inline def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
      
      inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
    }
  }
  
  type AwsCredentialIdentityProvider = IdentityProvider[AwsCredentialIdentity]
}
