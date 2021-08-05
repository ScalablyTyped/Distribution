package typings.awsSdkClientCognitoIdentityBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesCognitoIdentityProviderMod.CognitoIdentityProvider
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateIdentityPoolInputMod {
  
  trait CreateIdentityPoolInput
    extends StObject
       with InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ] = js.undefined
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>TRUE if the identity pool supports unauthenticated logins.</p>
      */
    var AllowUnauthenticatedIdentities: Boolean
    
    /**
      * <p>An array of Amazon Cognito Identity user pools and their client IDs.</p>
      */
    var CognitoIdentityProviders: js.UndefOr[js.Array[CognitoIdentityProvider] | Iterable[CognitoIdentityProvider]] = js.undefined
    
    /**
      * <p>The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your backend and the Cognito service to communicate about the developer provider. For the <code>DeveloperProviderName</code>, you can use letters as well as period (<code>.</code>), underscore (<code>_</code>), and dash (<code>-</code>).</p> <p>Once you have set a developer provider name, you cannot change it. Please take care in setting this parameter.</p>
      */
    var DeveloperProviderName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>A string that you provide.</p>
      */
    var IdentityPoolName: String
    
    /**
      * <p>A list of OpendID Connect provider ARNs.</p>
      */
    var OpenIdConnectProviderARNs: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
    
    /**
      * <p>An array of Amazon Resource Names (ARNs) of the SAML provider for your identity pool.</p>
      */
    var SamlProviderARNs: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
    
    /**
      * <p>Optional key:value pairs mapping provider names to provider app IDs.</p>
      */
    var SupportedLoginProviders: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.undefined
  }
  object CreateIdentityPoolInput {
    
    inline def apply(AllowUnauthenticatedIdentities: Boolean, IdentityPoolName: String): CreateIdentityPoolInput = {
      val __obj = js.Dynamic.literal(AllowUnauthenticatedIdentities = AllowUnauthenticatedIdentities.asInstanceOf[js.Any], IdentityPoolName = IdentityPoolName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateIdentityPoolInput]
    }
    
    extension [Self <: CreateIdentityPoolInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setAllowUnauthenticatedIdentities(value: Boolean): Self = StObject.set(x, "AllowUnauthenticatedIdentities", value.asInstanceOf[js.Any])
      
      inline def setCognitoIdentityProviders(value: js.Array[CognitoIdentityProvider] | Iterable[CognitoIdentityProvider]): Self = StObject.set(x, "CognitoIdentityProviders", value.asInstanceOf[js.Any])
      
      inline def setCognitoIdentityProvidersUndefined: Self = StObject.set(x, "CognitoIdentityProviders", js.undefined)
      
      inline def setCognitoIdentityProvidersVarargs(value: CognitoIdentityProvider*): Self = StObject.set(x, "CognitoIdentityProviders", js.Array(value :_*))
      
      inline def setDeveloperProviderName(value: String): Self = StObject.set(x, "DeveloperProviderName", value.asInstanceOf[js.Any])
      
      inline def setDeveloperProviderNameUndefined: Self = StObject.set(x, "DeveloperProviderName", js.undefined)
      
      inline def setIdentityPoolName(value: String): Self = StObject.set(x, "IdentityPoolName", value.asInstanceOf[js.Any])
      
      inline def setOpenIdConnectProviderARNs(value: js.Array[String] | Iterable[String]): Self = StObject.set(x, "OpenIdConnectProviderARNs", value.asInstanceOf[js.Any])
      
      inline def setOpenIdConnectProviderARNsUndefined: Self = StObject.set(x, "OpenIdConnectProviderARNs", js.undefined)
      
      inline def setOpenIdConnectProviderARNsVarargs(value: String*): Self = StObject.set(x, "OpenIdConnectProviderARNs", js.Array(value :_*))
      
      inline def setSamlProviderARNs(value: js.Array[String] | Iterable[String]): Self = StObject.set(x, "SamlProviderARNs", value.asInstanceOf[js.Any])
      
      inline def setSamlProviderARNsUndefined: Self = StObject.set(x, "SamlProviderARNs", js.undefined)
      
      inline def setSamlProviderARNsVarargs(value: String*): Self = StObject.set(x, "SamlProviderARNs", js.Array(value :_*))
      
      inline def setSupportedLoginProviders(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "SupportedLoginProviders", value.asInstanceOf[js.Any])
      
      inline def setSupportedLoginProvidersUndefined: Self = StObject.set(x, "SupportedLoginProviders", js.undefined)
    }
  }
}
