package typings.contentfulManagement.createCmaHttpClientMod

import org.scalablytyped.runtime.StringDictionary
import typings.axios.mod.AxiosProxyConfig
import typings.axios.mod.AxiosRequestConfig
import typings.axios.mod.AxiosResponse
import typings.node.httpMod.Agent
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientParams extends js.Object {
  
  /**
    * Contentful CMA Access Token
    */
  var accessToken: String = js.native
  
  /**
    * Application name and version e.g myApp/version
    */
  var application: js.UndefOr[String] = js.native
  
  var feature: js.UndefOr[String] = js.native
  
  /**
    * Optional additional headers
    */
  var headers: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * API host
    * @default api.contentful.com
    */
  var host: js.UndefOr[String] = js.native
  
  /**
    * direct file upload host
    * @default upload.contentful.com
    */
  var hostUpload: js.UndefOr[String] = js.native
  
  /**
    * Optional Node.js HTTP agent for proxying
    * @see <a href="https://nodejs.org/api/http.html#http_class_http_agent">Node.js docs</a> and <a href="https://www.npmjs.com/package/https-proxy-agent">https-proxy-agent</a>
    */
  var httpAgent: js.UndefOr[Agent] = js.native
  
  /**
    * Optional Node.js HTTP agent for proxying
    * @see <a href="https://nodejs.org/api/http.html#http_class_http_agent">Node.js docs</a> and <a href="https://www.npmjs.com/package/https-proxy-agent">https-proxy-agent</a>
    */
  var httpsAgent: js.UndefOr[typings.node.httpsMod.Agent] = js.native
  
  /**
    * Requests will be made over http instead of the default https
    * @default false
    */
  var insecure: js.UndefOr[Boolean] = js.native
  
  /**
    * Integration name and version e.g react/version
    */
  var integration: js.UndefOr[String] = js.native
  
  /**
    * A log handler function to process given log messages & errors.
    * Receives the log level (error, warning & info) and the actual log data (Error object or string).
    * @see The default can be found at: https://github.com/contentful/contentful-sdk-core/blob/master/lib/create-http-client.js
    */
  var logHandler: js.UndefOr[js.Function2[/* level */ String, /* data */ Error | String, Unit]] = js.native
  
  /**
    * Optional maximum content length in bytes
    * @default 1073741824 i.e 1GB
    */
  var maxContentLength: js.UndefOr[Double] = js.native
  
  /**
    * Optional Axios proxy
    * @see <a href="https://github.com/mzabriskie/axios#request-config"> axios docs </a>
    */
  var proxy: js.UndefOr[AxiosProxyConfig] = js.native
  
  /**
    * Gets called on every request triggered by the SDK
    */
  var requestLogger: js.UndefOr[js.Function1[/* config */ AxiosRequestConfig, Unit]] = js.native
  
  /**
    * Gets called on every response
    */
  var responseLogger: js.UndefOr[js.Function1[/* response */ AxiosResponse[_], Unit]] = js.native
  
  /**
    * Optional number of retries before failure
    * @default 5
    */
  var retryLimit: js.UndefOr[Double] = js.native
  
  /**
    * If we should retry on errors and 429 rate limit exceptions
    * @default true
    */
  var retryOnError: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional number of milliseconds before the request times out.
    * @default 30000
    */
  var timeout: js.UndefOr[Double] = js.native
}
object ClientParams {
  
  @scala.inline
  def apply(accessToken: String): ClientParams = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientParams]
  }
  
  @scala.inline
  implicit class ClientParamsOps[Self <: ClientParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: String): Self = this.set("application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplication: Self = this.set("application", js.undefined)
    
    @scala.inline
    def setFeature(value: String): Self = this.set("feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeature: Self = this.set("feature", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[js.Any]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHostUpload(value: String): Self = this.set("hostUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostUpload: Self = this.set("hostUpload", js.undefined)
    
    @scala.inline
    def setHttpAgent(value: Agent): Self = this.set("httpAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpAgent: Self = this.set("httpAgent", js.undefined)
    
    @scala.inline
    def setHttpsAgent(value: typings.node.httpsMod.Agent): Self = this.set("httpsAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpsAgent: Self = this.set("httpsAgent", js.undefined)
    
    @scala.inline
    def setInsecure(value: Boolean): Self = this.set("insecure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsecure: Self = this.set("insecure", js.undefined)
    
    @scala.inline
    def setIntegration(value: String): Self = this.set("integration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegration: Self = this.set("integration", js.undefined)
    
    @scala.inline
    def setLogHandler(value: (/* level */ String, /* data */ Error | String) => Unit): Self = this.set("logHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLogHandler: Self = this.set("logHandler", js.undefined)
    
    @scala.inline
    def setMaxContentLength(value: Double): Self = this.set("maxContentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxContentLength: Self = this.set("maxContentLength", js.undefined)
    
    @scala.inline
    def setProxy(value: AxiosProxyConfig): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setRequestLogger(value: /* config */ AxiosRequestConfig => Unit): Self = this.set("requestLogger", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRequestLogger: Self = this.set("requestLogger", js.undefined)
    
    @scala.inline
    def setResponseLogger(value: /* response */ AxiosResponse[_] => Unit): Self = this.set("responseLogger", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResponseLogger: Self = this.set("responseLogger", js.undefined)
    
    @scala.inline
    def setRetryLimit(value: Double): Self = this.set("retryLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryLimit: Self = this.set("retryLimit", js.undefined)
    
    @scala.inline
    def setRetryOnError(value: Boolean): Self = this.set("retryOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryOnError: Self = this.set("retryOnError", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
