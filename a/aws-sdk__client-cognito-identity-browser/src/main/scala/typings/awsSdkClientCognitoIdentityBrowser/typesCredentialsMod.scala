package typings.awsSdkClientCognitoIdentityBrowser

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCredentialsMod {
  
  trait Credentials extends StObject {
    
    /**
      * <p>The Access Key portion of the credentials.</p>
      */
    var AccessKeyId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The date at which these credentials will expire.</p>
      */
    var Expiration: js.UndefOr[Date | String | Double] = js.undefined
    
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
    
    @scala.inline
    implicit class CredentialsMutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessKeyId(value: String): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyIdUndefined: Self = StObject.set(x, "AccessKeyId", js.undefined)
      
      @scala.inline
      def setExpiration(value: Date | String | Double): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
      
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
  
  trait UnmarshalledCredentials
    extends StObject
       with Credentials {
    
    /**
      * <p>The date at which these credentials will expire.</p>
      */
    @JSName("Expiration")
    var Expiration_UnmarshalledCredentials: js.UndefOr[Date] = js.undefined
  }
  object UnmarshalledCredentials {
    
    @scala.inline
    def apply(): UnmarshalledCredentials = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledCredentials]
    }
    
    @scala.inline
    implicit class UnmarshalledCredentialsMutableBuilder[Self <: UnmarshalledCredentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpiration(value: Date): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
    }
  }
}
