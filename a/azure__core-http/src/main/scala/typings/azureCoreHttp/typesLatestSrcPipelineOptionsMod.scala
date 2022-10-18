package typings.azureCoreHttp

import typings.azureCoreHttp.typesLatestSrcHttpClientMod.HttpClient
import typings.azureCoreHttp.typesLatestSrcPoliciesDeserializationPolicyMod.DeserializationOptions
import typings.azureCoreHttp.typesLatestSrcPoliciesExponentialRetryPolicyMod.RetryOptions
import typings.azureCoreHttp.typesLatestSrcPoliciesKeepAlivePolicyMod.KeepAliveOptions
import typings.azureCoreHttp.typesLatestSrcPoliciesLogPolicyMod.LogPolicyOptions
import typings.azureCoreHttp.typesLatestSrcPoliciesRedirectPolicyMod.RedirectOptions
import typings.azureCoreHttp.typesLatestSrcPoliciesUserAgentPolicyMod.UserAgentOptions
import typings.azureCoreHttp.typesLatestSrcServiceClientMod.ProxyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcPipelineOptionsMod {
  
  trait InternalPipelineOptions
    extends StObject
       with PipelineOptions {
    
    /**
      * Configure whether to decompress response according to Accept-Encoding header (node-fetch only)
      */
    var decompressResponse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Options to configure API response deserialization.
      */
    var deserializationOptions: js.UndefOr[DeserializationOptions] = js.undefined
    
    /**
      * Options to configure request/response logging.
      */
    var loggingOptions: js.UndefOr[LogPolicyOptions] = js.undefined
    
    /**
      * Send JSON Array payloads as NDJSON.
      */
    var sendStreamingJson: js.UndefOr[Boolean] = js.undefined
  }
  object InternalPipelineOptions {
    
    inline def apply(): InternalPipelineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalPipelineOptions]
    }
    
    extension [Self <: InternalPipelineOptions](x: Self) {
      
      inline def setDecompressResponse(value: Boolean): Self = StObject.set(x, "decompressResponse", value.asInstanceOf[js.Any])
      
      inline def setDecompressResponseUndefined: Self = StObject.set(x, "decompressResponse", js.undefined)
      
      inline def setDeserializationOptions(value: DeserializationOptions): Self = StObject.set(x, "deserializationOptions", value.asInstanceOf[js.Any])
      
      inline def setDeserializationOptionsUndefined: Self = StObject.set(x, "deserializationOptions", js.undefined)
      
      inline def setLoggingOptions(value: LogPolicyOptions): Self = StObject.set(x, "loggingOptions", value.asInstanceOf[js.Any])
      
      inline def setLoggingOptionsUndefined: Self = StObject.set(x, "loggingOptions", js.undefined)
      
      inline def setSendStreamingJson(value: Boolean): Self = StObject.set(x, "sendStreamingJson", value.asInstanceOf[js.Any])
      
      inline def setSendStreamingJsonUndefined: Self = StObject.set(x, "sendStreamingJson", js.undefined)
    }
  }
  
  trait PipelineOptions extends StObject {
    
    /**
      * The HttpClient implementation to use for outgoing HTTP requests.  Defaults
      * to DefaultHttpClient.
      */
    var httpClient: js.UndefOr[HttpClient] = js.undefined
    
    /**
      * Options for how HTTP connections should be maintained for future
      * requests.
      */
    var keepAliveOptions: js.UndefOr[KeepAliveOptions] = js.undefined
    
    /**
      * Options to configure a proxy for outgoing requests.
      */
    var proxyOptions: js.UndefOr[ProxyOptions] = js.undefined
    
    /**
      * Options for how redirect responses are handled.
      */
    var redirectOptions: js.UndefOr[RedirectOptions] = js.undefined
    
    /**
      * Options that control how to retry failed requests.
      */
    var retryOptions: js.UndefOr[RetryOptions] = js.undefined
    
    /**
      * Options for adding user agent details to outgoing requests.
      */
    var userAgentOptions: js.UndefOr[UserAgentOptions] = js.undefined
  }
  object PipelineOptions {
    
    inline def apply(): PipelineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PipelineOptions]
    }
    
    extension [Self <: PipelineOptions](x: Self) {
      
      inline def setHttpClient(value: HttpClient): Self = StObject.set(x, "httpClient", value.asInstanceOf[js.Any])
      
      inline def setHttpClientUndefined: Self = StObject.set(x, "httpClient", js.undefined)
      
      inline def setKeepAliveOptions(value: KeepAliveOptions): Self = StObject.set(x, "keepAliveOptions", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveOptionsUndefined: Self = StObject.set(x, "keepAliveOptions", js.undefined)
      
      inline def setProxyOptions(value: ProxyOptions): Self = StObject.set(x, "proxyOptions", value.asInstanceOf[js.Any])
      
      inline def setProxyOptionsUndefined: Self = StObject.set(x, "proxyOptions", js.undefined)
      
      inline def setRedirectOptions(value: RedirectOptions): Self = StObject.set(x, "redirectOptions", value.asInstanceOf[js.Any])
      
      inline def setRedirectOptionsUndefined: Self = StObject.set(x, "redirectOptions", js.undefined)
      
      inline def setRetryOptions(value: RetryOptions): Self = StObject.set(x, "retryOptions", value.asInstanceOf[js.Any])
      
      inline def setRetryOptionsUndefined: Self = StObject.set(x, "retryOptions", js.undefined)
      
      inline def setUserAgentOptions(value: UserAgentOptions): Self = StObject.set(x, "userAgentOptions", value.asInstanceOf[js.Any])
      
      inline def setUserAgentOptionsUndefined: Self = StObject.set(x, "userAgentOptions", js.undefined)
    }
  }
}
