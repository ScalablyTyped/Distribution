package typings.azureCoreHttpCompat.mod

import org.scalablytyped.runtime.StringDictionary
import typings.azureCoreHttpCompat.mod.^
import typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod.HttpClient
import typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod.HttpHeaders
import typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod.PipelinePolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def convertHttpClient(requestPolicyClient: RequestPolicy): HttpClient = ^.asInstanceOf[js.Dynamic].applyDynamic("convertHttpClient")(requestPolicyClient.asInstanceOf[js.Any]).asInstanceOf[HttpClient]

inline def createRequestPolicyFactoryPolicy(factories: js.Array[RequestPolicyFactory]): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("createRequestPolicyFactoryPolicy")(factories.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]

inline def disableKeepAlivePolicyName: /* "DisableKeepAlivePolicy" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("disableKeepAlivePolicyName").asInstanceOf[/* "DisableKeepAlivePolicy" */ String]

inline def requestPolicyFactoryPolicyName: /* "RequestPolicyFactoryPolicy" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("requestPolicyFactoryPolicyName").asInstanceOf[/* "RequestPolicyFactoryPolicy" */ String]

inline def toHttpHeadersLike(headers: HttpHeaders): HttpHeadersLike = ^.asInstanceOf[js.Dynamic].applyDynamic("toHttpHeadersLike")(headers.asInstanceOf[js.Any]).asInstanceOf[HttpHeadersLike]

type RawHttpHeaders = StringDictionary[String]
