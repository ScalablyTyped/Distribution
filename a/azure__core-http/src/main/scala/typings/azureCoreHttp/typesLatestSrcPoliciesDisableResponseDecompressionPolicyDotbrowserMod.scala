package typings.azureCoreHttp

import typings.azureCoreHttp.typesLatestSrcHttpOperationResponseMod.HttpOperationResponse
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.BaseRequestPolicy
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicy
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyFactory
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyOptions
import typings.azureCoreHttp.typesLatestSrcWebResourceMod.WebResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcPoliciesDisableResponseDecompressionPolicyDotbrowserMod {
  
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
