package typings.awsSdkCredentialProviderCognitoIdentity

import typings.awsSdkClientCognitoIdentity.mod.CognitoIdentityClient
import typings.awsSdkCredentialProviderCognitoIdentity.distTypesCognitoProviderParametersMod.CognitoProviderParameters
import typings.awsSdkTypes.distTypesCredentialsMod.Credentials
import typings.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFromCognitoIdentityMod {
  
  @JSImport("@aws-sdk/credential-provider-cognito-identity/dist-types/fromCognitoIdentity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromCognitoIdentity(parameters: FromCognitoIdentityParameters): CognitoIdentityCredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCognitoIdentity")(parameters.asInstanceOf[js.Any]).asInstanceOf[CognitoIdentityCredentialProvider]
  
  type CognitoIdentityCredentialProvider = Provider[CognitoIdentityCredentials]
  
  trait CognitoIdentityCredentials
    extends StObject
       with Credentials {
    
    /**
      * The Cognito ID returned by the last call to AWS.CognitoIdentity.getOpenIdToken().
      */
    var identityId: String
  }
  object CognitoIdentityCredentials {
    
    inline def apply(accessKeyId: String, identityId: String, secretAccessKey: String): CognitoIdentityCredentials = {
      val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], identityId = identityId.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[CognitoIdentityCredentials]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CognitoIdentityCredentials] (val x: Self) extends AnyVal {
      
      inline def setIdentityId(value: String): Self = StObject.set(x, "identityId", value.asInstanceOf[js.Any])
    }
  }
  
  trait FromCognitoIdentityParameters
    extends StObject
       with CognitoProviderParameters {
    
    /**
      * The unique identifier for the identity against which credentials will be
      * issued.
      */
    var identityId: String
  }
  object FromCognitoIdentityParameters {
    
    inline def apply(client: CognitoIdentityClient, identityId: String): FromCognitoIdentityParameters = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], identityId = identityId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FromCognitoIdentityParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FromCognitoIdentityParameters] (val x: Self) extends AnyVal {
      
      inline def setIdentityId(value: String): Self = StObject.set(x, "identityId", value.asInstanceOf[js.Any])
    }
  }
}
