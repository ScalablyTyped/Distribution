package typings.awsSdkCredentialProviderImds

import typings.awsSdkTypes.credentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imdsCredentialsMod {
  
  @JSImport("@aws-sdk/credential-provider-imds/dist/cjs/remoteProvider/ImdsCredentials", "fromImdsCredentials")
  @js.native
  def fromImdsCredentials(creds: ImdsCredentials): Credentials = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds/dist/cjs/remoteProvider/ImdsCredentials", "isImdsCredentials")
  @js.native
  def isImdsCredentials(arg: js.Any): /* is @aws-sdk/credential-provider-imds.@aws-sdk/credential-provider-imds/dist/cjs/remoteProvider/ImdsCredentials.ImdsCredentials */ Boolean = js.native
  
  @js.native
  trait ImdsCredentials extends StObject {
    
    var AccessKeyId: String = js.native
    
    var Expiration: String = js.native
    
    var SecretAccessKey: String = js.native
    
    var Token: String = js.native
  }
  object ImdsCredentials {
    
    @scala.inline
    def apply(AccessKeyId: String, Expiration: String, SecretAccessKey: String, Token: String): ImdsCredentials = {
      val __obj = js.Dynamic.literal(AccessKeyId = AccessKeyId.asInstanceOf[js.Any], Expiration = Expiration.asInstanceOf[js.Any], SecretAccessKey = SecretAccessKey.asInstanceOf[js.Any], Token = Token.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImdsCredentials]
    }
    
    @scala.inline
    implicit class ImdsCredentialsMutableBuilder[Self <: ImdsCredentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessKeyId(value: String): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiration(value: String): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretAccessKey(value: String): Self = StObject.set(x, "SecretAccessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
    }
  }
}
