package typings.consumerDataStandards.registerMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseOpenIDProviderConfigMetadata
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * JSON array containing a list of the Claim Names of the Claims that the CDR Register supplies values for
    */
  var claims_supported: js.Array[String]
  
  /**
    * JSON array containing a list of Proof Key for Code Exchange (PKCE) **[[RFC7636]](#nref-RFC7636)** code challenge methods supported by this authorization server. Given the CDR Register does not support PKCE, this field can be safely ignored
    */
  var code_challenge_methods_supported: js.Array[String]
  
  /**
    * JSON array containing a list of the OAuth 2.0 Grant Type values that the CDR Register supports
    */
  var grant_types_supported: js.Array[String]
  
  /**
    * JSON array containing a list of the JWS signing algorithms (alg values) supported by the CDR Register for the ID Token to encode the Claims in a JWT. Given the CDR Register does not issue ID tokens, this field can be safely ignored
    */
  var id_token_signing_alg_values_supported: js.Array[String]
  
  /**
    * URL using the https scheme with no query or fragment component that the CDR Register asserts as its Issuer Identifier
    */
  var issuer: String
  
  /**
    * URL of the CDR Register's JSON Web Key Set **[[JWK]](#nref-JWK)** document. This contains the signing key(s) used to validate access tokens issued from the CDR Register. Note that this differs from the JWKS endpoint used to validate SSAs and CDR Register client authentication
    */
  var jwks_uri: String
  
  /**
    * JSON array containing a list of the OAuth 2.0 response_type values that the CDR Registrer supports
    */
  var response_types_supported: js.Array[String]
  
  /**
    * JSON array containing a list of the OAuth 2.0 **[[RFC6749]](#nref-RFC6749)** scope values that the CDR Register supports
    */
  var scopes_supported: js.Array[String]
  
  /**
    * JSON array containing a list of the Subject Identifier types that the CDR Register supports. Given the CDR Register does not issue ID tokens, this field can be safely ignored
    */
  var subject_types_supported: js.Array[String]
  
  /**
    * Boolean value indicating server support for mutual TLS client certificate bound access tokens
    */
  var tls_client_certificate_bound_access_tokens: Boolean
  
  /**
    * URL of the CDR Register's OAuth 2.0 Token Endpoint
    */
  var token_endpoint: String
  
  /**
    * JSON array containing a list of Client Authentication methods supported by this Token Endpoint
    */
  var token_endpoint_auth_methods_supported: js.Array[String]
  
  /**
    * JSON array containing a list of the JWS signing algorithms (alg values) supported by the token endpoint for the signature on the JWT **[[JWT]](#nref-JWT)** used to authenticate the client at the token endpoint for the \"private_key_jwt\" authentication method
    */
  var token_endpoint_auth_signing_alg_values_supported: js.Array[String]
}
object ResponseOpenIDProviderConfigMetadata {
  
  inline def apply(
    claims_supported: js.Array[String],
    code_challenge_methods_supported: js.Array[String],
    grant_types_supported: js.Array[String],
    id_token_signing_alg_values_supported: js.Array[String],
    issuer: String,
    jwks_uri: String,
    response_types_supported: js.Array[String],
    scopes_supported: js.Array[String],
    subject_types_supported: js.Array[String],
    tls_client_certificate_bound_access_tokens: Boolean,
    token_endpoint: String,
    token_endpoint_auth_methods_supported: js.Array[String],
    token_endpoint_auth_signing_alg_values_supported: js.Array[String]
  ): ResponseOpenIDProviderConfigMetadata = {
    val __obj = js.Dynamic.literal(claims_supported = claims_supported.asInstanceOf[js.Any], code_challenge_methods_supported = code_challenge_methods_supported.asInstanceOf[js.Any], grant_types_supported = grant_types_supported.asInstanceOf[js.Any], id_token_signing_alg_values_supported = id_token_signing_alg_values_supported.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], jwks_uri = jwks_uri.asInstanceOf[js.Any], response_types_supported = response_types_supported.asInstanceOf[js.Any], scopes_supported = scopes_supported.asInstanceOf[js.Any], subject_types_supported = subject_types_supported.asInstanceOf[js.Any], tls_client_certificate_bound_access_tokens = tls_client_certificate_bound_access_tokens.asInstanceOf[js.Any], token_endpoint = token_endpoint.asInstanceOf[js.Any], token_endpoint_auth_methods_supported = token_endpoint_auth_methods_supported.asInstanceOf[js.Any], token_endpoint_auth_signing_alg_values_supported = token_endpoint_auth_signing_alg_values_supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseOpenIDProviderConfigMetadata]
  }
  
  extension [Self <: ResponseOpenIDProviderConfigMetadata](x: Self) {
    
    inline def setClaims_supported(value: js.Array[String]): Self = StObject.set(x, "claims_supported", value.asInstanceOf[js.Any])
    
    inline def setClaims_supportedVarargs(value: String*): Self = StObject.set(x, "claims_supported", js.Array(value*))
    
    inline def setCode_challenge_methods_supported(value: js.Array[String]): Self = StObject.set(x, "code_challenge_methods_supported", value.asInstanceOf[js.Any])
    
    inline def setCode_challenge_methods_supportedVarargs(value: String*): Self = StObject.set(x, "code_challenge_methods_supported", js.Array(value*))
    
    inline def setGrant_types_supported(value: js.Array[String]): Self = StObject.set(x, "grant_types_supported", value.asInstanceOf[js.Any])
    
    inline def setGrant_types_supportedVarargs(value: String*): Self = StObject.set(x, "grant_types_supported", js.Array(value*))
    
    inline def setId_token_signing_alg_values_supported(value: js.Array[String]): Self = StObject.set(x, "id_token_signing_alg_values_supported", value.asInstanceOf[js.Any])
    
    inline def setId_token_signing_alg_values_supportedVarargs(value: String*): Self = StObject.set(x, "id_token_signing_alg_values_supported", js.Array(value*))
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setJwks_uri(value: String): Self = StObject.set(x, "jwks_uri", value.asInstanceOf[js.Any])
    
    inline def setResponse_types_supported(value: js.Array[String]): Self = StObject.set(x, "response_types_supported", value.asInstanceOf[js.Any])
    
    inline def setResponse_types_supportedVarargs(value: String*): Self = StObject.set(x, "response_types_supported", js.Array(value*))
    
    inline def setScopes_supported(value: js.Array[String]): Self = StObject.set(x, "scopes_supported", value.asInstanceOf[js.Any])
    
    inline def setScopes_supportedVarargs(value: String*): Self = StObject.set(x, "scopes_supported", js.Array(value*))
    
    inline def setSubject_types_supported(value: js.Array[String]): Self = StObject.set(x, "subject_types_supported", value.asInstanceOf[js.Any])
    
    inline def setSubject_types_supportedVarargs(value: String*): Self = StObject.set(x, "subject_types_supported", js.Array(value*))
    
    inline def setTls_client_certificate_bound_access_tokens(value: Boolean): Self = StObject.set(x, "tls_client_certificate_bound_access_tokens", value.asInstanceOf[js.Any])
    
    inline def setToken_endpoint(value: String): Self = StObject.set(x, "token_endpoint", value.asInstanceOf[js.Any])
    
    inline def setToken_endpoint_auth_methods_supported(value: js.Array[String]): Self = StObject.set(x, "token_endpoint_auth_methods_supported", value.asInstanceOf[js.Any])
    
    inline def setToken_endpoint_auth_methods_supportedVarargs(value: String*): Self = StObject.set(x, "token_endpoint_auth_methods_supported", js.Array(value*))
    
    inline def setToken_endpoint_auth_signing_alg_values_supported(value: js.Array[String]): Self = StObject.set(x, "token_endpoint_auth_signing_alg_values_supported", value.asInstanceOf[js.Any])
    
    inline def setToken_endpoint_auth_signing_alg_values_supportedVarargs(value: String*): Self = StObject.set(x, "token_endpoint_auth_signing_alg_values_supported", js.Array(value*))
  }
}
