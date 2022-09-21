package typings.azureCoreClient.mod

import typings.azureCoreAuth.mod.TokenCredential
import typings.azureCoreRestPipeline.coreRestPipelineMod.Pipeline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceClientOptions
  extends StObject
     with CommonClientOptions {
  
  /**
    * If specified, this is the base URI that requests will be made against for this ServiceClient.
    * If it is not specified, then all OperationSpecs must contain a baseUrl property.
    * @deprecated This property is deprecated and will be removed soon, please use endpoint instead
    */
  var baseUri: js.UndefOr[String] = js.undefined
  
  /**
    * Credential used to authenticate the request.
    */
  var credential: js.UndefOr[TokenCredential] = js.undefined
  
  /**
    * If specified, will be used to build the BearerTokenAuthenticationPolicy.
    */
  var credentialScopes: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * If specified, this is the endpoint that requests will be made against for this ServiceClient.
    * If it is not specified, then all OperationSpecs must contain a baseUrl property.
    * to encourage customer to use endpoint, we mark the baseUri as deprecated.
    */
  var endpoint: js.UndefOr[String] = js.undefined
  
  /**
    * A customized pipeline to use, otherwise a default one will be created.
    */
  var pipeline: js.UndefOr[Pipeline] = js.undefined
  
  /**
    * The default request content type for the service.
    * Used if no requestContentType is present on an OperationSpec.
    */
  var requestContentType: js.UndefOr[String] = js.undefined
}
object ServiceClientOptions {
  
  inline def apply(): ServiceClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceClientOptions]
  }
  
  extension [Self <: ServiceClientOptions](x: Self) {
    
    inline def setBaseUri(value: String): Self = StObject.set(x, "baseUri", value.asInstanceOf[js.Any])
    
    inline def setBaseUriUndefined: Self = StObject.set(x, "baseUri", js.undefined)
    
    inline def setCredential(value: TokenCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    inline def setCredentialScopes(value: String | js.Array[String]): Self = StObject.set(x, "credentialScopes", value.asInstanceOf[js.Any])
    
    inline def setCredentialScopesUndefined: Self = StObject.set(x, "credentialScopes", js.undefined)
    
    inline def setCredentialScopesVarargs(value: String*): Self = StObject.set(x, "credentialScopes", js.Array(value*))
    
    inline def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setPipeline(value: Pipeline): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    inline def setRequestContentType(value: String): Self = StObject.set(x, "requestContentType", value.asInstanceOf[js.Any])
    
    inline def setRequestContentTypeUndefined: Self = StObject.set(x, "requestContentType", js.undefined)
  }
}
