package typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod

import org.scalablytyped.runtime.StringDictionary
import typings.azureCoreRestPipeline.anon.CustomNoProxyList
import typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod.^
import typings.node.NodeJS.ReadableStream
import typings.std.Blob
import typings.std.FormData
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def bearerTokenAuthenticationPolicy(options: BearerTokenAuthenticationPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("bearerTokenAuthenticationPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]

inline def bearerTokenAuthenticationPolicyName: /* "bearerTokenAuthenticationPolicy" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("bearerTokenAuthenticationPolicyName").asInstanceOf[/* "bearerTokenAuthenticationPolicy" */ String]

inline def createDefaultHttpClient(): HttpClient = ^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultHttpClient")().asInstanceOf[HttpClient]

inline def createEmptyPipeline(): Pipeline = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyPipeline")().asInstanceOf[Pipeline]

inline def createHttpHeaders(): HttpHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("createHttpHeaders")().asInstanceOf[HttpHeaders]
inline def createHttpHeaders(rawHeaders: RawHttpHeadersInput): HttpHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("createHttpHeaders")(rawHeaders.asInstanceOf[js.Any]).asInstanceOf[HttpHeaders]

inline def createPipelineFromOptions(options: InternalPipelineOptions): Pipeline = ^.asInstanceOf[js.Dynamic].applyDynamic("createPipelineFromOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Pipeline]

inline def createPipelineRequest(options: PipelineRequestOptions): PipelineRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("createPipelineRequest")(options.asInstanceOf[js.Any]).asInstanceOf[PipelineRequest]

inline def decompressResponsePolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decompressResponsePolicy")().asInstanceOf[PipelinePolicy]

inline def decompressResponsePolicyName: /* "decompressResponsePolicy" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("decompressResponsePolicyName").asInstanceOf[/* "decompressResponsePolicy" */ String]

inline def defaultRetryPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRetryPolicy")().asInstanceOf[PipelinePolicy]
inline def defaultRetryPolicy(options: DefaultRetryPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRetryPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]

inline def exponentialRetryPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("exponentialRetryPolicy")().asInstanceOf[PipelinePolicy]
inline def exponentialRetryPolicy(options: ExponentialRetryPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("exponentialRetryPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]

inline def exponentialRetryPolicyName: /* "exponentialRetryPolicy" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("exponentialRetryPolicyName").asInstanceOf[/* "exponentialRetryPolicy" */ String]

inline def formDataPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("formDataPolicy")().asInstanceOf[PipelinePolicy]

inline def formDataPolicyName: /* "formDataPolicy" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("formDataPolicyName").asInstanceOf[/* "formDataPolicy" */ String]

inline def getDefaultProxySettings(): js.UndefOr[ProxySettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProxySettings")().asInstanceOf[js.UndefOr[ProxySettings]]
inline def getDefaultProxySettings(proxyUrl: String): js.UndefOr[ProxySettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProxySettings")(proxyUrl.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ProxySettings]]

inline def isRestError(e: Any): /* is @azure/core-rest-pipeline.@azure/core-rest-pipeline/types/latest/core-rest-pipeline.RestError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRestError")(e.asInstanceOf[js.Any]).asInstanceOf[/* is @azure/core-rest-pipeline.@azure/core-rest-pipeline/types/latest/core-rest-pipeline.RestError */ Boolean]

inline def logPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("logPolicy")().asInstanceOf[PipelinePolicy]
inline def logPolicy(options: LogPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("logPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]

inline def logPolicyName: /* "logPolicy" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("logPolicyName").asInstanceOf[/* "logPolicy" */ String]

inline def ndJsonPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("ndJsonPolicy")().asInstanceOf[PipelinePolicy]

inline def ndJsonPolicyName: /* "ndJsonPolicy" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("ndJsonPolicyName").asInstanceOf[/* "ndJsonPolicy" */ String]

inline def proxyPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyPolicy")().asInstanceOf[PipelinePolicy]
inline def proxyPolicy(proxySettings: Unit, options: CustomNoProxyList): PipelinePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyPolicy")(proxySettings.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PipelinePolicy]
inline def proxyPolicy(proxySettings: ProxySettings): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyPolicy")(proxySettings.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
inline def proxyPolicy(proxySettings: ProxySettings, options: CustomNoProxyList): PipelinePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyPolicy")(proxySettings.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PipelinePolicy]

inline def proxyPolicyName: /* "proxyPolicy" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("proxyPolicyName").asInstanceOf[/* "proxyPolicy" */ String]

inline def redirectPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("redirectPolicy")().asInstanceOf[PipelinePolicy]
inline def redirectPolicy(options: RedirectPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("redirectPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]

inline def redirectPolicyName: /* "redirectPolicy" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("redirectPolicyName").asInstanceOf[/* "redirectPolicy" */ String]

inline def retryPolicy(strategies: js.Array[RetryStrategy]): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("retryPolicy")(strategies.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
inline def retryPolicy(strategies: js.Array[RetryStrategy], options: RetryPolicyOptions): PipelinePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("retryPolicy")(strategies.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PipelinePolicy]

inline def setClientRequestIdPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("setClientRequestIdPolicy")().asInstanceOf[PipelinePolicy]
inline def setClientRequestIdPolicy(requestIdHeaderName: String): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("setClientRequestIdPolicy")(requestIdHeaderName.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]

inline def setClientRequestIdPolicyName: /* "setClientRequestIdPolicy" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("setClientRequestIdPolicyName").asInstanceOf[/* "setClientRequestIdPolicy" */ String]

inline def systemErrorRetryPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")().asInstanceOf[PipelinePolicy]
inline def systemErrorRetryPolicy(options: SystemErrorRetryPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]

inline def systemErrorRetryPolicyName: /* "systemErrorRetryPolicy" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("systemErrorRetryPolicyName").asInstanceOf[/* "systemErrorRetryPolicy" */ String]

inline def throttlingRetryPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("throttlingRetryPolicy")().asInstanceOf[PipelinePolicy]
inline def throttlingRetryPolicy(options: ThrottlingRetryPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("throttlingRetryPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]

inline def throttlingRetryPolicyName: /* "throttlingRetryPolicy" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("throttlingRetryPolicyName").asInstanceOf[/* "throttlingRetryPolicy" */ String]

inline def tlsPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("tlsPolicy")().asInstanceOf[PipelinePolicy]
inline def tlsPolicy(tlsSettings: TlsSettings): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("tlsPolicy")(tlsSettings.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]

inline def tlsPolicyName: /* "tlsPolicy" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("tlsPolicyName").asInstanceOf[/* "tlsPolicy" */ String]

inline def tracingPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("tracingPolicy")().asInstanceOf[PipelinePolicy]
inline def tracingPolicy(options: TracingPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("tracingPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]

inline def tracingPolicyName: /* "tracingPolicy" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("tracingPolicyName").asInstanceOf[/* "tracingPolicy" */ String]

inline def userAgentPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("userAgentPolicy")().asInstanceOf[PipelinePolicy]
inline def userAgentPolicy(options: UserAgentPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("userAgentPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]

inline def userAgentPolicyName: /* "userAgentPolicy" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("userAgentPolicyName").asInstanceOf[/* "userAgentPolicy" */ String]

type DefaultRetryPolicyOptions = PipelineRetryOptions

type FormDataMap = StringDictionary[FormDataValue | js.Array[FormDataValue]]

type FormDataValue = String | Blob

type RawHttpHeaders = StringDictionary[String]

type RawHttpHeadersInput = Record[String, String | Double | Boolean]

type RequestBodyType = ReadableStream | (js.Function0[ReadableStream | typings.std.ReadableStream[js.typedarray.Uint8Array]]) | typings.std.ReadableStream[js.typedarray.Uint8Array] | Blob | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | FormData | String | Null

type SendRequest = js.Function1[/* request */ PipelineRequest, js.Promise[PipelineResponse]]
