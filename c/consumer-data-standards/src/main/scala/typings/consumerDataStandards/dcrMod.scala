package typings.consumerDataStandards

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.ES256
import typings.consumerDataStandards.consumerDataStandardsStrings.PS256
import typings.consumerDataStandards.consumerDataStandardsStrings.`code id_token`
import typings.consumerDataStandards.consumerDataStandardsStrings.authorization_code
import typings.consumerDataStandards.consumerDataStandardsStrings.client_credentials
import typings.consumerDataStandards.consumerDataStandardsStrings.invalid_client_metadata
import typings.consumerDataStandards.consumerDataStandardsStrings.invalid_redirect_uri
import typings.consumerDataStandards.consumerDataStandardsStrings.invalid_software_statement
import typings.consumerDataStandards.consumerDataStandardsStrings.private_key_jwt
import typings.consumerDataStandards.consumerDataStandardsStrings.refresh_token
import typings.consumerDataStandards.consumerDataStandardsStrings.unapproved_software_statement
import typings.consumerDataStandards.consumerDataStandardsStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dcrMod {
  
  trait ClientRegistration
    extends StObject
       with /* k */ StringDictionary[Any] {
    
    /**
      * Kind of the application. The only supported application type will be `web`
      */
    var application_type: js.UndefOr[web | Null] = js.undefined
    
    /**
      * 'Contains the Data Holder issuer value as described in the OIDC Discovery Document
      */
    var aud: String
    
    /**
      * Human-readable string name of the software product description to be presented to the end user during authorization
      */
    var client_description: String
    
    /**
      * Data Holder issued client identifier string
      */
    var client_id: String
    
    /**
      * Time at which the client identifier was issued expressed as seconds since 1970-01-01T00:00:00Z as measured in UTC
      */
    var client_id_issued_at: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Human-readable string name of the software product to be presented to the end-user during authorization
      */
    var client_name: String
    
    /**
      * URL string of a web page providing information about the client
      */
    var client_uri: String
    
    /**
      * The time at which the request expires expressed as seconds since 1970-01-01T00:00:00Z as measured in UTC
      */
    var exp: Double
    
    /**
      * Array of OAuth 2.0 grant type strings that the client can use at the token endpoint
      */
    var grant_types: js.Array[client_credentials | authorization_code | refresh_token]
    
    /**
      * The time at which the request was issued by the Data Recipient  expressed as seconds since 1970-01-01T00:00:00Z as measured in UTC
      */
    var iat: Double
    
    /**
      * JWE `alg` algorithm with which an id_token is to be encrypted
      */
    var id_token_encrypted_response_alg: String
    
    /**
      * JWE `enc` algorithm with which an id_token is to be encrypted
      */
    var id_token_encrypted_response_enc: String
    
    /**
      * Algorithm with which an id_token is to be signed
      */
    var id_token_signed_response_alg: js.UndefOr[PS256 | ES256 | Null] = js.undefined
    
    /**
      * Contains the identifier for the ADR Software Product (SoftwareProductId) as defined in the CDR Register
      */
    var iss: String
    
    /**
      * Unique identifier for the JWT, used to prevent replay of the token
      */
    var jti: String
    
    /**
      * URL string referencing the client JSON Web Key (JWK) Set **[[RFC7517]](#nref-RFC7517)** document, which contains the client public keys
      */
    var jwks_uri: String
    
    /**
      * A unique identifier string assigned by the CDR Register that identifies the Accredited Data Recipient Legal Entity
      */
    var legal_entity_id: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Human-readable string name of the Accredited Data Recipient Legal Entity
      */
    var legal_entity_name: js.UndefOr[String | Null] = js.undefined
    
    /**
      * URL string that references a logo for the client. If present, the server SHOULD display this image to the end-user during approval
      */
    var logo_uri: String
    
    /**
      * A unique identifier string assigned by the CDR Register that identifies the Accredited Data Recipient Brand
      */
    var org_id: String
    
    /**
      * Human-readable string name of the Accredited Data Recipient to be presented to the end user during authorization
      */
    var org_name: String
    
    /**
      * URL string that points to a human-readable policy document for the Software Product
      */
    var policy_uri: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Base URI for the Consumer Data Standard Data Recipient endpoints. This should be the base to provide reference to all other Data Recipient Endpoints
      */
    var recipient_base_uri: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Array of redirection URI strings for use in redirect-based flows. If used, redirect_uris MUST match or be a subset of the redirect_uris as defined in the SSA
      */
    var redirect_uris: js.Array[String]
    
    /**
      * Algorithm which the ADR expects to sign the request object if a request object will be part of the authorization request sent to the Data Holder
      */
    var request_object_signing_alg: PS256 | ES256
    
    /**
      * Array of the OAuth 2.0 response type strings that the client can use at the authorization endpoint.
      */
    var response_types: js.Array[`code id_token`]
    
    /**
      * URI string that references the location of the Software Product consent revocation endpoint
      */
    var revocation_uri: js.UndefOr[String | Null] = js.undefined
    
    /**
      * String containing a space-separated list of scope values that the client can use when requesting access tokens.
      */
    var scope: String
    
    /**
      * URL string referencing the client sector identifier URI, used as an optional input to the Pairwise Identifier
      */
    var sector_identifier_uri: js.UndefOr[String | Null] = js.undefined
    
    /**
      * String representing a unique identifier assigned by the Register and used by registration endpoints to identify the software product to be dynamically registered. </br></br>The "software_id" will remain the same for the lifetime of the product, across multiple updates and versions
      */
    var software_id: String
    
    /**
      * String containing a role of the software in the CDR Regime. Initially the only value used with be `data-recipient-software-product`
      */
    var software_roles: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The Software Statement Assertion, as defined in CDR standards
      */
    var software_statement: String
    
    /**
      * The requested authentication method for the token endpoint
      */
    var token_endpoint_auth_method: private_key_jwt
    
    /**
      * The algorithm used for signing the JWT
      */
    var token_endpoint_auth_signing_alg: PS256 | ES256
    
    /**
      * URL string that points to a human-readable terms of service document for the Software Product
      */
    var tos_uri: js.UndefOr[String | Null] = js.undefined
  }
  object ClientRegistration {
    
    inline def apply(
      aud: String,
      client_description: String,
      client_id: String,
      client_name: String,
      client_uri: String,
      exp: Double,
      grant_types: js.Array[client_credentials | authorization_code | refresh_token],
      iat: Double,
      id_token_encrypted_response_alg: String,
      id_token_encrypted_response_enc: String,
      iss: String,
      jti: String,
      jwks_uri: String,
      logo_uri: String,
      org_id: String,
      org_name: String,
      redirect_uris: js.Array[String],
      request_object_signing_alg: PS256 | ES256,
      response_types: js.Array[`code id_token`],
      scope: String,
      software_id: String,
      software_statement: String,
      token_endpoint_auth_signing_alg: PS256 | ES256
    ): ClientRegistration = {
      val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], client_description = client_description.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any], client_name = client_name.asInstanceOf[js.Any], client_uri = client_uri.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], grant_types = grant_types.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], id_token_encrypted_response_alg = id_token_encrypted_response_alg.asInstanceOf[js.Any], id_token_encrypted_response_enc = id_token_encrypted_response_enc.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], jti = jti.asInstanceOf[js.Any], jwks_uri = jwks_uri.asInstanceOf[js.Any], logo_uri = logo_uri.asInstanceOf[js.Any], org_id = org_id.asInstanceOf[js.Any], org_name = org_name.asInstanceOf[js.Any], redirect_uris = redirect_uris.asInstanceOf[js.Any], request_object_signing_alg = request_object_signing_alg.asInstanceOf[js.Any], response_types = response_types.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], software_id = software_id.asInstanceOf[js.Any], software_statement = software_statement.asInstanceOf[js.Any], token_endpoint_auth_method = "private_key_jwt", token_endpoint_auth_signing_alg = token_endpoint_auth_signing_alg.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientRegistration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientRegistration] (val x: Self) extends AnyVal {
      
      inline def setApplication_type(value: web): Self = StObject.set(x, "application_type", value.asInstanceOf[js.Any])
      
      inline def setApplication_typeNull: Self = StObject.set(x, "application_type", null)
      
      inline def setApplication_typeUndefined: Self = StObject.set(x, "application_type", js.undefined)
      
      inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setClient_description(value: String): Self = StObject.set(x, "client_description", value.asInstanceOf[js.Any])
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setClient_id_issued_at(value: Double): Self = StObject.set(x, "client_id_issued_at", value.asInstanceOf[js.Any])
      
      inline def setClient_id_issued_atNull: Self = StObject.set(x, "client_id_issued_at", null)
      
      inline def setClient_id_issued_atUndefined: Self = StObject.set(x, "client_id_issued_at", js.undefined)
      
      inline def setClient_name(value: String): Self = StObject.set(x, "client_name", value.asInstanceOf[js.Any])
      
      inline def setClient_uri(value: String): Self = StObject.set(x, "client_uri", value.asInstanceOf[js.Any])
      
      inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setGrant_types(value: js.Array[client_credentials | authorization_code | refresh_token]): Self = StObject.set(x, "grant_types", value.asInstanceOf[js.Any])
      
      inline def setGrant_typesVarargs(value: (client_credentials | authorization_code | refresh_token)*): Self = StObject.set(x, "grant_types", js.Array(value*))
      
      inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      inline def setId_token_encrypted_response_alg(value: String): Self = StObject.set(x, "id_token_encrypted_response_alg", value.asInstanceOf[js.Any])
      
      inline def setId_token_encrypted_response_enc(value: String): Self = StObject.set(x, "id_token_encrypted_response_enc", value.asInstanceOf[js.Any])
      
      inline def setId_token_signed_response_alg(value: PS256 | ES256): Self = StObject.set(x, "id_token_signed_response_alg", value.asInstanceOf[js.Any])
      
      inline def setId_token_signed_response_algNull: Self = StObject.set(x, "id_token_signed_response_alg", null)
      
      inline def setId_token_signed_response_algUndefined: Self = StObject.set(x, "id_token_signed_response_alg", js.undefined)
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
      
      inline def setJwks_uri(value: String): Self = StObject.set(x, "jwks_uri", value.asInstanceOf[js.Any])
      
      inline def setLegal_entity_id(value: String): Self = StObject.set(x, "legal_entity_id", value.asInstanceOf[js.Any])
      
      inline def setLegal_entity_idNull: Self = StObject.set(x, "legal_entity_id", null)
      
      inline def setLegal_entity_idUndefined: Self = StObject.set(x, "legal_entity_id", js.undefined)
      
      inline def setLegal_entity_name(value: String): Self = StObject.set(x, "legal_entity_name", value.asInstanceOf[js.Any])
      
      inline def setLegal_entity_nameNull: Self = StObject.set(x, "legal_entity_name", null)
      
      inline def setLegal_entity_nameUndefined: Self = StObject.set(x, "legal_entity_name", js.undefined)
      
      inline def setLogo_uri(value: String): Self = StObject.set(x, "logo_uri", value.asInstanceOf[js.Any])
      
      inline def setOrg_id(value: String): Self = StObject.set(x, "org_id", value.asInstanceOf[js.Any])
      
      inline def setOrg_name(value: String): Self = StObject.set(x, "org_name", value.asInstanceOf[js.Any])
      
      inline def setPolicy_uri(value: String): Self = StObject.set(x, "policy_uri", value.asInstanceOf[js.Any])
      
      inline def setPolicy_uriNull: Self = StObject.set(x, "policy_uri", null)
      
      inline def setPolicy_uriUndefined: Self = StObject.set(x, "policy_uri", js.undefined)
      
      inline def setRecipient_base_uri(value: String): Self = StObject.set(x, "recipient_base_uri", value.asInstanceOf[js.Any])
      
      inline def setRecipient_base_uriNull: Self = StObject.set(x, "recipient_base_uri", null)
      
      inline def setRecipient_base_uriUndefined: Self = StObject.set(x, "recipient_base_uri", js.undefined)
      
      inline def setRedirect_uris(value: js.Array[String]): Self = StObject.set(x, "redirect_uris", value.asInstanceOf[js.Any])
      
      inline def setRedirect_urisVarargs(value: String*): Self = StObject.set(x, "redirect_uris", js.Array(value*))
      
      inline def setRequest_object_signing_alg(value: PS256 | ES256): Self = StObject.set(x, "request_object_signing_alg", value.asInstanceOf[js.Any])
      
      inline def setResponse_types(value: js.Array[`code id_token`]): Self = StObject.set(x, "response_types", value.asInstanceOf[js.Any])
      
      inline def setResponse_typesVarargs(value: (`code id_token`)*): Self = StObject.set(x, "response_types", js.Array(value*))
      
      inline def setRevocation_uri(value: String): Self = StObject.set(x, "revocation_uri", value.asInstanceOf[js.Any])
      
      inline def setRevocation_uriNull: Self = StObject.set(x, "revocation_uri", null)
      
      inline def setRevocation_uriUndefined: Self = StObject.set(x, "revocation_uri", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setSector_identifier_uri(value: String): Self = StObject.set(x, "sector_identifier_uri", value.asInstanceOf[js.Any])
      
      inline def setSector_identifier_uriNull: Self = StObject.set(x, "sector_identifier_uri", null)
      
      inline def setSector_identifier_uriUndefined: Self = StObject.set(x, "sector_identifier_uri", js.undefined)
      
      inline def setSoftware_id(value: String): Self = StObject.set(x, "software_id", value.asInstanceOf[js.Any])
      
      inline def setSoftware_roles(value: String): Self = StObject.set(x, "software_roles", value.asInstanceOf[js.Any])
      
      inline def setSoftware_rolesNull: Self = StObject.set(x, "software_roles", null)
      
      inline def setSoftware_rolesUndefined: Self = StObject.set(x, "software_roles", js.undefined)
      
      inline def setSoftware_statement(value: String): Self = StObject.set(x, "software_statement", value.asInstanceOf[js.Any])
      
      inline def setToken_endpoint_auth_method(value: private_key_jwt): Self = StObject.set(x, "token_endpoint_auth_method", value.asInstanceOf[js.Any])
      
      inline def setToken_endpoint_auth_signing_alg(value: PS256 | ES256): Self = StObject.set(x, "token_endpoint_auth_signing_alg", value.asInstanceOf[js.Any])
      
      inline def setTos_uri(value: String): Self = StObject.set(x, "tos_uri", value.asInstanceOf[js.Any])
      
      inline def setTos_uriNull: Self = StObject.set(x, "tos_uri", null)
      
      inline def setTos_uriUndefined: Self = StObject.set(x, "tos_uri", js.undefined)
    }
  }
  
  type ClientRegistrationRequest = String
  
  trait RegistrationError
    extends StObject
       with /* k */ StringDictionary[Any] {
    
    /**
      * Predefined error code as described in [section 3.3 OIDC Dynamic Client Registration](https://openid.net/specs/openid-connect-registration-1_0.html)
      */
    var error: invalid_redirect_uri | invalid_client_metadata | invalid_software_statement | unapproved_software_statement
    
    /**
      * Additional text description of the error for debugging.
      */
    var error_description: js.UndefOr[String | Null] = js.undefined
  }
  object RegistrationError {
    
    inline def apply(
      error: invalid_redirect_uri | invalid_client_metadata | invalid_software_statement | unapproved_software_statement
    ): RegistrationError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegistrationError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegistrationError] (val x: Self) extends AnyVal {
      
      inline def setError(
        value: invalid_redirect_uri | invalid_client_metadata | invalid_software_statement | unapproved_software_statement
      ): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setError_description(value: String): Self = StObject.set(x, "error_description", value.asInstanceOf[js.Any])
      
      inline def setError_descriptionNull: Self = StObject.set(x, "error_description", null)
      
      inline def setError_descriptionUndefined: Self = StObject.set(x, "error_description", js.undefined)
    }
  }
  
  trait RegistrationProperties
    extends StObject
       with /* k */ StringDictionary[Any] {
    
    /**
      * Kind of the application. The only supported application type will be `web`
      */
    var application_type: js.UndefOr[web | Null] = js.undefined
    
    /**
      * Human-readable string name of the software product description to be presented to the end user during authorization
      */
    var client_description: String
    
    /**
      * Data Holder issued client identifier string
      */
    var client_id: String
    
    /**
      * Time at which the client identifier was issued expressed as seconds since 1970-01-01T00:00:00Z as measured in UTC
      */
    var client_id_issued_at: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Human-readable string name of the software product to be presented to the end-user during authorization
      */
    var client_name: String
    
    /**
      * URL string of a web page providing information about the client
      */
    var client_uri: String
    
    /**
      * Array of OAuth 2.0 grant type strings that the client can use at the token endpoint
      */
    var grant_types: js.Array[client_credentials | authorization_code | refresh_token]
    
    /**
      * JWE `alg` algorithm with which an id_token is to be encrypted
      */
    var id_token_encrypted_response_alg: String
    
    /**
      * JWE `enc` algorithm with which an id_token is to be encrypted
      */
    var id_token_encrypted_response_enc: String
    
    /**
      * Algorithm with which an id_token is to be signed
      */
    var id_token_signed_response_alg: js.UndefOr[PS256 | ES256 | Null] = js.undefined
    
    /**
      * URL string referencing the client JSON Web Key (JWK) Set **[[RFC7517]](#nref-RFC7517)** document, which contains the client public keys
      */
    var jwks_uri: String
    
    /**
      * A unique identifier string assigned by the CDR Register that identifies the Accredited Data Recipient Legal Entity
      */
    var legal_entity_id: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Human-readable string name of the Accredited Data Recipient Legal Entity
      */
    var legal_entity_name: js.UndefOr[String | Null] = js.undefined
    
    /**
      * URL string that references a logo for the client. If present, the server SHOULD display this image to the end-user during approval
      */
    var logo_uri: String
    
    /**
      * A unique identifier string assigned by the CDR Register that identifies the Accredited Data Recipient Brand
      */
    var org_id: String
    
    /**
      * Human-readable string name of the Accredited Data Recipient to be presented to the end user during authorization
      */
    var org_name: String
    
    /**
      * URL string that points to a human-readable policy document for the Software Product
      */
    var policy_uri: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Base URI for the Consumer Data Standard Data Recipient endpoints. This should be the base to provide reference to all other Data Recipient Endpoints
      */
    var recipient_base_uri: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Array of redirection URI strings for use in redirect-based flows. If used, redirect_uris MUST match or be a subset of the redirect_uris as defined in the SSA
      */
    var redirect_uris: js.Array[String]
    
    /**
      * Algorithm which the ADR expects to sign the request object if a request object will be part of the authorization request sent to the Data Holder
      */
    var request_object_signing_alg: PS256 | ES256
    
    /**
      * Array of the OAuth 2.0 response type strings that the client can use at the authorization endpoint.
      */
    var response_types: js.Array[`code id_token`]
    
    /**
      * URI string that references the location of the Software Product consent revocation endpoint
      */
    var revocation_uri: js.UndefOr[String | Null] = js.undefined
    
    /**
      * String containing a space-separated list of scope values that the client can use when requesting access tokens.
      */
    var scope: String
    
    /**
      * URL string referencing the client sector identifier URI, used as an optional input to the Pairwise Identifier
      */
    var sector_identifier_uri: js.UndefOr[String | Null] = js.undefined
    
    /**
      * String representing a unique identifier assigned by the Register and used by registration endpoints to identify the software product to be dynamically registered. </br></br>The "software_id" will remain the same for the lifetime of the product, across multiple updates and versions
      */
    var software_id: String
    
    /**
      * String containing a role of the software in the CDR Regime. Initially the only value used with be `data-recipient-software-product`
      */
    var software_roles: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The Software Statement Assertion, as defined in CDR standards
      */
    var software_statement: String
    
    /**
      * The requested authentication method for the token endpoint
      */
    var token_endpoint_auth_method: private_key_jwt
    
    /**
      * The algorithm used for signing the JWT
      */
    var token_endpoint_auth_signing_alg: PS256 | ES256
    
    /**
      * URL string that points to a human-readable terms of service document for the Software Product
      */
    var tos_uri: js.UndefOr[String | Null] = js.undefined
  }
  object RegistrationProperties {
    
    inline def apply(
      client_description: String,
      client_id: String,
      client_name: String,
      client_uri: String,
      grant_types: js.Array[client_credentials | authorization_code | refresh_token],
      id_token_encrypted_response_alg: String,
      id_token_encrypted_response_enc: String,
      jwks_uri: String,
      logo_uri: String,
      org_id: String,
      org_name: String,
      redirect_uris: js.Array[String],
      request_object_signing_alg: PS256 | ES256,
      response_types: js.Array[`code id_token`],
      scope: String,
      software_id: String,
      software_statement: String,
      token_endpoint_auth_signing_alg: PS256 | ES256
    ): RegistrationProperties = {
      val __obj = js.Dynamic.literal(client_description = client_description.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any], client_name = client_name.asInstanceOf[js.Any], client_uri = client_uri.asInstanceOf[js.Any], grant_types = grant_types.asInstanceOf[js.Any], id_token_encrypted_response_alg = id_token_encrypted_response_alg.asInstanceOf[js.Any], id_token_encrypted_response_enc = id_token_encrypted_response_enc.asInstanceOf[js.Any], jwks_uri = jwks_uri.asInstanceOf[js.Any], logo_uri = logo_uri.asInstanceOf[js.Any], org_id = org_id.asInstanceOf[js.Any], org_name = org_name.asInstanceOf[js.Any], redirect_uris = redirect_uris.asInstanceOf[js.Any], request_object_signing_alg = request_object_signing_alg.asInstanceOf[js.Any], response_types = response_types.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], software_id = software_id.asInstanceOf[js.Any], software_statement = software_statement.asInstanceOf[js.Any], token_endpoint_auth_method = "private_key_jwt", token_endpoint_auth_signing_alg = token_endpoint_auth_signing_alg.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegistrationProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegistrationProperties] (val x: Self) extends AnyVal {
      
      inline def setApplication_type(value: web): Self = StObject.set(x, "application_type", value.asInstanceOf[js.Any])
      
      inline def setApplication_typeNull: Self = StObject.set(x, "application_type", null)
      
      inline def setApplication_typeUndefined: Self = StObject.set(x, "application_type", js.undefined)
      
      inline def setClient_description(value: String): Self = StObject.set(x, "client_description", value.asInstanceOf[js.Any])
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setClient_id_issued_at(value: Double): Self = StObject.set(x, "client_id_issued_at", value.asInstanceOf[js.Any])
      
      inline def setClient_id_issued_atNull: Self = StObject.set(x, "client_id_issued_at", null)
      
      inline def setClient_id_issued_atUndefined: Self = StObject.set(x, "client_id_issued_at", js.undefined)
      
      inline def setClient_name(value: String): Self = StObject.set(x, "client_name", value.asInstanceOf[js.Any])
      
      inline def setClient_uri(value: String): Self = StObject.set(x, "client_uri", value.asInstanceOf[js.Any])
      
      inline def setGrant_types(value: js.Array[client_credentials | authorization_code | refresh_token]): Self = StObject.set(x, "grant_types", value.asInstanceOf[js.Any])
      
      inline def setGrant_typesVarargs(value: (client_credentials | authorization_code | refresh_token)*): Self = StObject.set(x, "grant_types", js.Array(value*))
      
      inline def setId_token_encrypted_response_alg(value: String): Self = StObject.set(x, "id_token_encrypted_response_alg", value.asInstanceOf[js.Any])
      
      inline def setId_token_encrypted_response_enc(value: String): Self = StObject.set(x, "id_token_encrypted_response_enc", value.asInstanceOf[js.Any])
      
      inline def setId_token_signed_response_alg(value: PS256 | ES256): Self = StObject.set(x, "id_token_signed_response_alg", value.asInstanceOf[js.Any])
      
      inline def setId_token_signed_response_algNull: Self = StObject.set(x, "id_token_signed_response_alg", null)
      
      inline def setId_token_signed_response_algUndefined: Self = StObject.set(x, "id_token_signed_response_alg", js.undefined)
      
      inline def setJwks_uri(value: String): Self = StObject.set(x, "jwks_uri", value.asInstanceOf[js.Any])
      
      inline def setLegal_entity_id(value: String): Self = StObject.set(x, "legal_entity_id", value.asInstanceOf[js.Any])
      
      inline def setLegal_entity_idNull: Self = StObject.set(x, "legal_entity_id", null)
      
      inline def setLegal_entity_idUndefined: Self = StObject.set(x, "legal_entity_id", js.undefined)
      
      inline def setLegal_entity_name(value: String): Self = StObject.set(x, "legal_entity_name", value.asInstanceOf[js.Any])
      
      inline def setLegal_entity_nameNull: Self = StObject.set(x, "legal_entity_name", null)
      
      inline def setLegal_entity_nameUndefined: Self = StObject.set(x, "legal_entity_name", js.undefined)
      
      inline def setLogo_uri(value: String): Self = StObject.set(x, "logo_uri", value.asInstanceOf[js.Any])
      
      inline def setOrg_id(value: String): Self = StObject.set(x, "org_id", value.asInstanceOf[js.Any])
      
      inline def setOrg_name(value: String): Self = StObject.set(x, "org_name", value.asInstanceOf[js.Any])
      
      inline def setPolicy_uri(value: String): Self = StObject.set(x, "policy_uri", value.asInstanceOf[js.Any])
      
      inline def setPolicy_uriNull: Self = StObject.set(x, "policy_uri", null)
      
      inline def setPolicy_uriUndefined: Self = StObject.set(x, "policy_uri", js.undefined)
      
      inline def setRecipient_base_uri(value: String): Self = StObject.set(x, "recipient_base_uri", value.asInstanceOf[js.Any])
      
      inline def setRecipient_base_uriNull: Self = StObject.set(x, "recipient_base_uri", null)
      
      inline def setRecipient_base_uriUndefined: Self = StObject.set(x, "recipient_base_uri", js.undefined)
      
      inline def setRedirect_uris(value: js.Array[String]): Self = StObject.set(x, "redirect_uris", value.asInstanceOf[js.Any])
      
      inline def setRedirect_urisVarargs(value: String*): Self = StObject.set(x, "redirect_uris", js.Array(value*))
      
      inline def setRequest_object_signing_alg(value: PS256 | ES256): Self = StObject.set(x, "request_object_signing_alg", value.asInstanceOf[js.Any])
      
      inline def setResponse_types(value: js.Array[`code id_token`]): Self = StObject.set(x, "response_types", value.asInstanceOf[js.Any])
      
      inline def setResponse_typesVarargs(value: (`code id_token`)*): Self = StObject.set(x, "response_types", js.Array(value*))
      
      inline def setRevocation_uri(value: String): Self = StObject.set(x, "revocation_uri", value.asInstanceOf[js.Any])
      
      inline def setRevocation_uriNull: Self = StObject.set(x, "revocation_uri", null)
      
      inline def setRevocation_uriUndefined: Self = StObject.set(x, "revocation_uri", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setSector_identifier_uri(value: String): Self = StObject.set(x, "sector_identifier_uri", value.asInstanceOf[js.Any])
      
      inline def setSector_identifier_uriNull: Self = StObject.set(x, "sector_identifier_uri", null)
      
      inline def setSector_identifier_uriUndefined: Self = StObject.set(x, "sector_identifier_uri", js.undefined)
      
      inline def setSoftware_id(value: String): Self = StObject.set(x, "software_id", value.asInstanceOf[js.Any])
      
      inline def setSoftware_roles(value: String): Self = StObject.set(x, "software_roles", value.asInstanceOf[js.Any])
      
      inline def setSoftware_rolesNull: Self = StObject.set(x, "software_roles", null)
      
      inline def setSoftware_rolesUndefined: Self = StObject.set(x, "software_roles", js.undefined)
      
      inline def setSoftware_statement(value: String): Self = StObject.set(x, "software_statement", value.asInstanceOf[js.Any])
      
      inline def setToken_endpoint_auth_method(value: private_key_jwt): Self = StObject.set(x, "token_endpoint_auth_method", value.asInstanceOf[js.Any])
      
      inline def setToken_endpoint_auth_signing_alg(value: PS256 | ES256): Self = StObject.set(x, "token_endpoint_auth_signing_alg", value.asInstanceOf[js.Any])
      
      inline def setTos_uri(value: String): Self = StObject.set(x, "tos_uri", value.asInstanceOf[js.Any])
      
      inline def setTos_uriNull: Self = StObject.set(x, "tos_uri", null)
      
      inline def setTos_uriUndefined: Self = StObject.set(x, "tos_uri", js.undefined)
    }
  }
}
