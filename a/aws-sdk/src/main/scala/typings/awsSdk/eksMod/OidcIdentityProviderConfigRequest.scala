package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OidcIdentityProviderConfigRequest extends StObject {
  
  /**
    * This is also known as audience. The ID for the client application that makes authentication requests to the OpenID identity provider.
    */
  var clientId: String
  
  /**
    * The JWT claim that the provider uses to return your groups.
    */
  var groupsClaim: js.UndefOr[String] = js.undefined
  
  /**
    * The prefix that is prepended to group claims to prevent clashes with existing names (such as system: groups). For example, the value oidc: will create group names like oidc:engineering and oidc:infra.
    */
  var groupsPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the OIDC provider configuration.
    */
  var identityProviderConfigName: String
  
  /**
    * The URL of the OpenID identity provider that allows the API server to discover public signing keys for verifying tokens. The URL must begin with https:// and should correspond to the iss claim in the provider's OIDC ID tokens. Per the OIDC standard, path components are allowed but query parameters are not. Typically the URL consists of only a hostname, like https://server.example.org or https://example.com. This URL should point to the level below .well-known/openid-configuration and must be publicly accessible over the internet.
    */
  var issuerUrl: String
  
  /**
    * The key value pairs that describe required claims in the identity token. If set, each claim is verified to be present in the token with a matching value. For the maximum number of claims that you can require, see Amazon EKS service quotas in the Amazon EKS User Guide.
    */
  var requiredClaims: js.UndefOr[requiredClaimsMap] = js.undefined
  
  /**
    * The JSON Web Token (JWT) claim to use as the username. The default is sub, which is expected to be a unique identifier of the end user. You can choose other claims, such as email or name, depending on the OpenID identity provider. Claims other than email are prefixed with the issuer URL to prevent naming clashes with other plug-ins.
    */
  var usernameClaim: js.UndefOr[String] = js.undefined
  
  /**
    * The prefix that is prepended to username claims to prevent clashes with existing names. If you do not provide this field, and username is a value other than email, the prefix defaults to issuerurl#. You can use the value - to disable all prefixing.
    */
  var usernamePrefix: js.UndefOr[String] = js.undefined
}
object OidcIdentityProviderConfigRequest {
  
  inline def apply(clientId: String, identityProviderConfigName: String, issuerUrl: String): OidcIdentityProviderConfigRequest = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], identityProviderConfigName = identityProviderConfigName.asInstanceOf[js.Any], issuerUrl = issuerUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OidcIdentityProviderConfigRequest]
  }
  
  extension [Self <: OidcIdentityProviderConfigRequest](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setGroupsClaim(value: String): Self = StObject.set(x, "groupsClaim", value.asInstanceOf[js.Any])
    
    inline def setGroupsClaimUndefined: Self = StObject.set(x, "groupsClaim", js.undefined)
    
    inline def setGroupsPrefix(value: String): Self = StObject.set(x, "groupsPrefix", value.asInstanceOf[js.Any])
    
    inline def setGroupsPrefixUndefined: Self = StObject.set(x, "groupsPrefix", js.undefined)
    
    inline def setIdentityProviderConfigName(value: String): Self = StObject.set(x, "identityProviderConfigName", value.asInstanceOf[js.Any])
    
    inline def setIssuerUrl(value: String): Self = StObject.set(x, "issuerUrl", value.asInstanceOf[js.Any])
    
    inline def setRequiredClaims(value: requiredClaimsMap): Self = StObject.set(x, "requiredClaims", value.asInstanceOf[js.Any])
    
    inline def setRequiredClaimsUndefined: Self = StObject.set(x, "requiredClaims", js.undefined)
    
    inline def setUsernameClaim(value: String): Self = StObject.set(x, "usernameClaim", value.asInstanceOf[js.Any])
    
    inline def setUsernameClaimUndefined: Self = StObject.set(x, "usernameClaim", js.undefined)
    
    inline def setUsernamePrefix(value: String): Self = StObject.set(x, "usernamePrefix", value.asInstanceOf[js.Any])
    
    inline def setUsernamePrefixUndefined: Self = StObject.set(x, "usernamePrefix", js.undefined)
  }
}
