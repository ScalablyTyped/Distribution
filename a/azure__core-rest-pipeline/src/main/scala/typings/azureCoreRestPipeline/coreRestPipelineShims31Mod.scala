package typings.azureCoreRestPipeline

import typings.azureCoreRestPipeline.`31CoreRestPipelineMod`.BearerTokenAuthenticationPolicyOptions
import typings.azureCoreRestPipeline.`31CoreRestPipelineMod`.DefaultRetryPolicyOptions
import typings.azureCoreRestPipeline.`31CoreRestPipelineMod`.ExponentialRetryPolicyOptions
import typings.azureCoreRestPipeline.`31CoreRestPipelineMod`.HttpClient
import typings.azureCoreRestPipeline.`31CoreRestPipelineMod`.HttpHeaders
import typings.azureCoreRestPipeline.`31CoreRestPipelineMod`.InternalPipelineOptions
import typings.azureCoreRestPipeline.`31CoreRestPipelineMod`.LogPolicyOptions
import typings.azureCoreRestPipeline.`31CoreRestPipelineMod`.Pipeline
import typings.azureCoreRestPipeline.`31CoreRestPipelineMod`.PipelinePolicy
import typings.azureCoreRestPipeline.`31CoreRestPipelineMod`.PipelineRequest
import typings.azureCoreRestPipeline.`31CoreRestPipelineMod`.PipelineRequestOptions
import typings.azureCoreRestPipeline.`31CoreRestPipelineMod`.ProxySettings
import typings.azureCoreRestPipeline.`31CoreRestPipelineMod`.RawHttpHeadersInput
import typings.azureCoreRestPipeline.`31CoreRestPipelineMod`.RedirectPolicyOptions
import typings.azureCoreRestPipeline.`31CoreRestPipelineMod`.RestErrorOptions
import typings.azureCoreRestPipeline.`31CoreRestPipelineMod`.RetryPolicyOptions
import typings.azureCoreRestPipeline.`31CoreRestPipelineMod`.RetryStrategy
import typings.azureCoreRestPipeline.`31CoreRestPipelineMod`.SystemErrorRetryPolicyOptions
import typings.azureCoreRestPipeline.`31CoreRestPipelineMod`.ThrottlingRetryPolicyOptions
import typings.azureCoreRestPipeline.`31CoreRestPipelineMod`.TlsSettings
import typings.azureCoreRestPipeline.`31CoreRestPipelineMod`.TracingPolicyOptions
import typings.azureCoreRestPipeline.`31CoreRestPipelineMod`.UserAgentPolicyOptions
import typings.azureCoreRestPipeline.anon.CustomNoProxyList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreRestPipelineShims31Mod {
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "RestError")
  @js.native
  open class RestError protected ()
    extends typings.azureCoreRestPipeline.`31CoreRestPipelineMod`.RestError {
    def this(message: String) = this()
    def this(message: String, options: RestErrorOptions) = this()
  }
  /* static members */
  object RestError {
    
    /**
      * This means that parsing the response from the server failed.
      * It may have been malformed.
      */
    @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "RestError.PARSE_ERROR")
    @js.native
    val PARSE_ERROR: String = js.native
    
    /**
      * Something went wrong when making the request.
      * This means the actual request failed for some reason,
      * such as a DNS issue or the connection being lost.
      */
    @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "RestError.REQUEST_SEND_ERROR")
    @js.native
    val REQUEST_SEND_ERROR: String = js.native
  }
  
  inline def bearerTokenAuthenticationPolicy(options: BearerTokenAuthenticationPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("bearerTokenAuthenticationPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "bearerTokenAuthenticationPolicyName")
  @js.native
  val bearerTokenAuthenticationPolicyName: /* "bearerTokenAuthenticationPolicy" */ String = js.native
  
  inline def createDefaultHttpClient(): HttpClient = ^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultHttpClient")().asInstanceOf[HttpClient]
  
  inline def createEmptyPipeline(): Pipeline = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyPipeline")().asInstanceOf[Pipeline]
  
  inline def createHttpHeaders(): HttpHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("createHttpHeaders")().asInstanceOf[HttpHeaders]
  inline def createHttpHeaders(rawHeaders: RawHttpHeadersInput): HttpHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("createHttpHeaders")(rawHeaders.asInstanceOf[js.Any]).asInstanceOf[HttpHeaders]
  
  inline def createPipelineFromOptions(options: InternalPipelineOptions): Pipeline = ^.asInstanceOf[js.Dynamic].applyDynamic("createPipelineFromOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Pipeline]
  
  inline def createPipelineRequest(options: PipelineRequestOptions): PipelineRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("createPipelineRequest")(options.asInstanceOf[js.Any]).asInstanceOf[PipelineRequest]
  
  inline def decompressResponsePolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decompressResponsePolicy")().asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "decompressResponsePolicyName")
  @js.native
  val decompressResponsePolicyName: /* "decompressResponsePolicy" */ String = js.native
  
  inline def defaultRetryPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRetryPolicy")().asInstanceOf[PipelinePolicy]
  inline def defaultRetryPolicy(options: DefaultRetryPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRetryPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
  
  inline def exponentialRetryPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("exponentialRetryPolicy")().asInstanceOf[PipelinePolicy]
  inline def exponentialRetryPolicy(options: ExponentialRetryPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("exponentialRetryPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "exponentialRetryPolicyName")
  @js.native
  val exponentialRetryPolicyName: /* "exponentialRetryPolicy" */ String = js.native
  
  inline def formDataPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("formDataPolicy")().asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "formDataPolicyName")
  @js.native
  val formDataPolicyName: /* "formDataPolicy" */ String = js.native
  
  inline def getDefaultProxySettings(): js.UndefOr[ProxySettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProxySettings")().asInstanceOf[js.UndefOr[ProxySettings]]
  inline def getDefaultProxySettings(proxyUrl: String): js.UndefOr[ProxySettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProxySettings")(proxyUrl.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ProxySettings]]
  
  inline def isRestError(e: Any): /* is @azure/core-rest-pipeline.@azure/core-rest-pipeline/types/3.1/core-rest-pipeline.RestError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRestError")(e.asInstanceOf[js.Any]).asInstanceOf[/* is @azure/core-rest-pipeline.@azure/core-rest-pipeline/types/3.1/core-rest-pipeline.RestError */ Boolean]
  
  inline def logPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("logPolicy")().asInstanceOf[PipelinePolicy]
  inline def logPolicy(options: LogPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("logPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "logPolicyName")
  @js.native
  val logPolicyName: /* "logPolicy" */ String = js.native
  
  inline def ndJsonPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("ndJsonPolicy")().asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "ndJsonPolicyName")
  @js.native
  val ndJsonPolicyName: /* "ndJsonPolicy" */ String = js.native
  
  inline def proxyPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyPolicy")().asInstanceOf[PipelinePolicy]
  inline def proxyPolicy(proxySettings: Unit, options: CustomNoProxyList): PipelinePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyPolicy")(proxySettings.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PipelinePolicy]
  inline def proxyPolicy(proxySettings: ProxySettings): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyPolicy")(proxySettings.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
  inline def proxyPolicy(proxySettings: ProxySettings, options: CustomNoProxyList): PipelinePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyPolicy")(proxySettings.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "proxyPolicyName")
  @js.native
  val proxyPolicyName: /* "proxyPolicy" */ String = js.native
  
  inline def redirectPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("redirectPolicy")().asInstanceOf[PipelinePolicy]
  inline def redirectPolicy(options: RedirectPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("redirectPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "redirectPolicyName")
  @js.native
  val redirectPolicyName: /* "redirectPolicy" */ String = js.native
  
  inline def retryPolicy(strategies: js.Array[RetryStrategy]): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("retryPolicy")(strategies.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
  inline def retryPolicy(strategies: js.Array[RetryStrategy], options: RetryPolicyOptions): PipelinePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("retryPolicy")(strategies.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PipelinePolicy]
  
  inline def setClientRequestIdPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("setClientRequestIdPolicy")().asInstanceOf[PipelinePolicy]
  inline def setClientRequestIdPolicy(requestIdHeaderName: String): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("setClientRequestIdPolicy")(requestIdHeaderName.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "setClientRequestIdPolicyName")
  @js.native
  val setClientRequestIdPolicyName: /* "setClientRequestIdPolicy" */ String = js.native
  
  inline def systemErrorRetryPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")().asInstanceOf[PipelinePolicy]
  inline def systemErrorRetryPolicy(options: SystemErrorRetryPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "systemErrorRetryPolicyName")
  @js.native
  val systemErrorRetryPolicyName: /* "systemErrorRetryPolicy" */ String = js.native
  
  inline def throttlingRetryPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("throttlingRetryPolicy")().asInstanceOf[PipelinePolicy]
  inline def throttlingRetryPolicy(options: ThrottlingRetryPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("throttlingRetryPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "throttlingRetryPolicyName")
  @js.native
  val throttlingRetryPolicyName: /* "throttlingRetryPolicy" */ String = js.native
  
  inline def tlsPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("tlsPolicy")().asInstanceOf[PipelinePolicy]
  inline def tlsPolicy(tlsSettings: TlsSettings): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("tlsPolicy")(tlsSettings.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "tlsPolicyName")
  @js.native
  val tlsPolicyName: /* "tlsPolicy" */ String = js.native
  
  inline def tracingPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("tracingPolicy")().asInstanceOf[PipelinePolicy]
  inline def tracingPolicy(options: TracingPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("tracingPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "tracingPolicyName")
  @js.native
  val tracingPolicyName: /* "tracingPolicy" */ String = js.native
  
  inline def userAgentPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("userAgentPolicy")().asInstanceOf[PipelinePolicy]
  inline def userAgentPolicy(options: UserAgentPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("userAgentPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "userAgentPolicyName")
  @js.native
  val userAgentPolicyName: /* "userAgentPolicy" */ String = js.native
}
