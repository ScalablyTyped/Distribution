package typings.azureMsalCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authorizationendpoint extends StObject {
  
  var authorization_endpoint: String
  
  var claims_supported: js.Array[String]
  
  var cloud_graph_host_name: String
  
  var cloud_instance_name: String
  
  var device_authorization_endpoint: String
  
  var end_session_endpoint: String
  
  var frontchannel_logout_supported: Boolean
  
  var http_logout_supported: Boolean
  
  var id_token_signing_alg_values_supported: js.Array[String]
  
  var issuer: String
  
  var jwks_uri: String
  
  var kerberos_endpoint: String
  
  var msgraph_host: String
  
  var rbac_url: String
  
  var request_uri_parameter_supported: Boolean
  
  var response_modes_supported: js.Array[String]
  
  var response_types_supported: js.Array[String]
  
  var scopes_supported: js.Array[String]
  
  var subject_types_supported: js.Array[String]
  
  var tenant_region_scope: Null
  
  var token_endpoint: String
  
  var token_endpoint_auth_methods_supported: js.Array[String]
  
  var userinfo_endpoint: String
}
object Authorizationendpoint {
  
  inline def apply(
    authorization_endpoint: String,
    claims_supported: js.Array[String],
    cloud_graph_host_name: String,
    cloud_instance_name: String,
    device_authorization_endpoint: String,
    end_session_endpoint: String,
    frontchannel_logout_supported: Boolean,
    http_logout_supported: Boolean,
    id_token_signing_alg_values_supported: js.Array[String],
    issuer: String,
    jwks_uri: String,
    kerberos_endpoint: String,
    msgraph_host: String,
    rbac_url: String,
    request_uri_parameter_supported: Boolean,
    response_modes_supported: js.Array[String],
    response_types_supported: js.Array[String],
    scopes_supported: js.Array[String],
    subject_types_supported: js.Array[String],
    tenant_region_scope: Null,
    token_endpoint: String,
    token_endpoint_auth_methods_supported: js.Array[String],
    userinfo_endpoint: String
  ): Authorizationendpoint = {
    val __obj = js.Dynamic.literal(authorization_endpoint = authorization_endpoint.asInstanceOf[js.Any], claims_supported = claims_supported.asInstanceOf[js.Any], cloud_graph_host_name = cloud_graph_host_name.asInstanceOf[js.Any], cloud_instance_name = cloud_instance_name.asInstanceOf[js.Any], device_authorization_endpoint = device_authorization_endpoint.asInstanceOf[js.Any], end_session_endpoint = end_session_endpoint.asInstanceOf[js.Any], frontchannel_logout_supported = frontchannel_logout_supported.asInstanceOf[js.Any], http_logout_supported = http_logout_supported.asInstanceOf[js.Any], id_token_signing_alg_values_supported = id_token_signing_alg_values_supported.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], jwks_uri = jwks_uri.asInstanceOf[js.Any], kerberos_endpoint = kerberos_endpoint.asInstanceOf[js.Any], msgraph_host = msgraph_host.asInstanceOf[js.Any], rbac_url = rbac_url.asInstanceOf[js.Any], request_uri_parameter_supported = request_uri_parameter_supported.asInstanceOf[js.Any], response_modes_supported = response_modes_supported.asInstanceOf[js.Any], response_types_supported = response_types_supported.asInstanceOf[js.Any], scopes_supported = scopes_supported.asInstanceOf[js.Any], subject_types_supported = subject_types_supported.asInstanceOf[js.Any], tenant_region_scope = tenant_region_scope.asInstanceOf[js.Any], token_endpoint = token_endpoint.asInstanceOf[js.Any], token_endpoint_auth_methods_supported = token_endpoint_auth_methods_supported.asInstanceOf[js.Any], userinfo_endpoint = userinfo_endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorizationendpoint]
  }
  
  extension [Self <: Authorizationendpoint](x: Self) {
    
    inline def setAuthorization_endpoint(value: String): Self = StObject.set(x, "authorization_endpoint", value.asInstanceOf[js.Any])
    
    inline def setClaims_supported(value: js.Array[String]): Self = StObject.set(x, "claims_supported", value.asInstanceOf[js.Any])
    
    inline def setClaims_supportedVarargs(value: String*): Self = StObject.set(x, "claims_supported", js.Array(value*))
    
    inline def setCloud_graph_host_name(value: String): Self = StObject.set(x, "cloud_graph_host_name", value.asInstanceOf[js.Any])
    
    inline def setCloud_instance_name(value: String): Self = StObject.set(x, "cloud_instance_name", value.asInstanceOf[js.Any])
    
    inline def setDevice_authorization_endpoint(value: String): Self = StObject.set(x, "device_authorization_endpoint", value.asInstanceOf[js.Any])
    
    inline def setEnd_session_endpoint(value: String): Self = StObject.set(x, "end_session_endpoint", value.asInstanceOf[js.Any])
    
    inline def setFrontchannel_logout_supported(value: Boolean): Self = StObject.set(x, "frontchannel_logout_supported", value.asInstanceOf[js.Any])
    
    inline def setHttp_logout_supported(value: Boolean): Self = StObject.set(x, "http_logout_supported", value.asInstanceOf[js.Any])
    
    inline def setId_token_signing_alg_values_supported(value: js.Array[String]): Self = StObject.set(x, "id_token_signing_alg_values_supported", value.asInstanceOf[js.Any])
    
    inline def setId_token_signing_alg_values_supportedVarargs(value: String*): Self = StObject.set(x, "id_token_signing_alg_values_supported", js.Array(value*))
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setJwks_uri(value: String): Self = StObject.set(x, "jwks_uri", value.asInstanceOf[js.Any])
    
    inline def setKerberos_endpoint(value: String): Self = StObject.set(x, "kerberos_endpoint", value.asInstanceOf[js.Any])
    
    inline def setMsgraph_host(value: String): Self = StObject.set(x, "msgraph_host", value.asInstanceOf[js.Any])
    
    inline def setRbac_url(value: String): Self = StObject.set(x, "rbac_url", value.asInstanceOf[js.Any])
    
    inline def setRequest_uri_parameter_supported(value: Boolean): Self = StObject.set(x, "request_uri_parameter_supported", value.asInstanceOf[js.Any])
    
    inline def setResponse_modes_supported(value: js.Array[String]): Self = StObject.set(x, "response_modes_supported", value.asInstanceOf[js.Any])
    
    inline def setResponse_modes_supportedVarargs(value: String*): Self = StObject.set(x, "response_modes_supported", js.Array(value*))
    
    inline def setResponse_types_supported(value: js.Array[String]): Self = StObject.set(x, "response_types_supported", value.asInstanceOf[js.Any])
    
    inline def setResponse_types_supportedVarargs(value: String*): Self = StObject.set(x, "response_types_supported", js.Array(value*))
    
    inline def setScopes_supported(value: js.Array[String]): Self = StObject.set(x, "scopes_supported", value.asInstanceOf[js.Any])
    
    inline def setScopes_supportedVarargs(value: String*): Self = StObject.set(x, "scopes_supported", js.Array(value*))
    
    inline def setSubject_types_supported(value: js.Array[String]): Self = StObject.set(x, "subject_types_supported", value.asInstanceOf[js.Any])
    
    inline def setSubject_types_supportedVarargs(value: String*): Self = StObject.set(x, "subject_types_supported", js.Array(value*))
    
    inline def setTenant_region_scope(value: Null): Self = StObject.set(x, "tenant_region_scope", value.asInstanceOf[js.Any])
    
    inline def setToken_endpoint(value: String): Self = StObject.set(x, "token_endpoint", value.asInstanceOf[js.Any])
    
    inline def setToken_endpoint_auth_methods_supported(value: js.Array[String]): Self = StObject.set(x, "token_endpoint_auth_methods_supported", value.asInstanceOf[js.Any])
    
    inline def setToken_endpoint_auth_methods_supportedVarargs(value: String*): Self = StObject.set(x, "token_endpoint_auth_methods_supported", js.Array(value*))
    
    inline def setUserinfo_endpoint(value: String): Self = StObject.set(x, "userinfo_endpoint", value.asInstanceOf[js.Any])
  }
}
