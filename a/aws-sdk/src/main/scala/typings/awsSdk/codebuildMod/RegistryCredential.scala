package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegistryCredential extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) or name of credentials created using Secrets Manager.    The credential can use the name of the credentials only if they exist in your current Amazon Web Services Region.  
    */
  var credential: NonEmptyString
  
  /**
    *  The service that created the credentials to access a private Docker registry. The valid value, SECRETS_MANAGER, is for Secrets Manager. 
    */
  var credentialProvider: CredentialProviderType
}
object RegistryCredential {
  
  inline def apply(credential: NonEmptyString, credentialProvider: CredentialProviderType): RegistryCredential = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], credentialProvider = credentialProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistryCredential]
  }
  
  extension [Self <: RegistryCredential](x: Self) {
    
    inline def setCredential(value: NonEmptyString): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    inline def setCredentialProvider(value: CredentialProviderType): Self = StObject.set(x, "credentialProvider", value.asInstanceOf[js.Any])
  }
}
