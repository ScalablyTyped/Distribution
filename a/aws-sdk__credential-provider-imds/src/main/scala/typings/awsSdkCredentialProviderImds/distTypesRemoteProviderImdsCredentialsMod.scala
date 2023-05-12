package typings.awsSdkCredentialProviderImds

import typings.awsSdkTypes.distTypesIdentityAwsCredentialIdentityMod.AwsCredentialIdentity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRemoteProviderImdsCredentialsMod {
  
  @JSImport("@aws-sdk/credential-provider-imds/dist-types/remoteProvider/ImdsCredentials", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromImdsCredentials(creds: ImdsCredentials): AwsCredentialIdentity = ^.asInstanceOf[js.Dynamic].applyDynamic("fromImdsCredentials")(creds.asInstanceOf[js.Any]).asInstanceOf[AwsCredentialIdentity]
  
  inline def isImdsCredentials(arg: Any): /* is @aws-sdk/credential-provider-imds.@aws-sdk/credential-provider-imds/dist-types/remoteProvider/ImdsCredentials.ImdsCredentials */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImdsCredentials")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is @aws-sdk/credential-provider-imds.@aws-sdk/credential-provider-imds/dist-types/remoteProvider/ImdsCredentials.ImdsCredentials */ Boolean]
  
  trait ImdsCredentials extends StObject {
    
    var AccessKeyId: String
    
    var Expiration: String
    
    var SecretAccessKey: String
    
    var Token: String
  }
  object ImdsCredentials {
    
    inline def apply(AccessKeyId: String, Expiration: String, SecretAccessKey: String, Token: String): ImdsCredentials = {
      val __obj = js.Dynamic.literal(AccessKeyId = AccessKeyId.asInstanceOf[js.Any], Expiration = Expiration.asInstanceOf[js.Any], SecretAccessKey = SecretAccessKey.asInstanceOf[js.Any], Token = Token.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImdsCredentials]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImdsCredentials] (val x: Self) extends AnyVal {
      
      inline def setAccessKeyId(value: String): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
      
      inline def setExpiration(value: String): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
      
      inline def setSecretAccessKey(value: String): Self = StObject.set(x, "SecretAccessKey", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
    }
  }
}
