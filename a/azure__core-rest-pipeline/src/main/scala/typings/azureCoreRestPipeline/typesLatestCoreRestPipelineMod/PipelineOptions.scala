package typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineOptions extends StObject {
  
  /**
    * Options to configure a proxy for outgoing requests.
    */
  var proxyOptions: js.UndefOr[ProxySettings] = js.undefined
  
  /**
    * Options for how redirect responses are handled.
    */
  var redirectOptions: js.UndefOr[RedirectPolicyOptions] = js.undefined
  
  /**
    * Options that control how to retry failed requests.
    */
  var retryOptions: js.UndefOr[PipelineRetryOptions] = js.undefined
  
  /** Options for configuring TLS authentication */
  var tlsOptions: js.UndefOr[TlsSettings] = js.undefined
  
  /**
    * Options for adding user agent details to outgoing requests.
    */
  var userAgentOptions: js.UndefOr[UserAgentPolicyOptions] = js.undefined
}
object PipelineOptions {
  
  inline def apply(): PipelineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipelineOptions] (val x: Self) extends AnyVal {
    
    inline def setProxyOptions(value: ProxySettings): Self = StObject.set(x, "proxyOptions", value.asInstanceOf[js.Any])
    
    inline def setProxyOptionsUndefined: Self = StObject.set(x, "proxyOptions", js.undefined)
    
    inline def setRedirectOptions(value: RedirectPolicyOptions): Self = StObject.set(x, "redirectOptions", value.asInstanceOf[js.Any])
    
    inline def setRedirectOptionsUndefined: Self = StObject.set(x, "redirectOptions", js.undefined)
    
    inline def setRetryOptions(value: PipelineRetryOptions): Self = StObject.set(x, "retryOptions", value.asInstanceOf[js.Any])
    
    inline def setRetryOptionsUndefined: Self = StObject.set(x, "retryOptions", js.undefined)
    
    inline def setTlsOptions(value: TlsSettings): Self = StObject.set(x, "tlsOptions", value.asInstanceOf[js.Any])
    
    inline def setTlsOptionsUndefined: Self = StObject.set(x, "tlsOptions", js.undefined)
    
    inline def setUserAgentOptions(value: UserAgentPolicyOptions): Self = StObject.set(x, "userAgentOptions", value.asInstanceOf[js.Any])
    
    inline def setUserAgentOptionsUndefined: Self = StObject.set(x, "userAgentOptions", js.undefined)
  }
}
