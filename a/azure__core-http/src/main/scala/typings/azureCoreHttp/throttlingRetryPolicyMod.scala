package typings.azureCoreHttp

import typings.azureCoreHttp.httpOperationResponseMod.HttpOperationResponse
import typings.azureCoreHttp.requestPolicyMod.BaseRequestPolicy
import typings.azureCoreHttp.requestPolicyMod.RequestPolicy
import typings.azureCoreHttp.requestPolicyMod.RequestPolicyFactory
import typings.azureCoreHttp.requestPolicyMod.RequestPolicyOptions
import typings.azureCoreHttp.webResourceMod.WebResourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throttlingRetryPolicyMod {
  
  @JSImport("@azure/core-http/types/latest/src/policies/throttlingRetryPolicy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-http/types/latest/src/policies/throttlingRetryPolicy", "ThrottlingRetryPolicy")
  @js.native
  open class ThrottlingRetryPolicy_ protected () extends BaseRequestPolicy {
    def this(nextPolicy: RequestPolicy, options: RequestPolicyOptions) = this()
    def this(nextPolicy: RequestPolicy, options: RequestPolicyOptions, _handleResponse: ResponseHandler) = this()
    
    /* private */ var _defaultResponseHandler: Any = js.native
    
    /* private */ var _handleResponse: Any = js.native
    
    /* private */ var numberOfRetries: Any = js.native
  }
  /* static members */
  object ThrottlingRetryPolicy_ {
    
    @JSImport("@azure/core-http/types/latest/src/policies/throttlingRetryPolicy", "ThrottlingRetryPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parseDateRetryAfterHeader(headerValue: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDateRetryAfterHeader")(headerValue.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
    
    inline def parseRetryAfterHeader(headerValue: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRetryAfterHeader")(headerValue.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  }
  
  inline def throttlingRetryPolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("throttlingRetryPolicy")().asInstanceOf[RequestPolicyFactory]
  
  type ResponseHandler = js.Function2[
    /* httpRequest */ WebResourceLike, 
    /* response */ HttpOperationResponse, 
    js.Promise[HttpOperationResponse]
  ]
}
