package typings.awsSdk

import typings.awsSdk.anon.LoginId
import typings.awsSdk.cognitoIdentityCredentialsMod.CognitoIdentityCredentials.CognitoIdentityOptions
import typings.awsSdk.cognitoidentityMod.GetCredentialsForIdentityResponse
import typings.awsSdk.cognitoidentityMod.GetIdInput
import typings.awsSdk.cognitoidentityMod.GetOpenIdTokenInput
import typings.awsSdk.cognitoidentityMod.IdentityId
import typings.awsSdk.cognitoidentityMod.IdentityPoolId
import typings.awsSdk.configBaseMod.ConfigurationOptions
import typings.awsSdk.credentialsMod.Credentials
import typings.awsSdk.stsMod.AssumeRoleWithWebIdentityRequest
import typings.awsSdk.stsMod.AssumeRoleWithWebIdentityResponse
import typings.awsSdk.stsMod.arnType
import typings.awsSdk.stsMod.clientTokenType
import typings.awsSdk.stsMod.roleSessionNameType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cognitoIdentityCredentialsMod {
  
  @JSImport("aws-sdk/lib/credentials/cognito_identity_credentials", "CognitoIdentityCredentials")
  @js.native
  /**
    * Creates a new credentials object.
    */
  class CognitoIdentityCredentials () extends Credentials {
    /**
      * Creates a new credentials object with optional configuration.
      */
    def this(options: CognitoIdentityOptions) = this()
    def this(options: CognitoIdentityOptions, clientConfig: ConfigurationOptions) = this()
    
    /**
      * Clears the cached Cognito ID associated with the currently configured identity pool ID.
      */
    def clearCachedId(): Unit = js.native
    
    /**
      * The raw data response from the call to AWS.CognitoIdentity.getCredentialsForIdentity(), or AWS.STS.assumeRoleWithWebIdentity().
      */
    var data: GetCredentialsForIdentityResponse | AssumeRoleWithWebIdentityResponse = js.native
    
    /**
      * The Cognito ID returned by the last call to AWS.CognitoIdentity.getOpenIdToken().
      */
    var identityId: String = js.native
    
    /**
      * The map of params passed to AWS.CognitoIdentity.getId(), AWS.CognitoIdentity.getOpenIdToken(), and AWS.STS.assumeRoleWithWebIdentity().
      */
    var params: GetIdInput | GetOpenIdTokenInput | AssumeRoleWithWebIdentityRequest = js.native
  }
  // Needed to expose interfaces on the class
  object CognitoIdentityCredentials {
    
    type ClientConfiguration = ConfigurationOptions
    
    /* Rewritten from type alias, can be one of: 
      - typings.awsSdk.cognitoidentityMod.GetIdInput
      - typings.awsSdk.cognitoidentityMod.GetCredentialsForIdentityInput
      - typings.awsSdk.cognitoidentityMod.GetOpenIdTokenInput
      - typings.awsSdk.stsMod.AssumeRoleWithWebIdentityRequest
    */
    trait CognitoIdentityCredentialsInputs extends StObject
    object CognitoIdentityCredentialsInputs {
      
      @scala.inline
      def AssumeRoleWithWebIdentityRequest(RoleArn: arnType, RoleSessionName: roleSessionNameType, WebIdentityToken: clientTokenType): typings.awsSdk.stsMod.AssumeRoleWithWebIdentityRequest = {
        val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], RoleSessionName = RoleSessionName.asInstanceOf[js.Any], WebIdentityToken = WebIdentityToken.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.awsSdk.stsMod.AssumeRoleWithWebIdentityRequest]
      }
      
      @scala.inline
      def GetCredentialsForIdentityInput(IdentityId: IdentityId): typings.awsSdk.cognitoidentityMod.GetCredentialsForIdentityInput = {
        val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.awsSdk.cognitoidentityMod.GetCredentialsForIdentityInput]
      }
      
      @scala.inline
      def GetIdInput(IdentityPoolId: IdentityPoolId): typings.awsSdk.cognitoidentityMod.GetIdInput = {
        val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.awsSdk.cognitoidentityMod.GetIdInput]
      }
      
      @scala.inline
      def GetOpenIdTokenInput(IdentityId: IdentityId): typings.awsSdk.cognitoidentityMod.GetOpenIdTokenInput = {
        val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.awsSdk.cognitoidentityMod.GetOpenIdTokenInput]
      }
    }
    
    type CognitoIdentityOptions = CognitoIdentityCredentialsInputs & LoginId
  }
}
