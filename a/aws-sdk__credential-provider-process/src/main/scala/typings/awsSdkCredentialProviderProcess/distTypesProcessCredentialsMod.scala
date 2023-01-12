package typings.awsSdkCredentialProviderProcess

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesProcessCredentialsMod {
  
  trait ProcessCredentials extends StObject {
    
    var AccessKeyId: String
    
    var Expiration: js.UndefOr[Double] = js.undefined
    
    var SecretAccessKey: String
    
    var SessionToken: js.UndefOr[String] = js.undefined
    
    var Version: Double
  }
  object ProcessCredentials {
    
    inline def apply(AccessKeyId: String, SecretAccessKey: String, Version: Double): ProcessCredentials = {
      val __obj = js.Dynamic.literal(AccessKeyId = AccessKeyId.asInstanceOf[js.Any], SecretAccessKey = SecretAccessKey.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessCredentials]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProcessCredentials] (val x: Self) extends AnyVal {
      
      inline def setAccessKeyId(value: String): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
      
      inline def setExpiration(value: Double): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
      
      inline def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
      
      inline def setSecretAccessKey(value: String): Self = StObject.set(x, "SecretAccessKey", value.asInstanceOf[js.Any])
      
      inline def setSessionToken(value: String): Self = StObject.set(x, "SessionToken", value.asInstanceOf[js.Any])
      
      inline def setSessionTokenUndefined: Self = StObject.set(x, "SessionToken", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    }
  }
}
