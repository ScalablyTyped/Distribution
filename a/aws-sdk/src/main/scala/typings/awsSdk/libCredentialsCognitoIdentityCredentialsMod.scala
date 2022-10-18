package typings.awsSdk

import typings.awsSdk.anon.LoginId
import typings.awsSdk.clientsCognitoidentityMod.GetCredentialsForIdentityResponse
import typings.awsSdk.clientsCognitoidentityMod.GetIdInput
import typings.awsSdk.clientsCognitoidentityMod.GetOpenIdTokenInput
import typings.awsSdk.clientsCognitoidentityMod.IdentityId
import typings.awsSdk.clientsCognitoidentityMod.IdentityPoolId
import typings.awsSdk.clientsStsMod.AssumeRoleWithWebIdentityRequest
import typings.awsSdk.clientsStsMod.AssumeRoleWithWebIdentityResponse
import typings.awsSdk.clientsStsMod.arnType
import typings.awsSdk.clientsStsMod.clientTokenType
import typings.awsSdk.clientsStsMod.roleSessionNameType
import typings.awsSdk.libConfigBaseMod.ConfigurationOptions
import typings.awsSdk.libCredentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCredentialsCognitoIdentityCredentialsMod {
  
  @js.native
  trait CognitoIdentityCredentials extends Credentials {
    
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
      - typings.awsSdk.clientsCognitoidentityMod.GetIdInput
      - typings.awsSdk.clientsCognitoidentityMod.GetCredentialsForIdentityInput
      - typings.awsSdk.clientsCognitoidentityMod.GetOpenIdTokenInput
      - typings.awsSdk.clientsStsMod.AssumeRoleWithWebIdentityRequest
    */
    trait CognitoIdentityCredentialsInputs extends StObject
    object CognitoIdentityCredentialsInputs {
      
      inline def AssumeRoleWithWebIdentityRequest(RoleArn: arnType, RoleSessionName: roleSessionNameType, WebIdentityToken: clientTokenType): typings.awsSdk.clientsStsMod.AssumeRoleWithWebIdentityRequest = {
        val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], RoleSessionName = RoleSessionName.asInstanceOf[js.Any], WebIdentityToken = WebIdentityToken.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.awsSdk.clientsStsMod.AssumeRoleWithWebIdentityRequest]
      }
      
      inline def GetCredentialsForIdentityInput(IdentityId: IdentityId): typings.awsSdk.clientsCognitoidentityMod.GetCredentialsForIdentityInput = {
        val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.awsSdk.clientsCognitoidentityMod.GetCredentialsForIdentityInput]
      }
      
      inline def GetIdInput(IdentityPoolId: IdentityPoolId): typings.awsSdk.clientsCognitoidentityMod.GetIdInput = {
        val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.awsSdk.clientsCognitoidentityMod.GetIdInput]
      }
      
      inline def GetOpenIdTokenInput(IdentityId: IdentityId): typings.awsSdk.clientsCognitoidentityMod.GetOpenIdTokenInput = {
        val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.awsSdk.clientsCognitoidentityMod.GetOpenIdTokenInput]
      }
    }
    
    type CognitoIdentityOptions = CognitoIdentityCredentialsInputs & LoginId
  }
}
