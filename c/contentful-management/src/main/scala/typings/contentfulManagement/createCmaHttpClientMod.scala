package typings.contentfulManagement

import org.scalablytyped.runtime.StringDictionary
import typings.axios.mod.AxiosInstance
import typings.axios.mod.AxiosProxyConfig
import typings.axios.mod.AxiosRequestConfig
import typings.axios.mod.AxiosResponse
import typings.node.httpMod.Agent
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createCmaHttpClientMod {
  
  @JSImport("contentful-management/dist/typings/create-cma-http-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCMAHttpClient(params: ClientParams): AxiosInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("createCMAHttpClient")(params.asInstanceOf[js.Any]).asInstanceOf[AxiosInstance]
  
  trait ClientParams extends StObject {
    
    /**
      * Contentful CMA Access Token
      */
    var accessToken: String
    
    /**
      * Application name and version e.g myApp/version
      */
    var application: js.UndefOr[String] = js.undefined
    
    var feature: js.UndefOr[String] = js.undefined
    
    /**
      * Optional additional headers
      */
    var headers: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    /**
      * API host
      * @default api.contentful.com
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * direct file upload host
      * @default upload.contentful.com
      */
    var hostUpload: js.UndefOr[String] = js.undefined
    
    /**
      * Optional Node.js HTTP agent for proxying
      * @see <a href="https://nodejs.org/api/http.html#http_class_http_agent">Node.js docs</a> and <a href="https://www.npmjs.com/package/https-proxy-agent">https-proxy-agent</a>
      */
    var httpAgent: js.UndefOr[Agent] = js.undefined
    
    /**
      * Optional Node.js HTTP agent for proxying
      * @see <a href="https://nodejs.org/api/http.html#http_class_http_agent">Node.js docs</a> and <a href="https://www.npmjs.com/package/https-proxy-agent">https-proxy-agent</a>
      */
    var httpsAgent: js.UndefOr[typings.node.httpsMod.Agent] = js.undefined
    
    /**
      * Requests will be made over http instead of the default https
      * @default false
      */
    var insecure: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Integration name and version e.g react/version
      */
    var integration: js.UndefOr[String] = js.undefined
    
    /**
      * A log handler function to process given log messages & errors.
      * Receives the log level (error, warning & info) and the actual log data (Error object or string).
      * @see The default can be found at: https://github.com/contentful/contentful-sdk-core/blob/master/lib/create-http-client.js
      */
    var logHandler: js.UndefOr[js.Function2[/* level */ String, /* data */ Error | String, Unit]] = js.undefined
    
    /**
      * Optional maximum content length in bytes
      * @default 1073741824 i.e 1GB
      */
    var maxContentLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional Axios proxy
      * @see <a href="https://github.com/mzabriskie/axios#request-config"> axios docs </a>
      */
    var proxy: js.UndefOr[AxiosProxyConfig] = js.undefined
    
    /**
      * Gets called on every request triggered by the SDK
      */
    var requestLogger: js.UndefOr[js.Function1[/* config */ AxiosRequestConfig, Unit]] = js.undefined
    
    /**
      * Gets called on every response
      */
    var responseLogger: js.UndefOr[js.Function1[/* response */ AxiosResponse[js.Any], Unit]] = js.undefined
    
    /**
      * Optional number of retries before failure
      * @default 5
      */
    var retryLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * If we should retry on errors and 429 rate limit exceptions
      * @default true
      */
    var retryOnError: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional number of milliseconds before the request times out.
      * @default 30000
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ClientParams {
    
    inline def apply(accessToken: String): ClientParams = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientParams]
    }
    
    extension [Self <: ClientParams](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setApplication(value: String): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
      
      inline def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
      
      inline def setHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostUpload(value: String): Self = StObject.set(x, "hostUpload", value.asInstanceOf[js.Any])
      
      inline def setHostUploadUndefined: Self = StObject.set(x, "hostUpload", js.undefined)
      
      inline def setHttpAgent(value: Agent): Self = StObject.set(x, "httpAgent", value.asInstanceOf[js.Any])
      
      inline def setHttpAgentUndefined: Self = StObject.set(x, "httpAgent", js.undefined)
      
      inline def setHttpsAgent(value: typings.node.httpsMod.Agent): Self = StObject.set(x, "httpsAgent", value.asInstanceOf[js.Any])
      
      inline def setHttpsAgentUndefined: Self = StObject.set(x, "httpsAgent", js.undefined)
      
      inline def setInsecure(value: Boolean): Self = StObject.set(x, "insecure", value.asInstanceOf[js.Any])
      
      inline def setInsecureUndefined: Self = StObject.set(x, "insecure", js.undefined)
      
      inline def setIntegration(value: String): Self = StObject.set(x, "integration", value.asInstanceOf[js.Any])
      
      inline def setIntegrationUndefined: Self = StObject.set(x, "integration", js.undefined)
      
      inline def setLogHandler(value: (/* level */ String, /* data */ Error | String) => Unit): Self = StObject.set(x, "logHandler", js.Any.fromFunction2(value))
      
      inline def setLogHandlerUndefined: Self = StObject.set(x, "logHandler", js.undefined)
      
      inline def setMaxContentLength(value: Double): Self = StObject.set(x, "maxContentLength", value.asInstanceOf[js.Any])
      
      inline def setMaxContentLengthUndefined: Self = StObject.set(x, "maxContentLength", js.undefined)
      
      inline def setProxy(value: AxiosProxyConfig): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setRequestLogger(value: /* config */ AxiosRequestConfig => Unit): Self = StObject.set(x, "requestLogger", js.Any.fromFunction1(value))
      
      inline def setRequestLoggerUndefined: Self = StObject.set(x, "requestLogger", js.undefined)
      
      inline def setResponseLogger(value: /* response */ AxiosResponse[js.Any] => Unit): Self = StObject.set(x, "responseLogger", js.Any.fromFunction1(value))
      
      inline def setResponseLoggerUndefined: Self = StObject.set(x, "responseLogger", js.undefined)
      
      inline def setRetryLimit(value: Double): Self = StObject.set(x, "retryLimit", value.asInstanceOf[js.Any])
      
      inline def setRetryLimitUndefined: Self = StObject.set(x, "retryLimit", js.undefined)
      
      inline def setRetryOnError(value: Boolean): Self = StObject.set(x, "retryOnError", value.asInstanceOf[js.Any])
      
      inline def setRetryOnErrorUndefined: Self = StObject.set(x, "retryOnError", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
