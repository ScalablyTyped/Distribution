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

object disableResponseDecompressionPolicyBrowserMod {
  
  @JSImport("@azure/core-http/types/latest/src/policies/disableResponseDecompressionPolicy.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-http/types/latest/src/policies/disableResponseDecompressionPolicy.browser", "DisableResponseDecompressionPolicy")
  @js.native
  open class DisableResponseDecompressionPolicy_ protected () extends BaseRequestPolicy {
    def this(nextPolicy: RequestPolicy, options: RequestPolicyOptions) = this()
    
    def sendRequest(_request: WebResource): js.Promise[HttpOperationResponse] = js.native
  }
  
  inline def disableResponseDecompressionPolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("disableResponseDecompressionPolicy")().asInstanceOf[RequestPolicyFactory]
}
