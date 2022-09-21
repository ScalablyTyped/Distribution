package typings.azureMsalNode

import typings.azureMsalCommon.clientConfigurationMod.ApplicationTelemetry
import typings.azureMsalCommon.clientConfigurationMod.AzureCloudOptions
import typings.azureMsalCommon.clientConfigurationMod.LoggerOptions
import typings.azureMsalCommon.constantsMod.AuthenticationScheme
import typings.azureMsalCommon.inetworkmoduleMod.INetworkModule
import typings.azureMsalCommon.protocolModeMod.ProtocolMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Code extends StObject {
    
    var code: String
    
    var desc: String
  }
  object Code {
    
    inline def apply(code: String, desc: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@azure/msal-common.@azure/msal-common.BaseAuthRequest> */
  trait PartialBaseAuthRequest extends StObject {
    
    var authenticationScheme: js.UndefOr[AuthenticationScheme] = js.undefined
    
    var authority: js.UndefOr[String] = js.undefined
    
    var azureCloudOptions: js.UndefOr[AzureCloudOptions] = js.undefined
    
    var claims: js.UndefOr[String] = js.undefined
    
    var correlationId: js.UndefOr[String] = js.undefined
    
    var requestedClaimsHash: js.UndefOr[String] = js.undefined
    
    var resourceRequestMethod: js.UndefOr[String] = js.undefined
    
    var resourceRequestUri: js.UndefOr[String] = js.undefined
    
    var scopes: js.UndefOr[js.Array[String]] = js.undefined
    
    var shrClaims: js.UndefOr[String] = js.undefined
    
    var shrNonce: js.UndefOr[String] = js.undefined
    
    var sshJwk: js.UndefOr[String] = js.undefined
    
    var sshKid: js.UndefOr[String] = js.undefined
  }
  object PartialBaseAuthRequest {
    
    inline def apply(): PartialBaseAuthRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialBaseAuthRequest]
    }
    
    extension [Self <: PartialBaseAuthRequest](x: Self) {
      
      inline def setAuthenticationScheme(value: AuthenticationScheme): Self = StObject.set(x, "authenticationScheme", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationSchemeUndefined: Self = StObject.set(x, "authenticationScheme", js.undefined)
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
      
      inline def setAzureCloudOptions(value: AzureCloudOptions): Self = StObject.set(x, "azureCloudOptions", value.asInstanceOf[js.Any])
      
      inline def setAzureCloudOptionsUndefined: Self = StObject.set(x, "azureCloudOptions", js.undefined)
      
      inline def setClaims(value: String): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
      
      inline def setRequestedClaimsHash(value: String): Self = StObject.set(x, "requestedClaimsHash", value.asInstanceOf[js.Any])
      
      inline def setRequestedClaimsHashUndefined: Self = StObject.set(x, "requestedClaimsHash", js.undefined)
      
      inline def setResourceRequestMethod(value: String): Self = StObject.set(x, "resourceRequestMethod", value.asInstanceOf[js.Any])
      
      inline def setResourceRequestMethodUndefined: Self = StObject.set(x, "resourceRequestMethod", js.undefined)
      
      inline def setResourceRequestUri(value: String): Self = StObject.set(x, "resourceRequestUri", value.asInstanceOf[js.Any])
      
      inline def setResourceRequestUriUndefined: Self = StObject.set(x, "resourceRequestUri", js.undefined)
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setShrClaims(value: String): Self = StObject.set(x, "shrClaims", value.asInstanceOf[js.Any])
      
      inline def setShrClaimsUndefined: Self = StObject.set(x, "shrClaims", js.undefined)
      
      inline def setShrNonce(value: String): Self = StObject.set(x, "shrNonce", value.asInstanceOf[js.Any])
      
      inline def setShrNonceUndefined: Self = StObject.set(x, "shrNonce", js.undefined)
      
      inline def setSshJwk(value: String): Self = StObject.set(x, "sshJwk", value.asInstanceOf[js.Any])
      
      inline def setSshJwkUndefined: Self = StObject.set(x, "sshJwk", js.undefined)
      
      inline def setSshKid(value: String): Self = StObject.set(x, "sshKid", value.asInstanceOf[js.Any])
      
      inline def setSshKidUndefined: Self = StObject.set(x, "sshKid", js.undefined)
    }
  }
  
  trait PrivateKey extends StObject {
    
    var privateKey: String
    
    var thumbprint: String
    
    var x5c: js.UndefOr[String] = js.undefined
  }
  object PrivateKey {
    
    inline def apply(privateKey: String, thumbprint: String): PrivateKey = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], thumbprint = thumbprint.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrivateKey]
    }
    
    extension [Self <: PrivateKey](x: Self) {
      
      inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setThumbprint(value: String): Self = StObject.set(x, "thumbprint", value.asInstanceOf[js.Any])
      
      inline def setX5c(value: String): Self = StObject.set(x, "x5c", value.asInstanceOf[js.Any])
      
      inline def setX5cUndefined: Self = StObject.set(x, "x5c", js.undefined)
    }
  }
  
  /* Inlined std.Required<@azure/msal-node.@azure/msal-node/dist/config/Configuration.NodeAuthOptions> */
  trait RequiredNodeAuthOptions extends StObject {
    
    var authority: String
    
    var authorityMetadata: String
    
    var azureCloudOptions: AzureCloudOptions
    
    var clientAssertion: String
    
    var clientCapabilities: js.Array[String]
    
    var clientCertificate: PrivateKey
    
    var clientId: String
    
    var clientSecret: String
    
    var cloudDiscoveryMetadata: String
    
    var knownAuthorities: js.Array[String]
    
    var protocolMode: ProtocolMode
    
    var skipAuthorityMetadataCache: Boolean
  }
  object RequiredNodeAuthOptions {
    
    inline def apply(
      authority: String,
      authorityMetadata: String,
      azureCloudOptions: AzureCloudOptions,
      clientAssertion: String,
      clientCapabilities: js.Array[String],
      clientCertificate: PrivateKey,
      clientId: String,
      clientSecret: String,
      cloudDiscoveryMetadata: String,
      knownAuthorities: js.Array[String],
      protocolMode: ProtocolMode,
      skipAuthorityMetadataCache: Boolean
    ): RequiredNodeAuthOptions = {
      val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], authorityMetadata = authorityMetadata.asInstanceOf[js.Any], azureCloudOptions = azureCloudOptions.asInstanceOf[js.Any], clientAssertion = clientAssertion.asInstanceOf[js.Any], clientCapabilities = clientCapabilities.asInstanceOf[js.Any], clientCertificate = clientCertificate.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], cloudDiscoveryMetadata = cloudDiscoveryMetadata.asInstanceOf[js.Any], knownAuthorities = knownAuthorities.asInstanceOf[js.Any], protocolMode = protocolMode.asInstanceOf[js.Any], skipAuthorityMetadataCache = skipAuthorityMetadataCache.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredNodeAuthOptions]
    }
    
    extension [Self <: RequiredNodeAuthOptions](x: Self) {
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setAuthorityMetadata(value: String): Self = StObject.set(x, "authorityMetadata", value.asInstanceOf[js.Any])
      
      inline def setAzureCloudOptions(value: AzureCloudOptions): Self = StObject.set(x, "azureCloudOptions", value.asInstanceOf[js.Any])
      
      inline def setClientAssertion(value: String): Self = StObject.set(x, "clientAssertion", value.asInstanceOf[js.Any])
      
      inline def setClientCapabilities(value: js.Array[String]): Self = StObject.set(x, "clientCapabilities", value.asInstanceOf[js.Any])
      
      inline def setClientCapabilitiesVarargs(value: String*): Self = StObject.set(x, "clientCapabilities", js.Array(value*))
      
      inline def setClientCertificate(value: PrivateKey): Self = StObject.set(x, "clientCertificate", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setCloudDiscoveryMetadata(value: String): Self = StObject.set(x, "cloudDiscoveryMetadata", value.asInstanceOf[js.Any])
      
      inline def setKnownAuthorities(value: js.Array[String]): Self = StObject.set(x, "knownAuthorities", value.asInstanceOf[js.Any])
      
      inline def setKnownAuthoritiesVarargs(value: String*): Self = StObject.set(x, "knownAuthorities", js.Array(value*))
      
      inline def setProtocolMode(value: ProtocolMode): Self = StObject.set(x, "protocolMode", value.asInstanceOf[js.Any])
      
      inline def setSkipAuthorityMetadataCache(value: Boolean): Self = StObject.set(x, "skipAuthorityMetadataCache", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<@azure/msal-node.@azure/msal-node/dist/config/Configuration.NodeSystemOptions> */
  trait RequiredNodeSystemOptions extends StObject {
    
    var loggerOptions: LoggerOptions
    
    var networkClient: INetworkModule
    
    var proxyUrl: String
  }
  object RequiredNodeSystemOptions {
    
    inline def apply(loggerOptions: LoggerOptions, networkClient: INetworkModule, proxyUrl: String): RequiredNodeSystemOptions = {
      val __obj = js.Dynamic.literal(loggerOptions = loggerOptions.asInstanceOf[js.Any], networkClient = networkClient.asInstanceOf[js.Any], proxyUrl = proxyUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredNodeSystemOptions]
    }
    
    extension [Self <: RequiredNodeSystemOptions](x: Self) {
      
      inline def setLoggerOptions(value: LoggerOptions): Self = StObject.set(x, "loggerOptions", value.asInstanceOf[js.Any])
      
      inline def setNetworkClient(value: INetworkModule): Self = StObject.set(x, "networkClient", value.asInstanceOf[js.Any])
      
      inline def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<@azure/msal-node.@azure/msal-node/dist/config/Configuration.NodeTelemetryOptions> */
  trait RequiredNodeTelemetryOpti extends StObject {
    
    var application: ApplicationTelemetry
  }
  object RequiredNodeTelemetryOpti {
    
    inline def apply(application: ApplicationTelemetry): RequiredNodeTelemetryOpti = {
      val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredNodeTelemetryOpti]
    }
    
    extension [Self <: RequiredNodeTelemetryOpti](x: Self) {
      
      inline def setApplication(value: ApplicationTelemetry): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    }
  }
}
