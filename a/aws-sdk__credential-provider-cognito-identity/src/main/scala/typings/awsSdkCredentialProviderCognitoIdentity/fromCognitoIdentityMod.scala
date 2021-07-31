package typings.awsSdkCredentialProviderCognitoIdentity

import typings.awsSdkClientCognitoIdentity.mod.CognitoIdentityClient
import typings.awsSdkCredentialProviderCognitoIdentity.cognitoProviderParametersMod.CognitoProviderParameters
import typings.awsSdkTypes.credentialsMod.CredentialProvider
import typings.awsSdkTypes.credentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromCognitoIdentityMod {
  
  @JSImport("@aws-sdk/credential-provider-cognito-identity/dist/cjs/fromCognitoIdentity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromCognitoIdentity(parameters: FromCognitoIdentityParameters): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCognitoIdentity")(parameters.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
  
  trait CognitoIdentityCredentials
    extends StObject
       with Credentials {
    
    /**
      * The Cognito ID returned by the last call to AWS.CognitoIdentity.getOpenIdToken().
      */
    var identityId: String
  }
  object CognitoIdentityCredentials {
    
    @scala.inline
    def apply(accessKeyId: String, identityId: String, secretAccessKey: String): CognitoIdentityCredentials = {
      val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], identityId = identityId.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[CognitoIdentityCredentials]
    }
    
    @scala.inline
    implicit class CognitoIdentityCredentialsMutableBuilder[Self <: CognitoIdentityCredentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentityId(value: String): Self = StObject.set(x, "identityId", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(client: CognitoIdentityClient, identityId: String): FromCognitoIdentityParameters = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], identityId = identityId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FromCognitoIdentityParameters]
    }
    
    @scala.inline
    implicit class FromCognitoIdentityParametersMutableBuilder[Self <: FromCognitoIdentityParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentityId(value: String): Self = StObject.set(x, "identityId", value.asInstanceOf[js.Any])
    }
  }
}
