package typings.azureCoreClient.mod

import typings.azureCoreRestPipeline.coreRestPipelineMod.HttpClient
import typings.azureCoreRestPipeline.coreRestPipelineMod.PipelineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonClientOptions
  extends StObject
     with PipelineOptions {
  
  /**
    * Additional policies to include in the HTTP pipeline.
    */
  var additionalPolicies: js.UndefOr[js.Array[AdditionalPolicyConfig]] = js.undefined
  
  /**
    * Set to true if the request is sent over HTTP instead of HTTPS
    */
  var allowInsecureConnection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The HttpClient that will be used to send HTTP requests.
    */
  var httpClient: js.UndefOr[HttpClient] = js.undefined
}
object CommonClientOptions {
  
  inline def apply(): CommonClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonClientOptions]
  }
  
  extension [Self <: CommonClientOptions](x: Self) {
    
    inline def setAdditionalPolicies(value: js.Array[AdditionalPolicyConfig]): Self = StObject.set(x, "additionalPolicies", value.asInstanceOf[js.Any])
    
    inline def setAdditionalPoliciesUndefined: Self = StObject.set(x, "additionalPolicies", js.undefined)
    
    inline def setAdditionalPoliciesVarargs(value: AdditionalPolicyConfig*): Self = StObject.set(x, "additionalPolicies", js.Array(value*))
    
    inline def setAllowInsecureConnection(value: Boolean): Self = StObject.set(x, "allowInsecureConnection", value.asInstanceOf[js.Any])
    
    inline def setAllowInsecureConnectionUndefined: Self = StObject.set(x, "allowInsecureConnection", js.undefined)
    
    inline def setHttpClient(value: HttpClient): Self = StObject.set(x, "httpClient", value.asInstanceOf[js.Any])
    
    inline def setHttpClientUndefined: Self = StObject.set(x, "httpClient", js.undefined)
  }
}
