package typings.awsSdkTypes

import typings.awsSdkTypes.utilMod.Provider
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object credentialsMod {
  
  type CredentialProvider = Provider[Credentials]
  
  @js.native
  trait Credentials extends StObject {
    
    /**
      * AWS access key ID
      */
    val accessKeyId: String = js.native
    
    /**
      * A {Date} when these credentials will no longer be accepted.
      */
    val expiration: js.UndefOr[Date] = js.native
    
    /**
      * AWS secret access key
      */
    val secretAccessKey: String = js.native
    
    /**
      * A security or session token to use with these credentials. Usually
      * present for temporary credentials.
      */
    val sessionToken: js.UndefOr[String] = js.native
  }
  object Credentials {
    
    @scala.inline
    def apply(accessKeyId: String, secretAccessKey: String): Credentials = {
      val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    @scala.inline
    implicit class CredentialsMutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiration(value: Date): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
      
      @scala.inline
      def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
    }
  }
}
