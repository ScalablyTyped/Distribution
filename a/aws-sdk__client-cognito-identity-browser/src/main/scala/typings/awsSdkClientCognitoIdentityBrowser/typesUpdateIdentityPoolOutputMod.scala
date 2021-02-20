package typings.awsSdkClientCognitoIdentityBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesCognitoIdentityProviderMod.UnmarshalledCognitoIdentityProvider
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateIdentityPoolOutputMod {
  
  @js.native
  trait UpdateIdentityPoolOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>TRUE if the identity pool supports unauthenticated logins.</p>
      */
    var AllowUnauthenticatedIdentities: Boolean = js.native
    
    /**
      * <p>A list representing an Amazon Cognito Identity User Pool and its client ID.</p>
      */
    var CognitoIdentityProviders: js.UndefOr[js.Array[UnmarshalledCognitoIdentityProvider]] = js.native
    
    /**
      * <p>The "domain" by which Cognito will refer to your users.</p>
      */
    var DeveloperProviderName: js.UndefOr[String] = js.native
    
    /**
      * <p>An identity pool ID in the format REGION:GUID.</p>
      */
    var IdentityPoolId: String = js.native
    
    /**
      * <p>A string that you provide.</p>
      */
    var IdentityPoolName: String = js.native
    
    /**
      * <p>A list of OpendID Connect provider ARNs.</p>
      */
    var OpenIdConnectProviderARNs: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * <p>An array of Amazon Resource Names (ARNs) of the SAML provider for your identity pool.</p>
      */
    var SamlProviderARNs: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * <p>Optional key:value pairs mapping provider names to provider app IDs.</p>
      */
    var SupportedLoginProviders: js.UndefOr[StringDictionary[String]] = js.native
  }
  object UpdateIdentityPoolOutput {
    
    @scala.inline
    def apply(
      $metadata: ResponseMetadata,
      AllowUnauthenticatedIdentities: Boolean,
      IdentityPoolId: String,
      IdentityPoolName: String
    ): UpdateIdentityPoolOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], AllowUnauthenticatedIdentities = AllowUnauthenticatedIdentities.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], IdentityPoolName = IdentityPoolName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateIdentityPoolOutput]
    }
    
    @scala.inline
    implicit class UpdateIdentityPoolOutputMutableBuilder[Self <: UpdateIdentityPoolOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUnauthenticatedIdentities(value: Boolean): Self = StObject.set(x, "AllowUnauthenticatedIdentities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCognitoIdentityProviders(value: js.Array[UnmarshalledCognitoIdentityProvider]): Self = StObject.set(x, "CognitoIdentityProviders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCognitoIdentityProvidersUndefined: Self = StObject.set(x, "CognitoIdentityProviders", js.undefined)
      
      @scala.inline
      def setCognitoIdentityProvidersVarargs(value: UnmarshalledCognitoIdentityProvider*): Self = StObject.set(x, "CognitoIdentityProviders", js.Array(value :_*))
      
      @scala.inline
      def setDeveloperProviderName(value: String): Self = StObject.set(x, "DeveloperProviderName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeveloperProviderNameUndefined: Self = StObject.set(x, "DeveloperProviderName", js.undefined)
      
      @scala.inline
      def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityPoolName(value: String): Self = StObject.set(x, "IdentityPoolName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenIdConnectProviderARNs(value: js.Array[String]): Self = StObject.set(x, "OpenIdConnectProviderARNs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenIdConnectProviderARNsUndefined: Self = StObject.set(x, "OpenIdConnectProviderARNs", js.undefined)
      
      @scala.inline
      def setOpenIdConnectProviderARNsVarargs(value: String*): Self = StObject.set(x, "OpenIdConnectProviderARNs", js.Array(value :_*))
      
      @scala.inline
      def setSamlProviderARNs(value: js.Array[String]): Self = StObject.set(x, "SamlProviderARNs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamlProviderARNsUndefined: Self = StObject.set(x, "SamlProviderARNs", js.undefined)
      
      @scala.inline
      def setSamlProviderARNsVarargs(value: String*): Self = StObject.set(x, "SamlProviderARNs", js.Array(value :_*))
      
      @scala.inline
      def setSupportedLoginProviders(value: StringDictionary[String]): Self = StObject.set(x, "SupportedLoginProviders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedLoginProvidersUndefined: Self = StObject.set(x, "SupportedLoginProviders", js.undefined)
    }
  }
}
