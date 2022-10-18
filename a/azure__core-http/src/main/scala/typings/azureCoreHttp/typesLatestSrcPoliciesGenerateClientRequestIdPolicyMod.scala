package typings.azureCoreHttp

import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.BaseRequestPolicy
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicy
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyFactory
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcPoliciesGenerateClientRequestIdPolicyMod {
  
  @JSImport("@azure/core-http/types/latest/src/policies/generateClientRequestIdPolicy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-http/types/latest/src/policies/generateClientRequestIdPolicy", "GenerateClientRequestIdPolicy")
  @js.native
  open class GenerateClientRequestIdPolicy_ protected () extends BaseRequestPolicy {
    def this(nextPolicy: RequestPolicy, options: RequestPolicyOptions, _requestIdHeaderName: String) = this()
    
    /* private */ var _requestIdHeaderName: Any = js.native
  }
  
  inline def generateClientRequestIdPolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("generateClientRequestIdPolicy")().asInstanceOf[RequestPolicyFactory]
  inline def generateClientRequestIdPolicy(requestIdHeaderName: String): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("generateClientRequestIdPolicy")(requestIdHeaderName.asInstanceOf[js.Any]).asInstanceOf[RequestPolicyFactory]
}
