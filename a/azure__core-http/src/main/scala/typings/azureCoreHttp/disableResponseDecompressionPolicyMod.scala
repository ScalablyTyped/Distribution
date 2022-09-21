package typings.azureCoreHttp

import typings.azureCoreHttp.httpOperationResponseMod.HttpOperationResponse
import typings.azureCoreHttp.requestPolicyMod.BaseRequestPolicy
import typings.azureCoreHttp.requestPolicyMod.RequestPolicy
import typings.azureCoreHttp.requestPolicyMod.RequestPolicyFactory
import typings.azureCoreHttp.requestPolicyMod.RequestPolicyOptions
import typings.azureCoreHttp.webResourceMod.WebResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disableResponseDecompressionPolicyMod {
  
  @JSImport("@azure/core-http/types/latest/src/policies/disableResponseDecompressionPolicy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-http/types/latest/src/policies/disableResponseDecompressionPolicy", "DisableResponseDecompressionPolicy")
  @js.native
  open class DisableResponseDecompressionPolicy_ protected () extends BaseRequestPolicy {
    /**
      * Creates an instance of DisableResponseDecompressionPolicy.
      *
      * @param nextPolicy -
      * @param options -
      */
    def this(nextPolicy: RequestPolicy, options: RequestPolicyOptions) = this()
    
    /**
      * Sends out request.
      *
      * @param request -
      * @returns
      */
    def sendRequest(request: WebResource): js.Promise[HttpOperationResponse] = js.native
  }
  
  inline def disableResponseDecompressionPolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("disableResponseDecompressionPolicy")().asInstanceOf[RequestPolicyFactory]
}
